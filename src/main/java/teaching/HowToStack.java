package teaching;

import java.util.Stack;

public class HowToStack {

    // Stack concept LIFO (Last in first out)
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        stacks.push("coconut");
        stacks.push("apple");
        stacks.push("orange");
        stacks.push("melon");

        System.out.println(stacks);

        System.out.println(stacks.peek());
        System.out.println(stacks);

        System.out.println(stacks.pop());
        System.out.println(stacks);

        System.out.println(stacks.search("apple"));
        System.out.println(stacks.search("dqwdqwdq"));

        System.out.println(stacks.get(1));

        System.out.println(stacks.contains("apple"));
        System.out.println(stacks.contains("dqwdqwdq"));

        System.out.println(stacks.empty());
        System.out.println(stacks);

    }

}
