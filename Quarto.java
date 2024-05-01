package hotel_at3;

public class Quarto {
	//atributos
	private String num_quarto;
	private boolean ocupado;
	private boolean estado;
	private EstadoChave estadoChave;
	
	
	//construtor
	public Quarto() {
		
	}
	public Quarto(String num_quarto, boolean ocupado, boolean estado) {
		this.num_quarto=num_quarto;
		this.ocupado=ocupado;
		this.estado=estado;
	}
	public Quarto(String num_quarto, boolean ocupado, boolean estado, EstadoChave estadoChave) {
		this.num_quarto=num_quarto;
		this.ocupado=ocupado;
		this.estado=estado;
		this.estadoChave=estadoChave.Disponivel;
	}
	
	//get e set
	public String getNum_quarto() {
		return num_quarto;
	}
	public boolean getOcupado() {
		return ocupado;
	}
	public boolean getEstado() {
		return estado;
	}
	public EstadoChave getEstadoChave() {
		return estadoChave;
	}
	
	
	public void setNum_quarto(String num_quarto) {
		this.num_quarto=num_quarto;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado=ocupado;
	}
	public void setEstado(boolean estado) {
		this.estado=estado;
	}
	public void setEstadoChave(EstadoChave estadoChave) {
		this.estadoChave=estadoChave;
	}
	
	
	// metodos
	public void Ocupado() {
		if (ocupado == true) {
			System.out.println(getNum_quarto() + "Quarto ocupado");
		}
		else {
			System.out.println(getNum_quarto() +"Quarto desocupado");
		}
	}
	
	public void  Limpo() {
		if(estado == true) {
			System.out.println(getNum_quarto()+"Limpo!");
		}
		else {
			System.out.println(getNum_quarto()+"Não Limpo!");
		}
	}
	
	public void Limpando(EstadoChave estadoChave) {
		if(this.estadoChave == EstadoChave.Limpeza) {
				System.out.println("Limpando!");
			} else {
				System.out.println("Já está limpo!");
			}
	  }
}
