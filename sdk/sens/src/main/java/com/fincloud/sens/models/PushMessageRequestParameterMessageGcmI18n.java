/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageRequestParameterMessageGcmI18n model.
 */
public class PushMessageRequestParameterMessageGcmI18n {
    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default", required = true)
    private PushMessageRequestParameterMessageGcmI18nDefault defaultProperty;

    /**
     * [language]: ISO 639-1, 소문자.
     */
    @JsonProperty(value = "[language]")
    private PushMessageRequestParameterMessageGcmI18nLanguage language;

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageRequestParameterMessageGcmI18nDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageRequestParameterMessageGcmI18n object itself.
     */
    public PushMessageRequestParameterMessageGcmI18n withDefaultProperty(PushMessageRequestParameterMessageGcmI18nDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get [language]: ISO 639-1, 소문자.
     *
     * @return the language value
     */
    public PushMessageRequestParameterMessageGcmI18nLanguage language() {
        return this.language;
    }

    /**
     * Set [language]: ISO 639-1, 소문자.
     *
     * @param language the language value to set
     * @return the PushMessageRequestParameterMessageGcmI18n object itself.
     */
    public PushMessageRequestParameterMessageGcmI18n withLanguage(PushMessageRequestParameterMessageGcmI18nLanguage language) {
        this.language = language;
        return this;
    }

}
