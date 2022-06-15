import java.util.ArrayList;
import java.util.Scanner;

import MG3D.geometrie.*;


public class Mesure {

    
    public static ArrayList<Integer> Dijkstra(Maillage m, int sommet_source, int sommet_destination){
        
        int[] parcouru=new int[m.getNbSommets()];
        int[] precedent=new int[m.getNbSommets()]; 
        ArrayList<Integer> pas_encore_vu=new ArrayList<Integer>();
        
        for(int i=0; i<m.getNbSommets(); i++){
            parcouru[i]=Integer.MAX_VALUE;
            precedent[i]= 0;
            pas_encore_vu.add(i);
        }

        parcouru[sommet_source]=0;
    
        while(!pas_encore_vu.isEmpty()){
            
            int min=pas_encore_vu.get(0);

            for(Integer i: pas_encore_vu){

                if(parcouru[i]<parcouru[min]){
                    min=i;
                    }
                }

            pas_encore_vu.remove(Integer.valueOf(min));

            for(Integer s2: m.getSommet(min).getVoisins()){
                Sommet Som1= m.getSommet(min);
                Sommet Som2= m.getSommet(s2);
                double distance=Som1.longueur(Som2);

                if(parcouru[s2]>parcouru[min]+distance){

                    parcouru[s2]=(int) (parcouru[min]+distance);
                    precedent[s2]=min;
                }

                
            }
        }

        ArrayList<Integer> chemin=new ArrayList<Integer>();
        int s=sommet_destination;
        chemin.add(s);
        
        while(s!=sommet_source){
            s=precedent[s];
            chemin.add(s);
            
        }

        return chemin;
        }


        public static double distance(Maillage m, ArrayList<Integer> chemin){
            double distance =0.0;
            for(int i=0;i<chemin.size()-1;i++){
                distance += m.distanceEuclidienneEntreSommets(chemin.get(i), chemin.get(i+1));
            }
            return distance;
        }

        public static void main(String[] args){
            boolean messMail=true;    
            boolean messSommetS=true;
            boolean messSommetD=true;
            int SommetS=0;
            int SommetD=0;

                while(messMail){
                try{
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Entrez le chemin du fichier: ");
                    String chemin=sc.next();
                    Maillage m = new Maillage(chemin);

                    while(messSommetS){
                        try{
                            System.out.println("\nEntrez l'index du sommet de départ");
                            SommetS=sc.nextInt();
                            messSommetS=false;
                        } catch(NumberFormatException e){
                            System.out.println("Format du nombre non accepté");
                        }
                    }

                    while(messSommetD){
                        try{
                            System.out.println("\nEntrez l'index du sommet de départ");
                            SommetD=sc.nextInt();
                            messSommetD=false;
                        } catch(NumberFormatException e){
                            System.out.println("Format du nombre non accepté");
                        }
                    }


                    System.out.println("Longueur de la distance: " + distance(m, Dijkstra(m, SommetS, SommetD)));
                    messMail=false;
                    sc.close();

                } catch(NullPointerException e){
                    System.out.println("Fichier introuvable, veuillez réessayer !");
                }
            }
        }

    }


