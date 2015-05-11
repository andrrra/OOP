/**
 * Created by Andra on 05.03.2015.
 */
public class TestIn {
    public static void main(String[] args) {

        In file = new In("http://www.gutenberg.org/files/39063/39063-0.txt");
        while (!file.isEmpty()) {
            String line = file.readLine();
            if (line.contains("mountain")) {
                System.out.println(line);
            }
        }
    }
}