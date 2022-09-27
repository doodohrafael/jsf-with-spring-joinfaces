package com.rafael.jsfwithspringjoinfaces.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Aluno {

	private String nome;
	private LocalDate dataNascimento;
	
}
