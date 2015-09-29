import java.util.Scanner;

public class Chamados {
	
	private String desc;
	public static int countCliente;
	public static int countTecnico;
	private int idCliente;
	private int idTecnico;
	private int urgencia;
	
	Scanner tc = new Scanner(System.in);

	
	
	Chamados(){
		countCliente++;
		countTecnico++;	
	}

	
	public void lerChamado(){
		System.out.println("Informe a descrição do problema");
		this.setDesc(tc.next());
		System.out.println("Informe o id do Cliente");
		this.setIdCliente(tc.nextInt());
		System.out.println("Informe o id do tecnico");
		this.setIdTecnico(tc.nextInt());
		System.out.println("Informe a Urgencia de\n 4-Urgente \n3-Alta \n2-Moderada \n1-Baixa\n");
		this.setUrgencia(tc.nextInt());
	}
	

	public int getUrgencia() {
		return urgencia;
	}


	public void setUrgencia(int urgencia) {
		this.urgencia = urgencia;
	}


	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public int getIdTecnico() {
		return idTecnico;
	}



	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}
	
	
	
	

}
