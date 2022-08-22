

class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        } 
}
class CountNonLeafNodes{
    Node root;
    
    public int countNonLeafNodes(){
        if(root == null){
            return 0;
        }
        return countNonLeafNodes(root);
    }
    public int countNonLeafNodes(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1+ countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
    }
}

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        CountNonLeafNodes tree = new CountNonLeafNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(5);
  
        System.out.println(
            "Preorder traversal of binary tree is "+tree.countNonLeafNodes());
       
  
    }
}

