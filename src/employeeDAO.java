import java.util.List;

public interface employeeDAO {
    public List<Employee>gatAllEmp();
    public void addEmployee(Employee newEmp);
    public void updateEmp(Employee employee);
    public void deleteEmp(int id);
    public Employee findEmp(int id);

}//class
