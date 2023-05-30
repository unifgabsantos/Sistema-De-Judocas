/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.fpij.jitakyoei.model.beans;

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
public class AlunoTest {
    /*
     * Teste de criação da classe Aluno
    	Long id;
	String nome;
	String registroCbj;
	Date dataNascimento;
	Date dataCadastro;
	String telefone1;
	String telefone2;
	String email;
	String cpf;
	String observacoes;
     */
    public AlunoTest() {
        Aluno a = new Aluno();
        Filiado f = new Filiado();
        a.setFiliado(f);
        assertEquals(a.getFiliado().getId(),null);
        assertEquals(a.getFiliado().getNome(),null);
        assertEquals(a.getFiliado().getRegistroCbj(),null);
        assertEquals(a.getFiliado().getDataNascimento(),null);
        assertEquals(a.getFiliado().getDataCadastro(),null);
        assertEquals(a.getFiliado().getTelefone1(),null);
        assertEquals(a.getFiliado().getTelefone2(),null);
        assertEquals(a.getFiliado().getEmail(),null);
        assertEquals(a.getFiliado().getCpf(),null);
        assertEquals(a.getFiliado().getObservacoes(),null);
    }
    
    /**
     * Test of getFiliado method, of class Aluno.
     */
    @Test
    public void testGetFiliado() {
        System.out.println("getFiliado");
        Aluno instance = new Aluno();
        Filiado expResult = null;
        Filiado result = instance.getFiliado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFiliado method, of class Aluno.
     */
    @Test
    public void testSetFiliado() {
        System.out.println("setFiliado");
        Filiado filiado = null;
        Aluno instance = new Aluno();
        instance.setFiliado(filiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class Aluno.
     */
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        Aluno instance = new Aluno();
        Entidade expResult = null;
        Entidade result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidade method, of class Aluno.
     */
    @Test
    public void testSetEntidade() {
        System.out.println("setEntidade");
        Entidade entidade = null;
        Aluno instance = new Aluno();
        instance.setEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class Aluno.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        Aluno instance = new Aluno();
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessor method, of class Aluno.
     */
    @Test
    public void testSetProfessor() {
        System.out.println("setProfessor");
        Professor professor = null;
        Aluno instance = new Aluno();
        instance.setProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Aluno.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Aluno.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Aluno instance = new Aluno();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyProperties method, of class Aluno.
     */
    @Test
    public void testCopyProperties() {
        System.out.println("copyProperties");
        Aluno other = null;
        Aluno instance = new Aluno();
        instance.copyProperties(other);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
