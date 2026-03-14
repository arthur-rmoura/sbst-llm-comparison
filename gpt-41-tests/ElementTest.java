package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElementTest {
    @Test
    void testConstructorAndTagName() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
    }
}

