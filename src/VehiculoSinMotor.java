
public class VehiculoSinMotor extends Vehiculo {

	private boolean motor;
	private static int nVSM;
	
	public VehiculoSinMotor (String marca, String modelo, String color, int velocidad, boolean motor, String tipoLicencia)
	{
		super(marca, modelo, color, velocidad);
		this.motor=motor;
		
		nVSM++;
	}
	
	public boolean isMotor() {
		return motor;
	}
	
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	public void mostrarVSM()
	{
		System.out.println("Lleva motor:" +isMotor() + "\tNumero de vehiculos con motor:" +nVSM);
	}
}
