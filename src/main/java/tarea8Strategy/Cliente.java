package tarea8Strategy;

public class Cliente {
    public static void main(String []args){
        Tienda tiendaDeRopa = new Tienda("Shein");
        tiendaDeRopa.addRopa(new Ropa("Invierno","+10%"));
        tiendaDeRopa.addRopa(new Ropa("Verano","+10%"));
        tiendaDeRopa.addRopa(new Ropa("Primavera","+10%"));
        tiendaDeRopa.addRopa(new Ropa("Otoño","+10%"));

        tiendaDeRopa.setStrategySales(new Invierno());
        tiendaDeRopa.iniciarEstrategia();

        tiendaDeRopa.addRopa(new Ropa("Invierno","-10%"));
        tiendaDeRopa.addRopa(new Ropa("Verano","-10%"));
        tiendaDeRopa.addRopa(new Ropa("Primavera","-10%"));
        tiendaDeRopa.addRopa(new Ropa("Otoño","-10%"));

        tiendaDeRopa.setStrategySales(new Verano());
        tiendaDeRopa.iniciarEstrategia();

        tiendaDeRopa.addRopa(new Ropa("Invierno","normal"));
        tiendaDeRopa.addRopa(new Ropa("Verano","normal"));
        tiendaDeRopa.addRopa(new Ropa("Primavera","normal"));
        tiendaDeRopa.addRopa(new Ropa("Otoño","normal"));

        tiendaDeRopa.setStrategySales(new Primavera());
        tiendaDeRopa.iniciarEstrategia();

        tiendaDeRopa.addRopa(new Ropa("Invierno","-50%"));
        tiendaDeRopa.addRopa(new Ropa("Verano","-50%"));
        tiendaDeRopa.addRopa(new Ropa("Primavera","-50%"));
        tiendaDeRopa.addRopa(new Ropa("Otoño","-50%"));

        tiendaDeRopa.setStrategySales(new Otoño());
        tiendaDeRopa.iniciarEstrategia();
    }
}
