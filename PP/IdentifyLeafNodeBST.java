/******************************************************************************

    Given a set of positive numbers, write a program to build a Binary Search Tree (BST) and return the leaf 
    node(s). Traverse the right sub-tree first and then the left while identifying the leaf nodes.

A Binary Search Tree (BST) is a tree in which the left sub-tree of a node has a value less than its parent node's 
value and the right sub-tree of a node has a value greater than or equal to, its parent node's value.

Input Format

First line contains the number of nodes. Second line contains the list of numbers separated by a space. Read 
the input from the standard input stream.

Output Format

Print the value of leaf node(s) in a separate line to the standard output stream. Print -1 if no tree can 
be formed.

Sample Input		
5
2 3 1 0 4	

Sample Output
4
0	

Explanation
The first number in the input i.e. 5 is the count of nodes in the binary tree. The second number i.e. 2 
is the root node. The third number i.e. 3 is greater than 2, so 3 should be added as right child of 2. 
The fourth number i.e. 1 is lesser than 2, so 1 should be added as left child of 2. Fifth number i.e. 0 
is less than 2 and 1 so, it should be added as left child of node 1. Sixth number i.e. 4 is greater than 
2 and 3 and hence it should be added as right child of node 3. Based on the binary tree formed as explained
above, nodes with value 4 & 0 are the ONLY leaf nodes and hence the output.

Sample Input
1
23	

Output
-1	

Explanation
Binary tree is formed with one node however it is not considered as a leaf node	

*******************************************************************************/

 import java.util.Scanner; 

class Node{
    int data;
    Node left, right = null;
    Node(int data){
        this.data = data;
    }
}
class BSTLeafNodes { 
    static Node root;
    public static void main(String[] args) throws Exception {  
         Scanner scanner = new Scanner(System.in); 
        String n = scanner.nextLine(); 
        String input = scanner.nextLine(); 
        scanner.close(); 
        String strArr[] = input.split("\\s"); 
        Integer[] intArr = new Integer[strArr.length]; 

        for(int i=0;i<strArr.length; i++){ 
            intArr[i] = Integer.parseInt(strArr[i]); 
        } 
        getLeafNodes(intArr); 
    } 
    
    public static void getLeafNodes(){
        if(root == null){
            System.out.println(-1);
            return;
        }
        if(root.left == null && root.right == null){
            System.out.println(-1);
            return;
        }
        getLeafNodes(root);
    }
    public static void getLeafNodes(Node root){
        if(root.left == null && root.right == null){
            System.out.println(root.data);
            return;
        }
        if(root.right != null){
            getLeafNodes(root.right);
        }
         if(root.left != null){
             getLeafNodes(root.left);
        }
        
    }
    
    
    public static void addNodes(int data){
        Node node = new Node(data);
        if(root== null){
            root = node;
            return;
        }
        else{
            Node curr = root, parent = null;
            while(true){
                parent = curr;  
                if(data < curr.data) {  
                      curr = curr.left;  
                      if(curr == null) {  
                          parent.left = node;  
                          return;  
                      }  
                  }
                else {  
                      curr = curr.right;  
                      if(curr == null) {  
                          parent.right = node;  
                          return;  
                      }  
                }
            }
        }
    }
    public static void getLeafNodes(Integer[] intArr){ 
        int n = intArr.length;
        for(int i=0;i<n;i++)
        {
           addNodes(intArr[i]);
        }
        getLeafNodes();
    } 

  
    //IdentifyLeafNodes
} 
