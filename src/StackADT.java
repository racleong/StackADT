import java.util.ArrayList;

public interface StackADT<ArrayList>
{
  /**
   * Removes the object at the top of the stack and returns that object as the value.
   */
  public ArrayList pop();

  /**
   * Looks at the object at the top of the stack without removing it from the stack.
   */
  public ArrayList top();

  /**
   * Returns the size of the stack, i.e. no of elements currently in the stack.
   */
  public int size();

  /**
   * Tests if the stack is empty.
   */
  public boolean isEmpty();

  /**
   * Pushes/adds an item onto the top of the stack.
   */
  public void push(ArrayList arrayList);
}

