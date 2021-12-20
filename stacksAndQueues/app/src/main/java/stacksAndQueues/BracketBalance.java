package stacksAndQueues;

public class BracketBalance {

  static boolean bracketValidation (String expr){
    StackAsLinkedList  stack =new StackAsLinkedList();
//

    for (int i = 0; i < expr.length(); i++)
    {
      char x = expr.charAt(i);

      if (x == '(' || x == '[' || x == '{')
      {
        // Push the element in the stack
        stack.push(x);
        continue;
      }

      // So check if the stack is empty , return false .

      if (stack.isEmpty())
        return false;
      char check;
      switch (x) {
        case ')':
          check = (char) stack.pop();
          if (check == '{' || check == '[')
            return false;
          break;

        case '}':
          check = (char) stack.pop();
          if (check == '(' || check == '[')
            return false;
          break;

        case ']':
          check = (char) stack.pop();
          if (check == '(' || check == '{')
            return false;
          break;
      }
    }

    // Check Empty Stack
    return (stack.isEmpty());
  }
}
