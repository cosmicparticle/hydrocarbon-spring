package cho.carbon.hc.spring.propTranslator;

/**
 * 
 * <p>Title: SetPropertyValueComposite</p>
 * <p>Description: </p><p>
 * 设置值的字段对象。在设置值时使用
 * </p>
 */
public interface SetPropertyValueComposite extends PropertyValueComposite{
	/**
	 * 要设置的字段值类型
	 * @return
	 */
	Object getToSetValue();
	/**
	 * 要设置的字段值的对象类型
	 * @return
	 */
	Class<?> getToSetValueType();
	
	/**
	 * 判断要设置的值是否为null
	 * @return
	 */
	boolean toSetValueIsNull();
	/**
	 * 使用表达式对象来设置字段值
	 * @param value 
	 */
	void setValueByExpression(Object value);
	
}
