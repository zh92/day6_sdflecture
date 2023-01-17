package sg.edu.nus.iss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() +
                            "\tRunnable ..." + i);
                }
            }
        });
        thread1.start();

        MyRunnableImplementation mRI1 = new MyRunnableImplementation("Task1");
        // MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task2");
        // MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task3");
        // MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task4");
        // MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task5");
        Thread thread2 = new Thread(mRI1);
        thread2.start();

        Thread thread3 = new Thread(mRI1);
        thread3.start();

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
    }
}
