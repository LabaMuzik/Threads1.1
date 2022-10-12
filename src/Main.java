public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("main group");
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(group, myThread, "Поток 1");
        thread1.start();
        Thread thread2 = new Thread(group, myThread, "Поток 2");
        thread2.start();
        Thread thread3 = new Thread(group, myThread, "Поток 3");
        thread3.start();
        Thread thread4 = new Thread(group, myThread, "Поток 4");
        thread4.start();
        MyThread.sleep(15000);
        group.interrupt();
        MyThread.sleep(200);
        
        System.out.println("\nВсе потоки завершены!");

    }
}