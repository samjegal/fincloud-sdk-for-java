/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkMessageRequestParameterMessagesItem model.
 */
public class AlimTalkMessageRequestParameterMessagesItem {
    /**
     * The countryCode property.
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /**
     * The to property.
     */
    @JsonProperty(value = "to", required = true)
    private String to;

    /**
     * The content property.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /**
     * The buttons property.
     */
    @JsonProperty(value = "buttons")
    private List<AlimTalkMessageRequestParameterMessagesPropertiesItemsItem> buttons;

    /**
     * Get the countryCode value.
     *
     * @return the countryCode value
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode value.
     *
     * @param countryCode the countryCode value to set
     * @return the AlimTalkMessageRequestParameterMessagesItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesItem withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the to value.
     *
     * @return the to value
     */
    public String to() {
        return this.to;
    }

    /**
     * Set the to value.
     *
     * @param to the to value to set
     * @return the AlimTalkMessageRequestParameterMessagesItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesItem withTo(String to) {
        this.to = to;
        return this;
    }

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
     * @return the AlimTalkMessageRequestParameterMessagesItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesItem withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the buttons value.
     *
     * @return the buttons value
     */
    public List<AlimTalkMessageRequestParameterMessagesPropertiesItemsItem> buttons() {
        return this.buttons;
    }

    /**
     * Set the buttons value.
     *
     * @param buttons the buttons value to set
     * @return the AlimTalkMessageRequestParameterMessagesItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesItem withButtons(List<AlimTalkMessageRequestParameterMessagesPropertiesItemsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

}
