import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCouleurImage {

    @Test
    public void testCouleurConstructeurCopie(){  
            Couleur p1 = new Couleur(128, 36, 49);
            Couleur p2 = new Couleur(p1);
            assertEquals(p1, p2);
    }

    @Test
    public void testImageConstructeurCopie(){
        try{
            Image img = new Image("images/reference.ppm");
            Image copie = new Image(img);
            Image reference = new Image("images/reference.ppm");
            assertEquals(copie, reference);
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Test
    public void testImageDifference1(){
        try{
            Image img1 = new Image("images/reference.ppm");
            Image img2 = new Image("images/reference.ppm");
            img1.difference(img2);
            Image noir = new Image(img1.getTailleX(), img1.getTailleY());
            noir.setNoir();
            
            assertEquals(img1, noir);

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Test
    public void testImageDifference2(){
        try{
	    
            Image img1 = new Image("images/reference.ppm");
            Image img2 = new Image("images/reference.ppm");
            img2.negatif();
            img1.difference(img2);
            Image blanc = new Image(img1.getTailleX(), img1.getTailleY());
            blanc.setBlanc();
            
            assertEquals(img1, blanc);

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Test
    public void testImageNegatif(){
        try{    
            Image img = new Image("images/reference.ppm");
            img.negatif();
            Image referenceNegatif = new Image("images/reference_negatif.ppm");
            assertEquals(img, referenceNegatif);

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Test
    public void testImageNiveauGris(){
        try{   
            Image img = new Image("images/reference.ppm");
            img.niveauGris();
            Image referenceGris = new Image("images/reference_niveauGris.ppm");
            assertEquals(img, referenceGris);

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Test
    public void testSetPixel1(){

        Image img = new Image(3, 3);

        img.setPixel(0, 0, new Couleur(0, 0, 0));
        img.setPixel(1, 0, new Couleur(0, 0, 255));
        img.setPixel(2, 0, new Couleur(0, 255, 0));
        img.setPixel(0, 1, new Couleur(0, 255, 255));
        img.setPixel(1, 1, new Couleur(255, 0, 0));
        img.setPixel(2, 1, new Couleur(255, 0, 255));
        img.setPixel(0, 2, new Couleur(255, 255, 0));
        img.setPixel(1, 2, new Couleur(255, 255, 255));
        img.setPixel(2, 2, new Couleur(0, 0, 0));


        try{
            Image reference = new Image("images/reference.ppm");
            assertEquals(img, reference);
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Test
    public void testSetPixel2(){

        Image img = new Image(3, 3);
        Couleur c = new Couleur();
    
        c.setR(0);c.setV(0);c.setB(0);
        img.setPixel(0, 0, c);
        c.setR(0);c.setV(0);c.setB(255);
        img.setPixel(1, 0, c);
        c.setR(0);c.setV(255);c.setB(0);
        img.setPixel(2, 0, c);
        c.setR(0);c.setV(255);c.setB(255);
        img.setPixel(0, 1, c);
        c.setR(255);c.setV(0);c.setB(0);
        img.setPixel(1, 1, c);
        c.setR(255);c.setV(0);c.setB(255);
        img.setPixel(2, 1, c);
        c.setR(255);c.setV(255);c.setB(0);
        img.setPixel(0, 2, c);
        c.setR(255);c.setV(255);c.setB(255);
        img.setPixel(1, 2, c);
        c.setR(0);c.setV(0);c.setB(0);
        img.setPixel(2, 2, c);

        try{
            Image reference = new Image("images/reference.ppm");
            assertEquals(img, reference);

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}


