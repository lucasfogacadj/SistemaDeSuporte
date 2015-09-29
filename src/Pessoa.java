import java.util.Scanner;

public abstract class Pessoa {
	
	private String nome;
	private int telefone;
	private String email;
	private String senha;
	
	Scanner tc = new Scanner(System.in);

	
	public void ler (){
		System.out.println("Informe o nome");
		this.setNome(tc.next());
		System.out.println("Informe o telefone");
		this.setTelefone(tc.nextInt());
		System.out.println("Informe o email");
		this.setEmail(tc.next());
		System.out.println("Informe a senha");
		this.setSenha(tc.next());
	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getNome() {
		return nome;
	}



	public int getTelefone() {
		return telefone;
	}



	public String getEmail() {
		return email;
	}



	public String getSenha() {
		return senha;
	}



	public Scanner getTc() {
		return tc;
	}
	
	public boolean validaLogin(String email, String senha){
		if((email.equals(this.email))&&(senha.equals(this.senha))){
			return true;
		}else{
			return false;
		}
	}

	public boolean comparaNome(String nome){
		if(nome.equals(this.nome)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", senha=" + senha + "]";
	}
	
	
	

}
