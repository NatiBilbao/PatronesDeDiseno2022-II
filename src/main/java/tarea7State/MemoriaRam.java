package tarea7State;

public class MemoriaRam {
    String capacidadTotal;
    int recursosUtilizados;
    String description;

    public MemoriaRam() {
    }

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getRecursosUtilizados() {
        return recursosUtilizados;
    }

    public String getDescription() {
        return description;
    }

    public MemoriaRam setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public MemoriaRam setRecursosUtilizados(int recursosUtilizados) {
        this.recursosUtilizados = recursosUtilizados;
        return this;
    }

    public MemoriaRam setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo(){
        System.out.println("**** memoria ram ****");
        System.out.println("capacidadTotal: "+capacidadTotal);
        System.out.println("capacidadUtiliza: "+ recursosUtilizados);
        System.out.println("description: "+description);
    }
}
