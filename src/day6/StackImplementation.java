package day6;

public class StackImplementation {
    int max = 100;
    int [] stack = new int [max];
    int top =-1;
    public void push(int value){
        if (top == -1){
        System.out.println("Stack Overflow");
            }
            else{
                stack [++top] = value;
    }
}
int pop(){
    if (top ==-1){
        System.out.println("Stack Underflow");
        return -1;
    }
    return stack [top--];
    }
    int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
