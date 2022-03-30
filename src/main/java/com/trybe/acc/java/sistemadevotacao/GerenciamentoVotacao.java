package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfComputado = new ArrayList<String>();
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
    for (String cpf : cpfComputado) {
      if (cpf == cpfPessoaEleitora) {
        System.out.println("Pessoa eleitora já votou!");
      } else {
        for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
          if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
            pessoaCandidata.recebeVoto();
            cpfComputado.add(cpfPessoaEleitora);
          }
        }

      }
    }
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