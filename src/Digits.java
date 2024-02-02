import java.util.ArrayList;
public class Digits
{
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /** Constructs a Digits object that represents num.
     *  Precondition: num >= 0
     */
    public Digits(int num)
    {
        String number = Integer.toString(num);
        digitList = new ArrayList<Integer>();
        for(int i = 0; i < number.length(); i++)
        {
            char digit = number.charAt(i);
            digitList.add(Character.getNumericValue(digit));
        }
    }

    /** Returns true if the digits in this Digits object are in strictly increasing order;
     *          false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        boolean isIncreasing = true;
        for(int i = 1; i < digitList.size(); i++)
        {
            if(digitList.get(i) <= digitList.get(i - 1))
            {
                isIncreasing = false;
            }
        }
        return isIncreasing;
    }

    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }
}