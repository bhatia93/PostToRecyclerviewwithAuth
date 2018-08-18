package com.example.esteplogic_android.posttorecyclerview;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public  class  Book
{
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("published")
    @Expose
    private String published;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("website")
    @Expose
    private String website;

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public void setSubtitle(String subtitle)
    {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
