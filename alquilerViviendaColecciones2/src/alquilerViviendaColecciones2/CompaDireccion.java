package alquilerViviendaColecciones2;

import java.util.Comparator;

public class CompaDireccion implements Comparator<Vivienda> {

	@Override
	public int compare(Vivienda o1, Vivienda o2) {
		// TODO Auto-generated method stub
		return o1.getDireccion().compareToIgnoreCase(o2.getDireccion());
	}

}
