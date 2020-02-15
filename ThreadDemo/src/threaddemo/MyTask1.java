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
public class MyTask1 extends Thread {
    Printer mref;
    MyTask1(Printer p){
    mref=p;
    }
    public void run(){
    mref.printdocument(10,"Nidhi Dhote");
    }
}
