package corePrograms;

public class Digital extends Thread {

    public void run() {
        System.out.println("Now you are here");
    }

    public static void main(String a[]) {
        Thread run = new Thread(new Digital());
        System.out.print("1. ");
        run.start();
        System.out.print("2. ");
        run.start();
    }
}

