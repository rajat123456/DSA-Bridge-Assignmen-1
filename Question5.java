/*
 * @author rajatrawat
 */
 
public class Main {
    
    // keep track of elements
    static int rear=-1;
    
    public static void main(String[]args)
    {
        
        StackUsingArray stk=new StackUsingArray();
        
        // size of stack
        System.out.println("Size of Stack: "+size(stk));
        
        // pop from empty stack
        pop(stk);
        
        // push into stack
        push(1, stk);
        push(2, stk);
        push(3, stk);
        
        System.out.println("Size of Stack: "+size(stk));
        
        // print entire stack
        print(stk);
        
        push(4, stk);
        
        pop(stk);
        pop(stk);
        pop(stk);
        
        print(stk);
        
        System.out.println("Size of Stack: "+size(stk));
        
        pop(stk);
        
    }
    
    static void push(int value, StackUsingArray stk)
    {
        rear++;
        
        if(rear==stk.arr.length)
        {
         System.out.println("Overflow");
         return;
        }
        
       stk.arr[rear]=value;
       
    }   
    
    
    // pop function
    static void pop(StackUsingArray stk)
    {
        
       if(rear==-1)
       {
         System.out.println("Underflow");
         return;
       }
       
       --rear;
    
   }
   
   
   // size function
    static int size(StackUsingArray stk)
    {
       return rear+1;   
    }
    
        
    // print function
    static void print(StackUsingArray stk)
    {
        
        if(rear==-1)
        {
            System.out.println("Stack is Empty");
        }
        
        else
        {
        
          System.out.print("Contents of Stack: ");
        
          for(int q=rear; q>=0; q--)
           {
             System.out.print(stk.arr[q]+" ");
           }
        
          System.out.println();
        }
        
    }
    
}

//StackUsingArray class with 1 property: integer array
class StackUsingArray
{
  int[]arr=new int[3];
}
