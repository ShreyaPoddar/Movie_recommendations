package Parser;
import java.io.*;
import java.util.*;

public class ReadData {

    static ArrayList<RatingsData> rating;
    static ArrayList<MoviesData> movie;
    static ArrayList<GenreData> genredata;
    static ArrayList<UserData> user;



    public static void getrating(String link1)
    {
        Scanner in = null;
        try {
            in = new Scanner(new File(link1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        rating = new ArrayList<RatingsData>();
        while (in.hasNextLine()) {
            RatingsData rd = new RatingsData();
            String arr[] = in.nextLine().split("\\t");
            if (arr.length > 0) {
                rd.setUserid(Integer.parseInt(arr[0]));
                rd.setMovieid(Integer.parseInt(arr[1]));
                rd.setRating(Integer.parseInt(arr[2]));
                rd.setTimestamp(arr[3]);
                rating.add(rd);
            }

        }
//        System.out.println(rating.get(0));
//        System.out.println("Hello,It worked");
    }
    public static void getgenre(String link2)
    {
        Scanner in = null;
        try {
            in = new Scanner(new File(link2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        genredata = new ArrayList<GenreData>();
        while (in.hasNextLine()) {
            GenreData gd = new GenreData();
            String arr[] = in.nextLine().split("\\|");
            if (arr.length > 1) {
                gd.setGenre(arr[0]);
                gd.setIndex(Integer.parseInt(arr[1]));
                genredata.add(gd);
            }
    }
//        System.out.println(genredata.get(0));
//        System.out.println("Hello,It worked");
}
public static void main(String[] args)throws IOException
{
//    ReadData rData=new ReadData();
    getrating("D:/Downloads/Assignment1/ratings.data");
    getgenre("D:/Downloads/Assignment1/genre.data");

}
}

