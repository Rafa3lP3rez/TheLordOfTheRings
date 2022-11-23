package src;

public class Board {

    Heroes heroes;
    Bestias bestias;

    Elfos elfos;
    Humanos humanos;
    Hobbits hobbits;

    Orcos orcos;
    Trasgos trasgos;

    public void showBoard() {

    }

    public boolean isWinner(Personajes personajes) {
        return false;
    }

    public boolean HumanWinner(Humanos humanos) {
        if (humanos.getAtaque() > elfos.getAtaque()) {

         if (humanos.getAtaque() > hobbits.getAtaque()) {
            return true;
            }
        }
        if (humanos.getAtaque() > trasgos.getAtaque()) {
            if (humanos.getAtaque() > orcos.getAtaque()){
                return true;
            }
        }
        return false;

    }

    public boolean HobbitsWinner(Hobbits hobbits) {
        if (hobbits.getAtaque() > elfos.getAtaque()) {
            return true;
        }
        if (hobbits.getAtaque() > humanos.getAtaque()) {
            return true;
        }
        if (hobbits.getAtaque() > trasgos.getAtaque()) {
            if (hobbits.getAtaque() > orcos.getAtaque()) {
                return true;
            }
        }
        return false;
    }
}
