public class change
{
    public static int[] coins = {5, 10, 25};
    //run program by java program.java on terminal
    //when running specific method in java, first run javac change.java, then run java methodname
    public static void main(String[] args)
    {
      int cents = 11;
      System.out.println(NumberofWaystoMake(cents, 0)); //second parameter, currentCoin is to help remove duplicates
    }

    public static int NumberofWaystoMake(int cents, int currentCoin)
    {
      //using recursion
      if (cents < 5)
      {
        return 1;
      }
      else if (cents < 0)
      {
        return 0;
      }
      int numWays = 0;
      for (int coin = currentCoin; coin < coins.length; coin++)
      {
          numWays += NumberofWaystoMake(cents - coins[coin], coin);
      }

      return numWays - 1; //always count 1 more... using magic number to solve this issue (committed a crime)

    }

}
