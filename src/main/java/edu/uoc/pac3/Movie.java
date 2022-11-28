package edu.uoc.pac3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Movie {
    private String title;
    private String summary;
    private Actor[] casting;

    public Movie(String title, String summary, Actor[] casting) {
        setTitle(title);
        setSummary(summary);
        setCasting(casting);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Actor[] getCasting() {
        return casting;
    }

    public void setCasting(Actor[] casting){
        this.casting = casting;
    }

    public String getJSON(){

        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public String getPrettyJSON(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this);
        return json;
    }

    public static Movie getObject(String inputJson){
        Movie movieObject = new Gson().fromJson(inputJson, Movie.class);
        return movieObject;
    }

}
