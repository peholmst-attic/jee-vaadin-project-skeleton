package com.vaadin.jee.skeleton.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.cdi.CDIUI;
import com.vaadin.jee.skeleton.boundary.SampleBoundary;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@CDIUI("")
@Push
@Theme(SkeletonTheme.THEME_NAME)
@Widgetset("com.vaadin.jee.skeleton.SkeletonWidgetset")
public class SkeletonUI extends UI {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkeletonUI.class);

    @Inject
    SampleBoundary boundary;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Button("This is a skeleton UI", this::invokeBoundary));
        LOGGER.info("UI {} initialized", this);
    }

    private void invokeBoundary(Button.ClickEvent event) {
        Notification.show(boundary.createAndReturn("Foobar!").toString());
    }
}
