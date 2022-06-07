package tarea5Command;

public class ModoDefensa implements ICommand{

    private Juego juego;

     public ModoDefensa(Juego juego){
         this.juego=juego;
     }
    @Override
    public void execute() {
        System.out.println("ejecutando comando: ModoDefensa");
        juego.modoDefensa();
    }
}
