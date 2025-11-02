package ar.unahur.edu.obj2.patroncommand.operaciones;


import ar.unahur.edu.obj2.patroncommand.Programable;

public class Str implements IOperable{

    public Str() {
        super();
    }
    @Override
    public void execute(Programable micro) {
        micro.setMemory(micro.getAddr(), micro.getAcumuladorA());
        micro.incProgramCounter();
    }

}
