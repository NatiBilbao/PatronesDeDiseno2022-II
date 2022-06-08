package tarea6Observer;

public interface IEmpresa {
    void usuario(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Actividades actividades);
}
