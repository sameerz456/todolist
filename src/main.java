import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        todolist toDo=new todolist();
        while (true){
            System.out.println("1.add");
            System.out.println("2.view");
            System.out.println("3.delete");
            System.out.println("4.mark as complete");
            System.out.println("5exit");
            System.out.println("enter from 1-5");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter a task");
                    String input=scanner.nextLine();
                    toDo.addTasks(input);
                    break;
                case 2:
                    toDo.displayTasks();
                    break;
                case 3:
                    toDo.displayTasks();
                    System.out.println("enter the number");
                    int delete=scanner.nextInt()-1;
                    toDo.removeTask(delete);
                    break;
                case 4:
                    toDo.displayTasks();
                    System.out.println("enter a number to mark as completed");
                    int complete= scanner.nextInt()-1;
                    toDo.markAsCompleted(complete);
                    break;
                case 5:
                    System.exit(0);
            }
        }


    }

}
