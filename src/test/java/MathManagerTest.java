import Classes.MathManagerImpl;
import Classes.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MathManagerTest {MathManagerImpl pm = MathManagerImpl.getInstance();
    //Inicilizo las variables
    private final static Logger logger = Logger.getLogger(String.valueOf(MathManagerTest.class));
    //Creo Alumnos
    private Alumno a1;
    private Alumno a2;
    private Alumno a3;
    private Instituto i1;
    private Instituto i2;

    //Creo operaciones
    private OperacionMat p1;
    private OperacionMat p2;
    private OperacionMat p3;
    private OperacionMat p4;

    //Creo los metodos para probar las funciones que he creado

    @Before //Lo que se hace antes de empezar la demostracion
    //Primero inicilizo las estructuras de datos
    public void setUp() throws Exception {
        //Creo tres alumnos
        a1 = new Alumno("Arnau");
        a2 = new Alumno ("Andrés");
        a3 = new Alumno ("Liz");

        //Creo dos institutos
        i1 = new Instituto("Ies XXV");
        i2 = new Instituto("Joan Pelegrí");
        //Creo Operaciones
        p1 = new OperacionMat(a1,i1,"3+2*3");
        p2 = new OperacionMat(a2,i1,"5*4+48+33");
        p3 = new OperacionMat(a3,i2,"(3+9)*4");
        p4 = new OperacionMat(a1,i1,"3+2*3");



    }

    @After //Lo que hago al acabar la demostracion
    //pongo los parametros a null para evitar problemas si vuelvo a arrancar el Testp
    public void tearDown(){
        a1 = null;
        a2 = null;
        a3 = null;
        p1 = null;
        p2 = null;
        p3 = null;
        p4 = null;
        i1= null;
        i2 = null;

    }
    //test para realizar un pedido
    @org.junit.Test
    public void hacerPedido(){
        logger.info("Test: Realizar Clases.Pedido de " +u1.getUser() );
        Assert.assertTrue(pm.getInstance().pedirOperacion(p1,a1));//si el boolean de respuesta es true
    }
    //test para sevir el pedido
    @org.junit.Test
    public void servirPedido(){
        logger.info("Test: Servir Clases.Pedido de " +u2.getUser());

        pm.getInstance().servirPedido();
        Assert.assertEquals(0,pm.getInstance().getPedidos().size());//Me aseguro de que el pedido sea eliminado de la cola del pedidos servidos
    }

}
