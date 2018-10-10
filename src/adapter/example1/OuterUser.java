package adapter.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yu
 *劳务公司人员的实现类
 */
public class OuterUser implements IOuterUser {
    /*
     * 用户的基本信息
     */
	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "这个员工叫混世魔王。。。。。");
		baseInfoMap.put("mobileNumber", "这个员工的电话是。。。。");
		return baseInfoMap;
	}
	 /*
	  * 员工的家庭信息
	  */
	@Override
	public Map getUserOfficeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumber", "员工的家庭电话是。。。。。。");
			
		return null;
	}
	/*
	 * 员工的工作信息，比如，职位等
	 */
	@Override
	public Map getUserHomeInfo() {
		HashMap officeInfo  = new HashMap();
		officeInfo.put("jobPosition", "这个人的职位是Boss.....");
		officeInfo.put("officeTelNumber", "员工的办公电话是。。。。");
		return officeInfo;
	}

}
