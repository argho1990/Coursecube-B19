public class Lab578 {

    public static void main(String[] args) {

        MyThread th = new MyThread();
        Thread t1 = new Thread(th);
        System.out.println(t1.getState());
        t1.start();

    }
}

class MyThread extends Thread {
}
