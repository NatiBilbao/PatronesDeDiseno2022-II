package tarea4ChainResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(int edad);
    IHandler next();
}
