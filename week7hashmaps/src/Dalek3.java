import java.util.ArrayList;

/**
 * Created by Andra on 05.03.2015.
 */public class Dalek3 {

    private ArrayList<String> s = new ArrayList<String>();

    public void addSaying(String ss) {
        s.add(ss);
    }

    public void setSayings(String[] s) {
        for (int i=0; i< s.length; i++)
            this.s.add(s[i]);
    }

    public void speak() {
        String utterance;
        if (s.size() > 0) {
            int i = (int) (Math.random() * s.size());
            utterance = s.get(i);
        }
        else {
            utterance = "No utterances installed!";
        }
        System.out.println(utterance);

    }


    public static void main(String[] args) {

        Dalek3 d1 = new Dalek3();
        String[] u1 = {
                "Exterminate, Exterminate!",
                "I obey!",
                "Exterminate, annihilate, DESTROY!",
                "You cannot escape.",
                "Daleks do not feel fear.",
                "The Daleks must survive!"
        };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek3 d2 = new Dalek3();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }
    }

}