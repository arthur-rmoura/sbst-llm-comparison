package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void testClone() {
        Element el = new Element("div");
        Node clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el.nodeName(), clone.nodeName());
    }
}

