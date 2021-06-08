package alquilerViviendaColecciones2;

import java.util.*;

public class AlquilerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner (System.in);
		ArrayList <Vivienda> comunidad =new ArrayList <Vivienda>();
		
		int opciones;
		
		do {
			System.out.println("1. Introducir vivienda");
			System.out.println("2. Ordenar viviendas");
			System.out.println("3. Consultar por alquiler y categoría");
			System.out.println("4. Borrar todo");
			System.out.println("5. Ordenar por precio");
			System.out.println("6. Ordenar por dirección");
			System.out.println("0. Salir");
			opciones=teclado.nextInt();
			
			switch(opciones) {
			case 1:
				insertarDatos(teclado, comunidad);
				break;
			case 2:
				ordenar(comunidad);
				break;
			case 3:
				consultar(teclado,comunidad);
				break;
			case 4:
				borrarTodo(comunidad);
				break;
			case 5:
				Collections.sort(comunidad, new CompaPrecio());
				System.out.println("Viviendas ordenadas por precio: "+ comunidad);
				break;
			case 6:
				Collections.sort(comunidad, new CompaDireccion());
				System.out.println("Viviendas ordenadas por dirección: "+comunidad);
				break;
			}
			
		}while(opciones!=0);
		
		
	}

	public static void insertarDatos(Scanner teclado, ArrayList <Vivienda> comunidad) {
		
		Vivienda v = new Vivienda();
			
			System.out.println("Introduce el código de la vivienda");
			v.setCodigo(teclado.nextInt());
			System.out.println("Introduce el número de habitaciones");
			v.setnHabitaciones(teclado.nextInt());
			System.out.println("Introduce la dirección");
			v.setDireccion(teclado.next());
			System.out.println("Introduce el precio");
			v.setPrecio(teclado.nextFloat());
			comunidad.add(v);
			
		
		System.out.println(comunidad);
		
	}
	
	public static void ordenar (ArrayList <Vivienda> comunidad) {
	Iterator<Vivienda> it = comunidad.iterator();
		while(it.hasNext())
			
			System.out.println(it.next());
	}
	
	public static void consultar(Scanner teclado, ArrayList <Vivienda> comunidad) {
		System.out.println("Introduce el precio de la vivienda");
		int precioBuscar = teclado.nextInt();
		System.out.println("Introduce el número de habitaciones");
		int habitacionesBuscar= teclado.nextInt();
		int noEnc=0;
		for(Vivienda v:comunidad) {
			noEnc++;
			if(precioBuscar==v.getPrecio() && habitacionesBuscar==v.getnHabitaciones()) {
				System.out.println(v);
				
			}else if(noEnc==comunidad.size()){
				
				
				System.out.println("No encontrado");
			}
		}
	}
	
	public static void borrarTodo(ArrayList <Vivienda> comunidad) {
		comunidad.removeAll(comunidad);
	}
	
	
}
