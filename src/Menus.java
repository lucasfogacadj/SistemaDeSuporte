
public class Menus {
	
	public static StringBuilder menuGerente(){
		
		StringBuilder menu = new StringBuilder();
		menu.append("Digite:\n");
		menu.append("1 - Cadastrar Cliente\n");
		menu.append("2- Cadastrar Tecnico\n");
		menu.append("3- Cadastrar Gerente\n");
		menu.append("4 - Exlcuir Cliente\n");
		menu.append("5 - Excluir Tecnico\n");
		menu.append("6 - Excluir Gerente\n");
		menu.append("7 - Atualizar Cliente\n");
		menu.append("8 - Atualizar Tecnico\n");
		menu.append("9 - Atualizar Gerente\n");
		
		return menu;
	}
	
	public static StringBuilder menuLogar(){
		
		StringBuilder menu = new StringBuilder();
		menu.append("Digite para logar como:\n");
		menu.append("1- Gerente:\n");
		menu.append("2- Tecnico:\n");
		menu.append("3- Cliente:\n");
		menu.append("4- Sair\n");
	
		
		return menu;
	}
	
	
}
