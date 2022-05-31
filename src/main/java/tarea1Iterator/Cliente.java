package tarea1Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Cliente {
    public static void main(String[]args){
        ConcreteAggregateA importadora1 = new ConcreteAggregateA();
        importadora1.add("jose1");
        importadora1.add("jose2");
        importadora1.add("jose3");
        importadora1.add("jose4");
        importadora1.add("jose5");

        ConcreteAggregateB importadora2 = new ConcreteAggregateB();
        importadora2.add("juan1");
        importadora2.add("juan2");
        importadora2.add("juan3");
        importadora2.add("juan4");
        importadora2.add("juan5");

        Iterator iterator;
        iterator = importadora1.createIterator();

        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("importadora1: "+client);
        }

        iterator = importadora2.createIterator();

        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("importadora2: "+client);
        }
    }
}
