package decorator.example1;

public abstract class Decorator extends SchoolReport {
	//������Ҫ֪�����ĸ��ɼ���
	private SchoolReport sr;
	
	//���캯�������ݳɼ�������
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	
	//�ɼ�������Ҫ�������ġ�
	public void report() {
		this.sr.report();
	}
   
	//ǩ������Ҫǩ��
	public void sign(String name) {
		this.sr.sign(name);

	}

}
