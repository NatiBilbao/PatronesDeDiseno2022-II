package tarea8Strategy;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String name;
    private List<Ropa> ropaList= new ArrayList<>();
    private IEstrategia strategySales;

    public Tienda(String name){
        this.name=name;
    }

    public void addRopa(Ropa ropa){
        ropaList.add(ropa);
    }

    public IEstrategia getStrategySales() {
        return strategySales;
    }

    public void setStrategySales(IEstrategia strategySales) {
        this.strategySales = strategySales;
    }

    public void iniciarEstrategia(){
        strategySales.estrategia(ropaList);
    }
}
