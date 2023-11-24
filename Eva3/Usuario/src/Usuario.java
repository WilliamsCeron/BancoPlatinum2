public class Usuario {
	private int Rut;
	private String Username;
	private String Password;
	
	// Constructores, getters y setters
  // constructor por defecto
	public Usuario() {
	}
	
	// Constructor con parámetros
	public Usuario(int Rut, String Username, String Password) {
		this.Rut = Rut;
		this.Username = Username;
		this.Password = Password;
	}

	// Getters y setters
	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
}
