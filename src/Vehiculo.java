
public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private int velocidad;
	private final int VEL_MAX = 120;
	
	public Vehiculo(String marca, String modelo, String color, int velocidad)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.velocidad=velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	private int acelerar(int a)
	{
		velocidad +=a;
		if (velocidad >= VEL_MAX)
		{
			System.out.println("Has alcanzado la velocidad maxima:");
			
		}
		else {
	
			System.out.println("Tu velocidad actual es:");
		}
		return velocidad;
	}

	private int frenar(int f)
	{
		velocidad -= f;
		if (velocidad <=0)
		{
			System.out.println("Tu vehiculo esta parado");
		}
		else {
			System.out.println("Tu velocidad actual es:");
		}
		return velocidad;
	}
	
	public void mostrarV()
	{
		System.out.println("Marca" +getMarca() + "\tModelo" +getModelo() + "\tColor:" +getColor() + "\tVelociadadInicial");
	}
}
