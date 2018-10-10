package decorator;

/**
 * @author yu
 *����װ���ߣ�װ���ࣩ
 */
public class Decorator extends Component {
	private Component component;
	
	//ͨ�����캯�����ݱ�װ����
	public Decorator(Component _component){
		this.component = _component;
	}
	
	//ί�и�������ִ��
	@Override
	public void operate() {
		this.component.operate();
	}

}
