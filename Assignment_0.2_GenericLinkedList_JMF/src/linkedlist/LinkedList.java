package linkedlist;
/**
* @author James Frayser
* LinkedList.java
*/
public class LinkedList<T> {
       
       /**
       * methods
       */
       Node head;
       int length;
       Node tail;
       
       /**
       * empty argument constructor
       */
       public LinkedList()
       {
              head=null;
              length=0;
              tail=head;
       }
       
       /**
       * isEmpty asks if the list is empty
       * @return
       */
       public boolean isEmpty()
       {
              if (head==null) { return true;}
              else return false;
       }
       /**
       * getter
       * @return
       */
       public Node getList()
       {
              return head;
       }
       
       /**
       * adds a node to the list
       * @param aNode
       */
       public void addNode(Node aNode)
       {
              if (isEmpty() ) {
                     head = aNode;
                     tail=head;
                     return;
              }
              tail.nextNode=aNode;
              tail=tail.nextNode;
              tail.nextNode=null;
              length++;
              
       }
 
       /**
       * main method
       * @param args
       */
       public static void main(String[] args) {
              // TODO Auto-generated method stub
              LinkedList myList=new LinkedList();
              
              Node aNode=new Node();
              aNode.setData("Jack");
              myList.addNode(aNode);
              aNode = new Node();
              aNode.setData(2);
              myList.addNode(aNode);
              
              Node tempnode=myList.getList();
              do 
              {
                     System.out.println(tempnode.data);
                     tempnode=tempnode.nextNode;
              } while (tempnode!=null);
                     
              
              
 
       }

}