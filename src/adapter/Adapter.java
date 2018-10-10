package adapter;


/**
 * @author yu
 *ÊÊÅäÆ÷½ÇÉ«£¨ºËĞÄ½ÇÉ«£©
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSomething();
	}
	
}
