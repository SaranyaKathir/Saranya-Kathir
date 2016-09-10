public class Oddeven {
public static void main(String args[]) {
  int num;
    System.out.println("Enter the number: ");
      Scanner d=new Scanner(System.in);
  num=d.nextInt();
if(num%2==0)
  {
    System.out.println("The number is even");
  }
else {
    System.out.println("The number is odd");
  }
}
}
