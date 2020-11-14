
public class bicicleta extends VehiculoSinMotor {
	
	protected int nRuedas = 2;
	
	public bicicleta (String marca, String modelo, String color, int velocidad, boolean motor, String tipoLicencia)
	{
		super(marca, modelo, color, velocidad, motor, tipoLicencia);
	}
	
	public void mostrarB()
	{
		mostrarVSM();
		System.out.println("Numero de ruedas:" +nRuedas);
	}
}
