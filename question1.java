import java.util.*;
class question1 {
    public static void main(String[] args){
        List<Float> l = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            Float n = sc.nextFloat();
            l.add(n);
        }

        Float sum= Float.valueOf(0);
        for(Float i:l){
            sum+=i;
        }
        System.out.println(sum);
    }

}