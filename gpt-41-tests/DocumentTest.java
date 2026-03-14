package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {
    @Test
    void testConstructor() {
        Document doc = new Document("http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.location());
    }
}

