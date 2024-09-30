import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<Employee>();

        System.out.println("Enter List of Employees name(type exit to finish): ");

        while (true) {
            String name = sc.nextLine();
            if("exit".equalsIgnoreCase(name)) {
                break;
            }
            employees.add(new Employee(name));
        }
        List<Employee> filteredEmployees = employees.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Employees whose names start with 'A': ");
        filteredEmployees.forEach(e->System.out.println(e.getName()));
        sc.close();
    }
}