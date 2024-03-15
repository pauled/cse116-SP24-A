package week8;

public class BinaryTreeNode<A> {
    public A value;
    public BinaryTreeNode<A> left;
    public BinaryTreeNode<A> right;

    public BinaryTreeNode(A value,
                          BinaryTreeNode left,
                          BinaryTreeNode right){
        this.value=value;
        this.left=left;
        this.right=right;
    }
    public int maxTreeDepth(){
        int depth=1;
        int left=0;
        if (this.left!=null){
            left=this.left.maxTreeDepth();
        }
        int right=0;
        if (this.right!=null){
            right=this.right.maxTreeDepth();
        }
        if (left>right){
            return left+depth;
        }  else {
            return right+depth;
        }
    }
    public String preOrderTraversal(BinaryTreeNode node){
        if (node!=null){
            String out="";
            out+=node.value.toString()+" ";
            out+=preOrderTraversal(node.left);
            out+=preOrderTraversal(node.right);
            return out;
        } else {
            return "";
        }
    }
    public String postOrderTraversal(BinaryTreeNode node){
        if (node!=null){
            String out="";
            out+=postOrderTraversal(node.left);
            out+=postOrderTraversal(node.right);
            out+=node.value.toString()+" ";
            return out;
        } else {
            return "";
        }
    }
    public String inOrderTraversal(BinaryTreeNode node){
        String out="";
        if (node.left!=null) {
            out += this.inOrderTraversal(node.left);
        }
        out+=node.value.toString()+" ";
        if (node.right!=null) {
            out += inOrderTraversal(node.right);
        }
        return out;
        /*if (node!=null){
            String out="";
            out+=inOrderTraversal(node.left);
            out+=node.value.toString()+" ";
            out+=inOrderTraversal(node.right);
            return out;
        } else {
            return "";
        }*/
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=
                new BinaryTreeNode<>(5,null,null);
        root.left=new BinaryTreeNode<>(2,null,null);
        root.right=new BinaryTreeNode<>(8,null,null);
        root.left.left=new BinaryTreeNode<>(-3,null,null);
        root.left.right=new BinaryTreeNode<>(4,null,null);
        root.right.left=new BinaryTreeNode<>(7,null,null);
        root.right.right=new BinaryTreeNode<>(14,null,null);
        System.out.println(root.preOrderTraversal(root));
        System.out.println(root.postOrderTraversal(root));
        System.out.println(root.inOrderTraversal(root));

        root=new BinaryTreeNode<>(5,null,null);
        root.left=new BinaryTreeNode<>(2,null,null);
        root.right=new BinaryTreeNode<>(8,null,null);
        root.left.left=new BinaryTreeNode<>(-3,null,null);
        System.out.println(root.inOrderTraversal(root));
    }
}
