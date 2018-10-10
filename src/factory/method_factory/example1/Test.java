package factory.method_factory.example1;

public class Test {
	public static void main(String[] args) {
		
	//声明阴阳八卦炉
	AbstractHumanFactory yinyanglu = new HumanFactory();
	//女娲第一次造人，火候不是，于是白人产生了。
	System.out.println("\n--造出的第一批人士白色人种");
	Human whitehuman  = yinyanglu.createHuman(WhiteHuman.class);
	whitehuman.getColor();
	whitehuman.talk();
	//女娲第二次造人，火候过足，于是黑人产生了。
	System.out.println("\n--造出的第二批人是黑色人种 ！");
	Human blackHuman = yinyanglu.createHuman(BlackHuman.class);
	blackHuman.getColor();
	blackHuman.talk();
	// 女娲第三次造人，火候刚刚好，于是黄色人种产生了。
	System.out.println("\n--造出的第三批人是huang色人种");
	Human yellowHuman = yinyanglu.createHuman(YellowHuman.class);
	yellowHuman.getColor();
	yellowHuman.talk();
	
	}
}
