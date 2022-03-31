package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfComputado;
  private int totalVotos;

  /**
   * Método construtor.
   */
  public GerenciamentoVotacao() { // apenas inicializa as listas
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
    this.cpfComputado = new ArrayList<String>();
  }

  /**
   * Método cadastrarPessoaCandidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
      } else {
        PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
        pessoasCandidatas.add(pessoaCandidata);
      }
    }
  }

  /**
   * Método cadastrarPessoaEleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (eleitor.getCpf() == cpf) {
        System.out.println("Pessoa eleitora já cadastrada!");
      } else {
        PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
        pessoasEleitoras.add(pessoaEleitora);
      }
    }
  }

  /**
   * Método votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      System.out.println("Pessoa eleitora NAO votou!"); // apagar
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
          pessoaCandidata.recebeVoto();
        }
      }
      cpfComputado.add(cpfPessoaEleitora);
      totalVotos += 1;
      // }
    }
  }

  /**
   * Método mostraResultado.
   */
  public void mostrarResultado() {
    if (totalVotos <= 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        System.out.println(
            "Nome: " + pessoaCandidata.getNome() + " - "
                + pessoaCandidata.getVotos() + "votos" + "( "
                + calculaPorcentagem(pessoasCandidatas.indexOf(pessoaCandidata)) + "% )");
      }
      System.out.println("Total de votos: " + totalVotos);
    }
  }

  private double calculaPorcentagem(int indicePessoaCandidata) {
    int votosPessoaCandidata = pessoasCandidatas.get(indicePessoaCandidata).getVotos();
    return Math.round((votosPessoaCandidata * 100.0) / totalVotos);
  }
}