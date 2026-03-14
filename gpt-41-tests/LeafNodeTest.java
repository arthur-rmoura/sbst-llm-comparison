package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeafNodeTest {
    static class DummyLeafNode extends LeafNode {
        DummyLeafNode(String value) { super(value); }
        @Override
        @org.jspecify.annotations.NullMarked
        public String nodeName() { return "dummy"; }
        @Override
        public void outerHtmlHead(org.jsoup.internal.QuietAppendable accum, org.jsoup.nodes.Document.OutputSettings out) {
            // minimal stub for test
        }
    }

    @Test
    void testCoreValue() {
        DummyLeafNode node = new DummyLeafNode("test");
        assertEquals("test", node.coreValue());
    }
}
