class Employee {
    int salary() {
        return 0;
    }
}

class Developer extends Employee {
    int salary() {
        return 50000;
    }
}

class Tester extends Employee {
    int salary() {
        return 40000;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e;

        e = new Developer();
        System.out.println("Developer Salary: " + e.salary());

        e = new Tester();
        System.out.println("Tester Salary: " + e.salary());
    }
}
