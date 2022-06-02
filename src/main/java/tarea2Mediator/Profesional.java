package tarea2Mediator;

public class Profesional extends Persona{
    public Profesional(ICanalComunication canalComunication) {
        super(canalComunication);
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> ci: "+getCi()+" name: "+getName() + "grado: "+getGrado());
        System.out.println("INFO> ci: "+getCi()+" name: "+getName() + "lenguaje: "+getLenguaje());
        System.out.println("INFO> ci: "+getCi()+" name: "+getName() + "certificaciones:"+getCertificaciones());
        System.out.println("INFO> received "+msg);
    }
}
