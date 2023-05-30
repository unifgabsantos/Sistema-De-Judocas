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
public class AlunoTest {
    public AlunoTest(){};
    /*
     * Teste de criação do Aluno
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
    @Test
    public void criacaoAluno() {
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
  @Test
    public void StringAluno(){
        Aluno a = new Aluno();
        Filiado f = new Filiado();
        a.setFiliado(f);
       
        a.getFiliado().setNome("Example 123");
        assertEquals(a.getFiliado().getNome(),"Example 123");
        
        a.getFiliado().setRegistroCbj("Example");
        assertEquals(a.getFiliado().getRegistroCbj(),"Example");
        
        a.getFiliado().setTelefone1("12345");
        assertEquals(a.getFiliado().getTelefone1(),"12345");
        
        a.getFiliado().setTelefone2("6789");
        assertEquals(a.getFiliado().getTelefone2(),"6789");
         
        a.getFiliado().setEmail("guilherme@example.com");
        assertEquals(a.getFiliado().getEmail(),"guilherme@example.com");
        
        a.getFiliado().setObservacoes("Aaaa");
        assertEquals(a.getFiliado().getObservacoes(),"Aaaa");
    }
}