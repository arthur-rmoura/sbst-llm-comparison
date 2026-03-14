package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommentTest {
    @Test
    void testConstructorAndGetData() {
        Comment comment = new Comment("test comment");
        assertEquals("test comment", comment.getData());
    }

    @Test
    void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }
}

