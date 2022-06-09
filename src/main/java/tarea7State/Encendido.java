package tarea7State;

import java.util.Random;

public class Encendido implements IStateComputadora{

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("Informacion - Estado Encendido");
        computadora.getProgramasAbiertos().setRecuersosUtilizados(new Random().nextInt(100));
        computadora.getProgramasAbiertos().setEstadoDelPrograma("Abiertos");
        computadora.getProgramasAbiertos().showInfo();

    }
}
