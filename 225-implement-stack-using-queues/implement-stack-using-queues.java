class MyStack {
Queue<Integer> kiuu;
    public MyStack() {
    kiuu = new LinkedList<>();
    } 
    
    public void push(int x) {
        kiuu.add(x);
        int size = kiuu.size();
        while(size > 1) {
            kiuu.add(kiuu.remove());
            size--;
        }
    }
    
    public int pop() {

       return kiuu.remove();
    }
    
    public int top() {
        return kiuu.peek();
    }
    
    public boolean empty() {
        return kiuu.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */