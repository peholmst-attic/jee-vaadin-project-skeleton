package com.vaadin.jee.skeleton.ui;

import com.vaadin.jee.skeleton.ui.i18n.VaadinUILocaleResolver;
import org.apache.deltaspike.core.api.message.MessageBundle;
import org.apache.deltaspike.core.api.message.MessageContextConfig;
import org.apache.deltaspike.core.api.message.MessageTemplate;

@MessageBundle
@MessageContextConfig(localeResolver = VaadinUILocaleResolver.class)
public interface SkeletonUIMessages {

    @MessageTemplate("{ui_content_button_label}")
    String uiContentButtonLabel();
}
