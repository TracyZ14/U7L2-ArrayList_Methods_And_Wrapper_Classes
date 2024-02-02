public class DigitsTester
{
    public static void main(String[] args)
    {
        Digits d1 = new Digits(15704);
        System.out.println("EXPECTED RESULT : [1, 5, 7, 0, 4]");
        System.out.println("ACTUAL RESULT   : " + d1.getDigitList());

        Digits d2 = new Digits(0);
        System.out.println("EXPECTED RESULT : [0]");
        System.out.println("ACTUAL RESULT   : " + d2.getDigitList());

        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + new Digits(7).isStrictlyIncreasing());

        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + new Digits(1356).isStrictlyIncreasing());

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + new Digits(1336).isStrictlyIncreasing());

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + new Digits(1536).isStrictlyIncreasing());

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + new Digits(65310).isStrictlyIncreasing());
    }
}