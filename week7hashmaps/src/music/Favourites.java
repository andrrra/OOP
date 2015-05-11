package music;

import java.util.ArrayList;

/**
 * Created by Andra on 05.03.2015.
 */
public class Favourites {
    private final ArrayList<MusicTrack> list = new ArrayList<MusicTrack>();

    public void addTrack(String artist, String title){
        list.add(new MusicTrack(artist, title));
    }

    public void showFavourites(){
        for(int i=0;i<list.size();i++)
            if(list.get(i) !=null) System.out.println(list.get(i));
    }

    public static void main (String[] args){
        Favourites favourites = new Favourites();
        favourites.addTrack("Fun", "Some Nights");
        favourites.addTrack("Oliver Tank", "Help You Breathe");
        favourites.addTrack("Horse Feathers", "Fit Against the Country");
        favourites.addTrack("Emile Sande", "Country House");
        favourites.addTrack("Fun", "Walking the Dog");
        favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
        favourites.showFavourites();
    }
}
