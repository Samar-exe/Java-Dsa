import java.util.Scanner;
public class greeting {
  public static void main(String[] args) {
    System.out.print("\nEnter Your Gender: ");
    Scanner input = new Scanner(System.in);
    String gender = input.nextLine();
    System.out.print("Enter yout name: ");
    String name = input.nextLine();
    String gen = gender.toLowerCase();
    if (gen.equals("male")) {
      System.out.println("Hello Mr. "+name);
    }
    else if (gen.equals("female")){
      System.out.println("Hello Ms. "+ name);
    }
    else{
      System.out.println("LGBT not allowed");
    }
    input.close();
  }
}
