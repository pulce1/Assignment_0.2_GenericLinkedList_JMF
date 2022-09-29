
/**
 * Linked list is a class that allows for you to be able to make a list with what you need
 * using generics.
* @author James Frayser
* LinkedList.java
* @version 9/22/2002
*/
public class LinkedList<T> {
       
       /**
       * methods
       */
       Node<T> head;
       int length;
       Node<T> tail;
       
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
       * @return a boolean, false if it is not empty, true if it is
       */
       public boolean isEmpty()
       {
              if (head==null) { return true;}
              else return false;
       }
       /**
       * getter
       * @return head
       */
       public Node<T> getList()
       {
              return head;
       }
       
       /**
       * adds a node to the list
       * @param aNode: the node being added to
       */
       public void addNode(Node<T> aNode)
       {
              if (isEmpty() ) {
                     head = aNode;
                     tail=head;
                     return;
              }
              tail.nextNode = aNode;
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
              LinkedList<String> myList=new LinkedList<String>();
              
              Node<String> aNode=new Node<String>();
              aNode.setData("Jackson");
              myList.addNode(aNode);
              aNode = new Node<String>();
              aNode.setData("Phil");
              myList.addNode(aNode);

              Node<String> tempnode=myList.getList();
              do 
              {
                     System.out.println(tempnode.data);
                     tempnode=tempnode.nextNode;
              } while (tempnode!=null);
                     
              
              
 
       }//end main

}//end class