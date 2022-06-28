package EjercicioEnClasesSinBridge;

public class Linux implements IPlataforma {

    @Override
    public void arquitectura_x64() {
        System.out.println("Linux x64");
    }

    @Override
    public void arquitectura_x86() {
        System.out.println("Linux x86");
    }
}
