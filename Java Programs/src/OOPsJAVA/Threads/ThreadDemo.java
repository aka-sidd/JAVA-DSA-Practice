package OOPsJAVA.Threads;

class WorkerThread extends Thread{
    public void fun(){
      try{
          for(int i = 1;i<=5;i++){
              System.out.println("Siddharth");
              Thread.sleep(1000);
          }
      }
      catch(InterruptedException e){
      }
    }
}
class ThreadDemo
{
    public static void main(String[] args) throws InterruptedException {
        WorkerThread t=new WorkerThread();
        t.fun();
        for(int i=1;i<=5;i++){
            System.out.println("Pandey");
            Thread.sleep(1000);
        }
    }
}