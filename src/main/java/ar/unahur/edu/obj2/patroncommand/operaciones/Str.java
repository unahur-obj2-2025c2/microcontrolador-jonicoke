package ar.unahur.edu.obj2.patroncommand.operaciones;


import ar.unahur.edu.obj2.patroncommand.Programable;

public class Str extends Comando{

    public Str() {
        super();
    }
    @Override
    public void DoExecute(Programable micro) {
        micro.setMemory(micro.getAddr(), micro.getAcumuladorA());
    }

}
