import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Cliente> cliente = new ArrayList<>();
		ArrayList<Tecnico> tecnico = new ArrayList<>();
		ArrayList<Gerente> gerente = new ArrayList<>();
		
	
		
		Scanner tc = new Scanner(System.in);

		int opc;
		
		do{
			System.out.println(Menus.menuLogar());
			opc=tc.nextInt();
			
			switch(opc){
			
			case 1: {
				if(gerente.isEmpty()){
					Gerente g1 = new Gerente();
					g1.ler();
					gerente.add(g1);
					System.out.println("Gerente Cadastrado com Sucesso!");
					System.out.println("--------------------------------");
				}
				Gerente g = new Gerente();
				String email;
				String senha;
				System.out.println("Faça o Login");
				System.out.println("Digite o email:");
				email=tc.next();
				System.out.println("--------------------------------");
				System.out.println("Digite a senha:");
				senha=tc.next();
				for(int i=0; i<gerente.size(); i++){
				if(g.validaLogin(email, senha)){
					int opca;
					System.out.println("Login feito com sucesso");
					System.out.println("-----------------------");
					do{
						System.out.println(Menus.menuGerente());
					opca = tc.nextInt();
					switch(opca){
					
					case 1:{
						Cliente c1 = new Cliente();
						c1.ler();
						cliente.add(c1);
						break;
					}
					case 2:{
						Tecnico t1 = new Tecnico ();
						t1.ler();
						tecnico.add(t1);
						break;
					}
					case 3:{
						Gerente g1 = new Gerente();
						g1.ler();
						gerente.add(g1);
					}
					case 4:{
						String nome;
						System.out.println("Informe o nome do cliente");
						nome=tc.next();
						int posicao;
						Cliente c1 = new Cliente();
						for(int i1=0; i1<cliente.size(); i1++){
							if(c1.comparaNome(nome)){
								posicao=i1;
								cliente.remove(posicao);
							}else{
								System.out.println("nome não encontrado");
							}
						}
						break;
					}
					case 5:{
						String nome;
						System.out.println("Informe o nome do Tecnico");
						nome=tc.next();
						int posicao;
						Tecnico t1 = new Tecnico();
						for(int i1=0; i1<tecnico.size(); i1++){
							if(t1.comparaNome(nome)){
								posicao=i1;
								tecnico.remove(posicao);
							}else{
								System.out.println("nome não encontrado");
							}
						}
						break;
					}
					case 6:{
						String nome;
						System.out.println("Informe o nome do gerente");
						nome=tc.next();
						int posicao;
						Gerente g1 = new Gerente();
						for(int i1=0; i1<gerente.size(); i1++){
							if(g1.comparaNome(nome)){
								posicao=i1;
								gerente.remove(posicao);
							}else{
								System.out.println("nome não encontrado");
							}
						}
						break;
					}
					case 7:{String nome;
					System.out.println("Informe o nome do cliente");
					nome=tc.next();
					int posicao;
					Cliente c1 = new Cliente();
					for(int i1=0; i1<cliente.size(); i1++){
						if(c1.comparaNome(nome)){
							posicao=i1;
							c1.ler();
							cliente.set(posicao, c1);
						}else{
							System.out.println("nome não encontrado");
						}
					}
					break;
					}
					case 8:{
						String nome;
						System.out.println("Informe o nome do Tecnico");
						nome=tc.next();
						int posicao;
						Tecnico t1 = new Tecnico();
						for(int i1=0; i1<tecnico.size(); i1++){
							if(t1.comparaNome(nome)){
								posicao=i1;
								t1.ler();
								tecnico.set(posicao, t1);
							}else{
								System.out.println("nome não encontrado");
							}
						}
						break;
					}
					case 9:{
						String nome;
						System.out.println("Informe o nome do Gerente");
						nome=tc.next();
						int posicao;
						Gerente g1 = new Gerente();
						for(int i1=0; i1<gerente.size(); i1++){
							if(g1.comparaNome(nome)){
								posicao=i1;
								g1.ler();
								gerente.set(posicao, g1);
							}else{
								System.out.println("nome não encontrado");
							}
						}
						break;
					}
					
					}
					}while(opca!=10);
				}
					else{
					System.out.println("Email ou senha errado:");
				}
				}
				break; 
			}
			case 2:{
				break;
			}
			
			}
			
		}while(opc!=4);
		
		
	}

}
