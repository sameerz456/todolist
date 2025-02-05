import java.util.ArrayList;
import java.util.Scanner;
public class toDO {
    public static void main(String[] args){
        ArrayList<String> toDOList=new ArrayList<>();
        boolean isRunning=true;
        Scanner scanner=new Scanner(System.in);
        while(isRunning){
            System.out.println("--------toDOList Menu-----------");
            System.out.println("1.Add the task");
            System.out.println("2.view tasks");
            System.out.println("3.delete the task");
            System.out.println("4.exit");
            System.out.println("Enter your choice");
            int choice= scanner.nextInt();
            scanner.nextLine();
                switch (choice){
                    case 1:
                        System.out.println("enter list");
                        String task = scanner.nextLine();
                        toDOList.add(task);
                        System.out.println("task has been added");
                        break;
                    case 2:
                        if(toDOList.isEmpty()){
                            System.out.println("there is no task to view");


                        }else{
                            for(int i=0;i<toDOList.size();i++){
                                System.out.println((i+1)+"."+ toDOList.get(i));
                            }
                            break;
                        }
                    case 3:
                        if(toDOList.isEmpty()){
                            System.out.println("no task");
                        }else{
                            for(int j=0;j<toDOList.size();j++){
                            System.out.println((j+1)+"."+toDOList.get(j));
                                System.out.println("enter the number to remove it");
                                int delete= scanner.nextInt()-1;
                                toDOList.remove(delete);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("existing-----");
                        isRunning=false;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
        }scanner.close();
    }
}
