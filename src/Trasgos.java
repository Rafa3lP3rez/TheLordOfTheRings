package src;

public class Trasgos extends Bestias{

    public Trasgos(){
        super();
    }

    public Trasgos(String nombre, int ataque, int armadura, int vida){
        super(nombre, ataque, armadura, vida);
    }
    
    @Override
    public int tirarDados(){
        return super.tirarDados();
    }

    @Override
    public Integer getAtaque(){
        return super.getAtaque();
    }

}
