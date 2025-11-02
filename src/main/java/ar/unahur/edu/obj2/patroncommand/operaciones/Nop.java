package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class Nop implements IOperable {

    public Nop() {
        super();
    }
    @Override
    public void execute(Programable micro) {
        micro.incProgramCounter();
    }

}
