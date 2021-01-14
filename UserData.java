package Parser;
import java.io.*;
import java.util.*;

public class UserData {
    int userid;
    int age;
    String gender;
    String occupation;
    String zipcode;
    UserData()
    {}
    public UserData(int userid,int age,String gender,String occupation,String zipcode)
    {
        this.userid=userid;
        this.age=age;
        this.gender=gender;
        this.occupation=occupation;
        this.zipcode=zipcode;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }
    @Override
    public String toString()
    {
        return String.format("User id: "+userid+"Age:"+age+"Gender:"+gender+"Occupation"+occupation+"Zipcode"+zipcode);

    }
}
