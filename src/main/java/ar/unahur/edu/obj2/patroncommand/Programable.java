package ar.unahur.edu.obj2.patroncommand;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.operaciones.IOperable;

public interface Programable {

    void run(List<IOperable> operaciones);

    void incProgramCounter();

    Integer getProgramCounter();

    void setAcumuladorA(Integer value);

    Integer getAcumuladorA();

    void setAcumuladorB(Integer value);

    Integer getAcumuladorB();

    void setAddr(Integer addr);

    Integer getAddr();

    void reset();

    List<Integer> getMemory();

    void setMemory(Integer addr, Integer val);
}
