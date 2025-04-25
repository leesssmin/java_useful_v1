package thread;

public class WorkerMainTest1 {

    //메인 쓰레드
    public static void main(String[] args) {

        //사용하는 방법
        System.out.println("-------------메인 스레드 시작-------------");
        // 현재 쓰레드가 누군지 알아보는 명령어
        System.out.println(Thread.currentThread()); // [#1,main.....]

        // 작업자 하나 만들어 내기
        Worker worker1 = new Worker("워커1(써브쓰레드)");
        worker1.start(); //너가 위임 받은 일은 시작해

        System.out.println("-------------메인 스레드 종료-------------");



    } //end of main

} // end of class
