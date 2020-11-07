public class node{
    int data;
    int height;
    node left;
    node right;
    /* defines each node in the AVL tree, the height is important later for balanceing */

    public node(int data){
        node left = null;
        node right = null;
        this.data = data;
        height = 0;
    }

    public node(){
        node left = null;
        node right = null;
        data = 0;
        height = 0;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }


}