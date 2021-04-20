package com.jetbulb.webinar.post;

public class Post {
    public String title;
    public String content;
    public String text;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.text = title + "\n\n" + content;
    }

    /**
     * Retrieves a post title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves a post content
     */
    public String getContent() {
        return content;
    }

    /**
     * Retrieves a text that contains both title and content
     */
    public String getText() {
        return text;
    }

}
