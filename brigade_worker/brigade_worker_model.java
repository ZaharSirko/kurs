package  brigade_worker;
import  worker.worker_model;

public class brigade_worker_model extends worker_model {
    public brigade_worker_model(){
        super();
    }
    public brigade_worker_model(int id, String name, String suremane, int age, int department, int salary) {
        super(id, name, suremane, age, department, salary);
    }
}
