package template_method.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		/*
		HummerModel h1 = new HummerH1Model();
		h1.run();
		
		HummerModel h2 = new HummerH2Model();
		h2.run();*/
		
		System.out.println("--------------H1型号悍马--------------");
		
		System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要  1-需要");
		
		String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		HummerH1Model hh1 = new HummerH1Model();
		if(type.equals("0")){
			hh1.setArarm(false);
		}
		hh1.run();
			
		System.out.println("--------H2型号悍马");
		HummerH2Model hh2 = new HummerH2Model();
		hh2.run();
	}
}
