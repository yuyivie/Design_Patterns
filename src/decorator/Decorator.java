package decorator;

/**
 * @author yu
 *抽象装饰者（装饰类）
 */
public class Decorator extends Component {
	private Component component;
	
	//通过构造函数传递被装饰者
	public Decorator(Component _component){
		this.component = _component;
	}
	
	//委托给修饰者执行
	@Override
	public void operate() {
		this.component.operate();
	}

}
