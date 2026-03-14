package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    @Test
    void testConstructor() {
        Range.Position start = new Range.Position(0, 1, 1);
        Range.Position end = new Range.Position(1, 2, 2);
        Range range = new Range(start, end);
        assertEquals(start, range.start());
        assertEquals(end, range.end());
    }
}
