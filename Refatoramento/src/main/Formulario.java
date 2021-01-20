package main;

import java.util.ArrayList;

import Colaboradores.Colaboradores;
import Producao.ProducaoAcademica;

public interface Formulario 
{
    public ProducaoAcademica PreencherDados(ArrayList<Projetos> projetos,Colaboradores colaborador);
}
