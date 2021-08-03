/*
 * @author rajatrawat
 */
 
public class Q6 {
    
    // keep track of elements
    static int front=-1,rear=-1;
    
    public static void main(String[]args)
    {
        
        QueueUsingArray qu=new QueueUsingArray();
        
        // size of queue
        System.out.println("Size of Queue: "+size(qu));
        
        // dequeue from empty queue
        dequeue(qu);
        
        
        enqueue(1, qu);
        enqueue(2, qu);
        enqueue(3, qu);
        
        System.out.println("Size of Queue: "+size(qu));
        
        // print entire queue
        print(qu);
        
        enqueue(4, qu);
        
        // delete node
        dequeue(qu);
        dequeue(qu);
        dequeue(qu);
        
        // print entire queue
        print(qu);
        
        System.out.println("Size of Queue: "+size(qu));
        
        dequeue(qu);
        
    }
    
    
    // enqueue function
    static void enqueue(int value, QueueUsingArray qu)
    {
        
        rear++;
        
        if(rear==qu.arr.length)
        {
         System.out.println("Overflow");
         return;
        }
        
       qu.arr[rear]=value;
       
    }   
    
    
    // dequeue function
    static void dequeue(QueueUsingArray qu)
    {
        
       if(front==rear)
       {
         System.out.println("Underflow");
         return;
       }
       
       ++front;
       
       if(front>=qu.arr.length)
       {
           System.out.println("Underflow");
           return;
       }
       
       qu.arr[front]=Integer.MIN_VALUE;
    
   }
   
   
   // size function
    static int size(QueueUsingArray qu)
    {
        
       if(rear>=qu.arr.length)
       return qu.arr.length-1-front;
       
       else
       return (rear-front);   
    }
    
        
    // print function
    static void print(QueueUsingArray qu)
    {
        
        if(rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        
        else
        {
        
          System.out.print("Contents of Queue: ");
        
          for(int q=0; q<qu.arr.length; q++)
           {
             if(qu.arr[q]!=Integer.MIN_VALUE)  
             System.out.print(qu.arr[q]+" ");
           }
        
          System.out.println();
        }
        
    }
    
}

//QueueUsingArray class with 1 property: integer array
class QueueUsingArray
{
  int[]arr=new int[3];
}
