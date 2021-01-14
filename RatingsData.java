package Parser;
import java.io.*;
import java.util.*;

public class RatingsData {
    int userid;
    int movieid;
    int rating;
    String timestamp;
    RatingsData()
    {
        this(0,0,0,"");
    }

    RatingsData(int userid,int movieid,int rating,String timestamp)
    {
        this.userid=userid;
        this.movieid=movieid;
        this.rating=rating;
        this.timestamp=timestamp;
    }
    public void setUserid(int userid)
    {
        this.userid=userid;
    }
    public int getUserid()
    {
        return userid;
    }
    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }
    public int getMovieid()
    {
        return movieid;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }
    public int getRating()
    {
        return rating;
    }
    public void setTimestamp(String timestamp)
    {
        this.timestamp=timestamp;
    }
    public String getTimestamp()
    {
        return timestamp;
    }
    @Override
    public String toString()
    {
       return String.format("User id: "+userid+"Movie id: "+movieid+"Rating:"+rating+"Timestamp:"+timestamp);

    }

}
