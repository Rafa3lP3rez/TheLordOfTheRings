package src;

public class Board {

    Heroes heroes;
    Bestias bestias;

    Elfos elfos;
    Humanos humanos;
    Hobbits hobbits;

    Orcos orcos;
    Trasgos trasgos;


    public boolean isWinner(){
        if(HumanWinner(humanos)){
            System.out.println("Humanos han ganado!!");
            return true;
        }if(HobbitsWinner(hobbits) ){
            System.out.println("Hobbits han ganado!");
            return true;
        }if(ElfosWinner(elfos)){
            System.out.println("Elfos han ganado");
            return  true;
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





