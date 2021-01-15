package Parser;
import java.io.*;
import java.util.*;


public class MoviesData {
    int movieid;
    String movietitle;
    String releasedate;
    String videoreleasedate;
    String url;
    ArrayList<Integer> genre=new ArrayList<Integer>();
    MoviesData(){
    }

    public MoviesData(int movieid,String movietitle,String releasedate,String videoreleasedate,String url,ArrayList<Integer> genre)
    {
        this.movieid=movieid;
        this.movietitle=movietitle;
        this.releasedate=releasedate;
        this.videoreleasedate=videoreleasedate;
        this.url=url;
        this.genre=genre;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public String getMovietitle() {
        return movietitle;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setVideoreleasedate(String videoreleasedate) {
        this.videoreleasedate = videoreleasedate;
    }

    public String getVideoreleasedate() {
        return videoreleasedate;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setGenre(ArrayList<Integer> genre) {
        this.genre = genre;
    }

    public ArrayList<Integer> getGenre() {
        return genre;
    }
    @Override
    public String toString()
    {
        return String.format("Movie id: "+movieid+"Movie title: "+movietitle+"Release date:"+releasedate+
                "Video release date:"+videoreleasedate+"URL:"+url+"Genre"+genre);

    }

}
