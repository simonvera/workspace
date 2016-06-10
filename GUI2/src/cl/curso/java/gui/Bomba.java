package cl.curso.java.gui;

public class Bomba extends Thread{
	private String []numero={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	public void run(){
		for (int i=9; i>=0;i--){
			try {
				System.out.println(numero [i] );
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
