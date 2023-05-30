/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.fpij.jitakyoei.model.beans;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class ProfessorTest {
    
    public ProfessorTest() {
    }
    /*
     * Teste de criação do Professor
     */
    @Test
    public void criacaoProfessor(){
        Professor p = new Professor();
        Filiado f = new Filiado();
        p.setFiliado(f);
        assertEquals(p.getFiliado().getId(),null);
        assertEquals(p.getFiliado().getNome(),null);
        assertEquals(p.getFiliado().getRegistroCbj(),null);
        assertEquals(p.getFiliado().getDataNascimento(),null);
        assertEquals(p.getFiliado().getDataCadastro(),null);
        assertEquals(p.getFiliado().getTelefone1(),null);
        assertEquals(p.getFiliado().getTelefone2(),null);
        assertEquals(p.getFiliado().getEmail(),null);
        assertEquals(p.getFiliado().getCpf(),null);
        assertEquals(p.getFiliado().getObservacoes(),null);
    }
    @Test
    public void StringProfessor(){
        Professor p = new Professor();
        Filiado f = new Filiado();
        p.setFiliado(f);
       
        p.getFiliado().setNome("Example 123");
        assertEquals(p.getFiliado().getNome(),"Example 123");
        
        p.getFiliado().setRegistroCbj("Example");
        assertEquals(p.getFiliado().getRegistroCbj(),"Example");
        
        p.getFiliado().setTelefone1("12345");
        assertEquals(p.getFiliado().getTelefone1(),"12345");
        
        p.getFiliado().setTelefone2("6789");
        assertEquals(p.getFiliado().getTelefone2(),"6789");
         
        p.getFiliado().setEmail("guilherme@example.com");
        assertEquals(p.getFiliado().getEmail(),"guilherme@example.com");
        
        p.getFiliado().setObservacoes("Aaaa");
        assertEquals(p.getFiliado().getObservacoes(),"Aaaa");
    }
}
