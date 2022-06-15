-- Auteur: PRUVOST Paul
-- Fait le: 24/05/2022
-- Nom de TP: TPD


-- Question 1: Créez une vue nommée client_produit permettant de consulter les caractéristiques des produits commandés par chaque client

CREATE OR REPLACE VIEW client_produit
AS (SELECT cli.numerocli, cli.nomcli, cli.prenomcli, pro.numeroprod, pro.designationprod, pro.prixprod FROM client cli
INNER JOIN commande com ON com.numerocli=cli.numerocli
INNER JOIN produit pro ON com.numeroprod=pro.numeroprod);


-- Question 2: En utilisant la vue client_produit, donnez pour chaque nom de client le produit le plus cher qui a été commandé

SELECT cp.nomcli, cp.designationprod, cp.numeroprod FROM client_produit cp
INNER JOIN (select nomcli, max(prixprod) as prixprod from client_produit group by nomcli) cp1 on cp.nomcli = cp1.nomcli 
AND cp.prixprod = cp1.prixprod;


-- Question 3: Le nom des clients qui ont commandé tous les produits

SELECT nomcli FROM client WHERE numerocli IN 
(SELECT numerocli FROM commande GROUP BY numerocli 
HAVING COUNT(DISTINCT(numeroprod)) = (SELECT COUNT(numeroprod) FROM produit));

SELECT nomcli FROM client c 
WHERE NOT EXISTS (SELECT * FROM produit p 
WHERE NOT EXISTS (SELECT * FROM commande co 
WHERE c.numerocli = co.numerocli 
AND co.numeroprod = p.numeroprod));


-- Question 5: Créez une vue produit_populaire qui donne toutes les informations sur les 10 produits les plus commandés

CREATE OR REPLACE VIEW produit_populaire AS
(SELECT numeroprod, designationprod, prixprod, COUNT(designationprod)
FROM client_produit
GROUP BY numeroprod, designationprod, prixprod 
ORDER BY COUNT(designationprod)
DESC LIMIT 10);
