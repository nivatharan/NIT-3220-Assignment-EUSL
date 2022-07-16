// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class summation{
    public static void main(String[] args) {
        int Summation = 0;
       for (int i = 10; i <= 50; i++)
       {
           if (i % 6 == 0 & i % 8 != 0)
           {
               System.out.println(i);
               Summation += i;
           }
       }
       System.out.println("Sum of the series: "+Summation);
    }
}