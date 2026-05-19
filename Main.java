import java.math.BigIntger;
public class Main
{
    public static void main(String args[])
    {
        int summe = 0;

        int obereGrenze = 50;

        for(int i = 1; i <= 20; ++i)
        {
            summe += 1;
        }
        
        BigInteger mult = new BigInteger("1");
        
        for(int i = 1; i <= obereGrenze; ++i)
        {
            BigInteger tmp = new BigInteger(String.valueOf(i));
            mult = mult.multiply(tmp);
        }
        
        System.out.println("Summe " + summe);
        System.out.println("Mult " + mult);
        
        //coole idee1
        // 2...
    }
}
