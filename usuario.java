package Dia21_08;

public class usuario {

	// Atributos 
	
		int id;
		String nome;
		int password;
		String permissao;
		String usuario;

		
		// Métodos
		
		String logar;
		String logout;
		String mexer;
		String Salvar;
		
		public int getid () {
			return id;
		}
		public void setid (int id) {
			this.id = id;
		}
		public String getnome () {
			return nome;
		}
		public void setnome (String nome) {
			this.nome = nome;
		}
		public int getpassword() {
			return password;
		}
		public void setpassword (int password) {
			this.password = password;
		}
		public String getpermissao () {
			return permissao;
		}
		public void setpermissao (String permissao) {
			this.permissao = permissao;
		}
		public String getusuario () {
			return usuario;
		}
		public void setLiga (String usuario) {
			this.usuario = usuario;
		}
		public String getlogar () {
			return logar;
		}
		public void setlogar (String logar) {
			this.logar = logar;
		}
		public String getlogout () {
			return logout;
		}
		public void setlogout (String logout) {
			this.logout = logout;
		}
		public String getmexer () {
			return mexer;
		}
		public void setmexer (String mexer) {
			this.mexer = mexer;
		}
		public String getSalvar () {
			return Salvar;
		}
		public void setSalvar (String Salvar) {
			this.Salvar = Salvar;
		}
	}
