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
class Printer {
   void printdocument(int no,String nameofdocument){
       for(int i=1;i<=no;i++)
       {
           System.out.println("name_of_documents "+nameofdocument+"no "+i);
       }
   } 
}

