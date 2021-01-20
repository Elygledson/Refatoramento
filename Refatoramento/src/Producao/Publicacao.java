package Producao;

import java.util.ArrayList;
import java.util.Scanner;

import Colaboradores.Colaboradores;
import main.Formulario;
import main.Sistema;

public class Publicacao extends ProducaoAcademica implements Formulario {

    static Scanner input = new Scanner(System.in);

    @Override
    public ProducaoAcademica PreencherDados(ArrayList<main.Projetos> projetos, Colaboradores colaborador) 
    {

        System.out.println("Digite um título para sua publicação:");
        var titulo = input.nextLine();
        System.out.println("Digite o nome da conferência:");
        var conferencia = input.nextLine();
        System.out.println("Digite o ano de publicação: Ex: yyyy");
        var ano = Integer.parseInt(input.nextLine());
        System.out.println("Digite onde foi publicado:");
        var local = input.nextLine();
        System.out.println("Digite o nome do projeto a ser associado");
        var NomeProjeto = input.nextLine();

        Publicacao novaPublicacao = new Publicacao();

        if (!Sistema.AnaliseGeral(colaborador, NomeProjeto)) {
            return null;
        }
        novaPublicacao.setGeral(NomeProjeto);
        novaPublicacao.setAutores();
        novaPublicacao.setTitulo(titulo);
        novaPublicacao.setAno(ano);
        novaPublicacao.setNome(conferencia);
        novaPublicacao.setTipo("PUBLICAÇÃO");
        novaPublicacao.setLocal(local);
        Sistema.setProducao(projetos, NomeProjeto, novaPublicacao);
        return novaPublicacao;
    }

    public void setGeral(String NomeProjeto) {
        super.Projetos.add(NomeProjeto);
        System.out.println("Escreva a publicação:");
        var publicacao = input.nextLine();
        super.publicacao.add(publicacao);
    }

    public void setAutores() {
        System.out.println("Digite o nome do(a) autor(a):");

        var autor = input.nextLine();

        super.Autores.add(autor);
        System.out.println("\nVoce gostaria de adicionar outro autor?\nSelecione a opção:\n[1] - SIM\n[2] - NÃO");
        var response = Integer.parseInt(input.nextLine());
        while (response > 2 || response <= 0) {
            System.out.println("Comando inválido!Tente novamente");
            response = Integer.parseInt(input.nextLine());
        }
        if (response == 1) {
            setAutores();
        }
    }


    
}
