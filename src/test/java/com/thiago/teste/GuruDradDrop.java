package com.thiago.teste;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruDragDrop;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedMethodListener.class)
public class GuruDradDrop {

    public final String BASE_URL = "http://demo.guru99.com/test/drag_drop.html";

    @Test
    public void dragDrop() throws Exception {
        new PageGuruDragDrop()
                .openPage(PageGuruDragDrop.class, BASE_URL)
                .DragDop();
    }
}
