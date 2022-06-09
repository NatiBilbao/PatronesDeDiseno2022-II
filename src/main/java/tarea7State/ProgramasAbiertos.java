package tarea7State;

public class ProgramasAbiertos {
    int cantidadDeprogramas;

    int recuersosUtilizados;

    String estadoDelPrograma;

    public ProgramasAbiertos(){}


    public int getCantidadDeprogramas() {
        return cantidadDeprogramas;
    }

    public ProgramasAbiertos setCantidadDeprogramas(int cantidadDeprogramas) {
        this.cantidadDeprogramas = cantidadDeprogramas;
        return this;
    }

    public int getRecuersosUtilizados() {
        return recuersosUtilizados;
    }

    public ProgramasAbiertos setRecuersosUtilizados(int recuersosUtilizados) {
        this.recuersosUtilizados = recuersosUtilizados;
        return this;
    }

    public String getEstadoDelPrograma() {
        return estadoDelPrograma;
    }

    public ProgramasAbiertos setEstadoDelPrograma(String estadoDelPrograma) {
        this.estadoDelPrograma = estadoDelPrograma;
        return this;
    }

    public void showInfo(){
        System.out.println("****** Programas Abiertos ******");
        System.out.println("Cantidad de programas abiertos: " + cantidadDeprogramas);
        System.out.println("Recursos utilizados: " + recuersosUtilizados);
        System.out.println("Estado del programa: " + estadoDelPrograma);
    }
}
