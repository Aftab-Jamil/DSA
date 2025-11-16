import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int [] arr={4,7,3,4,8,1};
        int [] nextGreater=new int[arr.length];

        Stack<Integer> stack =new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
             while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i]=-1;
                stack.push(arr[i]);
            }
            else{
                nextGreater[i]=stack.peek();
                stack.push(arr[i]);
            }
        }
        // printing nextGreater array
        for(int g:nextGreater){
            System.out.print(g+"---->>>>");
        }




    }
}
