package alquilerViviendaColecciones2;

public class Vivienda  {

	private int codigo;
	private int nHabitaciones;
	private String direccion;
	private float precio;
	
	
	
	public Vivienda() {
		super();
	}



	public Vivienda(int codigo, int nHabitaciones, String direccion, float precio) {
		super();
		this.codigo = codigo;
		this.nHabitaciones = nHabitaciones;
		this.direccion = direccion;
		this.precio = precio;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public int getnHabitaciones() {
		return nHabitaciones;
	}



	public void setnHabitaciones(int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}


	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + nHabitaciones;
		result = prime * result + Float.floatToIntBits(precio);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivienda other = (Vivienda) obj;
		if (codigo != other.codigo)
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (nHabitaciones != other.nHabitaciones)
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Vivienda [codigo=" + codigo + ", nHabitaciones=" + nHabitaciones + ", direccion=" + direccion
				+ ", precio=" + precio + "]";
	}




	
	
}
