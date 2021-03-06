package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /**
   * Classe principal.
   */
  public static void main(String[] args) {

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    short opcao;
    // menu cadastro de candidatos;
    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomePessoaCandidata = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroPessoaCandidata = scanner.nextInt();

        gerenciamentoVotacao.cadastrarPessoaCandidata(nomePessoaCandidata, numeroPessoaCandidata);

      } else if (opcao != 2) {
        System.out.println("Entre com uma opção válida!");
      }
    } while (opcao != 2);

    // menu cadastro de eleitores;
    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomePessoaEleitora = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitora = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nomePessoaEleitora, cpfPessoaEleitora);

      } else if (opcao != 2) {
        System.out.println("Entre com uma opção válida!");
      }
    } while (opcao != 2);

    // menu de votação
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      opcao = scanner.nextShort();

      if (opcao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitoraVotacao = scanner.next();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numeroPessoaCandidataVotacao = scanner.nextInt();

        gerenciamentoVotacao.votar(cpfPessoaEleitoraVotacao, numeroPessoaCandidataVotacao);

      } else if (opcao == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (opcao != 3) {
        System.out.println("Entre com uma opção válida!");
      }
    } while (opcao != 3);

    gerenciamentoVotacao.mostrarResultado();
    scanner.close();
  }
}
