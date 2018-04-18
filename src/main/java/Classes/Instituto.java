package Classes;

import java.util.ArrayList;
import java.util.List;

public class Instituto {



    String nombre;
    List<OperacionMat> operacionesRealizadas = new ArrayList<>();
    int numeroOperacionesRealizadas;

    public Instituto(String name){
        this.nombre = name;
        this.numeroOperacionesRealizadas=0;

    }
    public OperacionMat addOperacionesRealizadas (OperacionMat operacionMat){
        operacionesRealizadas.add(operacionMat);
        return operacionMat;
    }

    public List<OperacionMat> getAllOperacionesRealizadas() {
        return this.operacionesRealizadas;}

    public int getNumeroOperacionesRealizadas() {
        return numeroOperacionesRealizadas;
    }

    public void setNumeroOperacionesRealizadas(int numeroOperacionesRealizadas) {
        this.numeroOperacionesRealizadas = numeroOperacionesRealizadas;
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }






}
