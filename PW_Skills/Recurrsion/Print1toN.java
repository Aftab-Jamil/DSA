package PW_Skills.Recurrsion;

public class Print1toN {
    public static void print_1_to_N(int x,int n){
        if(x>n) return;
        System.out.println(x);
        print_1_to_N(x+1,n);
    }
    public static void print_1_to_N(int n){
        print_1_to_N(1,n);
    }

    public static void main(String[] args) {
        print_1_to_N(29);
    }
}
