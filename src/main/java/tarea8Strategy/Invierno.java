package tarea8Strategy;

import java.util.List;

public class Invierno implements IEstrategia{
    @Override
    public void estrategia(List<Ropa> tienda) {
        System.out.println("OFERTA DE INVIERNO");
        for (Ropa ropa : tienda) {
            if (!ropa.getPrecio().equals("oferta")) ;
            ropa.showInfo();
        }

    }
}
