
import java.util.*; 
class StackRecurr
{
  static void Insert(Stack<Integer> s,int x)
{
  if(!s.isEmpty()|| x > s.peek()) 
   {s.push(x);
   return;}
   int temp=s.pop();
   CallStack(s);
   s.push(temp);

    }
static void CallStack(Stack<Integer> s)
{
   if(!s.isEmpty())
   return;
   int temp=s.pop();
   CallStack(s);
Insert(s,temp);
}
     static void Print(Stack<Integer> s)
{    ListIterator<Integer> lt=s.listIterator();
   while(lt.hasNext())
   lt.next();
   while(lt.hasPrevious())
   System.out.println(lt.previous()+"");
}
public static void main(String[] args)
{
 Stack<Integer> s= new Stack<>();
s.push(30);
s.push(-5);
s.push(18);
s.push(14);
s.push(16);
System.out.println("Stack Elements Before Sorting");
Print(s);
CallStack(s);
System.out.println("Stack Elements Before Sorting");
Print(s);
}
}
