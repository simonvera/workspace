package cl.curso.java.ejemplo3;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cancion uno=new Cancion("asdf", "Simon", 4);
		Cancion dos=new Cancion("hfdj","Simon",3);
		Cancion tres=new Cancion("bcxnb","Simon",5);
		ArrayList<Cancion>canciones=new ArrayList<Cancion>();
		canciones.add(uno);
		canciones.add(dos);
		canciones.add(tres);
		Playlist asdf=new Playlist("vnmc", canciones);
		ArrayList<Playlist>playlist=new ArrayList<Playlist>();
		playlist.add(asdf);
		Usuario simon=new Usuario("Simon", playlist);
	}

}
