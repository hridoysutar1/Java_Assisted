package lesson4;

public class SingleLinkedlist {
   Node head;
    static class Node{

       int data;
       Node next;
       Node(int d){
           data=d;
           next=null;
       }
   }
   public static SingleLinkedlist linkedlistinsertion(SingleLinkedlist list,int data ){
        Node newNode=new Node(data);
        newNode.next=null;
        if (list.head==null){
            list.head=newNode;
        }
        else {
            Node lastNode=list.head;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
        return list;
   }
   public static void printlist(SingleLinkedlist list){
        Node currNode=list.head;
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
   }
   public static SingleLinkedlist deletell(SingleLinkedlist list,int key){
        Node currNode=list.head;
        Node prev=null;
        if (currNode.next==null&&currNode.data==key){
            list.head=currNode.next;
            System.out.println(key+" found and deleted");
            return list;
        }
        while (currNode!=null&&currNode.data!=key){
             prev=currNode;
            currNode=currNode.next;
        }
        if (currNode!=null){
            prev.next=currNode.next;
            System.out.println(key+" found and eleted");
        }
        if (currNode==null){
            System.out.println(" key not found");
        }
        return list;

   }


    public static void main(String[] args) {
           SingleLinkedlist ll=new SingleLinkedlist();
           ll= linkedlistinsertion(ll,1);
           ll=linkedlistinsertion(ll,2);
           ll=linkedlistinsertion(ll,3);
           ll=linkedlistinsertion(ll,4);
           ll=linkedlistinsertion(ll,5);
           printlist(ll);
           deletell(ll,3);
    }
}
