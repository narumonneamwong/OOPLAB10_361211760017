import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
    public static void main(String[] args) {
        //create interface constant
        employeeDAO dao =EmployeeDAOImpl.getInstance();

        //gat all Employee
        displayAllEmployee(dao);
        addNewEmployee (dao);

    }//main

    private static void addNewEmployee(employeeDAO dao) {
        Scanner sc = new Scanner(System.in);
        //input data
        System.out.print("Enter employee id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter employee name:");
        String name = (sc.nextLine().trim());
        System.out.print("Enter employee position:");
        String position = (sc.nextLine().trim());
        System.out.print("Enter employee salary:");
        double salary = Double.parseDouble(sc.nextLine().trim());

        //insert data to database
        Employee newEmp = new Employee(id,name,position,salary);
        dao.addEmployee(newEmp);

    }

    private static void displayAllEmployee(employeeDAO dao) {
        List<Employee> myEmpn = dao.gatAllEmp();
        for (Employee emp:myEmpn){
            System.out.println(emp.toString());
        }
    }
}//class
