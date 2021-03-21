import java.util.*;

class Employee implements Comparable<Employee>{
    private int Salary;
    private String EmployeeName;

    public Employee(int s, String f){
        this.Salary =s;
        this.EmployeeName=f;
    }
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.getSalary()<o.getSalary())
            return 1;
        else if (this.getSalary()>o.getSalary())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", EmployeeName='" + EmployeeName + '\'' +
                '}';
    }
}
class NameLengthSort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmployeeName().length()>o2.getEmployeeName().length())
            return 1;
        else if (o1.getEmployeeName().length()<o2.getEmployeeName().length())
            return -1;
        else
            return 0;

    }

}
public class solution26 {
    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        NameLengthSort nm = new NameLengthSort();
        Random rd = new Random();
        Name_generator ex = new Name_generator();

        for(int i=1;i<=10;i++){

            e.add(new Employee(rd.nextInt((100000 - 10000) + 1) + 10000,ex.name_Suggestor(rd.nextInt((15-8)+1)+8)));

        }
        System.out.println("Given list:"+e);
        Collections.sort(e,new NameLengthSort());
        System.out.println("Sorted based on employee name:"+e);

        Collections.sort(e);
        System.out.println("Sorted based on salary");
        e.forEach(System.out::println);


    }
}

