package abstractExcetion.interfacee.com.wipro.q2;

import abstractExcetion.interfacee.music.Playable;
import abstractExcetion.interfacee.music.string.Veena;
import abstractExcetion.interfacee.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		
		v.play();
		s.play();
		
		Playable pv = new Veena();
		Playable ps = new Saxophone();
		
		pv.play();
		ps.play();
	}
}
