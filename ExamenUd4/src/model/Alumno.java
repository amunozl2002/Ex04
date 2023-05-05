package model;

public class Alumno {

	// atributos
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int anyoNacimiento;
	private boolean requiereAdaptacion;
	private String descripcionAdaptacion;
	
	
	// constructor
	
	public Alumno(String nombre, String apellido1, String apellido2, int anyoNacimiento, boolean requiereAdaptacion,
			String descripcionAdaptacion) {
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setAnyoNacimiento(anyoNacimiento);
		setRequiereAdaptacion(requiereAdaptacion);
		setDescripcionAdaptacion(descripcionAdaptacion);
	}
	
	// getter y setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	public boolean isRequiereAdaptacion() {
		return requiereAdaptacion;
	}
	public void setRequiereAdaptacion(boolean requiereAdaptacion) {
		this.requiereAdaptacion = requiereAdaptacion;
	}
	public String getDescripcionAdaptacion() {
		return descripcionAdaptacion;
	}
	public void setDescripcionAdaptacion(String descripcionAdaptacion) {
		this.descripcionAdaptacion = descripcionAdaptacion;
	}
	
	public String  mostrar_informacion() {
		String adaptacion = requiereAdaptacion ? "Sí" : "No";
		String respuesta = ("\n---------- DATOS DEL ALUMNO ------------------------------------------------------------------------------" +
				"\n" +"\nNOMBRE: " + nombre + 
				"\nAPELLIDOS = " + apellido1 + " " + apellido2 +  
				"\nAÑO NACIMIENTO : " + anyoNacimiento + 
				"\nREQUIERE ADAPTACION? " + adaptacion +
				"\nDESCRIPCIÓN ADAPTACIÓN: " + descripcionAdaptacion);
		
		return respuesta;
	}

}
