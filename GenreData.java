package Parser;
import java.io.*;
import java.util.*;

public class GenreData {
    String genre;
    int index;
    GenreData()
    {
        this("",0);
    }
    public GenreData(String genre, int index) {
        this.genre = genre;
        this.index = index;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return String.format("Genre:" + genre + "Index:" + index);
    }
}

