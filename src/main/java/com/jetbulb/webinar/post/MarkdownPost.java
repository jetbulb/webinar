package com.jetbulb.webinar.post;

import net.steppschuh.markdowngenerator.text.Text;
import net.steppschuh.markdowngenerator.text.heading.Heading;

public class MarkdownPost implements Post {
    private final Heading title;
    private final Text content;

    public MarkdownPost(String title, String content) {
        this.title = new Heading(title, 1);
        this.content = new Text(content);
    }

    @Override
    public String getTitle() {
        return String.valueOf(title.getValue());
    }

    @Override
    public String getContent() {
        return String.valueOf(content.getValue());
    }

    @Override
    public String getText() {
        return new StringBuilder()
                .append(title)
                .append("\n")
                .append(content)
                .toString();
    }
}
