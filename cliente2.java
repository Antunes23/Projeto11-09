package Dia21_08;

public class cliente2 {

	public static void main(String[] args) {


		cliente cliente1 = new cliente();
		cliente cliente2 = new cliente();



		//Atributos


		cliente1.setid(001);
		cliente1.setnome("Fernando");
		cliente1.setpassword(123);
		cliente1.setpermissão("sim");
		cliente1.setusuario("fernandinho");
		
		cliente2.setid(002);
		cliente2.setnome("Douglas");
		cliente2.setpassword(123);
		cliente2.setpermissão("sim");
		cliente2.setusuario("Douglão");


		
		//Métodos



		cliente1.setcompra("Comprar");
		cliente1.setpaga("Pagar");
		cliente1.setparcela("Parcelar");
		cliente1.setcaloteia("Calotear");


		cliente2.setcompra ("Comprar");
		cliente2.setpaga("Pagar");
		cliente2.setparcela("Parcelar");
		cliente2.setcaloteia("Calotear");





		System.out.println("------------- CLIENTE 1 ATRIBUTOS ---------------------");
		System.out.println(cliente1.getid());
		System.out.println(cliente1.getnome());
		System.out.println(cliente1.getpassword());
		System.out.println(cliente1.getpermissão());
		System.out.println(cliente1.getusuario());




		System.out.println("-------------- CLIENTE 1 MÉTODOS -----------------");
		System.out.println(cliente1.getcompra());
		System.out.println(cliente1.getpaga());
		System.out.println(cliente1.getparcela());
		System.out.println(cliente1.getcaloteia());




		System.out.println("------------- CLIENTE 2 ATRIBUTOS ---------------------");
		System.out.println(cliente2.getid());
		System.out.println(cliente2.getnome());
		System.out.println(cliente2.getpassword());
		System.out.println(cliente2.getpermissão());
		System.out.println(cliente2.getusuario());




		System.out.println("-------------- CLIENTE 2 MÉTODOS -----------------");
		System.out.println(cliente2.getcompra());
		System.out.println(cliente2.getpaga());
		System.out.println(cliente2.getparcela());
		System.out.println(cliente2.getcaloteia());

	}

}
