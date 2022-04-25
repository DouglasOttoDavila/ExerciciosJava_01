package poo;

public class Employee {
    String name;
    double grossSalary;
    double tax;
    double percentage;

    //salario liquido
    public double calcNetSalary(double grossSalary, double tax) {
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary = grossSalary + ((percentage/100) * grossSalary);
    }
}
