package observer.example1.core2;

import java.awt.List;

public class Test {
	public static void main(String[] args) {
		LiSi lisi = new LiSi();	
		HanFeiZi2 h = new HanFeiZi2();
		h.addObserver(lisi);
		h.haveBreakfast();
	}
}
