package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    static class TestQuietAppendable extends org.jsoup.internal.QuietAppendable {
        private final StringBuilder builder = new StringBuilder();
        public TestQuietAppendable() { super(); }
        @Override
        public TestQuietAppendable append(CharSequence csq) {
            builder.append(csq);
            return this;
        }
        @Override
        public TestQuietAppendable append(char c) {
            builder.append(c);
            return this;
        }
        @Override
        public TestQuietAppendable append(char[] chars, int offset, int len) {
            builder.append(chars, offset, len);
            return this;
        }
        @Override
        public String toString() {
            return builder.toString();
        }
    }

    @Test
    void testPrinterInstantiation() {
        // Minimal test for Printer class
        Node node = new Element("div");
        org.jsoup.internal.QuietAppendable accum = new TestQuietAppendable();
        Document.OutputSettings settings = new Document.OutputSettings();
        Printer printer = new Printer(node, accum, settings);
        assertNotNull(printer);
    }
}
