package objectArray;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		for (Book book : library) {
			System.out.println(book); // null 5번 출
		}
		
		library[0] = new Book("태백산맥1", "조정래1");
		library[1] = new Book("태백산맥2", "조정래2");
		library[2] = new Book("태백산맥3", "조정래3");
		library[3] = new Book("태백산맥4", "조정래4");
		library[4] = new Book("태백산맥5", "조정래5");
		
		for (Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
	}

}
