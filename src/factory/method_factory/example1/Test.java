package factory.method_factory.example1;

public class Test {
	public static void main(String[] args) {
		
	//������������¯
	AbstractHumanFactory yinyanglu = new HumanFactory();
	//Ů洵�һ�����ˣ�����ǣ����ǰ��˲����ˡ�
	System.out.println("\n--����ĵ�һ����ʿ��ɫ����");
	Human whitehuman  = yinyanglu.createHuman(WhiteHuman.class);
	whitehuman.getColor();
	whitehuman.talk();
	//Ů洵ڶ������ˣ������㣬���Ǻ��˲����ˡ�
	System.out.println("\n--����ĵڶ������Ǻ�ɫ���� ��");
	Human blackHuman = yinyanglu.createHuman(BlackHuman.class);
	blackHuman.getColor();
	blackHuman.talk();
	// Ů洵��������ˣ����ոպã����ǻ�ɫ���ֲ����ˡ�
	System.out.println("\n--����ĵ���������huangɫ����");
	Human yellowHuman = yinyanglu.createHuman(YellowHuman.class);
	yellowHuman.getColor();
	yellowHuman.talk();
	
	}
}
