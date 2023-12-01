public class Main {
    public static void main(String[] args) {
        /*
0 + 1 = 1

1 + 1 = 2

1 + 2 = 3

2 + 3 = 5

3 + 5 = 8

5 + 8 = 13

13 + 8 = 21

21 + 8 = 34

x * y = z

y + z = result
         */
        int i = 0, value=1,result=0, fibonnaci=0;


        for (int j = 1; j <9; j++) {

            result=i+value;
            System.out.println(i+" + "+value+" = "+result);
            i=value;
            value=result;

        }
        System.out.print(fibonnaci);
    }
}