package objectArray;

public class ObjectCopy {
	// 얕은 복사 - 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래1");
		library[1] = new Book("태백산맥2", "조정래2");
		library[2] = new Book("태백산맥3", "조정래3");
		library[3] = new Book("태백산맥4", "조정래4");
		library[4] = new Book("태백산맥5", "조정래5");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("====================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("====================");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
