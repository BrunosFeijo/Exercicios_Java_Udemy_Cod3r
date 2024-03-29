package br.com.CursoJava.visao;

import br.com.CursoJava.excecao.ExplosaoException;
import br.com.CursoJava.excecao.SairException;
import br.com.CursoJava.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
        private Tabuleiro tabuleiro;
        private Scanner entrada = new Scanner(System.in);

        public TabuleiroConsole(Tabuleiro tabuleiro){
            this.tabuleiro = tabuleiro;

            executarJogo();
        }

    private void executarJogo() {
            try{
                boolean continuar = true;

                while(continuar){
                    cicloDoJogo();
                    System.out.println("Outra partida? (S/n)");
                    String resposta = entrada.nextLine();

                    if("n".equalsIgnoreCase(resposta)){
                        continuar = false;
                        System.out.println("Fim de Jogo");
                    }else{
                        tabuleiro.reiniciar();
                    }
                }
            }catch (SairException e ){
                System.out.println(e.getMessage());
            }finally {
                entrada.close();
            }

    }

    private void cicloDoJogo() {
            try{
                while(!tabuleiro.objetivoAlcancado()){
                    System.out.println(tabuleiro);

                    String digitado = capturaValorDigitado("Digite as coordenadas (x,y): ");

                    Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                            .map(e -> Integer.parseInt(e.trim()))
                            .iterator();

                    digitado = capturaValorDigitado("1 - Abrir\n2 - Marcar\n");
                    if("1".equalsIgnoreCase(digitado)){
                        tabuleiro.abrir(xy.next(), xy.next());
                    }else if ("2".equalsIgnoreCase(digitado)){
                        tabuleiro.alternarMarcacao(xy.next(), xy.next());
                    }
                }
                System.out.println("Você ganhou!!");
            }catch (ExplosaoException e){
                System.out.println(tabuleiro);
                System.out.println(e.getMessage());
            }
    }
    private String capturaValorDigitado(String texto){
        System.out.print(texto);
        String digitado = entrada.nextLine();

        if("sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }
        return digitado;
    }
}
