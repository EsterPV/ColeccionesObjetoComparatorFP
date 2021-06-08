package alquilerViviendaColecciones2;

import java.util.Comparator;

public class CompaPrecio implements Comparator<Vivienda> {

	@Override
	public int compare(Vivienda o1, Vivienda o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrecio() - o2.getPrecio());
	}

	


	
}
