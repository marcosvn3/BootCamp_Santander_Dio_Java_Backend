package edu.marcosvn3.SintaxeJava.MetodoExercicio_SmartTV;

public class Usuario {

	public static void main(String[] args) {
			SmartTv minhatv = new SmartTv();
			
			minhatv.ligar();
			minhatv.aumentarVolume();
			minhatv.aumentarVolume();
			minhatv.aumentarVolume();
			minhatv.aumentarVolume();
			minhatv.aumentarVolume();
			minhatv.aumentarVolume();
			
			minhatv.desligar();
			
			minhatv.aumentarVolume();
			minhatv.mudarCanal(8);
			
			System.out.println("Volume da tv:"+minhatv.getVolume());
			
			minhatv.ligar();
			
			minhatv.mudarCanal(4);
			
			System.out.println("Canal atual:"+minhatv.getCanal());
	}

}
