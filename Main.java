
/**
 * @author sam Kauffman
 * @version 1.0
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass <String>item = new GenericClass<>();
		item.setE("Sam");
		GenericClass<Integer>item2 = new GenericClass<>();
		item2.setE(12);
		
		SmallBag <GenericClass<String>> bag = new SmallBag<>();
		SmallBag <GenericClass<Integer>> bag2 = new SmallBag<>();
		
		bag.setItem(item);
		System.out.println(bag.getItem());
		
		bag2.setItem(item2);
		System.out.println(bag2.getItem());
	}

}
