package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class Add extends Comando {

    public Add() {
        super();
    } 
    @Override
    public void DoExecute(Programable micro) {
        micro.setAcumuladorA(micro.getAcumuladorA() + micro.getAcumuladorB());
        micro.setAcumuladorB(0);
    }

}
