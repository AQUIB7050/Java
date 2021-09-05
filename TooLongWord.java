import java.util.Scanner;
public class TooLongWord{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i=0; i<=n; i++) {
            String s = sc.nextLine();
            s.toLowerCase();
            int l = s.length();
            sum = 0;

            if(l>10){
                
                for(int j=1; j<=(l-2); j++){
                    sum += 1;
                }

                System.out.println(s.substring(0,1) + sum + s.substring(l-1));
            } else {
                System.out.println(s);
            }
        }



    }
}