package OOPsJAVA.Threads;

class PrintWorkerThread extends Thread
{
    public void fun(){
        try
        {
            for(int i = 1; i<=5;i++){
                System.out.println("Siddharth");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
        }
    }
}
class ThreadExecutionDemo
{
    public static void main(String[] args) throws InterruptedException {
        PrintWorkerThread t= new PrintWorkerThread();
        t.fun();
        for(int i = 1; i<=5;i++) {
            System.out.println("Pandey");
            Thread.sleep(1000);
        }
    }
}