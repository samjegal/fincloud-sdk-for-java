/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterMessageApnsI18nDefault model.
 */
public class PushMessageResultResponseParameterMessageApnsI18nDefault {
    /**
     * The content property.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the PushMessageResultResponseParameterMessageApnsI18nDefault object itself.
     */
    public PushMessageResultResponseParameterMessageApnsI18nDefault withContent(String content) {
        this.content = content;
        return this;
    }

}
