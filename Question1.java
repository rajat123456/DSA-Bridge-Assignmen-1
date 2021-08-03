/*
 * @author rajatrawat
 */
 
public class Q1 {
    
    public static void main(String[]args)
    {
        // array of students
        Student[]arr=new Student[3];
        
        // creating elements of array
        create(arr);
        
        // retrieving that element whose roll number is 6
        retrieve(6, arr);
      
        // update name to "Rawat" of that element whose roll number is 3  
        update(3,"Rawat", arr);
        
        // delete element whose roll number is 9
        delete(9, arr);
        
        // print all elements of array
        print(arr);
    }
    
    static void create(Student[]arr)
    {
        // creating objects of class Student
        Student st0=new Student("Rajat", 3, 100);
        Student st1=new Student("Sumeet", 6, 90);
        Student st2=new Student("Kanika", 9, 70);
        
        // filling those objects in student array
        arr[0]=st0;
        arr[1]=st1;
        arr[2]=st2;
    }   
    
    // retrieve function
    static void retrieve(int roll, Student[]arr)
    {
        for(int q=0;q<arr.length;q++)
        {
            if(arr[q].roll==roll)
            {
                System.out.println(arr[q].name+" "+arr[q].roll+" "+arr[q].marks);
                break;
            }
        }
    }
    
    // update function
    static void update(int roll, String name, Student[]arr)
    {
        for(int q=0;q<arr.length;q++)
        {
            if(arr[q].roll==roll)
            {
                arr[q].name=name;
                break;
            }
        }
    }
    
    // delete function
    static void delete(int roll, Student[]arr)
    {
        for(int q=0;q<arr.length;q++)
        {
            if(arr[q].roll==roll)
            {
                arr[q]=null;
                break;
            }
        }
    }
        
    // print function
    static void print(Student[]arr)
    {
        for(int q=0;q<arr.length;q++)
        {
          if(arr[q]!=null)
          System.out.println(arr[q].name+" "+arr[q].roll+" "+arr[q].marks);
        }
    }
    
}

//Student class with 3 properties: name, roll and marks
class Student
{
  String name;
  int roll;
  int marks;
  
  // Parameterized constructor for initializing properties of each student 
  Student(String name, int roll, int marks)
  {
      // current object's name = name which we passed as an argument from create method
      this.name=name;
  
      // current object's roll = roll which we passed as an argument from create method
      this.roll=roll;
    
      // current object's marks = marks which we passed as an argument from create method
      this.marks=marks;
  }
  
}
