package com.jetbulb.webinar.post;

public class Post {
    public String title;
    public Content content;

    public Post(String title, Content content) {
        this.title = title;
        this.content = content;
    }

    /**
     * Retrieves a post header
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves a post content
     */
    public String getContent() {
        return content.getConstructed();
    }

    /**
     * Retrieves a text that contains both header and content
     */
    public String getText() {
        StringBuilder sb = new StringBuilder(title);

        return sb.append("\n\n")
                .append(content.getConstructed())
                .toString();
    }

}
