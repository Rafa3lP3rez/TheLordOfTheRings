package src;

public class LordOfRings {

    private Bestias bestias;
    private Heroes heroes;
    private Personajes personajes;
    private  Board board;

    public void initGame() {
        System.out.println("\n************ WELCOME TO LORD OF RINGS GAME ************\n");
        heroes = createElfos();
        heroes = createHobbits();
        heroes = createHumanos();
        board = new Board();

    }

    public Heroes createHumanos(){
        Humanos humanos = new Humanos();
        return humanos;
    }

    public Heroes createHobbits(){
        Hobbits hobbits = new Hobbits();
        return hobbits;
    }

    public Heroes createElfos(){
        Elfos elfos = new Elfos();
        return elfos;
    }
}
