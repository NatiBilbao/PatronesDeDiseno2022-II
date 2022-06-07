package tarea5Command;

public class Juego {
    private String name;
    private String version;

    public Juego(){
    }

    public String getName() {
        return name;
    }

    public Juego setName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Juego setVersion(String version) {
        this.version = version;
        return this;
    }

    public void disparar(){
        System.out.println("Disparando");
    }

    public void modoDefensa(){
        System.out.println("Activando modo defensa...");
        System.out.println("Modo defensa activado");
    }

    public void atacar(){
        System.out.println("Atacando");
    }
}
