import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Cliente> cliente = new ArrayList<>();
		ArrayList<Tecnico> tecnico = new ArrayList<>();
		ArrayList<Gerente> gerente = new ArrayList<>();
		ArrayList <Chamados> chamado = new ArrayList<>();
		
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
				String email;
				String senha;
				System.out.println("Faça o Login");
				System.out.println("Digite o email:");
				email=tc.next();
				System.out.println("--------------------------------");
				System.out.println("Digite a senha:");
				senha=tc.next();
				for(int i=0; i<gerente.size(); i++){
				Gerente g=gerente.get(i);
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
				String senha;
				String email;
				System.out.println("Faça o Login");
				System.out.println("Digite o email:");
				email=tc.next();
				System.out.println("--------------------------------");
				System.out.println("Digite a senha:");
				senha=tc.next(); 
				for(int i=0; i<cliente.size(); i++){
					Cliente c = cliente.get(i);
					if(c.validaLogin(email, senha)){
						System.out.println("Login com Sucesso!");
						System.out.println("------------------");
						int op;
						do{
							System.out.println(Menus.menuCliente());
							op=tc.nextInt();
							switch(op){
							case 1:{
								//Cadastrar Chamado
								Tecnico sel= tecnico.get(0);
								for(int x=0; x<tecnico.size(); x++){
									if(sel.countchamados>tecnico.get(x).countchamados){
										sel=tecnico.get(x);
										Chamados ch = new Chamados(sel, c);
										ch.lerChamado();
										chamado.add(ch);
									}
								}
								
								break;
							}
							case 2:{
								//Consultar chamados do cliente
								for(int d=0; d<chamado.size(); d++){
									if(chamado.get(d).getC().equals(c)){
										System.out.println(chamado.get(d).toString());
									}
									else{
										System.out.println("Não possui chamados cadastrados");
									}
								}
								
								break;
							}
							
							case 3:{
								//Editar e cancelar chamado
								String nome;
								int numChamado;
								System.out.println("Informe o nome do Tecnico");
								nome=tc.next();
								System.out.println("Informe o numero do Chamado");
								numChamado=tc.nextInt();
								int posicao;
								Tecnico t1 = new Tecnico();
								for(int i1=0; i1<tecnico.size(); i1++){
									if(t1.comparaNome(nome)){
										posicao=i1;
									}
								}
								for(int r=0; r<chamado.size(); r++){
									if((chamado.get(r).getNumChmadao())==(numChamado)){
										Chamados up = new Chamados(t1, c);
										up.lerChamado();
										chamado.set(0, up);
									}
								}
								break;
							}
							
							}
							
						}while(opc!=10);
					}
					
					
					else{
						System.out.println("Email ou senha errado!");
					}
				}
				
				break;
			}
			
			case 3:{
				String senha;
				String email;
				System.out.println("Faça o Login");
				System.out.println("Digite o email:");
				email=tc.next();
				System.out.println("--------------------------------");
				System.out.println("Digite a senha:");
				senha=tc.next(); 
				for(int i=0; i<tecnico.size(); i++){
					Tecnico tt = tecnico.get(i);
					if(tt.validaLogin(email, senha)){
						System.out.println("Login com Sucesso!");
						System.out.println("------------------");
						int ppp;
						System.out.println(Menus.menuTecnico());
						ppp=tc.nextInt();
						
						do{
						
							switch(ppp){
							//listar chamados do tecnico
							case 1:{
								
								for(int o=0; o<chamado.size(); o++){
									if(chamado.get(o).getStatus()==1){
										if(chamado.get(o).getUrgencia()==1){
											System.out.println("Chamados Abertos");
											System.out.println(chamado.get(o).toString());
										}
										if(chamado.get(o).getUrgencia()==2){
											System.out.println("Chamados Abertos");
											System.out.println(chamado.get(o).toString());
										}
										if(chamado.get(o).getUrgencia()==3){
											System.out.println("Chamados Abertos");
											System.out.println(chamado.get(o).toString());
										}
										if(chamado.get(o).getUrgencia()==4){
											System.out.println("Chamados Abertos");
											System.out.println(chamado.get(o).toString());
										}
									}else{
										System.out.println("Chamados fechado");
										System.out.println(chamado.get(o).toString());
									}
								}
								break;
							}
							case 2:{
								//encerra chamados
								int numChamado;
								System.out.println("Informe o numero do chamado");
								numChamado=tc.nextInt();
								for(int o=0; o<chamado.size(); o++){
									if(chamado.get(o).getNumChmadao()==numChamado){
										System.out.println("Informe a data do fechamento");
										String data;
										data=tc.next();
										chamado.get(o).setData(data);
										chamado.get(o).setStatus(0);
									}
								}
							}
							}
						
						}while(ppp!=10);
			
			
						break;
					}
					break;
			}
				
			
		}while(opc!=4);
		
		
	}

	}while(opc!=10);
	}
}

