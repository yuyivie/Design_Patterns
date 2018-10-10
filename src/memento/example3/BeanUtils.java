package memento.example3;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author yu
 * ������
 */
public class BeanUtils {
	//��bean���������Լ���ֵ���뵽Hashmap  ��
	public static HashMap<String,Object>backupProp(Object bean){
		HashMap<String,Object> result = new HashMap<String,Object>();
		
		
		try {
			//���Bean����
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			
			//������� 
			PropertyDescriptor[]propertyDescriptor = beanInfo.getPropertyDescriptors();
			//������������
			for (PropertyDescriptor desc : propertyDescriptor) {
				//��������
				String fieldName = desc.getName();
				//��ȡ���Եķ���
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
	//��HashMap��ֵ���ص�bean��
	public static void restoreProp(Object bean,HashMap propMap){
		try {
			//���bean������
			BeanInfo beanInfo  = Introspector.getBeanInfo(bean.getClass());
			//�����������
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			
			//������������
			for (PropertyDescriptor pro : descriptors) {
				//��������
				String fieildName = pro.getName();
				//������������
				if(propMap.containsKey(fieildName)){
					//д���Եķ���
					Method setter  = pro.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieildName)});
				}
			}
		} catch (Exception e) {
			
		}
	}
}	
