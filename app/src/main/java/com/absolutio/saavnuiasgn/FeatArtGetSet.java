package com.absolutio.saavnuiasgn;

public class FeatArtGetSet {

    private String Title;
    private String Lang;
    private int Thumbnail;

    public FeatArtGetSet(String title, String lang, int thumbnail) {
        Title = title;
        Lang = lang;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getLang() {
        return Lang;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setLang(String lang) {
        Lang = lang;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
