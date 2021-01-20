package main.StatusdoProjeto;

public class Andamento implements AlterarStatus {

	private String status = "Status não alterado";
	
	@Override
	public void Restricao01(int q_professor,int q_geral)
	{
		if (q_professor >= 1 && q_geral >= 1) {
			this.status = "EM ANDAMENTO";
		System.out.println("Status alterado para ''EM ANDAMENTO''.");
		} else {
			System.out.println("ERRO: não foi possível alterar status para ''EM ANDAMENTO''.");
		}
	}

	@Override
	public void Restricao02(boolean flag) {
		return;
	}

	@Override
	public String returnStatus()
	{
		return this.status;
	}

}
