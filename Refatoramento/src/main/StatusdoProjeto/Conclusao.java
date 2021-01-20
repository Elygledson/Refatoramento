package main.StatusdoProjeto;

public class Conclusao implements AlterarStatus{

	private String status  = "Status não alterado";
	@Override
	public void Restricao01(int q_professor, int q_geral) {
		return;
	}
	
	@Override
	public void Restricao02(boolean flag) {
		if (!flag) {
		  System.out.println("Status alterado para ''CONCLUÍDO''.");
		  this.status = "CONCLUÍDO";
	  } else {
		  System.out.println("ERRO: não foi possível alterar status para ''CONCLUÍDO''.");
	  }
  	}

	@Override
	public String returnStatus() {
		return this.status;
	}

}
