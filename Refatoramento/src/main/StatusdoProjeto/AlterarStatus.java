package main.StatusdoProjeto;

public interface AlterarStatus {

    /*Restrição01: deve conter pelo menos um professor e um aluno para que o status seja alterado para "EM ANDAMENTO"*/
    public void Restricao01(int q_professor,int q_geral);

    /*Restrição02: o projeto deve conter produções acadêmicas para que o status seja alterado para "CONCLUÍDO"*/
    public void Restricao02(boolean flag);

    public String returnStatus();
}
