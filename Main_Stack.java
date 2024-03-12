class Main{
    public static void main(String[] args){
        Stack stack = new Stack(4);
        stack.push(2345);
        stack.push(234);
        stack.push(23);
        stack.push(2);
        
        System.out.println();
        stack.pop();
        System.out.println();
        stack.peek();
    }
}
