`class SimpleNumberToRoman 
{
  public static String digitToRoman(char digit) 
    {
        switch (digit) 
         {
            case '0': return "";
            case '1': return "I";
            case '2': return "II";
            case '3': return "III";
            case '4': return "IV";
            case '5': return "V";
            case '6': return "VI";
            case '7': return "VII";
            case '8': return "VIII";
            case '9': return "IX";
            default: return "";
        }
    }
    public static void numberToRoman(int number) 
      {
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) 
        {
            char digit = numberStr.charAt(i);
            System.out.print(digitToRoman(digit) + " ");
        }
     }

    public static void main(String[] args)
    {
        numberToRoman(1756);
    }
}
