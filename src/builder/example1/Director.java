package builder.example1;

import java.util.ArrayList;

public class Director {
	private ArrayList<String>sequence = new ArrayList<String>();
	private BenzBuilder banzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	/*
	 * A���͵ı��۳�ģ�ͣ���start��Ȼ��stop������ʲô�����ˣ�����һ��û��
	 */
	
	
	public BenzModel getABenzModel(){
		//��������������һЩ��������Ա��ע��ĵط�
		this.sequence.clear();
		//����ABeanzModel��ִ��˳��
		this.sequence.add("start");
		this.sequence.add("stop");
		//����˳�򷵻�һ�����۳�
		this.banzBuilder.setSequence(sequence);
		return (BenzModel) this.banzBuilder.getCarModel();
	}
	
	/*
	 * B���͵ı��۳�ģ�ͣ����ȷ������棬Ȼ��������Ȼ��ֹͣ��û������
	 */
	public BenzModel getBBenzModlel(){
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.banzBuilder.setSequence(sequence);
		return (BenzModel) this.banzBuilder.getCarModel();
	}
	/*
	 * C�ͺŵı������Ȱ����ȣ�Ȼ��������Ȼ��ֹͣ��
	 */
	public BMWModel getCBMWModel(){
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	/*
	 * D���Ͷ��ֻ��һ�����ܣ������ܣ������������ܣ���Զ��ֹͣ��
	 */
	public BMWModel getDBMWModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	/*
	 * ���ﻹ�����кܶ�ķ������������ֹͣ��Ȼ��������������һֱͣ�Ų�����
	 * ��̬��������������ʲô˳����˵����
	 */
}
