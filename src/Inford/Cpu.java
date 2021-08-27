package Inford;

import java.util.Date;

public class Cpu extends Tecnologico{
     private int memoriaPricipal;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPricipal) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.setMemoriaPricipal(memoriaPricipal);
    }

    public int getMemoriaPricipal() {
        return memoriaPricipal;
    }

    public void setMemoriaPricipal(int memoriaPricipal) {
        this.memoriaPricipal = memoriaPricipal;
    }
}
