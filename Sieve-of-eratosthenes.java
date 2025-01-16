public class Sieve-of-eratosthenes
{
    public static boolean bar[];


    public static boolean isPrime(int n)
    {


        return bar[n];


    }




    public static void init(int LIMIT)
    {


        bar = new boolean[LIMIT + 1];


        for(int i = 2; i<=LIMIT; i++)
        {
            bar[i] = true;
        }


        for(int i = 2; i*i<=LIMIT; i++)
        {


            if(bar[i])
            {


                //System.out.println("turning off the multiples of" + i);
                for(int j=i*i; j<=LIMIT; j+=i)
                {
                   // System.out.println("    turning off elemts at index" + j);
                    //System.out.println("outer loop" + i);


                    bar[j] = false;


                }


            }
        }


       // return bar;


    }


     public static void main(String args[])
     {


         int c=0;
         long start, end, mstime;


         final int LIMIT=1000000; // 1m took ~800 secs.


         start = System.currentTimeMillis();


         init(LIMIT);


         for(int i=2; i<LIMIT; i++)
         {


             if(isPrime(i)) {
                 System.out.println(i);
                 c++;
             }
         }


         end = System.currentTimeMillis();
         mstime = end - start;
         System.out.println("#primes = " + c + " , mstime = " + mstime);


     }




}
