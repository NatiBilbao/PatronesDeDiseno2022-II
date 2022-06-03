package tarea3Memento;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String,Memento> Backups = new HashMap<>();

     public void createBackups(String backups, Memento m){
         Backups.put(backups,m);
     }

     public Memento getBackups(String backups){
         return Backups.get(backups);
     }
}
