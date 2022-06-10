package tarea8Strategy;

import java.util.List;

public class Verano implements IEstrategia{
    @Override
    public void estrategia(List<Ropa> tienda) {
        System.out.println("OFERTA DE VERANO");
        for (Ropa ropa : tienda) {
            if (!ropa.getPrecio().equals("oferta")) ;
            ropa.showInfo();
        }

    }
}
