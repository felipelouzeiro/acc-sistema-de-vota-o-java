package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private int totalVotos;

  /**
   * Método cadastrarPessoaCandidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
      } else {
        PessoaCandidata pessoaCandidata = new PessoaCandidata(numero, nome);
        pessoasCandidatas.add(pessoaCandidata);
      }
    }
  }

  /**
   * Método cadastrarPessoaEleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    // verifica cpf
    // se cpf da pessoa eleitora já registrado:
    System.out.println("Pessoa eleitora já cadastrada!");
    // se não:
    PessoaEleitora pessoaEleitora = new PessoaEleitora();
    // passando o nome e cpf para o construtor dessa classe;
    // e adciona no array pessoasEleitoras;
  }

  /**
   * Método votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    // verifica se cpf já está no array cpfComputado
    // se cpf da pessoa eleitora já registrado:
    System.out.println("Pessoa eleitora já votou!");
    // se não, percorre array pessoasCandidatas, e chama o metodo recebeVoto:
    PessoaCandidata pessoaCandidata = new PessoaCandidata();
    // recebeVoto
    // insere cpf da pessoaEleitora no array cpfComputado
  }

  /**
   * Método mostraResultado.
   */
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