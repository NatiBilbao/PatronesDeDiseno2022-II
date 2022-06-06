package tarea4ChainResponsability;

public class ManagerHandler implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(int edad) {
        ConcreteHandler1 resp1= new ConcreteHandler1();
        this.setNext(resp1);

        ConcreteHandler2 resp2 = new ConcreteHandler2();
        resp1.setNext(resp2);

        ConcreteHandler3 resp3 = new ConcreteHandler3();
        resp2.setNext(resp3);

        ConcreteHandler4 respFinal = new ConcreteHandler4();
        resp3.setNext(respFinal);

        this.next.criteriaHandler(edad);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
