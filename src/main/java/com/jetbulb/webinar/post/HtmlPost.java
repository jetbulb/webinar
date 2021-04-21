package com.jetbulb.webinar.post;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.global.ClassAttribute;
import com.webfirmframework.wffweb.tag.html.html5.stylesandsemantics.Header;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class HtmlPost implements Post {
    private final Html document;
    private final Header header;
    private final Div content;

    public HtmlPost(String title, String content) {
        document = new Html(null);

        Head head = new Head(document);
        Body body = new Body(document, new ClassAttribute("html-post"));
        document.setChildren(List.of(head, body));

        header = new Header(body) {{
            new NoTag(this, title);
        }};
        this.content = new Div(body) {{
            new NoTag(this, content);
        }};
    }

    @Override
    public String getTitle() {
        return header.toHtmlString(StandardCharsets.UTF_8);
    }

    @Override
    public String getContent() {
        return content.toHtmlString(StandardCharsets.UTF_8);
    }

    @Override
    public String getText() {
        return document.toHtmlString(StandardCharsets.UTF_8);
    }
}
