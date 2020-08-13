/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageRequestParameterMessageApnsI18n model.
 */
public class PushMessageRequestParameterMessageApnsI18n {
    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default", required = true)
    private PushMessageRequestParameterMessageApnsI18nDefault defaultProperty;

    /**
     * [language]: ISO 639-1, 소문자.
     */
    @JsonProperty(value = "[language]")
    private PushMessageRequestParameterMessageApnsI18nLanguage language;

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageRequestParameterMessageApnsI18nDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageRequestParameterMessageApnsI18n object itself.
     */
    public PushMessageRequestParameterMessageApnsI18n withDefaultProperty(PushMessageRequestParameterMessageApnsI18nDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get [language]: ISO 639-1, 소문자.
     *
     * @return the language value
     */
    public PushMessageRequestParameterMessageApnsI18nLanguage language() {
        return this.language;
    }

    /**
     * Set [language]: ISO 639-1, 소문자.
     *
     * @param language the language value to set
     * @return the PushMessageRequestParameterMessageApnsI18n object itself.
     */
    public PushMessageRequestParameterMessageApnsI18n withLanguage(PushMessageRequestParameterMessageApnsI18nLanguage language) {
        this.language = language;
        return this;
    }

}
