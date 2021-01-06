package cho.carbon.hc.spring.propTranslator;

import org.springframework.expression.Expression;

public class DefaultGetPropertyValueComposite extends AbstractPropertyValueComposite implements GetPropertyValueComposite {

	public DefaultGetPropertyValueComposite(Object target, Expression expression) {
		super(target, expression);
	}

}
