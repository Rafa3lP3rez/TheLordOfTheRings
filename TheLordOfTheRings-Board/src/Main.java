package src;

public class Main {

    public static void main(String[] args) {

        LordOfRings lord = new LordOfRings();

       /* Heroes humano = new Humanos("Humano", 0, 40, 180);

        humano.tirarDados();

        System.out.println(humano.getAtaque());*/

        lord.initGame();
        lord.play();
        lord.showWinner();

    }
}
