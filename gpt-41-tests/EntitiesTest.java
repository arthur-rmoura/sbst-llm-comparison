package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntitiesTest {
    @Test
    void testEscape() {
        String escaped = Entities.escape("<div>");
        assertTrue(escaped.contains("&lt;"));
    }
}

