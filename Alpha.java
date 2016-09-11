public class Alpha {
  public static void main(String args[]) {
char ch;
  Scanner scan=new Scanner(System.in);
System.out.println("Enter whatever: ");
  ch=scan.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
  System.out.println("Alphabet"); }
else {
  System.out.println("Not an alphabet"); }
} }
