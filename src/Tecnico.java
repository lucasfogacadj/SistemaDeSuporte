
public class Tecnico extends Pessoa {
	
	public static int countTecnico;
	private int id;
	public int countchamados;
	

	Tecnico(){
		
		countTecnico++;	
		this.id=countTecnico;
	}
	
}
