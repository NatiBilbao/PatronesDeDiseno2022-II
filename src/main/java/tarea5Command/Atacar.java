package tarea5Command;

public class Atacar implements ICommand{

    private Juego juego;

    public Atacar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("ejecutando comando: Atacar");
        juego.atacar();
    }
}
