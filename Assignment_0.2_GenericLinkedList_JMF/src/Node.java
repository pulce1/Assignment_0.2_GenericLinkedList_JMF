
 
/**
 * Node uses the Linked list to call and look at what nodes there are present
 * using generics.
* @author James Frayser
* Node.java
* @version 9/22/2002
*/
class Node<T> {
       /**
       * methods
       */
       T data;
       @SuppressWarnings("rawtypes")
       Node nextNode;
       
       /**
       * empty argument constructor
       */
       public Node()
       {
              nextNode=null;
              data=null;
       }
       
       /**
       * getter and setter
       * @param data
       */
       public void setData(T data) {
              this.data=data;
       }
       
       @SuppressWarnings("rawtypes")
       public Node getNode() {
              return this;
       }
       
       /**
       * setNextNode calls to set the new node
       * @param nextNode
       */
       @SuppressWarnings("rawtypes")
       public void setNextNode(Node nextNode)
       {
              this.nextNode=nextNode;
       }
       
       
}//end class
 
 

