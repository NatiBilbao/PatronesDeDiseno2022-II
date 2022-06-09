package tarea7State;

public class Computadora {
    private IStateComputadora stateComputera;
    private ProgramasAbiertos programasAbiertos;
    private MemoriaRam memoriaRam;
    private CPU cpu;

    public Computadora(){
        programasAbiertos = new ProgramasAbiertos();
        memoriaRam = new MemoriaRam();
        cpu = new CPU();

        programasAbiertos.setCantidadDeprogramas(20).setRecuersosUtilizados(5);
        memoriaRam.setCapacidadTotal("16g").setRecursosUtilizados(5).setDescription("Intel");
        cpu.setCantidadDeSubprocesos(8).setCache("8MB").setVelocidadDelBus("8GT/s").setRecursosUtilizados(5);
    }

    public ProgramasAbiertos getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ProgramasAbiertos programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public IStateComputadora getStateComputer() {
        return stateComputera;
    }

    public void setStateComputer(IStateComputadora stateComputera) {
        this.stateComputera = stateComputera;
    }

    public void resourceManager() throws InterruptedException {
        stateComputera.resourceManager(this);
    }
}
