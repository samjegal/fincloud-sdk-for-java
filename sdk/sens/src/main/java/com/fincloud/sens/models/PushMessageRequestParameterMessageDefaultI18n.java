/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageRequestParameterMessageDefaultI18n model.
 */
public class PushMessageRequestParameterMessageDefaultI18n {
    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default", required = true)
    private PushMessageRequestParameterMessageDefaultI18nDefault defaultProperty;

    /**
     * [language]: ISO 639-1, 소문자.
     */
    @JsonProperty(value = "[language]")
    private PushMessageRequestParameterMessageDefaultI18nLanguage language;

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageRequestParameterMessageDefaultI18nDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageRequestParameterMessageDefaultI18n object itself.
     */
    public PushMessageRequestParameterMessageDefaultI18n withDefaultProperty(PushMessageRequestParameterMessageDefaultI18nDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get [language]: ISO 639-1, 소문자.
     *
     * @return the language value
     */
    public PushMessageRequestParameterMessageDefaultI18nLanguage language() {
        return this.language;
    }

    /**
     * Set [language]: ISO 639-1, 소문자.
     *
     * @param language the language value to set
     * @return the PushMessageRequestParameterMessageDefaultI18n object itself.
     */
    public PushMessageRequestParameterMessageDefaultI18n withLanguage(PushMessageRequestParameterMessageDefaultI18nLanguage language) {
        this.language = language;
        return this;
    }

}
