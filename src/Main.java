public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Петров", "Петр", "Петрович", 1, 32000);
        employees[1] = new Employee("Иванов", "Иван", "Иванович", 4, 35000);
        employees[2] = new Employee("Кипятков", "Владимир", "Иванович", 2, 45000);
        employees[3] = new Employee("Пупкин", "Василий", "Васильевич", 2, 44000);
        employees[4] = new Employee("Смирнов", "Алексей", "Игоревич", 5, 47000);
        employees[5] = new Employee("Фролов", "Андрей", "Юрьевич", 3, 45000);
        employees[6] = new Employee("Шмакаев", "Антон", "Александрович", 3, 55000);
        employees[7] = new Employee("Александров", "Игорь", "Сергеевич", 1, 40000);
        employees[8] = new Employee("Давлетов", "Артем", "Олегович", 5, 42000);
        employees[9] = new Employee("Железняков", "Александр", "Викторович", 4, 37000);
        all();
        System.out.println("-----------------------------------------------");
        System.out.println("Всего затрат на зарплату: " + getSumSalaryPerMonth());
        System.out.println("-----------------------------------------------");
        System.out.println("Минимальная зарплата у сотрудника: " + getMinSalary());
        System.out.println("-----------------------------------------------");
        System.out.println("Максимальная зарплата у сотрудника: " + getMaxSalary());
        System.out.println("-----------------------------------------------");
        System.out.println("Средняя зарплата сотрудников: " + averageValueSalary());
        System.out.println("-----------------------------------------------");
        getFullName();
    }

    public static void all() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static double getSumSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    public static double averageValueSalary() {
        double sum = getSumSalaryPerMonth();
        int count = countEmployees();
        return sum / count;
    }

    public static int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }
    public static void getFullName(){
        for (Employee employee: employees){
            System.out.println(employee.getFullName());
        }
    }

}
