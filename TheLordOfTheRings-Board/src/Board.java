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
        if (humanos.getVida() > trasgos.getVida()) {
            if (humanos.getVida() > orcos.getVida()) {
                return true;
            }
        }
        return false;
    }

    public boolean HobbitsWinner(Hobbits hobbits) {
        if (hobbits.getVida() > trasgos.getVida()) {
            if (hobbits.getVida() > orcos.getVida()) {
                return true;
            }
        }
        return false;
    }

    public boolean ElfosWinner(Elfos elfos) {
        if (elfos.getVida() > trasgos.getVida()) {
            if (elfos.getVida() > orcos.getVida()) {
                return true;
            }
        }
            return false;
        }
    }





