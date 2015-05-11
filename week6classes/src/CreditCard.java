/**
 * Created by Andra on 24.02.2015.
 */

import java.util.Calendar;

public class CreditCard {
    private int expiryMonth=0;
    private int expiryYear=0;
    private String firstName = "";
    private String lastName = "";
    private String ccNumber = "";
    Calendar now = Calendar.getInstance();

    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber){
        this.expiryMonth=expiryMonth;
        this.expiryYear=expiryYear;
        this.firstName=firstName;
        this.lastName=lastName;
        this.ccNumber=ccNumber;
    }

    public String formatExpiryDate(){
        return(expiryMonth+"/"+expiryYear%100);
    }

    public String formatFullName(){
        return(firstName+" "+lastName);

    }

    public String formatCCNumber(){
    //    return (ccNumber[0]+ccNumber[1]+ccNumber[2]+ccNumber[3]+" "+ccNumber[4]+ccNumber[5]+ccNumber[6]+ccNumber[7]+" "+ccNumber[8]+ccNumber[9]+ccNumber[10]+ccNumber[11]+" "+ccNumber[12]+ccNumber[13]+ccNumber[14]+ccNumber[15]);
        String formatNum = ccNumber.substring(0,4) + " " + ccNumber.substring(4,8) + " " + ccNumber.substring(8,12) + " " + ccNumber.substring(12,16);
        return formatNum;
    }

    public boolean isValid(){
        int curYear = now.get(Calendar.YEAR);
        int curMonth = now.get(Calendar.MONTH)+1;

        if ((curYear < expiryYear)||((curMonth<expiryMonth) && (curYear == expiryYear))) {
            return true;
        }
        else return false;
    }

    public String toString(){
        return ("Number: "+formatCCNumber()+"\n"+"Expiration date: "+formatExpiryDate()+"\n"+"Account holder: "+formatFullName()+"\n"+"Is valid: "+isValid());
    }



}
