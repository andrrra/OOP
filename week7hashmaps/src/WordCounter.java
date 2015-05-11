import java.util.HashMap;

/**
 * Created by Andra on 07.03.2015.
 */
public class WordCounter {

    private HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

    public WordCounter(String[] tokens){
        //Class constructor. When a WordCounter is created, it calls wordLengthFreq() on the input tokens.
        wordLengthFreq(tokens);
    }

    public void wordLengthFreq(String[] tokens){
        //Replace the object’s frequency distribution with information about the lengths of the strings in tokens.
        frequencies.clear();
        for (String token : tokens) {
            Integer tokenLength = token.length();
            Integer count = frequencies.get(tokenLength);
            if (count == null) {
                frequencies.put(tokenLength,1);
            }
            else {
                frequencies.put(tokenLength, count + 1);
            }
        }

    }

    public HashMap<Integer, Integer> getFreqDist(){
        //Returns the frequency distribution as a HashMap.
        return frequencies;
    }

    public int maxVal(){
        //Returns the highest value in the frequency distribution.
        int max = 0;
        for (int i : frequencies.values()) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public double[] map2array(){
        //Convert the frequency distribution to a normalized array of doubles. Each (integer) key of the frequency distribution
        // corresponds to an index into the array, and the value for that key corresponds to the element at the index. Convert the values
        // into percentages (where the maximum value of the distribution is 100%).

        // Handle empty frequencies
        if (frequencies.size() == 0) {
            return new double[] {};
        }

        // Find the longest token with a non-zero frequency
        int maximumKey = -1;
        for (int i : frequencies.keySet()) {
            if (i > maximumKey) {
                maximumKey = i;
            }
        }

        double[] points = new double[maximumKey + 1];

        int maximumValue = maxVal();

        for (int i = 0; i < points.length; i++) {
            Integer frequency = frequencies.get(i);
            if (frequency == null) {
                points[i] = 0;
            }
            else {
                points[i] = ((double) frequency) / maximumValue * 100;
            }
        }
        return points;
    }

    public static void main (String[] args){
        Tokenizer tokenizer = new Tokenizer("melville-moby_dick.txt");
        String[] tokens = tokenizer.getTokens();

        WordCounter wordCounter = new WordCounter(tokens);
        System.out.println(wordCounter.getFreqDist());
        double[] points = wordCounter.map2array();

        int n = points.length;
        StdDraw.clear();
        StdDraw.setXscale(0, n - 1);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.5 / n);
        for (int i = 0; i < n; i++) {
            StdDraw.line(i, 0, i, points[i]);
        }
    }
}
