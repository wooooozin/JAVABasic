package abstractClass;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer computer = new Computer(); // error - Cannot instantiate the type Computer
//		NoteBook noteBook = new NoteBook(); // error - Cannot instantiate the type NoteBook
		
		Computer deskTop = new DeskTop();
		deskTop.display();
		deskTop.turnOff();
		
		
		NoteBook myNoteBook = new MyNoteBook();
		myNoteBook.typing();

	}

}
