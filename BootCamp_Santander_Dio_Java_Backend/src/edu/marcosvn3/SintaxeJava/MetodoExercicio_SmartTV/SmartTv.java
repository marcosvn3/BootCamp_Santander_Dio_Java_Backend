package edu.marcosvn3.SintaxeJava.MetodoExercicio_SmartTV;

public class SmartTv {
	private boolean ligada = false;
	private int canal = 1;
	private int volume = 0;
	private final int volumeMax = 10; 
	private final int volumeMin = 0;
	
	
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public void ligar() {
		this.ligada = true;
	}
	public void desligar() {
		this.ligada = false;
	}
	
	public void aumentarVolume() {
		if(this.ligada == true) {	
			if(this.volume < this.volumeMax){
				this.volume+=1;
			}
		}else{
			System.out.println("Sua tv esta desligada!");
		}
		
	}
	
	public void diminuirVolume() {
		if(this.ligada == true) {	
			if(this.volume > this.volumeMin){
				this.volume-=1;
			}
		}else{
			System.out.println("Sua tv esta desligada!");
		}
	}
	
	public void mudarCanal(int canal){
		if(this.ligada == true) {	
			this.canal = canal;
		}else{
			System.out.println("Sua tv esta desligada!");
		}
	}
	
}
