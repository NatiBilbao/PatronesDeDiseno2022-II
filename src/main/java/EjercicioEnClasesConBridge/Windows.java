package EjercicioEnClasesConBridge;

public class Windows implements IPlataforma {
    private Arquitectura arquitectura;

    public Windows(Arquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println("Windows " + arquitectura.getArquitectura());
    }
}
