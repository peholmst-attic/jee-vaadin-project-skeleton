package com.vaadin.jee.skeleton.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ui.Transport;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CDIUI("")
@Push(transport = Transport.LONG_POLLING)
@Theme(SkeletonTheme.THEME_NAME)
@Widgetset("com.vaadin.jee.skeleton.SkeletonWidgetset")
public class SkeletonUI extends UI {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkeletonUI.class);

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("This is a skeleton UI"));
        LOGGER.debug("UI {} initialized", this);
    }
}
