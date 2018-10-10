package decorator.example1;

/**
 * @author yu
 *抽象成绩单
 */
public abstract class SchoolReport {
	//成绩单主要展示你的成绩情况
	public abstract void report();
	
	//成绩单家长签字，这个是最要命的  哈哈
	public abstract void sign(String name);
	
}
