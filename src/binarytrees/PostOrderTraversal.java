package binarytrees;

import java.util.Stack;

public class PostOrderTraversal {
    public static void traverse(Node<Integer> root){
        if (root==null) return;
        traverse(root.left);
        traverse(root.right);
        System.out.print(root.data+", ");
    }
    // Using two stacks
    public static void iterativeTraverse(Node<Integer> root) {
        if (root == null) return;
        Stack<Node<Integer>> tempStack=new Stack<>();
        Stack<Node<Integer>> postOrderStock=new Stack<>();
        tempStack.push(root);
        while (!tempStack.isEmpty()){
            Node<Integer> currentNode=tempStack.pop();
            postOrderStock.push(currentNode);
            if (postOrderStock.peek().left!=null) tempStack.push(currentNode.left);
            if (postOrderStock.peek().right!=null) tempStack.push(currentNode.right);
        }
       while (!postOrderStock.isEmpty()){
           System.out.print(postOrderStock.pop().data+", ");
       }
    }

    // Using one stack
    public static void iterativeTraversSingleStack(Node<Integer> root) {
        if (root == null) return;
        Stack<Node<Integer>> stack=new Stack<>();
        Node<Integer> currentNode=root;
        Node<Integer> lastVisitedNode=null;
        while (!stack.isEmpty()|| currentNode!=null){
          if (currentNode!=null){
              stack.push(currentNode);
              currentNode=currentNode.left;
          }
          else {
              if(stack.peek().right!=null && lastVisitedNode!=stack.peek().right){
                  currentNode=stack.peek().right;
              }
              else{
                  System.out.print(stack.peek().data+", ");
                  lastVisitedNode=stack.pop();
              }
          }

        }

    }
    
    public static void main(String[] args) {
       traverse(BinaryTree.createTree());
        System.out.println();
        iterativeTraverse(BinaryTree.createTree());
        System.out.println();
        iterativeTraversSingleStack(BinaryTree.createTree());
    }
}
