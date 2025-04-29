package my_test;

public class WorkMainTest {

    public static void main(String[] args) {
        System.out.println("----- main 시작------");

        System.out.println(Thread.currentThread());

        Worker worker1 = new Worker("워커(써브쓰레드)");
        worker1.start();

        System.out.println("------스레드 종료--------");

    }// end of main
} // end of class

