package adapter.example2;

import java.util.Map;

/**
 * @author yu
 *外部基本信息接口
 */
public interface IOuterUserBaseInfo {
	
	//基本信息，比如名称，性别，手机号码等
	public Map<String,String> getUserBAseInfo();
	
}
