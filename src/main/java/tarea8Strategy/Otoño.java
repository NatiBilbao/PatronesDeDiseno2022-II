package tarea8Strategy;

import java.util.List;

public class Otoño implements IEstrategia{
    @Override
    public void estrategia(List<Ropa> tienda){
        System.out.println("OFERTA DE OTOÑO");
        for(Ropa ropa:tienda){
            if (!ropa.getPrecio().equals("oferta"));
            ropa.showInfo();
        }

    }
}
