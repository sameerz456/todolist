import java.util.ArrayList;
public class todolist {
    ArrayList<tasks>task;
    public todolist(){
        task= new ArrayList<>();
    }
    public void addTasks(String taskName){
        tasks newTask=new tasks(taskName);
        task.add(newTask);
    }
    public void removeTask(int index){
        if(index>=0&&index<=task.size()){
            task.remove(index);
        }else{
            System.out.println("invalid");

        }
    }
    public void markAsCompleted(int index){
        if(index>=0&&index<=task.size()){
            task.get(index).asComplete();
        }
    }
    public void displayTasks(){
        if(task.isEmpty()){
            System.out.println("no task");
        }else{
            for(int i=0;i< task.size();i++){
                System.out.print((i+1)+".");
                task.get(i).displayTask();
            }
        }
    }
}
