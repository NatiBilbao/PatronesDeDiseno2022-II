package tarea6Observer;

public class Persona {
    String name;
    String numeroDeTelefono;

    public Persona(String name, String numero) {
        this.name = name;
        this.numeroDeTelefono = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
