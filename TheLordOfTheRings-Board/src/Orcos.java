package src;

public class Orcos extends  Bestias{

    public Orcos(){
       super();
    }

    public Orcos(String nombre, int ataque, int armadura, int vida){
        super(nombre, ataque, armadura, vida);
    }

    @Override
    public void tirarDados(){
        super.tirarDados();
    }

    @Override
    public Integer getAtaque(){
        return super.getAtaque();
    }

}
