package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 *������ģʽ��Ҳ��������ģʽ��
 *��һ�����Ӷ���Ĺ��������ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
 */
public class Test {
	 public static void main(String[] args) {
		/*
		 * �ͻ�����XX��˾����Ҫһ��������ģ�ͣ�Ȼ��XX��˾�͸������ϴ�
		 * ˵Ҫ����һ��ģ�ͣ�����һ��˳��Ȼ���Ҿ�������
		 */
		 //��ӽ�����ģʽ֮ǰ�ķ�����ÿ�ζ���Ҫnewһ������
	/*	 BenzModel bena = new BenzModel();
		 //���run˳��
		 ArrayList<String> sequence = new ArrayList<String>();
		 sequence.add("engineBoom");//�ͻ�Ҫ��ģ�run��ʱ���Ҫ�ȷ�������
		 sequence.add("start");//��������
		 sequence.add("stop");//����һ�ξ�ͣ����
		 bena.setSequence(sequence);//���ǰ����˳��������۳�
		 bena.run();*/
		 
		 
		 
		 //��ӽ�����֮��ķ�����
		/* ArrayList<String>sequence = new ArrayList<String>();
		 sequence.add("engineBoom");//�ͻ�Ҫ��ģ�run��ʱ���Ҫ�ȷ�������
		 sequence.add("start");//��������
		 sequence.add("stop");//����һ�ξ�ͣ����
		//Ҫһ�����۳�
		 BenzBuilder benzBuilder = new BenzBuilder();
		 benzBuilder.setSequence(sequence);
		 //�����һ�����۳���
		 BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		 //���۳���һ�¿���
		 benz.run();
		 //����ͬ���ķ�������һ��������
		 BMWBuilder bmwBuilder = new BMWBuilder();
		 bmwBuilder.setSequence(sequence);
		 BMWModel bmw =  (BMWModel) bmwBuilder.getCarModel();
		 bmw.run();*/
		 
		 
		 //����˵�����֮��ķ���
		 
		 /*
		  * ��������һ������������ǵĳ�����͸����״����ˡ�XX��˾ҪA���͵ı��۳�һ������
		  * B���͵ı��۳�100������C���͵ı���1000������D���͵Ĳ���Ҫ���ͷǳ����״�����
		  */
		 Director director = new Director();
		 //1����A���͵ı��۳�
		 for (int i = 0; i < 10000; i++) {
			director.getABenzModel().run();
		}
		 //100����B���͵ı��۳���
		 for (int i = 0; i <1000000 ; i++) {
			director.getBBenzModlel().run();
		}
		 //1000����C���͵ı�����
		 for (int i = 0; i < 10000000; i++) {
			director.getCBMWModel().run();
		}
	}
}
