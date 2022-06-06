package tarea4ChainResponsability;

public class ConcreteHandler4 implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int edad) {

        if (edad>=50){
            System.out.println("La edad es: "+edad);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
