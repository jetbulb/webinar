package com.jetbulb.webinar.post;

import java.util.ArrayList;
import java.util.List;

public class Content {
    private List<ContentItem> items;

    public Content() {
        this.items = new ArrayList<>();
    }

    public void addItem(String header, String content) {
        items.add(new ContentItem(header, content));
    }

    public String getConstructed() {
        StringBuilder sb = new StringBuilder();

        items.forEach(contentItem ->
                sb.append(contentItem.header)
                        .append("\n")
                        .append(contentItem.text)
                        .append("\n")
        );

        return sb.toString();
    }

    private static class ContentItem {
        final String header;
        final String text;

        public ContentItem(String header, String text) {
            this.header = header;
            this.text = text;
        }
    }
}
