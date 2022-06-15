import MG3D.geometrie.*;

public class Sub_division3 {
    

    public static Maillage Subdiv3(Maillage m){
        int nbsommets = m.getNbSommets();
        int nbface=m.getNbFaces();
        for(int i=0; i<nbface; i++){

            /* Récupération de la face i */
            Face f=m.getFace(i);

            /* Création des sommets en position de la face */
            Sommet a=m.getSommet(f.getS1());
            Sommet b=m.getSommet(f.getS2());
            Sommet c=m.getSommet(f.getS3());
            System.out.println(f.getS3());

            /* Somme des coordonnées des sommets */
            double sommeX=a.getX()+b.getX()+c.getX();
            double sommeY=a.getY()+b.getY()+c.getY();
            double sommeZ=a.getZ()+b.getZ()+c.getZ();
            
            /* Moyenne des coordonnées des sommets */
            double moyX=sommeX/3;
            double moyY=sommeY/3;
            double moyZ=sommeZ/3;

            /* Création du point central */
            Sommet pointcentral=new Sommet(moyX,moyY,moyZ);

            /* Ajout du point central à la liste des sommets */
            m.ajouter(pointcentral);

        }
        
        for(int i=0; i<nbface; i++){

            Face f=new Face(m.getFace(i));
            /* Récupération du 3ème sommet de la face */
            int indexs1=f.getS1();
            int indexs2=f.getS2();
            int indexs3=f.getS3();


            /* Changement du sommet s3 de la face pour prendre celui du point central */
            f.setS3(nbsommets+i);

            /* Création des faces f2 et f3 */
            Face f2=new Face(indexs2, indexs3, nbsommets+i);
            Face f3=new Face(indexs3, indexs1, nbsommets+i);

            /* Ajout des nouvelles faces à la liste de face */
            m.ajouter(f2);
            m.ajouter(f3);
        }
            return m;
    }

    public static void main(String[] args){
        Maillage m=new Maillage("cube.off");

        Maillage m2=Subdiv3(m);

        m2.sauverOFF("resultat.off");
    }
}
