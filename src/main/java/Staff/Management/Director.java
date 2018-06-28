package Staff.Management;

import Staff.Employee;

    public class Director extends Manager {
        double budget;


        public Director (String name, int niNumber, double salary, String deptName, double budget) {
            super(name, niNumber, salary, deptName);
            this.budget = budget;
        }


        public double getBudget() {
            return budget;
        }


        @Override
        public double payBonus() {
            return salary += salary*0.02;
        }



    }
