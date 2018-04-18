package Classes;



public class OperacionMat {



    Alumno alumno;
    Instituto instituto;
    String operacion;




    public OperacionMat(){}

    public OperacionMat(Alumno alumno, Instituto instituto, String operacion){

        this.alumno = alumno;
        this.instituto=instituto;
        this.operacion = operacion;

    }






    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }



    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }





    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }



}
