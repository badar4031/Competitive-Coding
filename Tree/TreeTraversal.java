class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        } 
}
class TreeTraversal{
    Node root;
    
    public void printPreOrder(){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        printPreOrder(root);
    }
    public void printPostOrder(){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        printPostOrder(root);
    }
    public void printInOrder(){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        printInOrder(root);
    }
    public void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data+"    ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data+"    ");
        printInOrder(node.right);
    }
    public void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data+"    ");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreOrder();
  
        System.out.println(
            "\nInorder traversal of binary tree is ");
        tree.printInOrder();
  
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.printPostOrder();
    }
}
