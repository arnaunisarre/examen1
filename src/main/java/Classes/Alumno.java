package Classes;
import java.util.ArrayList;
import java.util.List;

public class Alumno {


    private static int num = 0;     //Cantidad de usuarios registrados
    String nombre;

    OperacionMat operacion = new OperacionMat();
    List<OperacionMat> operacionesRealizadas = new ArrayList<>();


    public Alumno(){}


    public Alumno(String name){
        this.nombre = name;


    }

    public OperacionMat addOperacionesRealizadas (OperacionMat operacionMat){
        operacionesRealizadas.add(operacionMat);
        return operacionMat;
    }


    public OperacionMat getOperacion(){return this.operacion;}

    public List<OperacionMat> getAllOperacionesRealizadas() {
        return this.operacionesRealizadas;}
}
