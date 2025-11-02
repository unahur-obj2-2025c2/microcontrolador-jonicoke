package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class Lod implements IOperable{
    private Integer addr;
    public Lod(Integer addr) {
        super();
        this.addr = addr;
    }

    @Override
    public void execute(Programable micro) {
        micro.setAddr(addr);
        Integer value = micro.getMemory().get(micro.getAddr());
        micro.setAcumuladorA(value);
        micro.incProgramCounter();
    }

}
