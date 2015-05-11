import java.util.ArrayList;

/**
 * Created by Andra on 12.03.2015.
 */
public class VideoStore {

    private ArrayList<Video> videos = new ArrayList<Video>();

    public boolean addVideo(String title) {
        for (Video video : videos)
            if (video.getTitle().equals(title)) {
                System.out.println(title + " is already in stock.");
                return false;
            }
        videos.add(new Video(title));
        return true;
    }
    //Add a video by title to the inventory. If there is already a video with that title in the store’s inventory,
    // print out an error message and return false. Otherwise, add a new video with that title and return true.

    public Video getVideo(String title) {
        for (Video video : videos)
            if (video.getTitle().equals(title)) return video;
        System.out.println("Sorry, cannot find the requested video in the catalogue");
        return null;
    }
    // Return the video whose title is title. If there is no video in the inventory with that title, print out an error message and
    // return null.

    public boolean checkOutVideo(String title) {
        Video video = getVideo(title);
        if (video != null) {
            return video.checkOut();
        }
        return false;
    }
    // Check out a video by title. If there is a video with that title not already checked out, change its status to checked out and
    // return true. Otherwise, print out an appropriate error message and return false.

    public boolean returnVideo(Video video) {
        if (!videos.contains(video)) {
            System.out.println("Sorry, this video did not come from this store");
            return false;
        }
        return video.returnToStore();
    }
    //Return the result of calling the returnToStore() method on the video.

    public void rateVideo(Video video, int rating) {
        video.addRating(rating);
    }
    //Add the rating rating to the video.

    public double getAverageRatingForVideo(Video video) {
        return video.getAverageRating();
    }
    //Return the average user rating for this video as a double.

    public Video[] getCheckedOut() {
        int count = 0, i = 0;

        for (Video video : videos)
            if (video.isCheckedOut())
                count++;

        Video[] checkedOut = new Video[count];

        for (Video video : videos) {
            if (video.isCheckedOut()) {
                checkedOut[i] = video;
                i++;
            }
        }
        return checkedOut;
    }
    //Return an array of type Video[] consisting of all videos in the store which have been checked out.

    public Video mostPopular(){
        double maxRank=0;
        Video bestVideo = null;
        for(Video video:videos)
            if (getAverageRatingForVideo(video)>maxRank){
                maxRank=getAverageRatingForVideo(video);
                bestVideo=video;
            }
        return bestVideo;
    }
    //Return the video which has the highest average ranking. If there is a tie, return the first one.
    // If the store is not stocking any videos, return null

}