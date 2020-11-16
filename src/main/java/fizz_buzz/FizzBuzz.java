
package fizz_buzz;
import java.math.BigDecimal;
public class FizzBuzz {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String BANG = "BANG";
    int nFizz = 4;
    int nBuzz = 5;
    int nBang = 11;
    private final String[] ZeroToNineteen = {
            " zero",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };
    private final String[] tenToNinety = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    public boolean isFizz( Integer numberToSay ){
        return ( numberToSay % nFizz == 0 );
    }
    public boolean isBuzz( Integer numberToSay ){
        return ( numberToSay % nBuzz == 0);
    }
    public  boolean isBang(Integer numberToSay){
        return (numberToSay % nBang == 0);
    }
    public String Say(Integer numberToSay) {
        String result = "";
        if( numberToSay % nFizz == 0 ) {
            result = FIZZ;
        }else if( numberToSay % nBuzz == 0)
        {
            result = BUZZ;
        }else if(numberToSay % nBang == 0){
            result = BANG;
        }
        else{
            result = Integer.toString(numberToSay);
        }
        return result;
    }
    public void implement( Integer minimum, Integer maximum) {
        System.out.println("Minimum "+minimum);
        System.out.println("Maximum "+maximum); //0, 99999
        if(minimum > 0 && maximum > 0) {
            if (maximum > minimum)
                for (int i = minimum; i <= maximum; i++) {
                    System.out.println(convertToWords(i));
                }
            else
                System.out.println("Maximum is lower than minimun");
        }else{
            System.out.println("Positive numbers only");
        }
    }
    public String convertToWords(int intValue){
        String result = "";
        if( isFizz(intValue) == true)
            return FIZZ;
        else if( isBuzz( intValue ) == true)
            return BUZZ;
        else if ( isBang(intValue) == true )
            return BANG;
        int thousand = 0;
        while(intValue >= 1000)
        {
            intValue -= 1000;
            thousand++;
        }
        int hundred = 0;
        while(intValue >= 100)
        {
            intValue -= 100;
            hundred++;
        }
        int ten = 0;
        while(intValue >= 10)
        {
            intValue -= 10;
            ten++;
        }
        if(thousand > 0 ){
            if(thousand == 1)
                result = thousand +" thousand";
            else
                result = thousand +" thousands";
        }
        if(hundred>0){
            if( hundred ==1 )
                result+=" "+hundred+" hundred";
            else
                result+=" "+hundred+" hundreds";
        }
        if(ten == 1 ){
            result += " " + ZeroToNineteen[10+intValue];
        }else{
            if (ten > 0) {
                result += " " + tenToNinety[ten];
            }
            if (intValue > 0) {
                result += " " + ZeroToNineteen[intValue];
            }
        }
        // System.out.println("Number "+result);
        return result;
    }
}