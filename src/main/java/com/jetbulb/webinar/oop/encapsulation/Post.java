package com.jetbulb.webinar.oop.encapsulation;

public class Post {
    public String header;
    public String content;
    public String text;

    /**
     * Retrieves a post header
     */
    public String getHeader() {
        return header;
    }

    /**
     * Retrieves a post content
     */
    public String getContent() {
        return content;
    }

    /**
     * Retrieves a text that contains both header and content
     */
    public String getText() {
        return text;
    }

}
