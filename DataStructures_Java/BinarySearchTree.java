public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int value){
            data = value;
        }
    }

    public static Node insertNode(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(root.data>data){
            //left subtree
            root.left = insertNode(root.left, data);
        }
        else{
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public static void inOrderTraverse(Node root){
        if(root==null)
            return;
        inOrderTraverse(root.left);
        System.out.println(root.data+" ");
        inOrderTraverse(root.right);
    }

    public static boolean binarySearch(Node root , int key){
        if(root == null){
            // System.out.println("Not Found");
            return false;
        }
        if(root.data > key){
            return binarySearch(root.left, key);
        }
        if(root.data < key){
            return binarySearch(root.right, key);
        }
        if(root.data == key){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i =0 ; i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        inOrderTraverse(root);

        if(binarySearch(root, 7)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
