package tarea6Observer;

public class UserCompaniaTelefonica implements IUser{
    String actividad;
    Persona persona;

    public UserCompaniaTelefonica(String actividad, Persona persona) {
        this.actividad = actividad;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Actividades newActividades) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
        System.out.println("Numero de celular " + persona.getNumeroDeTelefono());
        System.out.println("Preferencia de notificaciones : "+ actividad);
        newActividades.showInfo();
    }

    @Override
    public String getPreferenciaActividades() {

        return actividad;
    }

    public Persona getPersona() {

        return persona;
    }
}
