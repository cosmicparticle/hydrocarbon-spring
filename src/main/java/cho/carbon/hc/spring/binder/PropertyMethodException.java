package cho.carbon.hc.spring.binder;

public class PropertyMethodException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6173778877437766294L;

	public PropertyMethodException(Exception e) {
		super(e);
	}

	public PropertyMethodException(String msg, IllegalArgumentException e) {
		super(msg, e);
	}

}
