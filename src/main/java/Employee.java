public class Employee {

    private String name;
    private float salary;
    private int workHours;
    private int hireYear;

    public  void Employee(String name, float salary, int workHours, int hireYear)
    {
        this.setName(name);
        this.setSalary(salary);
        this.setWorkHours(workHours);
        this.setHireYear(hireYear);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
    public float tax()
    {
        if(this.salary>1000)
        {
            return this.salary+=this.salary*0.03;

        }
        else {
            return this.salary;
        }
    }
    public float bonus()
    {
        if (this.workHours>40)
        {
            int extraTime=this.workHours%40;
           this.salary+=30*extraTime;
           return this.salary;
        }
        else
        {
            return this.salary;
        }

    }
    public void raiseSalary()
    {
        int workYears=2021-this.hireYear;
        if (workYears<10)
        {
            this.salary+=this.salary*0.05;
            System.out.println(this.salary);


        } else if (workYears>9&&workYears<20)
        {
            this.salary+=this.salary*0.10;
            System.out.println(this.salary);

        }
        else if (workYears>19)
        {
            this.salary+=this.salary*0.15;
            System.out.println(this.salary);

        }


    }

}
