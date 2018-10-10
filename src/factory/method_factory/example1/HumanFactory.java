package factory.method_factory.example1;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		//定义一个生产的人种
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return (T)human;
	}

}
