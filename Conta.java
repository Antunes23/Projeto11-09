package Dia21_08;

public class Conta {
	// Atributos 
	
	int id;
	String tipo;
	double saldo;

	
	// Métodos
	
	String sacar;
	String depositar;
	String acessar;
	
	public int getid () {
		return id;
	}
	public void setid (int id) {
		this.id = id;
	}
	public String gettipo () {
		return tipo;
	}
	public void settipo (String tipo) {
		this.tipo= tipo;
	}
	public double getsaldo () {
		return saldo;
	}
	public void setsaldo (double saldo) {
		this.saldo = saldo;
	}
	public String getsacar () {
		return sacar;
	}
	public void setsacar (String sacar) {
		this.sacar = sacar;
	}
	public String getdepositar () {
		return depositar;
	}
	public void setdepositar (String depositar) {
		this.depositar = depositar;
	}
	public String getacessar () {
		return acessar;
	}
	public void setacessar (String acessar) {
		this.acessar = acessar;
	}

}
