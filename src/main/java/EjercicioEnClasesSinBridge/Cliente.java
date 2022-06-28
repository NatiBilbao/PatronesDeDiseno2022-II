package EjercicioEnClasesSinBridge;

public class Cliente {
    public static void main(String[]args){
        System.out.println("LINUX");
        Linux linux = new Linux();
        linux.arquitectura_x64();
        linux.arquitectura_x86();
        System.out.println();

        System.out.println("WINDOWS");
        Windows windows = new Windows();
        windows.arquitectura_x64();
        windows.arquitectura_x86();



    }
}
