package tarea2Mediator;

public abstract class Persona {
    protected ICanalComunication canalComunication;
    private String ci;
    private String name;
    private String grado;
    private String lenguaje;
    private String certificaciones;

    public Persona(ICanalComunication canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getGrado() {
        return grado;
    }

    public Persona setGrado(String grado) {
        this.grado = grado;
        return this;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public Persona setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public Persona setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
        return this;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
