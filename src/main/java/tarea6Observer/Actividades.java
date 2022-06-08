package tarea6Observer;

public class Actividades {
    String actividad;

     public Actividades(String activdad){
         this.actividad = actividad;
     }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void showInfo(){
         System.out.println("Actividad: " + actividad);
    }
}
