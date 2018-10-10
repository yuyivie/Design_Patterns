package adapter.example2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<String,String>();
		officeInfo.put("jobPosition", "这个人的职位是BOSS.....");
		officeInfo.put("officeTelName","员工的办公室电话是。。。。。");
		return officeInfo;
		
	}

}
