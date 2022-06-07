package tarea5Command;

public class Cliente {
    public static void main (String[]args){
        Juego superJuego = new Juego();
        superJuego.setName("Juego de acciones").setVersion("2025");

        Disparar disparar = new Disparar(superJuego);
        ModoDefensa modoDefensa = new ModoDefensa(superJuego);
        Atacar atacar = new Atacar(superJuego);

        Acciones acciones = new Acciones();

        acciones.addCommand(disparar);
        acciones.addCommand(modoDefensa);
        acciones.addCommand(atacar);

        acciones.accionesCmd();
    }
}
