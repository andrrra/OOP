/**
 * Created by Andra on 12.03.2015.
 */
public class Video {
    private final String title;
    private boolean checkedOut=false;
    private int ratingCount=0;
    private int ratingSum=0;
    public Video(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public boolean addRating(int rating){
        if (rating<1||rating>5) {
            System.out.println(rating + " should be between 1 and 5.");
            return false;
        }
        ratingCount++;
        ratingSum+=rating;
        return true;

    }
    //Add a rating for the video. If rating is between 1-5 inclusive, then update the ratings for this video, keeping track of how
    // many ratings for it have been received, and return true. Otherwise, print out an error message and return false.
    public double getAverageRating(){
        if (ratingCount==0) return 0;
        else return (double)ratingSum/ratingCount;

    }
    //Return the average rating for this video. Although ratings are always integers, the average should be a double.
    // Return zero if no ratings have been added;
    public boolean checkOut(){
        if (checkedOut==true) {
            System.out.println(this + " is already checked out.");
            return false;
        }
        else {
            checkedOut=true;
            return true;
        }
    }
    //If the video is already checked out, warn the user and return false. Otherwise change the status of the video to checked out,
    // and return true.
    public boolean returnToStore(){
        if (checkedOut==false) {
            System.out.println(this + " is not checked out.");
            return false;
        }
        else {
            checkedOut=false;
            return true;
        }
    }
    //If the video is not checked out, warn the user and return false. Otherwise change the status of the video to not checked out,
    // and return true.
    public boolean isCheckedOut(){
        return checkedOut;
    }
    //Return the checked-out status of the video
    public String toString() {
        return "Video[title=\"" + title + "\", checkedOut=" + checkedOut + "]";
    }
}
