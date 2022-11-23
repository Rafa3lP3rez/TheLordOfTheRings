package src;

public class LordOfRings {

    private Bestias bestias;
    private Heroes heroes;
  //  private Turn turn;
    private  Board board;

    public void initGame(){
        System.out.println("\n************ WELCOME TO LORD OF RINGS GAME ************\n");

    }

    public Personajes createHumanos(){
        Humanos humanos = new Humanos();
        return humanos;
    }

    public Personajes createHobbits(){
        Hobbits hobbits = new Hobbits();
        return hobbits;
    }


}
