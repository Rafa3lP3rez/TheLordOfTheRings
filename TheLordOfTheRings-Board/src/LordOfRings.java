package src;

public class LordOfRings {

    private Bestias bestias;
    private Heroes heroes;
    private Personajes personajes;
    private  Board board;

    int option=0;
    public void initGame() {
        System.out.println("\n************ WELCOME TO LORD OF RINGS GAME ************\n");
        option = Input.getInteger("Creando personajes\n1. Crear Heroes\n2.Crear Bestias\nIngrese su opcion: ");
        if(option==1) {
            personajes = createElfos();
            personajes = createHobbits();
            personajes = createHumanos();
        } else if (option ==2) {
            personajes = createOrcos();
            personajes = createTrasgos();
        }
      //here goes turn class
        board = new Board();
    }

    public void play(){
        board = new Board();
        //here goes another instance of turn

    }

    public void showWinner(){
        System.out.println("TABLA DE RESULTADOS\n");
        board.isWinner();
    }

    //************ HEROES ************
    public Personajes createHumanos(){
        String name = Input.getString("Ingrese el nombre para humanos: ");
        Personajes personajes1 = new Humanos();
        return personajes1;
    }

    public Personajes createHobbits(){
        String name = Input.getString("Ingrese el nombre para hobbits: ");
        Personajes personajes2 = new Hobbits();
        return personajes2;
    }

    public Personajes createElfos(){
        String name = Input.getString("Ingrese el nombre para elfos: ");
        Personajes personajes3 = new Elfos();
        return personajes3;
    }

    //************  BESTIAS ************
    public Personajes createOrcos(){
        String name = Input.getString("Ingrese el nombre para los orcos: ");
        Personajes personajes4 = new Orcos();
        return personajes4;
    }

    public Personajes createTrasgos(){
        String name = Input.getString("Ingrese el nombre para los trasgos: ");
        Personajes personajes5 = new Orcos();
        return personajes5;
    }

}
