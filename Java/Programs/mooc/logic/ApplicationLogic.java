package mooc.logic;
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;
public class ApplicationLogic {
    private UserInterface userInterface;
    public ApplicationLogic(UserInterface userInterface){
        this.userInterface = userInterface;
    }
    public void execute(int times){
        for(int i = 0; i<times; i++){
            System.out.println("Application logic is working");
            this.userInterface.update();
        }
    }
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
