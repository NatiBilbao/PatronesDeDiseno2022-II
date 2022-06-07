package tarea5Command;

import java.util.ArrayList;
import java.util.List;

public class Acciones {
    private List <ICommand> commandsJuego = new ArrayList<>();

    public Acciones(){}

    public void addCommand(ICommand command){
        commandsJuego.add(command);
    }

    public void accionesCmd(){
        for (ICommand command  : commandsJuego) {
            command.execute();
        }
        commandsJuego.clear();
    }
}
