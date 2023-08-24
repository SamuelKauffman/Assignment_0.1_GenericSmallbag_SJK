
/**
 * @author sam Kauffman
 *
 * @param <T>
 */
public class GenericClass<T> {
	
	private T e;
	
	/**
	 * @return E
	 */
	public T getE() {
		return e;
	}
	/**
	 * @param e
	 */
	public void setE(T e) {
		this.e = e;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return e.toString();
	}
}
