class MyQueue {

    Stack<Integer> stack1; // for pushing elements
    Stack<Integer> stack2; // for popping elements

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if (stack2.isEmpty()) {
            transferElements();
        }
        return stack2.pop();
    }
    
    public int peek() {
        if (stack2.isEmpty()) {
            transferElements();
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    
    // transfers elements from stack1 to stack2 in reverse order
    private void transferElements() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
