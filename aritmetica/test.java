package aritmetica;

public class test {
	public static void main(String[] args) {

		Fraccion n1 = new Fraccion(new Numero(3),new Numero(4));
		Fraccion n2 = new Fraccion(new Numero(8),new Numero(2));
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		
		System.out.println("Numero 1");
		n1.sumar(n2);
		System.out.println(n1.toString());
		
		n1 = new Fraccion(new Numero(3),new Numero(4));
		n1.restar(n2);
		System.out.println(n1.toString());
		
		n1 = new Fraccion(new Numero(3),new Numero(4));
		n1.multiplicar(n2);
		System.out.println(n1.toString());
		
		n1 = new Fraccion(new Numero(3),new Numero(4));
		n1.dividir(n2);
		System.out.println(n1.toString());
		
		
		Numero num = new Numero(5);
		Numero num2 = new Numero(16);
		
		num.sumar(num2);
		System.out.println(num.getValor());
		num.restar(num2);
		System.out.println(num.getValor());
		num.multiplicar(num2);
		System.out.println(num.getValor());
		num.dividir(num2);
		System.out.println(num.getValor());
	
		
	}
}
