package sumnumbers;

public class Main {

    public static void main(String[] args) {
Sum s = new Sum();


        System.out.println(s.GetSum(1,2));

    }
    public static class Sum
    {
        public int GetSum(int a, int b)
        {
          int min = Math.min(a,b);
          int max = Math.max(a,b);

            return (max - min + 1) * (min + max) / 2;
        }
    }
}
