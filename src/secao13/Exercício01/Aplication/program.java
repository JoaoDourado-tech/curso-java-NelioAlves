    package secao13.Exercício01.Aplication;

    import secao13.Exercício01.Entities.Employee;
    import secao13.Exercício01.Entities.OutsourcedEmployee;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Locale;
    import java.util.Scanner;

    public class program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of Employees: ");
            int n = sc.nextInt();
            Employee newEmployee = null;

            List<Employee> listEmployees = new ArrayList<>();

            for (int i=0; i<n; i++){
                System.out.printf("Employee #%d Data: ", i + 1);
                System.out.print("Outsourced? (Y/N)");
                String outsourced = sc.next().toUpperCase();
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hour = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                if (outsourced.equals("Y")) {
                    System.out.println("Aditional Charge: ");
                    double additionalCharge = sc.nextDouble();
                    newEmployee = new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
                    listEmployees.add(newEmployee);
                } else {
                    newEmployee = new Employee(name, hour, valuePerHour);
                    listEmployees.add(newEmployee);
                }

            }
            System.out.println("PAYMENTS: \n");
            for(Employee e: listEmployees){
                System.out.println(e.toString());
            }
            sc.close();
            }

    }
