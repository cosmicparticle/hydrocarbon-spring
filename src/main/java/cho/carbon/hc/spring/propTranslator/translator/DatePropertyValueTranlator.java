package cho.carbon.hc.spring.propTranslator.translator;


import java.util.Date;

import javax.annotation.Resource;

import cho.carbon.bond.utils.date.FrameDateFormat;
import cho.carbon.hc.spring.propTranslator.GetPropertyValueComposite;
import cho.carbon.hc.spring.propTranslator.SetPropertyValueComposite;

/**
 * 
 * <p>Title: DatePropertyValueTranlator</p>
 * <p>Description: </p><p>
 * 日期字段转换器
 * </p>
 */
public class DatePropertyValueTranlator extends AbstractPropertyValueTranslator{

	@Resource
	FrameDateFormat dateFormat;
	
	@Override
	public boolean canGet(GetPropertyValueComposite composite) {
		return Date.class.isAssignableFrom(composite.getPropertyType());
	}

	@Override
	public boolean canSet(SetPropertyValueComposite composite) {
		return Date.class.isAssignableFrom(composite.getPropertyType()) 
				&& !composite.isPropertyNull() 
				&& composite.getToSetValue() instanceof String;
	}
	
	@Override
	public Object getValue(GetPropertyValueComposite composite) {
		return dateFormat.formatDate((Date) composite.getPropertyValue());
	}

	@Override
	public void setValue(SetPropertyValueComposite composite) {
		String value = (String) composite.getToSetValue();
		Date date = dateFormat.parse(value);
		composite.setValueByExpression(date);
	}

	protected void setDateFormat(FrameDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

}
