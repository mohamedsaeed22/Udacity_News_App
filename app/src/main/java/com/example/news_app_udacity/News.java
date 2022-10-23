package com.example.news_app_udacity;

import java.util.List;

public class News {

    private final String mTitle;
    private final String mSection_Name;
    private final List<String> mauthor_Name;
    private final String mDate;
    private final String mUrl;

    public News(String mSection_Name, List<String> mauthor_Name, String mTitle, String mDate, String mUrl) {
        this.mSection_Name = mSection_Name;
        this.mauthor_Name = mauthor_Name;
        this.mTitle = mTitle;
        this.mDate = mDate;
        this.mUrl = mUrl;

    }

    public List<String>  getMauthor_Name() {
        return mauthor_Name;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSection_Name() {
        return mSection_Name;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }
}
