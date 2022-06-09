package tarea7State;

public class Cliente {
    public static void main (String[]args) throws InterruptedException{
        Computadora computadora = new Computadora();
        computadora.setStateComputer(new Apagado());
        computadora.resourceManager();
        computadora.setStateComputer(new Reiniciar());
        computadora.resourceManager();
        computadora.setStateComputer(new Encendido());
        computadora.resourceManager();
    }
}
