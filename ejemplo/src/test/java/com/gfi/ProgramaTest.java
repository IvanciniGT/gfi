package com.gfi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class ProgramaTest extends TestCase{
    
    public ProgramaTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( ProgramaTest.class );
    }

    public void testPrograma1(){
        int resultado=Programa.suma(4,8);
        assertEquals(resultado,12);
    }
    public void testPrograma2(){
        int resultado=Programa.suma(4,-8);
        assertEquals(resultado,-4);
    }
    public void testPrograma3(){
        int resultado=Programa.suma(1,0);
        assertEquals(resultado,1);
    }
    public void testPrograma4(){
        int resultado=Programa.suma(-2,-3);
        assertEquals(resultado,-5);
    }
}