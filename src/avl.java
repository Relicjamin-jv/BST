public class avl {
    node root = new node();
    
    public avl(){
        root = null;
    }
    /* returns true if empty */
    public boolean isEmpty(){
        return root == null;
    }

    /*makes the root empty, thus the rest of the tree logically is empty (aka no children)*/
    public void makeEmpty(){
        root = null;
    }

    /* makes it do i can be lazy later and not have to put root everytime */
    public void insert(int data){
        root = insert(data, root);
    }

    /* to get the height of the node */
    public int height(node n){
        if (n == null){
            return -1;
        }
        else{
            return Math.max(height(n.left), height(n.right)) + 1;
        }
    }

    public node insert(int data, node n){
        
        if(n == null){
            n = new node(data);
        }
        else if(data < n.data){
            n.left = insert(data, n.left); /* inserts to the left of the node if the data within that node is less than the node it currently is looking at */
        }
        else if(data > n.data){
            n.right = insert(data, n.right);
        }
        else; /* this should never be possible */

        

        n.height = height(n);
        return n;
    }


    /* TODO : Implementing the balancing within the tree */

   

    





}
