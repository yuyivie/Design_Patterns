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
		
		System.out.println("--------------H1�ͺź���--------------");
		
		System.out.println("H1�ͺŵĺ����Ƿ���Ҫ�������죿0-����Ҫ  1-��Ҫ");
		
		String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		HummerH1Model hh1 = new HummerH1Model();
		if(type.equals("0")){
			hh1.setArarm(false);
		}
		hh1.run();
			
		System.out.println("--------H2�ͺź���");
		HummerH2Model hh2 = new HummerH2Model();
		hh2.run();
	}
}
