
public class coche extends VehiculoConMotor{

	protected int nRuedas = 4;
	
	public coche (String marca, String modelo, String color, int velocidad, boolean motor, String tipoLicencia)
	{
		super(marca, modelo, color, velocidad, motor, tipoLicencia);
	}
	
	public void mostrarC()
	{
		mostrarVCM();
		System.out.println("Numero de ruedas:" +nRuedas);
	}
}
