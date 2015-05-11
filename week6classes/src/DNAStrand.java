import java.util.regex.Pattern;

/**
 * Created by Andra on 24.02.2015.
 */
public class DNAStrand {

    private String dna;

    public DNAStrand(String dna) {
        this.dna=dna;
    }

    public boolean isValidDNA() {
        //Returns true if the DNA is valid
        //i.e, only contains the letters, A,T,C,G (in uppercase) and at least one of these characters.

        //Pattern.matches("[\\dATCG]+", dna);

        boolean ok = true, aok = false, tok = false, cok = false, gok = false;

        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) != 'A' && dna.charAt(i) != 'T' && dna.charAt(i) != 'C' && dna.charAt(i) != 'G') {
                ok = false;
            }
            if (dna.charAt(i) == 'A') aok = true;
            else if (dna.charAt(i) == 'T') tok = true;
            else if (dna.charAt(i) == 'C') cok = true;
            else if (dna.charAt(i) == 'G') gok = true;
        }
        return (ok && aok && tok && cok && gok);
    }

    public String complementWC(){
        String complementWC = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                complementWC += "T";
            }
            else if (dna.charAt(i) == 'C') {
                complementWC += "G";
            }
            else if (dna.charAt(i) == 'G') {
                complementWC += "C";
            }
            else {
                complementWC += "A";
            }

        }
        return complementWC;
    }

    public String palindromeWC(){
        return new StringBuilder(complementWC()).reverse().toString();
    }

    public boolean containsSequence(String seq){
        if (dna.contains(seq)){
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return dna;
    }

    public static void summarise(DNAStrand dna) {
        System.out.println("Original DNA Sequence: " + dna);
        if (dna.isValidDNA()) {
            System.out.println("Is valid");
            System.out.println("Complement: " + dna.complementWC());
            System.out.println("WC Palindrome: " + dna.palindromeWC());
        }
        else {
            System.out.println("Not Valid DNA");
        }
    }


    public static void main(String[] args) {
        DNAStrand test = new DNAStrand("ATGC");
        summarise(test);
    }


}
