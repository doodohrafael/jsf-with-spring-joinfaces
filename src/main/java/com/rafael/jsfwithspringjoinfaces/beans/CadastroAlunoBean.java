package com.rafael.jsfwithspringjoinfaces.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rafael.jsfwithspringjoinfaces.model.Aluno;

import lombok.Data;

@Data
@Component
@Scope("view")
public class CadastroAlunoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Aluno aluno;
	private Integer idade;
	
	CadastroAlunoBean() {
		this.aluno = new Aluno();
	}
	
	public void mostrarIdade() {
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
		
		this.idade = Period.between(aluno.getDataNascimento(), LocalDate.now()).getYears();
		
		System.out.println(aluno.getNome() + " tem " + idade + " anos.");
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(aluno.getNome() + " tem " + idade + " anos."));
	}
	
	public Date getDataHoje() {
		return new Date();
	}
	

}
