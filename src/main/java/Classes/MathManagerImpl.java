package Classes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Queue.QueueImp;

import java.nio.file.OpenOption;
import java.util.*;


public class MathManagerImpl implements MathManager{


    private static MathManagerImpl instance;
    private HashMap<String, Alumno> alumnos;
    private List<Classes.OperacionMat> operaciones;
    private List<Classes.Instituto> institutos;


    private QueueImp<OperacionMat> queue = new QueueImp<OperacionMat>();
    private static final Logger log =LogManager.getLogger(MathManager.class.getName());


    private MathManagerImpl(){
        institutos = new ArrayList<>();
        alumnos = new HashMap<>();
        operaciones = new  ArrayList<>();
    }

    public static MathManagerImpl getInstance(){

        if (instance == null){
            instance = new MathManagerImpl();
            log.info("Instancia creada");
        }
        return instance;
    }

    public void delete(){
        instance = null;
        log.info("Instáncia borrada");
    }

    public void addUsuario (Alumno u){
        alumnos.put(u.nombre, u);
        log.info("Usuarioa añadido correctamente "+u.toString());

    }
    public Alumno getUsuario (String name){
        return alumnos.get(name);
    }

    public List<Classes.Instituto> institutoListOperaciones() {

        log.info("Lista de institutos ordenados descendentemenete por operaciones realizadas");
        List<Classes.Instituto> list = new ArrayList<>(institutos); // copia de la lista
        Collections.sort(list, new Comparator<Instituto>() {
            @Override
            public int compare(Instituto o1, Instituto o2) {
                return o2.getNumeroOperacionesRealizadas() - o1.getNumeroOperacionesRealizadas();
            }
        });
        return  list;

    }

    public boolean pedirOperacion(OperacionMat operacion,Alumno alumno){

        log.info("Alumno "+alumno);
        try{
            queue.add(operacion);
            log.info("Pedido realizado por "+alumno.nombre);
            return true;
        }
        catch (FullQueue e){
            log.warn("Pedido de "+ alumno.nombre + " no se pudo realizar, queue llena");
            return false;
        }

    }

    private int processOperacion(OperacionMat oper) {
        log.info("Procesando operacion");

        int r = 0;
        return r;


    }


    public int fulfillOperacion() {
        int res = 0;
        try {
            OperacionMat o = queue.get();
            res = processOperacion(o);
            alumnos.get(o.owner).addOperacionesRealizadas(o);

        }
        catch (EmptyQueue e){
            log.warn("Intento de obtener pedido de la cola cuando esta vacía");
            res = 1000;
    }

        return res;
    }


    public List<OperacionMat> fulfilledOrdersByAlumno(Alumno alumno) {
        log.info("Pedidos realizados por alumno: "+alumno.nombre);
        List<OperacionMat> list = alumno.operacionesRealizadas;
        return list;
    }


    public List<OperacionMat> fulfilledOrdersByInstituto(Instituto instituto) {
        log.info("Pedidos realizados por instituto: "+instituto.nombre);
        List<OperacionMat> list = instituto.operacionesRealizadas;
        return list;
    }



}
