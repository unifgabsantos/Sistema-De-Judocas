/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.fpij.jitakyoei.model.beans;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class ProfessorTest {
    
    public ProfessorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class Professor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Professor instance = new Professor();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Professor.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Professor instance = new Professor();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiliado method, of class Professor.
     */
    @Test
    public void testGetFiliado() {
        System.out.println("getFiliado");
        Professor instance = new Professor();
        Filiado expResult = null;
        Filiado result = instance.getFiliado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFiliado method, of class Professor.
     */
    @Test
    public void testSetFiliado() {
        System.out.println("setFiliado");
        Filiado filiado = null;
        Professor instance = new Professor();
        instance.setFiliado(filiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidades method, of class Professor.
     */
    @Test
    public void testGetEntidades() {
        System.out.println("getEntidades");
        Professor instance = new Professor();
        List<Entidade> expResult = null;
        List<Entidade> result = instance.getEntidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidades method, of class Professor.
     */
    @Test
    public void testSetEntidades() {
        System.out.println("setEntidades");
        List<Entidade> entidades = null;
        Professor instance = new Professor();
        instance.setEntidades(entidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Professor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
