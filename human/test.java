package human;

public class test {
	public static void main(String[] args) {
		
		Cuerpo cuerpo=new Cuerpo();
		
		cuerpo.brazo1.setNombre("Brazo Derecho");
		cuerpo.brazo1.setLongitud(3);
		cuerpo.brazo1.setNum_dedos(5);
		System.out.println(cuerpo.brazo1);
		
		cuerpo.brazo2.setNombre("Brazo Izquierdo");
		cuerpo.brazo2.setLongitud(3);
		cuerpo.brazo2.setNum_dedos(5);
		System.out.println(cuerpo.brazo2);

		
		cuerpo.pierna1.setNombre("Pierna Derecha");
		cuerpo.pierna1.setLongitud(3);
		cuerpo.pierna1.setNum_dedos(5);
		System.out.println(cuerpo.pierna1);

		
		cuerpo.pierna2.setNombre("Pierna Derecha");
		cuerpo.pierna2.setLongitud(3);
		cuerpo.pierna2.setNum_dedos(5);
		System.out.println(cuerpo.pierna2);

		
		cuerpo.cabeza.setLongitudSombrero(45);
		cuerpo.cabeza.setNombre("Cabeza");
		cuerpo.cabeza.setNum_ojos(2);
		cuerpo.cabeza.setPeludo(true);
		System.out.println(cuerpo.cabeza);

		
		cuerpo.tronco.setAncho(45);
		cuerpo.tronco.setLargo(40);
		cuerpo.tronco.setOmbligo(true);
		cuerpo.tronco.setNombre("Tronco");
		System.out.println(cuerpo.tronco);

		
		System.out.println(cuerpo);
		
		
		
		
	}
}
