package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class SWAP implements IOperable {

    public SWAP() {
        super();
    }
    @Override
    public void execute(Programable micro) {
        Integer auxA = micro.getAcumuladorA();
        Integer auxB = micro.getAcumuladorB();
        
        micro.setAcumuladorA(auxB);
        micro.setAcumuladorB(auxA);

        micro.incProgramCounter();
    }

}
