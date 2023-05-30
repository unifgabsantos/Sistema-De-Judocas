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

}