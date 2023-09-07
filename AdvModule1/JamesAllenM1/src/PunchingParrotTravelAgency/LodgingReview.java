/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class LodgingReview{
//    private vars
    private int rating;
    private String comments;
//    default constructor probably not necessary because this is a standalone class
    LodgingReview(){
        
    }
//      setters and getters
    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }    
    
}
