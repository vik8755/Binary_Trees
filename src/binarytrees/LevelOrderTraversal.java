package binarytrees;

import java.util.*;

public class LevelOrderTraversal {
    public static List<List<Integer>> traverse(Node<Integer> root){
        Deque<Node<Integer>> queue=new ArrayDeque<>();
        List<List<Integer>> storedLevels=new ArrayList<>();
        if (root==null) return storedLevels;
        queue.add(root);
        while (!queue.isEmpty()){
            int height=queue.size();
            List<Integer> level=new LinkedList<>();
            for (int i=0;i<height;i++){
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                level.add(queue.poll().data);
            }
            storedLevels.add(level);
        }
        return storedLevels;

    }

    public static void main(String[] args) {
        System.out.println(traverse(BinaryTree.createTree()));

    }
}
