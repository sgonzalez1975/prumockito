package com.mycompany.prumockito;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class EscritorTest {
    
    public EscritorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of escribe method, of class Escritor.
     */
    @Test
    public void testEscribe() {
        System.out.println("escribe");
        OutputStreamWriter osw = Mockito.mock(OutputStreamWriter.class);
        Escritor instance = new Escritor(osw);
        ArrayList cads = new ArrayList();
        cads.add("cad");
        try 
        {
            instance.escribe(cads);
            Mockito.verify(osw).append("cad");
        }
        catch(Exception e) 
        {
            fail("Falló la prueba");
        }
    }
    
}
