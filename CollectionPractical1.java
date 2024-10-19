import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical1{
	public static void main(String[] args){
		Collection<Integer> c = new LinkedList<>();
		c.add(5);
		c.add(3);
		c.add(7);
		c.add(9);
		c.add(11);
		System.out.println(c);
		
		if(c.isEmpty()){
			System.out.println("The Collection is empty");
		}
		else{
			System.out.println("The Collection is not empty");
		}
		
		System.out.println("The size of the Collection:" + c.size());
		
		int checkelement = 3;
		if(c.contains(checkelement)){
			System.out.println("The Collection contains:" + checkelement);
		}
		else{
			System.out.println("The Collection doesn't contains:" + checkelement);
		}
		
		c.remove(11);
		
		System.out.println(c);
	}
}