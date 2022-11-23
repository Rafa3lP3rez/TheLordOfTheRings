package src;

public class Board {

    Heroes heroes;
    Bestias bestias;

    Elfos elfos;
    Humanos humanos;
    Hobbits hobbits;

    Orcos orcos;
    Trasgos trasgos;


    public boolean isWinner(Personajes personajes){
        if(bestias.getVida()> heroes.getVida()){
            return true;
        }
        return false;
    }

    public boolean HumanWinner(Humanos humanos) {
        if (humanos.getAtaque() > trasgos.getAtaque()) {
            if (humanos.getAtaque() > orcos.getAtaque()) {
                return true;
            }
        }
        return false;
    }

    public boolean HobbitsWinner(Hobbits hobbits) {
        if (hobbits.getAtaque() > trasgos.getAtaque()) {
            if (hobbits.getAtaque() > orcos.getAtaque()) {
                return true;
            }
        }
        return false;
    }

    public boolean ElfosWinner(Elfos elfos) {
        if (elfos.getAtaque() > trasgos.getAtaque()) {
            if (elfos.getAtaque() > orcos.getAtaque()) {
                return true;
            }
        }
            return false;
        }


    }





