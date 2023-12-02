import java.util.*;

public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static Node delete(Node root,int key){
        if(root.data > key){
            root.left = delete(root.left,key);
        }
        else if(root.data < key){
            root.right = delete(root.right,key);
        }
        else{
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3
            Node IS = inordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inordersuccessor(Node root){
        while(root.left == null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int X,int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    public static void Root2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.data);

        if(root.left==null && root.right==null){
            printPath(path);
        }
        else{
            Root2Leaf(root.left, path);
            Root2Leaf(root.right, path);
        }
    }

    public static void main(String[] args){
        int values[] = {5,1,2,3,6,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 7);

        inorder(root);
        System.out.println();

        Root2Leaf(root, new ArrayList<>());

        // printInRange(root, 2, 6);


        // preorder(root);
        // System.out.println();

        // postorder(root);
        // System.out.println();

        // if(search(root,3)){
        //     System.out.print("Found");
        // }
        // else{
        //     System.out.print("Not Found");
        // }

    }
}