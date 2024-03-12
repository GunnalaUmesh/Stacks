class Main{
    public static void main(String[] args){
        Queue que = new Queue(4);
        que.push(2345);
        que.push(234);
        que.push(23);
        que.push(2);
        que.peek();

        System.out.println();
        que.pop();
        que.peek();
        System.out.println();
        que.pop();
        que.peek();
        System.out.println();
        que.pop();
        que.peek();  
        System.out.println();
        que.pop();
        que.peek();

    }
}
