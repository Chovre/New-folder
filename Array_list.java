import java.util.*;
public class Array_list{
  public static void main(String[] args) {
      List<Object> al = new ArrayList<Object>();
      al.add(10);
      al.add("VVIT");
      al.add(12.13);
      al.add(null);
      System.out.println(al);
      al.add(0,"D");
      al.add(1,"E");
      al.add(2,"V");
      al.add(3,"D");
      al.add(4,"E");
      al.add(5,"V");
      al.remove(3);
      System.out.println(al);

  }
}