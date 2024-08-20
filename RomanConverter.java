public class RomanConverter {

    public static String digitToRoman(char digit) {
        switch (digit) {
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

    public static String convertDigitsToRoman(int number) {
        String numberStr = String.valueOf(number);
        String roman = "";

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            roman +=digitToRoman(digitChar);
        }
        
        return roman;
    }

    public static void main(String[] args) {
        int number = 1756;
        String romanNumerals = convertDigitsToRoman(number);
        System.out.println("The Roman numerals for " + number + " are " + romanNumerals);
    }
}
