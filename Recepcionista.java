package hotel_at3;

public class Recepcionista extends Thread {
    //atributos
	private String nome;
	
	//construtores
	public Recepcionista() {
		
	}
	public Recepcionista(String nome) {
		this.nome=nome;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}

	//metodo
	public void Alocar(Quarto ocupado, Quarto estado) {
		if(!ocupado.getOcupado() && estado.getEstado()) {
			System.out.println("pronto para ser alugado!");
		} else {
			System.out.println("não pode alugar!");
		}
	}
}
