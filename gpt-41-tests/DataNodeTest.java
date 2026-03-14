package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataNodeTest {
    @Test
    void testConstructorAndGetWholeData() {
        DataNode node = new DataNode("data");
        assertEquals("data", node.getWholeData());
    }

    @Test
    void testSetWholeData() {
        DataNode node = new DataNode("data");
        node.setWholeData("new data");
        assertEquals("new data", node.getWholeData());
    }
}

