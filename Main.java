package hotel_at3;

public class Main {
	public static void main(String[] args) {
		//instancias
		
		Hotel hotelzin = new Hotel("macajuba");
		

		
		Quarto q01 = new Quarto("01",true,true);
		Quarto q02 = new Quarto("02",true,true);
		Quarto q03 = new Quarto("03",true,true);
		Quarto q04 = new Quarto("04",true,true);
		Quarto q05 = new Quarto("05",true,true);
		Quarto q06 = new Quarto("06",false,false);
		Quarto q07 = new Quarto("07",false,true);
		Quarto q08 = new Quarto("08",false,false);
		Quarto q09 = new Quarto("09",false,true);
		Quarto q10 = new Quarto("10",false,false);
		
		q01.setEstadoChave(EstadoChave.Ocupada);
		q02.setEstadoChave(EstadoChave.Ocupada);
		q03.setEstadoChave(EstadoChave.Ocupada);
		q04.setEstadoChave(EstadoChave.Ocupada);
		q05.setEstadoChave(EstadoChave.Ocupada);
		q06.setEstadoChave(EstadoChave.Limpeza);
		q07.setEstadoChave(EstadoChave.Disponivel);
		q08.setEstadoChave(EstadoChave.Limpeza);
		q09.setEstadoChave(EstadoChave.Disponivel);
		q10.setEstadoChave(EstadoChave.Limpeza);
		
		q06.Limpando(EstadoChave.Limpeza);
		q07.Limpando(EstadoChave.Disponivel);
		q08.Limpando(EstadoChave.Limpeza);
		q09.Limpando(EstadoChave.Disponivel);
		q10.Limpando(EstadoChave.Limpeza);
		
		Recepcionista r1 = new Recepcionista();
		Recepcionista r2 = new Recepcionista();
		Recepcionista r3 = new Recepcionista();
		Recepcionista r4 = new Recepcionista();
		Recepcionista r5 = new Recepcionista();
		
		
		
	}
}
