package EjercicioEnClasesSinBridge;

public class Windows implements IPlataforma {

    @Override
    public void arquitectura_x64() {
        System.out.println("Windows x64");
    }

    @Override
    public void arquitectura_x86() {
        System.out.println("Windows x86");
    }
}
