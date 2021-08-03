/*
 * @author rajatrawat
 */
 
public class Q3 {
    
    public static void main(String[]args)
    {
        
        // creating nodes of LL
        DoublyLinkListNode headref=create();
        
        // retrieving that node whose value is 2
        retrieve(2, headref);
      
        // update value to 6 of that node whose value is 3  
        update(3, 6, headref);
        
        // delete node whose value is 2
        headref=delete(2, headref);
        
        // print entire LL
        print(headref);
    }
    
    static DoublyLinkListNode create()
    {
        // creating nodes of LL
        DoublyLinkListNode n1=new DoublyLinkListNode(1);
        DoublyLinkListNode n2=new DoublyLinkListNode(2);
        DoublyLinkListNode n3=new DoublyLinkListNode(3);

        // making point one to another        
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        
        return n1;
    }   
    
    // retrieve function
    static void retrieve(int value, DoublyLinkListNode headref)
    {
        DoublyLinkListNode temp=headref;
        
        while(temp!=null)
        {
            if(temp.value==value)
            {
             System.out.println(temp.value);
             return;
            }
            
            temp=temp.next;
        }
        
        System.out.println("Node with value: "+value+ " not present");
        
    }
    
    // update function
    static void update(int oldvalue, int newvalue, DoublyLinkListNode headref)
    {
        DoublyLinkListNode temp=headref;
        
        while(temp!=null)
        {
            if(temp.value==oldvalue)
            {
             temp.value=newvalue;
             break;
            }
            
            temp=temp.next;
        }
        
    }
    
    // delete function
    static DoublyLinkListNode delete(int value, DoublyLinkListNode headref)
    {
        // case of single node
        if(headref.next==null && headref.value==value)
        return null;
       
        DoublyLinkListNode cur=headref;
        DoublyLinkListNode pre=null;
        
        while(cur!=null)
        {
            if(cur.value==value && pre==null)
            {
              cur.next.prev=null;    
              headref=headref.next;
              break;
            }
            
            else if(cur.value==value)
            {
                pre.next=cur.next;
                
                // this case is to handle NullPointerException when we have to delete last element 
                if(cur.next!=null)
                cur.next.prev=pre;
                
                cur=null;
                break;
            }
            
            else
            {
             pre=cur;
             cur=cur.next;
            }
        }
        
        return headref;
   }
        
    // print function
    static void print(DoublyLinkListNode headref)
    {
        DoublyLinkListNode temp=headref;
        
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    
}

//DoublyLinkListNode class with 3 properties: value, prev & next field which points to prev & next node of LLs
class DoublyLinkListNode
{
  int value;
  DoublyLinkListNode prev;
  DoublyLinkListNode next;
  
  // Parameterized constructor for initializing properties of each Node
  DoublyLinkListNode(int value)
  {
      // current node's value = value which we passed as an argument from create method
      this.value=value;
      this.prev=null;
      this.next=null;
  }
  
}
