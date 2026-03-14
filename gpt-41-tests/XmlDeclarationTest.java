package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XmlDeclarationTest {
    @Test
    void testConstructorAndName() {
        XmlDeclaration decl = new XmlDeclaration("xml", true);
        assertEquals("xml", decl.name());
    }

    @Test
    void testGetWholeDeclaration() {
        XmlDeclaration decl = new XmlDeclaration("xml", true);
        assertNotNull(decl.getWholeDeclaration());
    }

    @Test
    void testClone() {
        XmlDeclaration decl = new XmlDeclaration("xml", true);
        XmlDeclaration clone = decl.clone();
        assertNotSame(decl, clone);
        assertEquals(decl.name(), clone.name());
    }
}

