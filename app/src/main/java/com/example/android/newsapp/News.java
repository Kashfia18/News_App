package com.example.android.newsapp;

public class News {
    /**
     * Article name
     */
    private final String mArticleName;

    /**
     * Author
     */
    private final String mAuthor;

    /**
     * Date
     */
    private final String mDate;

    /**
     * Category
     */
    private final String mCategory;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param articleName                is the magnitude (size) of the earthquake
     * @param author           is the location where the earthquake happened
     * @param date is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public News(String articleName, String author, String date, String category, String url) {
        mArticleName = articleName;
        mAuthor = author;
        mDate = date;
        mCategory=category;
        mUrl = url;
    }

    /**
     * get the magnitude
     *
     * @return String type
     */
    public String getArticleName() {
        return mArticleName;
    }

    /**
     * get the location
     *
     * @return String type
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * get the date.
     *
     * @return string type
     */
    public String getDate() {
        return mDate;
    }

    /**
     * get the date.
     *
     * @return string type
     */
    public String getCategory() {
        return mCategory;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;

    }

}
