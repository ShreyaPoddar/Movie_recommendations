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
    public static void getuserdata(String link3)
    {
        Scanner in = null;
        try {
            in = new Scanner(new File(link3));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        user = new ArrayList<UserData>();
        while (in.hasNextLine()) {
            UserData ud = new UserData();
            String arr[] = in.nextLine().split("\\|");
            if (arr.length > 1) {
                ud.setUserid(Integer.parseInt(arr[0]));
                ud.setAge(Integer.parseInt(arr[1]));
                ud.setGender(arr[2]);
                ud.setOccupation(arr[3]);
                ud.setZipcode(arr[4]);
                user.add(ud);
            }
        }
//        System.out.println(user.get(942));
//        System.out.println("Hello,It worked");
    }
    public static void getmovies(String link4) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(link4));
        String line;
        movie = new ArrayList<MoviesData>();
        while ((line = br.readLine()) != null) {
            if (line.length() == 0)
                continue;
            MoviesData md = new MoviesData();
            String arr[] = line.split("[|]");

            ArrayList<Integer> genre1 = new ArrayList<Integer>();
            md.setMovieid(Integer.parseInt(arr[0]));
            md.setMovietitle(arr[1]);
            md.setReleasedate(arr[2]);
            md.setVideoreleasedate(arr[3]);
//                md.setUrl(arr[4]);

            for (int i = 5; i < arr.length; i++) {
                genre1.add(Integer.parseInt(arr[i]));
            }

            System.out.println(genre1);

            md.setGenre(genre1);
            movie.add(md);
        }
//        System.out.println(movie.get(1681));
//        System.out.println("Hello,It worked");
    }

public static void main(String[] args)throws IOException
{
//    ReadData rData=new ReadData();
    getrating("D:/Downloads/Assignment1/ratings.data");
    getgenre("D:/Downloads/Assignment1/genre.data");
    getuserdata("D:/Downloads/Assignment1/user.data");
    getmovies("D:/Downloads/Assignment1/movie.data");
}
}

