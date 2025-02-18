import java.util.*;

public class SortedSetExample {
 
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    SortedSet<Integer> ss = new TreeSet<Integer>();
    
    ss.add(12);
    ss.add(123);
    ss.add(11);
    
    System.out.println(ss);
    TreeSet<Object> ts=new TreeSet<>();
    ts.add(1);
    ts.add(234);
    ts.add(80);
    System.out.println(ts);
    // ts.add(null);
    System.out.println(ts.reversed());
    System.out.println(ts.isEmpty());
  }
}
