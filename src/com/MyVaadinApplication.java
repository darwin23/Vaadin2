package com;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created by alumne1daw on 28/02/14.
 */
public class MyVaadinApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new Label("Hello, world!"));
    }
}
