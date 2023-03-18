package arrayList;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import objectArray.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(new Book("잔망루피1", "루피1"));
		list.add(new Book("잔망루피2", "루피2"));
		list.add(new Book("잔망루피3", "루피3"));
		list.add(new Book("잔망루피4", "루피4"));
		list.add(new Book("잔망루피5", "루피5"));
		
		list.remove(3);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showBookInfo();
		}
	}

}
