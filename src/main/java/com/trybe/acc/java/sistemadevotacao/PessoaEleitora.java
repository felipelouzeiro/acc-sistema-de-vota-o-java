package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  /**
   * Método PessoaEleitora.
   */
  private String cpf;
  // nome --> herdado da classe pessoa;

  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  @Override
  public String getNome() {
    return nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
