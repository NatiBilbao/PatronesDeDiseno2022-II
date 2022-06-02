package tarea2Mediator;

import java.util.ArrayList;
import java.util.List;

public class Skype implements ICanalComunication{
    List<Profesional> profesionalChat = new ArrayList<>();

    public Skype addProfesionalChat(Profesional profesional){
        profesionalChat.add(profesional);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        Profesional emisor = (Profesional) persona;
        for ( Profesional profesional : profesionalChat   ) {
            if (!emisor.getCi().equals(profesional.getCi())){
                if(emisor.getGrado().equals("6") && profesional.getGrado().equals("6")){
                    profesional.received(msg);
                }else if (emisor.getLenguaje().equals("C++") && profesional.getLenguaje().equals("Java")){
                    profesional.received(msg);
                }else if (emisor.getCertificaciones().equals("5")){
                    profesional.received(msg);
                }
            }
        }

    }
}
