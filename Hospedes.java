package hotel_at3;

public class Hospedes extends Thread{
	//atributos
	private String nome;
	private Quarto num_quarto;
	//thread
	
	//construtor
	public Hospedes(String nome, Quarto num_quarto) {
		this.nome=nome;
		this.num_quarto=num_quarto;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public Quarto getNum_quarto() {
		return num_quarto;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setNum_quarto(Quarto num_quarto) {
		this.num_quarto=num_quarto;
	}
	

	//metodos
	//thread
	public void Esperar() {
		//esperar a camareira terminar de limpar
	}
	public void EntregarChave() {
		//check out
	}
	public void Sair() {
		//sair para visitar a cidade - entregar chave recepção
	}
	
	public void Passear() {
		//quando não tiver quarto disponivel ele da uma volta e dps volta
	}
	
	public void Reclamar() {
		//se ele sair para passear 2 vezes e não tiver quarto ele faz reclamação
	}
}
