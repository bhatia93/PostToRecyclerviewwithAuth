package com.example.esteplogic_android.posttorecyclerview;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Example
{

    @SerializedName("books")
    @Expose
     List<Book> books = null;

    public List<Book> getBooks()
    {
        return books;
    }

    public void setBooks(List<Book> books)
    {
        this.books = books;
    }

}