package EjercicioEnClasesConBridge;

public class Linux implements IPlataforma {
    private Arquitectura arquitectura;

    public Linux(Arquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println("Linux " + arquitectura.getArquitectura());
    }
}
