package sg.edu.nus.iss;

public class MyRunnableImplementation implements Runnable {

    private String taskName;
   
    public MyRunnableImplementation(String taskName) {
        this.taskName = taskName;
    }

    public MyRunnableImplementation() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" +
            taskName + "\tRunnable ... " + i);
        }
    }
    
}
