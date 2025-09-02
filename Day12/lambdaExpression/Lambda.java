package Day12.lambdaExpression;

public class Lambda {

    public static void main(String[] args) {
    
        Speaker sony = singer -> System.out.println("-_-_-_-_-***PLAYING " +singer+"***-_-_-_-_-");
                        
        sony.play("ARIJIT");
    }

    
}

 interface Speaker {
        void play(String artist);
}







