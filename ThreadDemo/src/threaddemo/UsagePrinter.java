/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Nidhi Implementing thread using Runnable interface
 */
public class UsagePrinter implements Runnable {
    public void run()
    {
        for(int i=1;i<=5;i++)
        System.out.println("Task 2 "+i);
    }
    
}
