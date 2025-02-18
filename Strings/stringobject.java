public class stringobject{
  public static void main(String[] args) {
    String s="azhar";
    String s1="azhar";
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s==s1);
    // proof for same pool
    s="mohammad";
    System.out.println(s);
    System.out.println(s==s1);
    String a=new String("kalyan");
    String b=new String("kalyan");
    System.out.println(a);
    System.out.println(b);
    System.out.println(a==b);
    System.out.println(a.equals(b));


  }
}