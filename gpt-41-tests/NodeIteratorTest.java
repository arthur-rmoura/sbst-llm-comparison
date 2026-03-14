package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeIteratorTest {
    @Test
    void testFrom() {
        Element element = new Element("div");
        NodeIterator<Node> iterator = NodeIterator.from(element);
        assertNotNull(iterator);
    }

    public static void trackSeen(Node node, StringBuilder builder) {
        builder.append(node.nodeName());
        if (node instanceof TextNode) builder.append(((TextNode) node).text());
        builder.append(";");
    }
}
