package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // Thread thread1 = new Thread(new Runnable() {

        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 20; i++) {
        //             System.out.println(Thread.currentThread().getName() +
        //                     "\tRunnable ..." + i);
        //         }
        //     }
        // });
        // thread1.start();

        // MyRunnableImplementation mRI1 = new MyRunnableImplementation("Task1");
        // MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task2");
        // MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task3");
        // MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task4");
        // MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task5");
        // Thread thread2 = new Thread(mRI1);
        // thread2.start();

        // Thread thread3 = new Thread(mRI1);
        // thread3.start();

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.shutdown();

        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        // ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        // MyRunnableInterface<Integer> addOperation = (a, b) -> {
        //     return a + b;
        // };
        // MyRunnableInterface<Integer> multiplyOperation = (a, b) -> {
        //     return a * b;
        // };
        // MyRunnableInterface<Integer> minusOperation = (a, b) -> {
        //     return a - b;
        // };

        // MyRunnableInterface<String> concatenateString = (a, b) -> {
        //     return a + b;
        // };

        // MyMessageInterface printString = (a) -> {
        //     System.out.println(a);
        // };
        // System.out.println("addOperation: " + addOperation.process(1, 1));
        // System.out.println("multiplyOperation: " + multiplyOperation.process(1, 1));
        // System.out.println("minusOperation: " + minusOperation.process(1, 1));
        // System.out.println("concatenateOperation: " + concatenateString.process("The brown fox ",
        //  "jump over the wall"));
        // printString.printMessage("Let's take a break a 12pm");

        //List of employees
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Tom", "Tan", 3000));
        employees.add(new Employee(2, "Alex", "Lim", 5000));
        employees.add(new Employee(3, "David", "Chan", 6000));
        employees.add(new Employee(4, "Richard", "Ho", 2000));

        // employees.forEach(emp -> System.out.println(emp));

        List<Employee> for (Employee filteredEmployees : filteredEmployees = employees.stream().filter(emp -> emp.getLastName().contains("Lim"))
                .collect(Collectors.toList());
                // filteredEmployees.forEach(emp -> System.out.println(emp));
        
                // employees.sort(Comparator.comparing(e -> e.getFirstName()));
                //Using comparator 
                // employees.sort(Comparator.comparing(Employee::getFirstName));
                employees.sort(Comparator.comparing(Employee::getFirstName).reversed());
        
                Comparator<Employee> compare = Comparator.comparing(e -> e.getFirstName());
                employees.sort(compare.reversed());
                // employees.forEach(emp -> System.out.println(emp));
        
                Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);
                employees.sort(groupByComparator);
                employees.forEach(emp -> System.out.println(exp));
            
        }
    }
}
