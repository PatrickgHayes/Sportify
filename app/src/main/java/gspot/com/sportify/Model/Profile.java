package gspot.com.sportify.Model;

import java.util.ArrayList;
import java.util.List;

/** Profile Class
 * Represents and holds all of a user's information.
 * Created by patrickhayes on 5/3/16.
 */
public class Profile {

    /* Set of information that each profile has */
    String mOwner;
    String mProfilePic;
    String mName;
    String mBio;
    String mContactInfo;
    GspotCalendar mCalendar;
    List<MySport> mMySports;

    /* Create a profile, but don't initialize the data */
    public Profile() {
    }

    /* Create a profile with default data */
    public Profile(String mName, String mOwner) {
        this.mName = mName;
        this.mOwner = mOwner;
        this.mBio = "Write a short description of yourself";
        this.mContactInfo = "How would you like people to contact you? Write it here.";
        this.mCalendar = new GspotCalendar();
        this.mMySports = new ArrayList<MySport>();
        this.mMySports.add(new MySport());
        this.mProfilePic = "@drawable/profile_default";
    }

    /* Get the name of the owner */
    public String getmOwner() {
        return mOwner;
    }

    /* Get the name of the user */
    public String getmName() {
        return mName;
    }

    /* Get the bio information */
    public String getmBio() {
        return mBio;
    }

    /* Get the contact info information */
    public String getmContactInfo() {
        return mContactInfo;
    }

    /* Get the list of sports */
    public List<MySport> getmMySports() {
        return mMySports;
    }

    /* Get the user's calendar */
    public GspotCalendar getmCalendar() {
        return mCalendar;
    }

    /* Get the user's profile picture */
    public String getmProfilePic() {
        return mProfilePic;
    }

    /* Set the owner */
    public void setmOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    /* Set the profile picture */
    public void setmProfilePic(String mProfilePic) {
        this.mProfilePic = mProfilePic;
    }

    /* Set the name of the user */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /* Set the bio information for the user */
    public void setmBio(String mBio) {
        this.mBio = mBio;
    }

    /* Set the contact info */
    public void setmContactInfo(String mContactInfo) {
        this.mContactInfo = mContactInfo;
    }

    /* Set the calendar */
    public void setmCalendar(GspotCalendar mCalendar) {
        this.mCalendar = mCalendar;
    }

    /* Set the list of sports */
    public void setmMySports(List<MySport> mMySports) {
        this.mMySports = mMySports;
    }

    /** Toggle Time Method
     * Toggle the availability of the user at a specific time
     * of the day and a specific day of the week.
     * @param timeOfDay specified time of the day to toggle
     * @param dayOfWeek specified day of the week to toggle
     */
    public void toggleTime(int dayOfWeek, int timeOfDay) {
        mCalendar.toggleTime(dayOfWeek, timeOfDay);
    }

    /** Set Availability Method
     * Sets the a specified time to be set as
     * 'available' or 'busy'.
     * @param availability specified time of the day to set
     * @param timeOfDay specified time of the day to set
     * @param dayOfWeek specified day of the week to set
     */
    public void setAvailability(boolean availability, int dayOfWeek, int timeOfDay) {
        mCalendar.setAvailability(availability, dayOfWeek, timeOfDay);
    }


}