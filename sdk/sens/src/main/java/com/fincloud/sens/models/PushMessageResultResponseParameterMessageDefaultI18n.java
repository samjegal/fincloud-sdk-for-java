/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterMessageDefaultI18n model.
 */
public class PushMessageResultResponseParameterMessageDefaultI18n {
    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default")
    private PushMessageResultResponseParameterMessageDefaultI18nDefault defaultProperty;

    /**
     * [language]: ISO 639-1, 소문자.
     */
    @JsonProperty(value = "[language]")
    private PushMessageResultResponseParameterMessageDefaultI18nLanguage language;

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageResultResponseParameterMessageDefaultI18nDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageResultResponseParameterMessageDefaultI18n object itself.
     */
    public PushMessageResultResponseParameterMessageDefaultI18n withDefaultProperty(PushMessageResultResponseParameterMessageDefaultI18nDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get [language]: ISO 639-1, 소문자.
     *
     * @return the language value
     */
    public PushMessageResultResponseParameterMessageDefaultI18nLanguage language() {
        return this.language;
    }

    /**
     * Set [language]: ISO 639-1, 소문자.
     *
     * @param language the language value to set
     * @return the PushMessageResultResponseParameterMessageDefaultI18n object itself.
     */
    public PushMessageResultResponseParameterMessageDefaultI18n withLanguage(PushMessageResultResponseParameterMessageDefaultI18nLanguage language) {
        this.language = language;
        return this;
    }

}
