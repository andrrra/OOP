/**
 * Created by Andra on 07.03.2015.
 */
public class Tokenizer {

    private String[] tokens={};

    public Tokenizer(){
        //do nothing;
    }

    public Tokenizer(String fname){
        tokensFromFile(fname);
    }

    public void tokensFromFile(String fname){
        In file = new In(fname);
        tokenize(file.readAll());
    }

    public void tokenize(String str){
        tokens = str.split("\\W+");
    }

    public String[] getTokens(){
        return tokens;
    }

    public int getNumberTokens(){
        return tokens.length;
    }

    public static void main(String[] args){
        Tokenizer t0 = new Tokenizer("melville-moby_dick.txt");
        String[] tokens0 = t0.getTokens();
    }

}
