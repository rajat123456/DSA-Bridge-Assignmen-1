/*
 * @author rajatrawat
 */
 
public class Q4 {
    
    public static void main(String[]args)
    {
        
        // creating nodes of LL
        CircularLinkListNode headref=create();
        
        // retrieving that node whose value is 2
        retrieve(2, headref);
      
        // update value to 6 of that node whose value is 3  
        update(3, 6, headref);
        
        // delete node whose value is 1
        headref=delete(1, headref);
        
        // print entire LL
        print(headref);
    }
    
    static CircularLinkListNode create()
    {
        // creating nodes of LL
        CircularLinkListNode n1=new CircularLinkListNode(1);
        CircularLinkListNode n2=new CircularLinkListNode(2);
        CircularLinkListNode n3=new CircularLinkListNode(3);

        // making point one to another        
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;
        
        return n1;
    }   
    
    // retrieve function
    static void retrieve(int value, CircularLinkListNode headref)
    {
        CircularLinkListNode temp=headref;
        
        while(temp.next!=headref)
        {
            if(temp.value==value)
            {
             System.out.println(temp.value);
             return;
            }
            
            temp=temp.next;
        }
        
        // checking for last node
        if(temp.value==value)
        System.out.println(temp.value);
        
        else
        System.out.println("Node with value: "+value+ " not present");
        
    }
    
    // update function
    static void update(int oldvalue, int newvalue, CircularLinkListNode headref)
    {
        CircularLinkListNode temp=headref;
        
        while(temp.next!=headref)
        {
            if(temp.value==oldvalue)
            {
             temp.value=newvalue;
             break;
            }
            
            temp=temp.next;
        }
        
        // checking for last node
        if(temp.value==oldvalue)
             temp.value=newvalue;
        
    }
    
    // delete function
    static CircularLinkListNode delete(int value, CircularLinkListNode headref)
    {
        // case of single node
        if(headref.next==null && headref.value==value)
        return null;
        
        CircularLinkListNode cur=headref;
        CircularLinkListNode pre=null;
        
        while(cur!=null)
        {
            if(cur.value==value && pre==null)
            {
                
              // for first node deletion   
              CircularLinkListNode temp=headref;
              while(temp.next!=headref)
              {
                temp=temp.next;    
              }

              temp.next=temp.next.next;
              headref=headref.next;
              cur=null;
              break;
            }
            
            else if(cur.value==value)
            {
                pre.next=cur.next;
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
    static void print(CircularLinkListNode headref)
    {
        CircularLinkListNode temp=headref;
        
        while(temp.next!=headref)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        
        System.out.print(temp.value+" ");
        
    }
    
}

//CircularLinkListNode class with 2 properties: value & next field which point to next node of LL
class CircularLinkListNode
{
  int value;
  CircularLinkListNode next;
  
  // Parameterized constructor for initializing properties of each Node
  CircularLinkListNode(int value)
  {
      // current node's value = value which we passed as an argument from create method
      this.value=value;
      this.next=null;
  }
  
}
