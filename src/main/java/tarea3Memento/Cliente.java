package tarea3Memento;

public class Cliente {
    public static void main(String[] args){
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        Alias alias = new Alias();

        Persona persona;
        persona = new Persona("Cris","456","27");
        alias.setBackups(persona);
        baseDeDatos.createBackups("BackupMarzo",alias.createBackups());

        persona = new Persona("Carlos","789","22");
        alias.setBackups(persona);
        baseDeDatos.createBackups("BackupMayo",alias.createBackups());

        persona = new Persona("Jesus","123","26");
        alias.setBackups(persona);
        baseDeDatos.createBackups("BackupJunio",alias.createBackups());

        persona = new Persona("Lili","147","25");
        alias.setBackups(persona);
        baseDeDatos.createBackups("BackupJulio",alias.createBackups());

        persona = new Persona("Andy","369","30");
        alias.setBackups(persona);
        baseDeDatos.createBackups("BackupAgosto",alias.createBackups());

        persona = alias.restoreBackups(baseDeDatos.getBackups("BackupMayo"));
        persona.showInfo();
    }
}
