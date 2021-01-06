package cho.carbon.hc.spring.binder;

import org.springframework.beans.PropertyValue;


public interface PropertyValueConvertContext {
	Object getTarget();
	String getPropertyName();
	PropertyValue getPropertyValue();
}
