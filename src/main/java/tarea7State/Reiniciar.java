package tarea7State;

public class Reiniciar implements IStateComputadora{

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException{
        System.out.println("Informacion - Estado Reiniciando");
        computadora.getProgramasAbiertos().setEstadoDelPrograma("Cerrados");
        computadora.getMemoriaRam().setRecursosUtilizados(0);
        computadora.getCpu().setRecursosUtilizados(0);
        computadora.getProgramasAbiertos().showInfo();
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
    }
}
