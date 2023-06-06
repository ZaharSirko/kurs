package  railway_station_worker;

import  worker.worker;

public class railway_station_worker extends worker {
    public railway_station_worker(){
        super();
    }
    public railway_station_worker(int id, String name, String surename, int age, String gender,int children, String chief,
            int department, int work_experience, int salary) {
        super(id, name, surename, age, gender, chief, department, work_experience, children, salary);
    }
    
}
