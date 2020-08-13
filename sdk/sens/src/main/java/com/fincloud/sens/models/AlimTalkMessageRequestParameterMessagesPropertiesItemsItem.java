/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkMessageRequestParameterMessagesPropertiesItemsItem model.
 */
public class AlimTalkMessageRequestParameterMessagesPropertiesItemsItem {
    /**
     * The type property.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The linkMobile property.
     */
    @JsonProperty(value = "linkMobile")
    private String linkMobile;

    /**
     * The linkPc property.
     */
    @JsonProperty(value = "linkPc")
    private String linkPc;

    /**
     * The schemeIos property.
     */
    @JsonProperty(value = "schemeIos")
    private String schemeIos;

    /**
     * The schemeAndroid property.
     */
    @JsonProperty(value = "schemeAndroid")
    private String schemeAndroid;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the AlimTalkMessageRequestParameterMessagesPropertiesItemsItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesPropertiesItemsItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the AlimTalkMessageRequestParameterMessagesPropertiesItemsItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesPropertiesItemsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the linkMobile value.
     *
     * @return the linkMobile value
     */
    public String linkMobile() {
        return this.linkMobile;
    }

    /**
     * Set the linkMobile value.
     *
     * @param linkMobile the linkMobile value to set
     * @return the AlimTalkMessageRequestParameterMessagesPropertiesItemsItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesPropertiesItemsItem withLinkMobile(String linkMobile) {
        this.linkMobile = linkMobile;
        return this;
    }

    /**
     * Get the linkPc value.
     *
     * @return the linkPc value
     */
    public String linkPc() {
        return this.linkPc;
    }

    /**
     * Set the linkPc value.
     *
     * @param linkPc the linkPc value to set
     * @return the AlimTalkMessageRequestParameterMessagesPropertiesItemsItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesPropertiesItemsItem withLinkPc(String linkPc) {
        this.linkPc = linkPc;
        return this;
    }

    /**
     * Get the schemeIos value.
     *
     * @return the schemeIos value
     */
    public String schemeIos() {
        return this.schemeIos;
    }

    /**
     * Set the schemeIos value.
     *
     * @param schemeIos the schemeIos value to set
     * @return the AlimTalkMessageRequestParameterMessagesPropertiesItemsItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesPropertiesItemsItem withSchemeIos(String schemeIos) {
        this.schemeIos = schemeIos;
        return this;
    }

    /**
     * Get the schemeAndroid value.
     *
     * @return the schemeAndroid value
     */
    public String schemeAndroid() {
        return this.schemeAndroid;
    }

    /**
     * Set the schemeAndroid value.
     *
     * @param schemeAndroid the schemeAndroid value to set
     * @return the AlimTalkMessageRequestParameterMessagesPropertiesItemsItem object itself.
     */
    public AlimTalkMessageRequestParameterMessagesPropertiesItemsItem withSchemeAndroid(String schemeAndroid) {
        this.schemeAndroid = schemeAndroid;
        return this;
    }

}
