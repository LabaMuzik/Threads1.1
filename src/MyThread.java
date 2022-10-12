public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Завершаю %s. ", Thread.currentThread().getName());
        }
    }
}