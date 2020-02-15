/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Nidhi 
 */
class MyTask extends Thread{//implementing thread using extends thread class
   //@override run method
    public void run()
    {
        for(int i=1;i<=5;i++)
      System.out.println("Task 1 "+ i);  
    }

}
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //main thread 
              /* MyTask mt=new MyTask();
               mt.start();*///start method invoked from java.lang.Thread allows to run jobs in a parallel manner
        	System.out.println("--Start--");
                Printer p1=new Printer();
                p1.printdocument(5,"NidhiDhote");
                Runnable run=new UsagePrinter();
                Thread up=new Thread(run);
               
                new Thread(new Printer1()).start(); 
                up.start();
               /* for(int i=1;i<=10;i++)
		System.out.println("1 Action "+ i);*/
		System.out.println("--End--");
                
    }
    
}
