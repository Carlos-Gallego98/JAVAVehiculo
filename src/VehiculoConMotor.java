
public class VehiculoConMotor extends Vehiculo {

	private boolean motor;
	private static int nVCM;
	private String tipoLicencia;
	
	public VehiculoConMotor(String marca, String modelo, String color, int velocidad, boolean motor, String tipoLicencia)
	{
		super(marca, modelo, color, velocidad);
		this.motor=motor;
		this.tipoLicencia = tipoLicencia;
		
		nVCM++;
	}
	
	public boolean isMotor() {
		return motor;
	}
	
	public void setMotor (boolean motor) {
		this.motor = motor;
	}
	
	public String getTipoLicencia() {
		return tipoLicencia;
	}
	
	public void setTipoLicencia (String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
		
	}
	
	public void mostrarVCM()
	{
		mostrarV();
		System.out.println("Tipo Licencia:" +getTipoLicencia() + "\t Lleva motor:" +isMotor());
	}
}
