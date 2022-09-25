package ToDoListProgram;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ListClass list;
    

    public UserInterface(Scanner sc) {
        this.scanner = sc;
        this.list = new ListClass();
    }
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.list = new ListClass();
    }

    public void start() {
        String command = new String("Random");
        String task = new String("Random");

        while(!(command.equals("stop"))) {
            System.out.print("Command: ");
            command = this.scanner.nextLine();

            if(command.equals("add") || command.equals("Add")) {
                System.out.print("Task: ");
                task = this.scanner.nextLine();
                list.add(task);
            }
            if(command.equals("list") || command.equals("List")) {
                list.print();
            }
            if(command.equals("remove") || command.equals("Remove")) {
                System.out.print("Which task should be removed? ");
                int number = this.scanner.nextInt();
                scanner.nextLine();
                list.remove(number);
            }
            if(command.equals("Stop")){
                break;
            }
        }
    }    
}
