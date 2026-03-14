package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;

class FormElementTest {
    @Test
    void testConstructor() {
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        FormElement form = new FormElement(tag, "", attrs);
        assertEquals("form", form.tagName());
    }
}
