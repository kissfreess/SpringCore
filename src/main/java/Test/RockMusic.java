package Test;

public class RockMusic implements Music{

    public RockMusic() {
    }

    public static RockMusic getInstance(){
        return new RockMusic();
    }

    @Override
    public void getMusic() {
        System.out.println("RRRRRRRRRRR");
    }

    public void init(){
        System.out.println("Hello!");
    }

    public void destroy(){
        System.out.println("Bye");
    }
}
