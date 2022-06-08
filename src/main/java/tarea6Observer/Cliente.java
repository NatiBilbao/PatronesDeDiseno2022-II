package tarea6Observer;

public class Cliente {
    public static void main (String [] args){
        EmpresaCompaniaTelefonica viva = new EmpresaCompaniaTelefonica();
        viva.usuario(new UserCompaniaTelefonica("Precios llamadas", new Persona("Cris","79564004")));
        viva.usuario(new UserCompaniaTelefonica("promociones",new Persona("Carlos","60154879")));
        viva.usuario(new UserCompaniaTelefonica("premios", new Persona("Lili","79665425")));
        viva.usuario(new UserCompaniaTelefonica("noticias", new Persona("Andrea","75421348")));
    }
}
