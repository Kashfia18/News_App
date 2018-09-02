package com.example.android.newsapp;

public class News {
    /**
     * Article name
     */
    private final String mArticleName;

    /**
     * Author name
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
     * @param articleName is the title of the news section.
     * @param author is the writer of the article
     * @param date  is the date of publication
     * @param category  is name of the section that the article belongs to.
     * @param url is the url to find more information about the news.
     */
    public News(String articleName, String author, String date, String category, String url) {
        mArticleName = articleName;
        mAuthor = author;
        mDate = date;
        mCategory=category;
        mUrl = url;
    }

    /**
     * get the article title
     *
     * @return String type
     */
    public String getArticleName() {
        return mArticleName;
    }

    /**
     * get the author
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
     * get the category.
     *
     * @return string type
     */
    public String getCategory() {
        return mCategory;
    }

    /**
     * get the URL
     *
     * @return string type
     */
    public String getUrl() {
        return mUrl;

    }

}
