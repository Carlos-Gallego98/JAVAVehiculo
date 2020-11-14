
public class TestVehiculo {

	public static void main(String[] args) {
		
	Coche miCoche = new Coche("Citroen","X3","Verde",true,"B2");
	miCoche.mostrarC();
	System.out.println(miCoche.acelerar(100));
	System.out.println(miCoche.frenar(25));
	System.out.println(miCoche.acelerar(100));
	System.out.println(miCoche.frenar(175));
	
	System.out.println(miCoche.acelerar(200));
	System.out.println(miCoche.frenar(150));
	System.out.println(miCoche.acelerar(50));
	System.out.println(miCoche.frenar(100));
	
	Moto miMoto = new Moto("Kawasaki","VN900","Rojo",true,"A2");
	miMoto.mostrarM();
	System.out.println(miMoto.acelerar(100));
	System.out.println(miMoto.frenar(25));
	System.out.println(miMoto.acelerar(100));
	System.out.println(miMoto.frenar(175));
	
	System.out.println(miMoto.acelerar(200));
	System.out.println(miMoto.frenar(150));
	System.out.println(miMoto.acelerar(50));
	System.out.println(miMoto.frenar(100));
	
	Bici miBici = new Bici("Macario","X275","Verde", false);
	miBici.mostrarB();
	System.out.println(miBici.acelerar(100));
	System.out.println(miBici.frenar(25));
	System.out.println(miBici.acelerar(100));
	System.out.println(miBici.frenar(175));
	
	System.out.println(miBici.acelerar(200));
	System.out.println(miBici.frenar(150));
	System.out.println(miBici.acelerar(50));
	System.out.println(miBici.frenar(100));
	
}
}
