package tarea4ChainResponsability;

public class ConcreteHandler2 implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int edad) {

        if (edad>=1 && edad < 18){
            System.out.println("La edad es :"+edad);
        } else {
            next.criteriaHandler(edad);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
