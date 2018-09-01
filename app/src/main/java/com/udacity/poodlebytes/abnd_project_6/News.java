package com.udacity.poodlebytes.abnd_project_6;

public class News {
    /**
     * An {@link News} object contains information related to a single news article.
     */

    /**
     * News Article TAG   //JSON key
     **/
    private String title;   //webTitle
    private String date;     //webPublicationDate
    private String url;     //webUrl
    private String author;     //tags / webTitle
    private String category;  //sectionName

    /**
     * Constructs a new {@link News} article containing:
     *
     * @param title    is the title article
     * @param date     the date of the article
     * @param url      website URL to read the article
     * @param author   article's author(s)
     * @param category category of article
     */
    public News(String title, String date, String url, String author, String category) {
        this.title = title;
        this.date = date;
        this.url = url;
        this.author = author;
        this.category = category;
    }

    /**
     * GET Functions
     **/
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getCategory() {
        return category;
    }
}
