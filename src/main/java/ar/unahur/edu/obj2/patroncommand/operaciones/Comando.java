package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Programable;

public abstract class Comando implements IOperable {

    @Override
    public void execute(Programable micro) {
        this.DoExecute(micro);
        micro.incProgramCounter();
    }
    protected abstract void DoExecute(Programable micro);
}
