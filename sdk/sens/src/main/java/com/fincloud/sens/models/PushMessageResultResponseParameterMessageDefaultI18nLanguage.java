/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [language]: ISO 639-1, 소문자.
 */
public class PushMessageResultResponseParameterMessageDefaultI18nLanguage {
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
     * @return the PushMessageResultResponseParameterMessageDefaultI18nLanguage object itself.
     */
    public PushMessageResultResponseParameterMessageDefaultI18nLanguage withContent(String content) {
        this.content = content;
        return this;
    }

}
