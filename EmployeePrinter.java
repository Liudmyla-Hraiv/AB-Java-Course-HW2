public class EmployeePrinter implements Printer{

     static void print(Employee employee) {
        System.out.println("Employee: "+ employee.FirstName+ " " +employee.LastName);
    }
}
