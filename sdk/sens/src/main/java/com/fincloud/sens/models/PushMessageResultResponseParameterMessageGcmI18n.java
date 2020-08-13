/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterMessageGcmI18n model.
 */
public class PushMessageResultResponseParameterMessageGcmI18n {
    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default")
    private PushMessageResultResponseParameterMessageGcmI18nDefault defaultProperty;

    /**
     * [language]: ISO 639-1, 소문자.
     */
    @JsonProperty(value = "[language]")
    private PushMessageResultResponseParameterMessageGcmI18nLanguage language;

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageResultResponseParameterMessageGcmI18nDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageResultResponseParameterMessageGcmI18n object itself.
     */
    public PushMessageResultResponseParameterMessageGcmI18n withDefaultProperty(PushMessageResultResponseParameterMessageGcmI18nDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get [language]: ISO 639-1, 소문자.
     *
     * @return the language value
     */
    public PushMessageResultResponseParameterMessageGcmI18nLanguage language() {
        return this.language;
    }

    /**
     * Set [language]: ISO 639-1, 소문자.
     *
     * @param language the language value to set
     * @return the PushMessageResultResponseParameterMessageGcmI18n object itself.
     */
    public PushMessageResultResponseParameterMessageGcmI18n withLanguage(PushMessageResultResponseParameterMessageGcmI18nLanguage language) {
        this.language = language;
        return this;
    }

}
