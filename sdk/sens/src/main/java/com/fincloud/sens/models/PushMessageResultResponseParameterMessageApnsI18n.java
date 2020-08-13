/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterMessageApnsI18n model.
 */
public class PushMessageResultResponseParameterMessageApnsI18n {
    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default")
    private PushMessageResultResponseParameterMessageApnsI18nDefault defaultProperty;

    /**
     * [language]: ISO 639-1, 소문자.
     */
    @JsonProperty(value = "[language]")
    private PushMessageResultResponseParameterMessageApnsI18nLanguage language;

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageResultResponseParameterMessageApnsI18nDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageResultResponseParameterMessageApnsI18n object itself.
     */
    public PushMessageResultResponseParameterMessageApnsI18n withDefaultProperty(PushMessageResultResponseParameterMessageApnsI18nDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get [language]: ISO 639-1, 소문자.
     *
     * @return the language value
     */
    public PushMessageResultResponseParameterMessageApnsI18nLanguage language() {
        return this.language;
    }

    /**
     * Set [language]: ISO 639-1, 소문자.
     *
     * @param language the language value to set
     * @return the PushMessageResultResponseParameterMessageApnsI18n object itself.
     */
    public PushMessageResultResponseParameterMessageApnsI18n withLanguage(PushMessageResultResponseParameterMessageApnsI18nLanguage language) {
        this.language = language;
        return this;
    }

}
