/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author admin
 */
public class Printer1 implements Runnable {
    public void run()
    {
        for(int i=1;i<=5;i++)
            System.out.println("Printer 1 "+i);
    }
}
