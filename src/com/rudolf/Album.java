package com.rudolf;

import java.util.Date;

/**
 * Created by rudi on 12/14/2015.
 */
public class Album {
    String artist;
    String title;
    double price;

    public Album(String artist, String title, double price, int consId, Date consDate) {
        this.artist = artist;
        this.title = title;
        this.price = price;
        this.consId = consId;
        this.consDate = consDate;
    }

    int consId;
    Date consDate;
    int albumID;




}
