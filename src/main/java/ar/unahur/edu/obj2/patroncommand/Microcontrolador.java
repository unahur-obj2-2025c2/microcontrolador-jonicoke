package ar.unahur.edu.obj2.patroncommand;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.operaciones.IOperable;

public class Microcontrolador implements Programable {
    private Integer A;
    private Integer B;
    private Integer PC;
    public List<Integer> memoria = new ArrayList<>(1024);
    private Integer addr;
    

    public Microcontrolador(Integer a, Integer b) {
        this.A = a;
        this.B = b;
    }

    @Override
    public void run(List<IOperable> operaciones) {
        operaciones.forEach(op -> op.execute(this));
    }

    @Override
    public void incProgramCounter() {
        this.PC++;
    }

    @Override
    public Integer getProgramCounter() {
        return this.PC;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        this.A = value;
    }

    @Override
    public Integer getAcumuladorA() {
        return this.A;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        this.B = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return this.B;
    }

    @Override
    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    public Integer getAddr() {
        return this.addr;
    }

    @Override
    public void reset() {
        this.A = 0;
        this.B = 0;
        this.PC = 0;
    }  
    @Override
    public List<Integer> getMemory() {
        return this.memoria;
    }
    @Override
    public void setMemory(Integer addr, Integer val) {
        this.memoria.set(addr, val);
    }
}
