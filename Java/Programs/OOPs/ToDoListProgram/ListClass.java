package ToDoListProgram;
import java.util.ArrayList;

public class ListClass {
    private ArrayList<String> list;
    public ListClass(){
        list = new ArrayList<>();
    }
    public void add(String task) {
        list.add(task);
    }
    public void print() {
        for(int i = 0, j=1; i<list.size(); i++, j++) {
            System.out.println(j + " : " + list.get(i));
        }
    }
    public void remove(int i) {
        list.remove(i-1);
    }
}