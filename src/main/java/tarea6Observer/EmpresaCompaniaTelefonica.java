package tarea6Observer;

import java.util.ArrayList;
import java.util.List;

public class EmpresaCompaniaTelefonica implements IEmpresa{
    private List<Actividades> actividadesList = new ArrayList<>();
    private  List <IUser> users= new ArrayList<>();

    public EmpresaCompaniaTelefonica(){}

    public void uploadActividades(Actividades actividades){
        actividadesList.add(actividades);
        notifyObservers(actividades);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);
    }

    public void usuario(IUser observer) {
        users.add(observer);
    }

    @Override
    public void notifyObservers(Actividades actividades) {
        for (IUser user:users ) {
            if (user.getPreferenciaActividades().equals(actividades.getActividad())){
                user.update("nueva actividad agregada!",actividades);
            }
        }
    }
}
