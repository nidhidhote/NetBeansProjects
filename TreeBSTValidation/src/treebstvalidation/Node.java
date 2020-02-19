/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treebstvalidation;
/**
 *
 * @author admin
 */ /*Validation using INT_MAX and INT_MIN*/
public class Node {
    int d;
    Node left,right;
    Node(int val)
    {
        d=val;
        left=right=null;
    }
    public boolean isBST(Node root){
       boolean k=checkValidation(root,Integer.MIN_VALUE,Integer.MAX_VALUE);//add comment
       
       return k;
    }
    public boolean checkValidation(Node root,int min,int max)
    {
        if(root==null)return true;/*empty tree is considering as a BST*/
        if(root.d<min || root.d>max)return false;
        return checkValidation(root.left,min,root.d)&&checkValidation(root.right,root.d,max);
        
        
    }
};

