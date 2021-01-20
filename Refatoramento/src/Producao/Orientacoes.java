package Producao;

import java.util.ArrayList;
import java.util.Scanner;

import Colaboradores.Colaboradores;
import main.Formulario;
import main.Sistema;

public class Orientacoes extends ProducaoAcademica implements Formulario {

    static Scanner input = new Scanner(System.in);

    @Override
    public ProducaoAcademica PreencherDados(ArrayList<main.Projetos> projetos, Colaboradores colaborador) 
    {
        if(colaborador.getTipo().equals("PROFESSOR")){

            System.out.println("Digite um título para sua orientação:");
            var titulo = input.nextLine();
            System.out.println("Digite o nome do projeto a ser associado");
            var NomeProjeto = input.nextLine();
            Orientacoes novaOrientacao = new Orientacoes();

            if (!Sistema.AnaliseGeral(colaborador, NomeProjeto)) {
                return null;
            }
            novaOrientacao.setGeral(NomeProjeto);
            novaOrientacao.setTitulo(titulo);
            novaOrientacao.setTipo("ORIENTAÇÃO");
            Sistema.setProducao(projetos , NomeProjeto , novaOrientacao);

            return novaOrientacao;
        }
        else{
            System.out.println("Permissão: somente professores podem criar orientações!!");
        }
        return null;
    }

    public void setGeral(String NomeProjeto) {

        super.Projetos.add(NomeProjeto);
        System.out.println("Digite o ano dessa produção: Ex: yyyy");
        var ano = Integer.parseInt(input.nextLine());
        super.Ano = ano;
        System.out.println("Escreva o nome do aluno a ser orientado:");
        var aluno = input.nextLine();
        super.Alunos.add(aluno);
        System.out.println("Escreva a orientaçao:");
        var orientacao = input.nextLine();
        super.orientacao.add(orientacao);
        while (true) {
            System.out.println("Deseja escrever uma orientação a outro aluno(a)? \n[1] - SIM\n[2] - NÃO");
            var opcao = Integer.parseInt(input.nextLine());
            if (opcao == 2)
                break;
            System.out.println("Escreva o nome do aluno a ser orientado:");
            aluno = input.nextLine();
            super.Alunos.add(aluno);
            System.out.println("Escreva a orientaçao:");
            orientacao = input.nextLine();
            super.orientacao.add(orientacao);
        }
    }


    }

