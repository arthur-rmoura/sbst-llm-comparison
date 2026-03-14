package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextNodeTest {
    @Test
    void testConstructorAndText() {
        TextNode node = new TextNode("hello");
        assertEquals("hello", node.text());
    }

    @Test
    void testIsBlank() {
        TextNode blank = new TextNode("");
        assertTrue(blank.isBlank());
    }

    @Test
    void testSplitText() {
        TextNode node = new TextNode("abcdef");
        TextNode split = node.splitText(3);
        assertEquals("abc", node.text());
        assertEquals("def", split.text());
    }
}

