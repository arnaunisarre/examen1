package Classes;

import java.util.List;

public interface MathManager {




    List<OperacionMat> fulfilledOrdersByAlumno();                       //listado de operaciones relaizadas por un alumno
    List<OperacionMat> fulfilledOrdersByInstituto();                    //listado de operaciones relaizadas por un instituto
    boolean pedirOperacion(OperacionMat operacion,Alumno alumno);                                   //Realiza una operacion que se guarda en la cola

    int fulfillOperacion();                         //Procesa una operacion
    List<Classes.Instituto> institutoListOperaciones(); //LISTA DE INSTITUOS EN ORDEN DESCENDENTE SEGUN LAS OPERCIONES REALIZADAS


}

