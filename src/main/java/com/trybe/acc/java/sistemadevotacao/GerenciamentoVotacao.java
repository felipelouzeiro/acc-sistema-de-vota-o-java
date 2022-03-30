package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<Object> pessoasCandidatas;
  private ArrayList<Object> pessoasEleitoras;
  private ArrayList<String> cpfComputado;
  private int totalVotos;

  public void cadastrarPessoaCandidata(String nome, int numero) {
    // verifica numero
    // se numero da pessoa candidata já registrado:
    System.out.println("Número pessoa candidata já utilizado!");
    // se não:
    PessoaCandidata pessoaCandidata = new PessoaCandidata();
    // passando o nome e numero para o construtor dessa classe;
    // e adciona no array pessoasCandidatas;
  }

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    // verifica cpf
    // se cpf da pessoa eleitora já registrado:
    System.out.println("Pessoa eleitora já cadastrada!");
    // se não:
    PessoaEleitora pessoaEleitora = new PessoaEleitora();
    // passando o nome e cpf para o construtor dessa classe;
    // e adciona no array pessoasEleitoras;
  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    // verifica se cpf já está no array cpfComputado
    // se cpf da pessoa eleitora já registrado:
    System.out.println("Pessoa eleitora já votou!");
    // se não, percorre array pessoasCandidatas, e chama o metodo recebeVoto:
    PessoaCandidata pessoaCandidata = new PessoaCandidata();
    // recebeVoto
    // insere cpf da pessoaEleitora no array cpfComputado
  }

  public void mostraResultado() {
    // verifica se já existe algum voto computado
    // se não:
    System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    // se sim:
    // imprime resultado
    System.out.println("Nome: Maria - 1 votos ( 100.0% ) \n Total de votos: 1");
  }

  private double calculaPorcentagem(int indicePessoaCandidata) {
    // verifica o objeto do indice em pessoasCandidatas, pega a porcentagem do
    // numero de votos dessa pessoa;

    // deve-se converter o numero de votos para float ou double e utilizar o metodo
    // round ou math do java para converter em uma casa decimal
    return totalVotos;
  }
}