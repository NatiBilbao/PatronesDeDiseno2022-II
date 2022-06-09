package tarea7State;

public class Apagado implements IStateComputadora {
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException{
        System.out.println("Informacion - Estado Apagado");
        computadora.getProgramasAbiertos().setRecuersosUtilizados(0);
        computadora.getMemoriaRam().setRecursosUtilizados(0);
        computadora.getCpu().setRecursosUtilizados(0);
        computadora.getProgramasAbiertos().showInfo();
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
    }
}
