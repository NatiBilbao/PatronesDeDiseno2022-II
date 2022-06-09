package tarea7State;

public class CPU {
    int cantidadDeSubprocesos;
    String cache;
    String velocidadDelBus;

    int recursosUtilizados;

    public CPU(){}

    public int getCantidadDeSubprocesos() {
        return cantidadDeSubprocesos;
    }

    public CPU setCantidadDeSubprocesos(int cantidadDeSubprocesos) {
        this.cantidadDeSubprocesos = cantidadDeSubprocesos;
        return this;
    }

    public String getCache() {
        return cache;
    }

    public CPU setCache(String cache) {
        this.cache = cache;
        return this;
    }

    public String getVelocidadDelBus() {
        return velocidadDelBus;
    }

    public CPU setVelocidadDelBus(String velocidadDelBus) {
        this.velocidadDelBus = velocidadDelBus;
        return this;
    }

    public int getRecursosUtilizados() {
        return recursosUtilizados;
    }

    public CPU setRecursosUtilizados(int recursosUtilizados) {
        this.recursosUtilizados = recursosUtilizados;
        return this;
    }

    public void showInfo(){
        System.out.println("******* CPU *******");
        System.out.println("Cantidad de subprocesos " + cantidadDeSubprocesos);
        System.out.println("Cache: " + cache);
        System.out.println("Velocidad del bus: " + velocidadDelBus);
        System.out.println("Recursos utilizados: " + recursosUtilizados);
    }
}
