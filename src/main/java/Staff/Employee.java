package Staff;

public abstract class Employee {
    String name;
    int niNumber;
    public double salary;

    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }


    public String getName(){
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise) {
        if(raise < 0){
            return salary;
        } else {
            return salary += raise;
        }
    }

    public double payBonus() {
        return salary += salary*0.01;
    }

    public void setName(String newName){
        if (newName != null) {
            name = newName;
        }
    }

}
