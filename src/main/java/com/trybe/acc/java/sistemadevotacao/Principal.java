package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    GerenciamentoVotacao gVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    short opcao;

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
        Short numeroPessoaCandidata = scanner.nextShort();

      } else if (opcao != 2) {
        System.out.println("Entre com uma opção válida!");
      }
    } while (opcao != 2);
  }

}
