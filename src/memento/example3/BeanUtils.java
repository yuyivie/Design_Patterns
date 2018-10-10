package memento.example3;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author yu
 * 工具类
 */
public class BeanUtils {
	//把bean的所有属性及数值放入到Hashmap  中
	public static HashMap<String,Object>backupProp(Object bean){
		HashMap<String,Object> result = new HashMap<String,Object>();
		
		
		try {
			//获得Bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			
			//获得属性 
			PropertyDescriptor[]propertyDescriptor = beanInfo.getPropertyDescriptors();
			//遍历所有属性
			for (PropertyDescriptor desc : propertyDescriptor) {
				//属性名称
				String fieldName = desc.getName();
				//读取属性的方法
				Method getter= desc.getReadMethod();
			
				Object fieldValue = getter.invoke(bean, new Object[]{});
				if(!fieldName.equalsIgnoreCase("class")){
					result.put(fieldName, fieldValue);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//把HashMap的值返回到bean中
	public static void restoreProp(Object bean,HashMap propMap){
		try {
			//获得bean的描述
			BeanInfo beanInfo  = Introspector.getBeanInfo(bean.getClass());
			//获得属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			
			//遍历所有属性
			for (PropertyDescriptor pro : descriptors) {
				//属性名称
				String fieildName = pro.getName();
				//如果有这个属性
				if(propMap.containsKey(fieildName)){
					//写属性的方法
					Method setter  = pro.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieildName)});
				}
			}
		} catch (Exception e) {
			
		}
	}
}	
