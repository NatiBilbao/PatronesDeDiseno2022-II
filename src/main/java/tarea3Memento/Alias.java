package tarea3Memento;

public class Alias {
    private Persona state;

    public void setBackups(Persona state) {
        this.state = state;
    }

    public Memento createBackups(){
        return new Memento(state);
    }

    public Persona restoreBackups(Memento m){
        System.out.println("***** restaurando ****");
        this.state=m.getState();
        return this.state;
    }
}
