package exsamples;

public class Worker {
    String workerName;
    String workerState;
    double workerSalary;

    Worker (String workerName, String workerState, double workerSalary){
        this.workerName = workerName ;
        this.workerState = workerState;
        this.workerSalary = workerSalary;
    }

    void showInfo() {
        System.out.println("Имя: " + workerName + "," +"\nДолжность: " + workerState + ","+"\nЗарплата: " + workerSalary);
    }




}
