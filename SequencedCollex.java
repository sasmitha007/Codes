import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequencedCollex{
	public SequencedCollex()
	{
		SequencedCollection sc = new LinkedList();
		sc.addFirst(7);
		sc.addFirst(4);
		sc.addFirst(5);
		
		System.out.println(sc.getFirst());
		System.out.println(sc.removeLast());
		System.out.println(sc);
		System.out.println(sc.reversed());
	}
	
	public static void main(String[] args){
		new SequencedCollex();
	}
}