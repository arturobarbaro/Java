package pruebas;

import org.junit.*;
import principal.Bolsa;

import static org.junit.Assert.*;

public class BolsaTest { //Alt + enter
    public static final int CAPACIDAD = 5;   // Capacidad de la bolsa
    private static Bolsa b;

    @BeforeClass
    public static void inicio(){
        b = new Bolsa(CAPACIDAD);
        System.out.println("\nInicio @BeforeClass");
    }

    @AfterClass
    public static void fin(){
        System.out.println("Fin @AfterClass\n");
    }

    @Before
    public void antes(){
        // b = new Bolsa(CAPACIDAD);
        System.out.println("\nAntes");
    }

    @After
    public void despues(){
        System.out.println("Despues\n");
    }

    @Test
    public void vaciaInicialmente(){
        assertEquals("La bolsa debe estar vacia pero no lo esta",0, b.numeroBolas()); // Ctrl + q
    }

    // TODO: 10/05/2018
    @Ignore
    @Test
    public void capacidadInicial(){
        assertEquals("La bolsa debe tener una capacidad inicial de "+CAPACIDAD,

                CAPACIDAD, b.capacidad()); // Ctrl + q

    }

    @Test
    public void numeroBolasTrasagregarBolas() {
        int n=3;      // Numero de bolas
        b.agregarBolas(3);
        assertEquals("La bolsa no tiene el numero de bolas esperado tras agregar "+n+" bolas",
                n,b.numeroBolas());
    }

    @Test(expected = IllegalArgumentException.class)
    public void bolsaCreadaConCapacidadNegativa() {
        Bolsa b1 = new Bolsa(-1);
    }

    @Test(timeout = 100)
    public void agregacionBolasCotasTiempo(){
        for (int i = 0; i < 1000000; i++) {
            b.agregarBolas(1);
        }
    }

}