package inheritanceinterface;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueun("잔망루피1");
		bookQueue.enQueun("잔망루피2");
		bookQueue.enQueun("잔망루피3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
		System.out.println(bookQueue.getSize());

	}

}
