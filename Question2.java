/*
 * @author rajatrawat
 */
 
public class Q2 {
    
    public static void main(String[]args)
    {
        
        // creating nodes of LL
        LinkListNode headref=create();
        
        // retrieving that node whose value is 2
        retrieve(2, headref);
      
        // update value to 6 of that node whose value is 3  
        update(3, 6, headref);
        
        // delete node whose value is 2
        headref=delete(2, headref);
        
        // print entire LL
        print(headref);
    }
    
    static LinkListNode create()
    {
        // creating nodes of LL
        LinkListNode n1=new LinkListNode(1);
        LinkListNode n2=new LinkListNode(2);
        LinkListNode n3=new LinkListNode(3);

        // making point one to another        
        n1.next=n2;
        n2.next=n3;
        
        return n1;
    }   
    
    // retrieve function
    static void retrieve(int value, LinkListNode headref)
    {
        LinkListNode temp=headref;
        
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
    static void update(int oldvalue, int newvalue, LinkListNode headref)
    {
        LinkListNode temp=headref;
        
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
    static LinkListNode delete(int value, LinkListNode headref)
    {
        LinkListNode cur=headref;
        LinkListNode pre=null;
        
        while(cur!=null)
        {
            if(cur.value==value && pre==null)
            {
              headref=headref.next;
              break;
            }
            
            else if(cur.value==value)
            {
                pre.next=cur.next;
                cur.next=null;
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
    static void print(LinkListNode headref)
    {
        LinkListNode temp=headref;
        
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    
}

//LinkListNode class with 2 properties: value and next field which points to next node of LL
class LinkListNode
{
  int value;
  LinkListNode next;
  
  // Parameterized constructor for initializing properties of each Node
  LinkListNode(int value)
  {
      // current node's value = value which we passed as an argument from create method
      this.value=value;
      this.next=null;
  }
  
}
