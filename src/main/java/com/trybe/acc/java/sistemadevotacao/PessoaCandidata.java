package com.trybe.acc.java.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  // nome -> herdado da classe Pessoa.
  private int numero;
  private int votos;

  /**
   * Método construtor.
   */
  public PessoaCandidata(int numero, String nome) {
    this.numero = numero;
    this.nome = nome;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  @Override
  public String getNome() {
    return nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void recebeVoto() {
    this.votos += 1;
  }

}
