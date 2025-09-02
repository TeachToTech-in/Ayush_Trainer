package innerClass;

public class AnnonymousInnerClass {
    
    public static void main(String[] args) {
        String EQUILIZER ="JAZZ \nPOP \nBASS \nMEGABASS \nCLASSICAL";

        /*
            We have a Interface Speaker,What problems do we have?
            1. create a new class which implements Speaker
            2. the create the object in Driver class
            3. So we have eleminated one extra implemantation class using Annonymous class 
        */
    
        Speaker sony = new Speaker() {

            @Override
            public void equilizer() {
                System.out.println(EQUILIZER);
            }

            @Override
            public void play(String singer) {
                System.out.println("-_-_-_-_-***PLAYING " +singer+"***-_-_-_-_-");
            }
            
        };

        sony.play("ARIJIT");

        
    }
}
//you can create class example also
//I am taking a interface example to show real world problems
interface Speaker{

    void equilizer();
    void play(String artist);
}
