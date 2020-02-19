/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treebstvalidation;

/**
 *
 * @author admin
 */
public class TreeBSTValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node root=new Node(10);
        root.left=new Node(7);
        root.right=new Node(13);
        root.left.left=new Node(5);
        root.left.right=new Node(8);
        root.left.right.left=new Node(9);
        boolean k=root.isBST(root);
        if(k==true)System.out.println("Tree is BST");
        else System.out.println("Tree is not BST");
    }
    
}
