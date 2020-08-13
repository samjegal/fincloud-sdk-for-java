/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterMessageDefault model.
 */
public class PushMessageResultResponseParameterMessageDefault {
    /**
     * The content property.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * The custom property.
     */
    @JsonProperty(value = "custom")
    private Object custom;

    /**
     * The option property.
     */
    @JsonProperty(value = "option")
    private Object option;

    /**
     * The i18n property.
     */
    @JsonProperty(value = "i18n")
    private PushMessageResultResponseParameterMessageDefaultI18n i18n;

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
     * @return the PushMessageResultResponseParameterMessageDefault object itself.
     */
    public PushMessageResultResponseParameterMessageDefault withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the custom value.
     *
     * @return the custom value
     */
    public Object custom() {
        return this.custom;
    }

    /**
     * Set the custom value.
     *
     * @param custom the custom value to set
     * @return the PushMessageResultResponseParameterMessageDefault object itself.
     */
    public PushMessageResultResponseParameterMessageDefault withCustom(Object custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Get the option value.
     *
     * @return the option value
     */
    public Object option() {
        return this.option;
    }

    /**
     * Set the option value.
     *
     * @param option the option value to set
     * @return the PushMessageResultResponseParameterMessageDefault object itself.
     */
    public PushMessageResultResponseParameterMessageDefault withOption(Object option) {
        this.option = option;
        return this;
    }

    /**
     * Get the i18n value.
     *
     * @return the i18n value
     */
    public PushMessageResultResponseParameterMessageDefaultI18n i18n() {
        return this.i18n;
    }

    /**
     * Set the i18n value.
     *
     * @param i18n the i18n value to set
     * @return the PushMessageResultResponseParameterMessageDefault object itself.
     */
    public PushMessageResultResponseParameterMessageDefault withI18n(PushMessageResultResponseParameterMessageDefaultI18n i18n) {
        this.i18n = i18n;
        return this;
    }

}
