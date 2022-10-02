public class Main {
    public static void main(String[] args) {
          Employee employee=new Employee();
          employee.setSalary(1200);
          employee.setName("Ali");
          employee.setHireYear(2018);
          employee.setWorkHours(52);
        System.out.println(employee.toString());
        System.out.println(employee.tax());
        System.out.println(employee.bonus());
        employee.raiseSalary();


    }
}
