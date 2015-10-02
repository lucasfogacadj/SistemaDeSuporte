import java.util.Scanner;

public class Chamados {
	
	private String desc;
	private int numChmadao;
	public static int countCliente;
	public static int countTecnico;
	private int idCliente;
	private int urgencia;
	private Tecnico tel;
	private Cliente c;
	private int status;
	private String data;
	
	Scanner tc = new Scanner(System.in);

	
	
	Chamados(Tecnico tel, Cliente c){
		this.setTel(tel);
		this.setC(c);
	}

	
	@Override
	public String toString() {
		return "Chamados [desc=" + desc + ", idCliente=" + idCliente + ", urgencia=" + urgencia + ", tel=" + tel
				+ ", c=" + c + ", tc=" + tc + "]";
	}


	public void lerChamado(){
		System.out.println("Informe a descrição do problema");
		this.setDesc(tc.next());
		System.out.println("Status do chamado:\n1- Aberto \n2-Fechado");
		this.setStatus(tc.nextInt());
		System.out.println("Informe a Urgencia de\n 4-Urgente \n3-Alta \n2-Moderada \n1-Baixa\n");
		this.setUrgencia(tc.nextInt());
		System.out.println("Informe o numero do chamado\n");
		this.setNumChmadao(tc.nextInt());
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


	public Tecnico getTel() {
		return tel;
	}


	public void setTel(Tecnico tel) {
		this.tel = tel;
	}


	public Cliente getC() {
		return c;
	}


	public void setC(Cliente c) {
		this.c = c;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + idCliente;
		result = prime * result + ((tc == null) ? 0 : tc.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + urgencia;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamados other = (Chamados) obj;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (tc == null) {
			if (other.tc != null)
				return false;
		} else if (!tc.equals(other.tc))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (urgencia != other.urgencia)
			return false;
		return true;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getNumChmadao() {
		return numChmadao;
	}


	public void setNumChmadao(int numChmadao) {
		this.numChmadao = numChmadao;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}




	
	
	
	
	

}
