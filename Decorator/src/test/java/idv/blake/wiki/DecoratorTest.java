package idv.blake.wiki;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void Decorator_test() {
        // original SimpleWindow
        SimpleWindow simpleWindow = new SimpleWindow();
        assertEquals("description:Simple Window", printInfo(simpleWindow));

        // HorizontalScrollBar  mixed Window
        HorizontalScrollBar horizontalScrollBar = new HorizontalScrollBar(simpleWindow);
        assertEquals("description:Simple Window, including horizontal scrollbars",printInfo(horizontalScrollBar));

        // VerticalScrollBar mixed Window
        VerticalScrollBar verticalScrollBar = new VerticalScrollBar(horizontalScrollBar);
        assertEquals("description:Simple Window, including horizontal scrollbars, including vertical scrollbars",printInfo(verticalScrollBar));
    }

    private String printInfo(Window window) {
        return "description:"+window.getDescription();
    }
}
