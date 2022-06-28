package EjercicioEnClasesConBridge;

public class Cliente {
    public static void main(String[]args){
        Arquitectura arquitectura_x86 = new Arquitectura("x86");
        Arquitectura arquitectura_x64 = new Arquitectura("x64");
        Arquitectura arquitectura_arm = new Arquitectura("arm");


        System.out.println("LINUX");
        Linux linux_x86 = new Linux(arquitectura_x86);
        linux_x86.arquitectura();
        Linux linux_x64 = new Linux(arquitectura_x64);
        linux_x64.arquitectura();
        System.out.println();

        System.out.println("WINDOWS");
        Windows windows_x86 = new Windows(arquitectura_x86);
        windows_x86.arquitectura();
        Windows windows_x64 = new Windows(arquitectura_x64);
        windows_x64.arquitectura();
        Windows windows_arm = new Windows(arquitectura_arm);
        windows_arm.arquitectura();


    }
}
