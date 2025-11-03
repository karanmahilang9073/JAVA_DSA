package practice;

public class Stack {
    private int maxsize;
    private int top;
    private int[] stackarray;

    public Stack(int size){
        maxsize = size;
        stackarray = new int[maxsize];
        top = -1;
    }

    public void push(int value){ //add an item to the top of the stack
        if(isFull()){
            System.out.println("stack is full cannot push"+value);
        }else{
            stackarray[++top] = value;
        }
    }

    public int pop(){ //removes and returns the top item
        if(isEmpty()){
            System.out.println("stack is empty cannot pop");
            return -1;
        }else{
            return stackarray[top--];
        }
    }

    public int peak(){ //returns the top item without removing
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            return stackarray[top];
        }
    }

    public boolean isEmpty(){ //checks if the  stack is empty
        return (top == -1);
    }

    public boolean isFull(){ //check if the stack is full
        return (top == maxsize -1);
    }


    public static void main(String[] args) {
        Stack  mystack = new Stack(5);
        mystack.push(10); //adds item to the topof the stack
        mystack.push(20);
        mystack.push(30);
        // System.out.println("top element is"+mystack.peak()); 
        // System.out.println("popped" + mystack.pop());   //removes and return the top item
        // System.out.println("top element now" +mystack.peak() ); // returns the top element without removing
        

    }
}