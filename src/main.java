import java.util.Scanner;
import java.util.ArrayList;

public class main implements Runnable{
    static avl tree = new avl();
    static GUI GUI = new GUI();
    static ArrayList<Integer> a = new ArrayList<>();
    static Thread t = new Thread(new main());   
    static boolean stopThread = false; 

    public static void main(String[] args){
        GUI.start();
        t.start();
    }

    public static void createNode(int data){
       if(tree.isEmpty()){
           return;
       }
       else{
           node n = new node(data); /* creates the new node to be added to the avl tree */
           tree.insert(data); /* inserts the new node into the tree */
       }
    }

    public static void deleteNode(int data){
        /* TODO: implementing after I finish the balancing methods */
    }

    public static void parse(String s) throws Exception{
        Scanner scn = new Scanner(s);
        try{
            int i = Integer.parseInt(s);
            System.out.print(i);
            a.add(i);
            scn.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }

    @Override
    public void run() {
        while(stopThread == false){
            System.out.println("is running");
            if(GUI.userInput){
                try{
                parse(GUI.S);
                stopThread = true;
                }catch(Exception e){
                    System.out.print(e.getMessage());
                }
            }
        }
        if(stopThread == true){
            for(int i = 0; i < a.size(); i++){
                createNode(a.get(i));
            }
        }
    }


}
