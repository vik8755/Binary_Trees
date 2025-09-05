package binarytrees;

public class Node<T> {
       Node<T> left;
       T data;
       Node<T> right;

       public Node(T data){
           this.data=data;
           left=null;
           right=null;
       }
}
