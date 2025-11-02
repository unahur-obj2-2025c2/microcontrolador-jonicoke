package ar.unahur.edu.obj2.patroncommand.invoker;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Programable;
import ar.unahur.edu.obj2.patroncommand.operaciones.IOperable;

public class Programa {

    List<IOperable> operaciones;
    
    public Programa() {
        this.operaciones = new ArrayList<>();
    }
    public void agregarOperacion(IOperable operacion) {
        operaciones.add(operacion);
    }   
    public void agregarOperaciones(List<IOperable> operaciones) {
        operaciones.addAll(operaciones);
    }
    public void vaciarLista() {
        operaciones.clear();
    }
    public void ejecutar(Programable micro) {
        micro.run(operaciones);
    }
    public void resetearMicro (Programable micro) {
        micro.reset();
    }
}
