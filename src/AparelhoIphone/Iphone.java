package AparelhoIphone;

import Aparelhos.AparelhoTelefonico;
import Aparelhos.NavegadorInternet;
import Aparelhos.ReprodutorMusical;
import java.util.Scanner;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int tela;
        int selecionado;

        System.out.println("Botão Ligar");
        selecionado = sc.nextInt();
        if (selecionado == 0) {
            System.out.println("Ligando Iphone \n");
        } else {
            System.out.println("Desligando Iphone");
        }

        System.out.println("Menu: \n" + "1-Internet \n" + "2-Musica \n" + "3-Telefone");

        selecionado = sc.nextInt();

        if (selecionado == 1) {
            System.out.println("Internet");
            System.out.println("Menu: \n" + " 11 -" + " 12 -" + " 13");
            selecionado = sc.nextInt();
            if (selecionado == 11) {
                iphone.exibirPagina();
            } else if (selecionado == 12) {
                iphone.adicionarNovaAba();
            } else if (selecionado == 13) {
                iphone.atualizarPagina();
            } else {
                System.out.println("Opção Inválida! \n" + "Tente Novamente!");
            }
        } else if (selecionado == 2) {
            System.out.println("Música");
            System.out.println("Menu: \n" + " 21 -" + " 22 -" + " 23");
            selecionado = sc.nextInt();
            if (selecionado == 21) {
                iphone.selecionarMusica();
            } else if (selecionado == 22) {
                iphone.tocar();
            } else if (selecionado == 23) {
                iphone.pausar();
            } else {
                System.out.println("Opção Inválida! \n" + "Tente Novamente!");
            }
        } else if (selecionado == 3) {
            System.out.println("Telefone");
            System.out.println("Menu: \n" + " 31 -" + " 32 -" + " 33");
            selecionado = sc.nextInt();
            if (selecionado == 31) {
                iphone.ligar();
            } else if (selecionado == 32) {
                iphone.atender();
            } else if (selecionado == 33) {
                iphone.iniciarCorreioDeVoz();
            } else {
                System.out.println("Opção Inválida!  \n" + "Tente Novamente!");
            }
        } else {
            System.out.println("Opção Inválida!");
        }
        sc.close();
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página Web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Página Web...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página Web...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música...");
    }
}
