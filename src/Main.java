public class Main {
  public static void main(String[] args) {
    StackADT stackTest = new ArrayListStack();
    System.out.println(stackTest.size());
    System.out.println(stackTest.isEmpty());
    String string = "Hello";
    String string2 = "Bye";
    stackTest.push(string);
    stackTest.push(string2);
    System.out.println(stackTest.isEmpty());
    System.out.println(stackTest.top());
    System.out.println(stackTest.pop());
  }
}
