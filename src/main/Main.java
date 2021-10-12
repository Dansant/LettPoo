package main;

import animal.*;

import java.util.Scanner;

public class Main {

   public static void main (String[] args) throws InterruptedException {

       int choice;
       Scanner myObj = new Scanner(System.in);
       boolean menu = true;
       int ida;
       float tam;
       float alt;
       String corPena;
       String corPelo;

       while (menu == true){

           System.out.println("Digite 0 para sair; \nDigite 1 para cadastrar um Gavião; ");
           System.out.println("Digite 2 para cadastrar um Avestruz \nDigite 3 para cadastrar um Leão;");
           System.out.println("Digite 4 para cadastrar um Morcego. \nEscolha:");
           choice = myObj.nextInt();

           switch (choice)
           {
               case 1: //Cadastro Gavião e amostragem
                   Gavião gav = new Gavião();

                   System.out.println("Digite cor da Pena do Gavião:");
                   corPena = myObj.next();
                   gav.setPena(corPena);

                   System.out.println("Idade do Gavião(anos):");
                   ida = myObj.nextInt();
                   gav.setIdade(ida);

                   System.out.println("Tamanho do Gavião(centimetros):");
                   tam = myObj.nextFloat();
                   gav.setTamanho(tam);

                   System.out.println("Altitude que ele voa(metros):");
                   alt = myObj.nextFloat();
                   gav.setAltitude(alt);

                   System.out.println("Altitude que ele voa(metros):"+ gav.getAltitude());
                   System.out.println("Idade(anos):"+ gav.getIdade());
                   System.out.println("Tamanho(centrimetros):"+ gav.getTamanho());
                   System.out.println("Cor da Pena:"+ gav.getPena());
                   System.out.print("Ele voa? ");
                   gav.voar();
                   System.out.print("Som emitido:");
                   gav.emitirSom();
                   System.out.print("Bota ovos?");
                   gav.ovos();

                   System.out.println("\nAguarde 5 segundos para voltar....\n");
                   Thread.sleep(5000);


                   break;
               case 2: //Cadastro Avestruz e amostragem
                   Avestruz avest = new Avestruz();

                   System.out.println("Digite cor da Pena do Avestruz:");
                   corPena = myObj.next();
                   avest.setPena(corPena);

                   System.out.println("Idade do Avestruz(anos):");
                   ida = myObj.nextInt();
                   avest.setIdade(ida);

                   System.out.println("Tamanho do Avestruz(metros):");
                   tam = myObj.nextFloat();
                   avest.setTamanho(tam);

                   System.out.println("Altitude que ele voa(metros):");
                   alt = myObj.nextFloat();
                   avest.setAltitude(alt);

                   System.out.println("Altitude que ele voa(metros):"+ avest.getAltitude());
                   System.out.println("Idade(anos):"+ avest.getIdade());
                   System.out.println("Tamanho(metros):"+ avest.getTamanho());
                   System.out.println("Cor da Pena:"+ avest.getPena());
                   System.out.print("Ele não voa.\n");
                   System.out.print("Som emitido:");
                   avest.emitirSom();
                   System.out.print("Bota ovos?");
                   avest.ovos();
                   System.out.println("\nAguarde 5 segundos para voltar....\n");
                   Thread.sleep(5000);

                   break;

               case 3: //Cadastro Leão e amostragem
                   Leão leo = new Leão();

                   System.out.println("Digite cor do pelo do Leão:");
                   corPelo = myObj.next();
                   leo.setPelo(corPelo);

                   System.out.println("Idade do Leão(anos):");
                   ida = myObj.nextInt();
                   leo.setIdade(ida);

                   System.out.println("Tamanho do Leão(metros):");
                   tam = myObj.nextFloat();
                   leo.setTamanho(tam);


                   System.out.println("Idade(anos):"+ leo.getIdade());
                   System.out.println("Tamanho(metros):"+ leo.getTamanho());
                   System.out.println("Cor do Pelo:"+ leo.getPelo());
                   System.out.print("Som emitido:");
                   leo.emitirSom();
                   System.out.print("Amamenta? ");
                   leo.amamentar();

                   System.out.println("\nAguarde 5 segundos para voltar....\n");
                   Thread.sleep(5000);
                   break;

               case 4: //Cadastro Morcego e amostragem
                   Morcego morc = new Morcego();

                   System.out.println("Digite cor do pelo do Morcego:");
                   corPelo = myObj.next();
                   morc.setPelo(corPelo);

                   System.out.println("Idade do Morcego(anos):");
                   ida = myObj.nextInt();
                   morc.setIdade(ida);

                   System.out.println("Tamanho do Morcego(centrimetros):");
                   tam = myObj.nextFloat();
                   morc.setTamanho(tam);

                   System.out.println("Idade(anos):"+ morc.getIdade());
                   System.out.println("Tamanho(centrimetros):"+ morc.getTamanho());
                   System.out.println("Cor do Pelo:"+ morc.getPelo());
                   System.out.print("Som emitido:");
                   morc.emitirSom();
                   System.out.print("Amamenta? ");
                   morc.amamentar();
                   System.out.print("Ele voa? ");
                   morc.voar();

                   System.out.println("\nAguarde 5 segundos para voltar....\n");
                   Thread.sleep(5000);
                   break;

               case 0: //Finalização do loop de cadastro e amostragem
                   menu = false;
                   System.out.println("Encerrado.... Aguarde 2 segundos....");
                   Thread.sleep(2000);
                   break;

               default: //Mensagem padrão para escolhas não cadastradas
                   System.out.println("Número Inválido!\nVoltando para a seleção. Aguarde 3 segundos....");
                   Thread.sleep(3000);
                   break;
           }
       }
   }
}
