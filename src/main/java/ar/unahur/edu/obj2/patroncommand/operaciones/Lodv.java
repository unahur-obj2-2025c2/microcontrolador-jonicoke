package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class Lodv implements IOperable {
    private Integer val;
    public Lodv(Integer val) {
        super();
        this.val = val;
    }
    @Override
    public void execute(Programable micro) {
        micro.setAcumuladorA(val);
        micro.incProgramCounter();
    }
}
