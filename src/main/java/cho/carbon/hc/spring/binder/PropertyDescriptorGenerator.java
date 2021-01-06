package cho.carbon.hc.spring.binder;

import java.beans.PropertyDescriptor;

public interface PropertyDescriptorGenerator {

	PropertyDescriptor getPropertyDescriptor(Class<?> targetClass,
			String propertyName);

}
