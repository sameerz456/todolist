public class tasks {
    String name;
    String status;
    public tasks(String taskName){
       this.name=taskName;
        this.status="pending";

    }
    public  void asComplete(){
        status="completed";
    }
    public void displayTask(){
        System.out.println("["+ status + "]" + name);

    }
}
