import java.util.Stack;
import java.util.*;

public class question3 {
    static Stack<Integer> st = new Stack<Integer>();
    static Integer minEle = Integer.MAX_VALUE;

    public static void pushEle(int num) {
        if (st.empty()) {
            minEle = num;
            st.push(num);
            return;
        }
        if (num < minEle) {
            st.push(2 * num - minEle);
            minEle = num;
        } else
            st.push(num);

    }

    public static void popEle() {
        if (st.empty()) {
            System.out.println("Can't pop the element");
            return;
        }
        int top = st.pop();
        if (top < minEle) {
            minEle = 2 * minEle - top;
        }
    }

    public static int getMin() {
        if (st.empty())
            return -1;
        return minEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println("1 : Push Element");
            System.out.println("2 : Pop Element");
            System.out.println("3 : Get Min Element");
            System.out.println("4 : Exit");
            
            System.out.print("Enter any above choices :  ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the number : ");
                    int num = sc.nextInt();
                    System.out.println();
                    pushEle(num);
                    break;
                case 2:
                    popEle();
                    break;
                case 3:
                    System.out.println("Minimum number is : " + getMin() + "\n");
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid Choice");
                    break;
            }
        }

    }

}