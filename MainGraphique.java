import java.util.ArrayList;
import MG2D.*;
import MG2D.geometrie.*;

public class MainGraphique {


    public static void dessinerPlateau(Fenetre f, Plateau p){
        f.effacer();
        for(int i=0; i<=800; i+=200){
            for(int j=0; j<=800; j+=200){
                Carre c=new Carre(Couleur.GRIS_FONCE ,new Point(j,i), 100, true);
                f.ajouter(c);
            }
        }

        for(int g=100; g<=800; g+=200){
            for(int h=100; h<=800; h+=200){
                Carre cc=new Carre(Couleur.GRIS_FONCE ,new Point(h,g), 100, true);
                f.ajouter(cc);
            }
        }

        for (int m=0; m<=8;m++){
            for(int n=0; n<=8;n++){
                if(p.getCase(new Position(m,n))!=null){
                    if (p.getCase(new Position(m,n)).getType().equals("Pion")){
                        if(p.getCase(new Position(m,n)).getCouleur()=='B'){
                            Texture pionB=new Texture("./images/pion_B.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(pionB);
                        }  
                        if (p.getCase(new Position(m,n)).getCouleur()=='N'){
                            Texture pionN=new Texture("./images/pion_N.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(pionN);
                        }
                    }
                    
                    if (p.getCase(new Position(m,n)).getType().equals("Roi")){
                        if(p.getCase(new Position(m,n)).getCouleur()=='B'){
                            Texture roiB=new Texture("./images/roi_B.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(roiB);
                        }  
                        if (p.getCase(new Position(m,n)).getCouleur()=='N'){
                            Texture roiN=new Texture("./images/roi_N.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(roiN);
                        }
                    }

                    if (p.getCase(new Position(m,n)).getType().equals("Cavalier")){
                        if(p.getCase(new Position(m,n)).getCouleur()=='B'){
                            Texture cavalierB=new Texture("./images/cavalier_B.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(cavalierB);
                        }  
                        if (p.getCase(new Position(m,n)).getCouleur()=='N'){
                            Texture cavalierN=new Texture("./images/cavalier_N.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(cavalierN);
                        }
                    }

                    if (p.getCase(new Position(m,n)).getType().equals("Fou")){
                        if(p.getCase(new Position(m,n)).getCouleur()=='B'){
                            Texture fouB=new Texture("./images/fou_B.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(fouB);
                        }  
                        if (p.getCase(new Position(m,n)).getCouleur()=='N'){
                            Texture fouN=new Texture("./images/fou_N.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(fouN);
                        }
                    }

                    if (p.getCase(new Position(m,n)).getType().equals("Dame")){
                        if(p.getCase(new Position(m,n)).getCouleur()=='B'){
                            Texture dameB=new Texture("./images/reine_B.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(dameB);
                        }  
                        if (p.getCase(new Position(m,n)).getCouleur()=='N'){
                            Texture dameN=new Texture("./images/reine_N.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(dameN);
                        }
                    }

                    if (p.getCase(new Position(m,n)).getType().equals("Tour")){
                        if(p.getCase(new Position(m,n)).getCouleur()=='B'){
                            Texture tourB=new Texture("./images/tour_B.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(tourB);
                        }  
                        if (p.getCase(new Position(m,n)).getCouleur()=='N'){
                            Texture tourN=new Texture("./images/tour_N.png", new Point(m*100,n*100), 100, 100);
                            f.ajouter(tourN);
                        }
                    }
                }
            }
        }
        f.rafraichir();
    }


    public static void main(String[] args){
        Fenetre f= new Fenetre("Echecs", 800,800);
        Plateau p= new Plateau();
        Souris souris=f.getSouris();
        boolean premierclick=false;
        boolean camp=false;


        dessinerPlateau(f, p);
        while(true){
            if(souris.getClicGauche()){
                premierclick=true;
                Point point=souris.getPosition();
                int x=point.getX()/100;
                int y=point.getY()/100;
                Piece pie=p.getCase(new Position(x,y));
                if(pie.getCouleur()=='B' && camp==false){
                    ArrayList<Position> ListPos=pie.getDeplacementPossible(p);
                    for(int i=0; i<ListPos.size(); i++){
                        Position pos=ListPos.get(i);
                        Cercle c=new Cercle(Couleur.ROUGE, new Point((pos.getX()*100+50),(pos.getY()*100+50)), 50);
                        f.ajouter(c);
                    }
                    if(p.estEchec('N')==true){
                        System.out.println("Le Roir Noir est en échec !");
                    }

                    while(premierclick==true){
                        try{
                            Thread.sleep(1);
                        }
                        catch( Exception e ){
                        }
                        if(souris.getClicGauche()){
                            Point pointpos=souris.getPosition();
                            Position pto=new Position(pointpos.getX()/100,pointpos.getY()/100);
                            Position pfrom=new Position(x,y);
                            Boolean test = p.deplacer(pfrom, pto);
                            if(test){
                                dessinerPlateau(f, p);
                            }
                            premierclick=false;
                        }
                    }
                    camp=true;
                } else {
                    if(pie.getCouleur()=='N' && camp==true){
                        ArrayList<Position> ListPos=pie.getDeplacementPossible(p);
                        for(int i=0; i<ListPos.size(); i++){
                            Position pos=ListPos.get(i);
                            Cercle c=new Cercle(Couleur.ROUGE, new Point((pos.getX()*100+50),(pos.getY()*100+50)), 50);
                            f.ajouter(c);
                        }
                        if(p.estEchec('B')==true){
                            System.out.println("Le Roi Blanc est en échec !");
                        }
    
                        while(premierclick==true){
                            try{
                                Thread.sleep(1);
                            }
                            catch( Exception e ){
                            }
                            if(souris.getClicGauche()){
                                Point pointpos=souris.getPosition();
                                Position pto=new Position(pointpos.getX()/100,pointpos.getY()/100);
                                Position pfrom=new Position(x,y);
                                Boolean test = p.deplacer(pfrom, pto);
                                if(test){
                                    dessinerPlateau(f, p);
                                }
                                premierclick=false;
                            }
                        }
                        camp=false;
                    }
                }
            }
            f.rafraichir();
        }


    }
}