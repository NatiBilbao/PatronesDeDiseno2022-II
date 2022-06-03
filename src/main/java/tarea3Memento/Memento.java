package tarea3Memento;

public class Memento {
    private Persona state;

    public Memento(Persona persona){
        state=persona;
    }

    public Persona getState() {
        return state;
    }
}
