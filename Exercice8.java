import java.util.Scanner;

class Exercice8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str;
        String verif;
        do{
            str=sc.next();
            verif=str.toLowerCase();
            int taille=str.length();
            System.out.println(taille + "caracteres");
        } while (verif.equals("exit")==false);
    }
}