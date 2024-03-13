package week8;

import week7.Comparator;
import week7.IntDecreasing;

public class BST <A>{
    private BinaryTreeNode<A> root;
    private Comparator<A> comparator;
    public BST(Comparator<A> comparator){
        this.comparator=comparator;
        this.root=null;
    }
    public void insert(A toInsert){
        if (this.root==null){
            this.root=new BinaryTreeNode<>(toInsert,null,null);
        } else {
            this.insertHelper(this.root, toInsert);
        }
    }
    public void insertHelper(BinaryTreeNode<A> node,A toInsert){
        if (this.comparator.compare(toInsert,node.value)){
            if (node.left==null){
                node.left=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                this.insertHelper(node.left,toInsert);
            }
        } else {
            if (node.right==null){
                node.right=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                this.insertHelper(node.right,toInsert);
            }
        }
    }
    public boolean find(A toFind){
        if (this.root==null){
            return false;
        } else {
            return findHelper(this.root,toFind);
        }
    }
    public boolean findHelper(BinaryTreeNode<A> node,A toFind){
        if (node.value.equals(toFind)){
            return true;
        } else if(this.comparator.compare(toFind,node.value)){
            if (node.left==null){
                return false;
            } else {
                return this.findHelper(node.left,toFind);
            }
        } else {
            if (node.right==null){
                return false;
            } else {
                return this.findHelper(node.right,toFind);
            }
        }
    }
    public static void main(String[] args) {
        BST<Integer> bst=new BST<>(new IntDecreasing());
        bst.insert(8);
        bst.insert(42);
        bst.insert(13);
        bst.insert(9);
        bst.insert(-1);
        bst.insert(6);
        bst.insert(-4);
        System.out.println(bst.root.inOrderTraversal(bst.root));
    }
}
