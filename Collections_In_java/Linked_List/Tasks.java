// package Collection_In_Java.LinkedList;


public class Tasks {

    static class Node{
    int value;
    Node next;
    public Node() {
    }
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
    //Stage 1

    //Task 1   Create  10 -> 20 -> 30 -> 40
    void createNodeList(Node l1){
        Node temp=l1;

        while(temp!=null){

            System.out.print(temp.value);
            if(temp.next!=null) System.out.print("->");      
            temp=temp.next;
        }
    }

    //Task 3 Count Nodes
    void countNode(Node l1){
        Node temp=l1;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Total Nodes: "+count);   
    }

    //Task 4 find max value

    void findMax(Node l1){

        Node temp=l1;
        int maxVal=temp.value;

        while(temp!=null){
            if(temp.value>maxVal){
                maxVal=temp.value;
            }
            temp=temp.next;
        }
        System.out.println(maxVal);
    }

    //Task 5 Search
    void search(Node l1,int num){

        Node temp=l1;
        boolean isFound=false;

        while(temp!=null){
            if(temp.value==num) {
                isFound=true;
                break;
            }
            temp=temp.next;
        }
        System.out.print("Search "+num+"-> ");
        System.out.println(isFound? "Found":"Not Found");
           
    }

    //Stage 2 Pointer Maniplation

    //Task 1 Insert at the start

    Node insertBeging(Node l1,int newVal){
        Node temp=new Node(newVal,l1);
        l1=temp;
        createNodeList(l1);
        return l1;
        
    }

    // Task 2 Insert at End
    Node insertAtEnd(Node l1,int newVal){
        
        Node temp=l1;
        while(temp!=null){
            temp=temp.next;
            if(temp.next==null){
                temp.next=new Node(newVal);
                break;
            }
        }
        createNodeList(l1);
        System.out.println();
        return l1;
    }

    // Task 3 Delete First Ele

    void delete1stEle(Node l1){
        l1=l1.next;
        createNodeList(l1);
    }

    // Task 4 Delete Last Ele

    void deleteLastEle(Node l1){
        Node temp=l1;
        
        while(temp!=null){
            Node current=temp;
            temp=temp.next;
            if(temp.next==null){
                current.next=null;
                break;
            }   
        } 
        createNodeList(l1);
        
    }

    void insertAfterEle(Node l1, int eleVal,int newVal ){
        
        Node temp=l1;

        while(temp!=null){
            if(temp.value==eleVal){
                Node newtemp=temp;
                temp.next=new Node(newVal,newtemp);
                break;
            }
            temp=temp.next;
        }

        createNodeList(l1);
    }





    public static void main(String[] args){

        Node n1=new Node(15);
        n1.next=new Node(40);
        n1.next.next=new Node(25);
        n1.next.next.next=new Node(30);
        n1.next.next.next.next=new Node(10);
        
        Tasks t1=new Tasks();



        //Stage 1

        // // Task 1
        t1.createNodeList(n1);
        System.out.println();

        // //Task 3
        // t1.countNode(n1);

        // //Task 4 Find maxvalue
        // t1.findMax(n1);

        // //Task 5 Search
        // t1.search(n1, 40);

        // Stage 2

        // //Task 1 Add First Element
        // n1=t1.insertBeging(n1,50);
        // System.out.println();
        
        // // Task 2 Add Last Element
        // n1=t1.insertAtEnd(n1, 20);

        // // Task 3  Delete first Element
        // t1.delete1stEle(n1);

        // // Task 4 Delete Last Element
        // t1.deleteLastEle(n1);

        // // Task 5 Insert aafter Element
        // t1.insertAfterEle(n1,25, 100);
        



    }
}
