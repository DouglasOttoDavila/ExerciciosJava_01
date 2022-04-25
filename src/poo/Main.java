package poo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Commons com = new Commons();
        Scanner scan = new Scanner(System.in);

        int option = 0;

        while (option >= 0) {
            com.clearScreen();
            System.out.println("-------------------------------------");
            System.out.println("\nSelect the desired program: ");
            System.out.println("\n1 - Retangle Calculation\n2 - Employee Registration\n3 - Internet Banking\n4 - Exit Application");
            System.out.println("-------------------------------------");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    com.clearScreen();
                    Retangle ret = new Retangle();
                    System.out.println("\nInsert the retangle width: ");
                    ret.width = scan.nextDouble();
                    System.out.println("\nInsert the retangle height: ");
                    ret.height = scan.nextDouble();
                    com.clearScreen();
                    System.out.println("\n1) Area: " + String.format("%.2f", Double.valueOf(ret.calcArea(ret.width, ret.height))) +" m²");
                    System.out.println("2) Perimeter: " + String.format("%.2f", Double.valueOf(ret.calcPerimeter(ret.width, ret.height))) +" m");
                    System.out.println("3) Diagonal: " + String.format("%.2f", Double.valueOf(ret.calcDiagonal(ret.width, ret.height))) +" m");
                    System.out.println("\nPress enter to proceed...");
                    com.waitForInput();
                break;
                
                case 2:
                    com.clearScreen();
                    Employee emp = new Employee();
                    System.out.println("\nInsert the employee's name: ");
                    scan.nextLine();
                    emp.name = scan.nextLine();
                    System.out.println("\nInsert the employee's gross salary ($): ");
                    emp.grossSalary = scan.nextDouble();
                    System.out.println("\nInsert the employee's taxes amount ($): ");
                    emp.tax = scan.nextDouble();
                    com.clearScreen();
                    System.out.println("\nName: "+emp.name);
                    System.out.println("Gross salary: $"+String.format("%.2f", Double.valueOf(emp.grossSalary)));
                    System.out.println("Taxes: $"+String.format("%.2f", Double.valueOf(emp.tax)));
                    System.out.println("\nPress enter to proceed...");
                    com.waitForInput();
                    com.clearScreen();
                    System.out.println("\nInsert the salary increase percentage (%): ");
                    emp.percentage = scan.nextDouble();
                    emp.increaseSalary(emp.percentage);
                    com.clearScreen();
                    System.out.println("\nName: "+emp.name);
                    System.out.println("Updated gross salary: $" + String.format("%.2f", Double.valueOf(emp.grossSalary)));
                    System.out.println("Taxes: $"+ String.format("%.2f", Double.valueOf(emp.tax)));
                    System.out.println("\nPress enter to proceed...");
                    com.waitForInput();
                break;

                case 3:
                    com.clearScreen();
                    
                    Account acc = new Account();

                    int number;
                    double initialValue;
                    int bankMenu = 0;

                    System.out.println("\n| Create a New Bank Account |");
                    System.out.println("\nType the account number: ");
                    number = scan.nextInt();
                    acc.createNumber(number);

                    com.clearScreen();
                    System.out.println("\nType the account holder name: ");
                    scan.nextLine();
                    acc.holder = scan.nextLine();

                    com.clearScreen();
                    System.out.println("\nInitial Deposit: ");
                    initialValue = scan.nextDouble();
                    acc.deposit(initialValue);

                    com.clearScreen();
                    System.out.println("\nAccount Successfully Created!");
                    System.out.println("\nAccount Holder: "+ acc.holder);
                    System.out.println("Account Number: "+ acc.showNumber());
                    System.out.println("Account Balance: $"+ acc.showBalance());
                    System.out.println("\nPress enter to proceed...");
                    com.waitForInput();

                    while (bankMenu >= 0) {
                        com.clearScreen();
                        System.out.println("\nBANK OF AMERICA - Internet Banking 1.0");
                        System.out.println("\n1 - My Profile\n2 - Deposit\n3 - Withdraw\n4 - Exit");
                        bankMenu = scan.nextInt();

                        switch (bankMenu) {
                            case 1:
                                com.clearScreen();
                                System.out.println("\nAccount Holder: "+acc.holder);
                                System.out.println("Account Number: "+acc.showNumber());
                                System.out.println("Account Balance: $"+acc.showBalance());
                                System.out.println("\nPress enter to proceed...");
                                com.waitForInput();
                                break;

                            case 2:
                                com.clearScreen();
                                System.out.println("\nAmount to deposit: ");
                                double depAmount = scan.nextDouble();
                                acc.deposit(depAmount);
                                com.clearScreen();
                                System.out.println("You have deposited: $" + depAmount);
                                System.out.println("Your current balance: $" + acc.showBalance());
                                System.out.println("\nPress enter to proceed...");
                                com.waitForInput();
                            break;

                            case 3:
                                com.clearScreen();
                                System.out.println("\nAmount to withdraw: ");
                                double witAmount = scan.nextDouble();
                                acc.withdraw(witAmount);
                                com.clearScreen();
                                System.out.println("You have withdrawed: $" + witAmount);
                                System.out.println("Your current balance: $" + acc.showBalance());
                                System.out.println("\nPress enter to proceed...");
                                com.waitForInput();
                            break;

                            case 4:
                                bankMenu = -1;
                            break;
                        }
                    }

                break;

                case 4:
                    
                    option = -1;
                    break;

                default:
                    option = 0;
                    break;
            }
        }
        
        scan.close();
        
    }
}