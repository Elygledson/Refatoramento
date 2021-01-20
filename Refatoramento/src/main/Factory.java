package main;

import java.util.ArrayList;

import Colaboradores.Colaboradores;
import Producao.Orientacoes;
import Producao.Publicacao;
import Producao.ProducaoAcademica;

public class Factory{
    
    public static ProducaoAcademica TipodeProducao(int tipo, ArrayList<Projetos> projetos, Colaboradores colaborador)
    {
        if(tipo == 1)
        {
            Publicacao instancia = new Publicacao();
            instancia.PreencherDados(projetos, colaborador);
            return instancia;
        }
        else if (tipo == 2)
        {
            Orientacoes instancia = new Orientacoes();
            instancia.PreencherDados(projetos, colaborador);
            return instancia;
        }
        
        return null;
    }
}
