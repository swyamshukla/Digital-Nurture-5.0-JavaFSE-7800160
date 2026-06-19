public class Main {
    public static void main(String[] args) {
        Company company = new Company(5);
company.addEmployee(new Employee(201, "Ananya", "Java Developer", 70000));
company.addEmployee(new Employee(202, "Rahul", "QA Engineer", 55000));
company.addEmployee(new Employee(203, "Sneha", "Data Analyst", 75000));
company.addEmployee(new Employee(204, "Karan", "Cloud Engineer", 90000));
company.addEmployee(new Employee(205, "Meera", "HR Executive", 60000));

        company.traverseEmployee();

        System.out.println();

        System.out.println("Searched Employee");
        company.searchEmployee(4);

        System.out.println();

        System.out.println("Employee Deleted");
        company.deleteEmployee(2);
        company.traverseEmployee();
    }    
}
