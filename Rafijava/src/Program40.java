import java.util.LinkedList;
import java.util.Iterator;
public class Program40 {

	public static void main(String[] args) {
		LinkedList<String>l_list = new LinkedList<String>();
		l_list.add("hello");
//		l_list.add("hi");
		l_list.add("fairfax");
		l_list.add("rahul");
		l_list.add("Ali");
		
		Iterator p = l_list.listIterator(0);
		while(p.hasNext()) {
			System.out.println(p.next());
			
		}
	}
}

//different between arrylist and linked list HOME WORK