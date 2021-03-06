
public class Menus {
	
	public static StringBuilder menuGerente(){
		
		StringBuilder menu = new StringBuilder();
		menu.append("Digite:\n");
		menu.append("1 - Cadastrar Cliente\n");
		menu.append("2 - Cadastrar Tecnico\n");
		menu.append("3 - Cadastrar Gerente\n");
		menu.append("4 - Exlcuir Cliente\n");
		menu.append("5 - Excluir Tecnico\n");
		menu.append("6 - Excluir Gerente\n");
		menu.append("7 - Atualizar Cliente\n");
		menu.append("8 - Atualizar Tecnico\n");
		menu.append("9 - Atualizar Gerente\n");
		menu.append("10 - Sair\n");
		
		return menu;
	}
	
	public static StringBuilder menuLogar(){
		
		StringBuilder menu = new StringBuilder();
		menu.append("Digite para logar como:\n");
		menu.append("1- Gerente:\n");
		menu.append("2- Cliente:\n");
		menu.append("3- Tecnico:\n");
		menu.append("4- Sair\n");
	
		
		return menu;
	}
	
	public static StringBuilder menuCliente(){
		
		StringBuilder menu = new StringBuilder();
		menu.append("Digite:\n");
		menu.append("1 - Cadrastrar Chamado.\n");
		menu.append("2 - Listar seus Chamados\n");
		menu.append("3 - Atualizar o chamado\n");
		menu.append("10 - Sair\n");
		
		return menu;
	}
	
	public static StringBuilder menuTecnico(){
		StringBuilder menu = new StringBuilder();
		menu.append("Digite:\n");
		menu.append("1- Consultar chamados\n");
		menu.append("Encerrar Chamados\n");
		
		return menu;
	}
	
}
