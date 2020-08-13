/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushUserRequestParameter model.
 */
public class PushUserRequestParameter {
    /**
     * The userId property.
     */
    @JsonProperty(value = "userId", required = true)
    private String userId;

    /**
     * (APNS|GCM).
     */
    @JsonProperty(value = "deviceType", required = true)
    private String deviceType;

    /**
     * The deviceToken property.
     */
    @JsonProperty(value = "deviceToken", required = true)
    private String deviceToken;

    /**
     * The channelName property.
     */
    @JsonProperty(value = "channelName")
    private String channelName;

    /**
     * The isNotificationAgreement property.
     */
    @JsonProperty(value = "isNotificationAgreement", required = true)
    private boolean isNotificationAgreement;

    /**
     * The isAdAgreement property.
     */
    @JsonProperty(value = "isAdAgreement", required = true)
    private boolean isAdAgreement;

    /**
     * The isNightAdAgreement property.
     */
    @JsonProperty(value = "isNightAdAgreement", required = true)
    private boolean isNightAdAgreement;

    /**
     * 국가코드 (ISO 3166-1 alpha-2, 대문자) *default: KR.
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * 언어 (ISO 639-1, 소문자) *default: ko.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Number of seconds away from UTC. Example: -28800 *default: 32400.
     */
    @JsonProperty(value = "timezone")
    private Integer timezone;

    /**
     * Get the userId value.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId value.
     *
     * @param userId the userId value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get (APNS|GCM).
     *
     * @return the deviceType value
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set (APNS|GCM).
     *
     * @param deviceType the deviceType value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the deviceToken value.
     *
     * @return the deviceToken value
     */
    public String deviceToken() {
        return this.deviceToken;
    }

    /**
     * Set the deviceToken value.
     *
     * @param deviceToken the deviceToken value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }

    /**
     * Get the channelName value.
     *
     * @return the channelName value
     */
    public String channelName() {
        return this.channelName;
    }

    /**
     * Set the channelName value.
     *
     * @param channelName the channelName value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * Get the isNotificationAgreement value.
     *
     * @return the isNotificationAgreement value
     */
    public boolean isNotificationAgreement() {
        return this.isNotificationAgreement;
    }

    /**
     * Set the isNotificationAgreement value.
     *
     * @param isNotificationAgreement the isNotificationAgreement value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withIsNotificationAgreement(boolean isNotificationAgreement) {
        this.isNotificationAgreement = isNotificationAgreement;
        return this;
    }

    /**
     * Get the isAdAgreement value.
     *
     * @return the isAdAgreement value
     */
    public boolean isAdAgreement() {
        return this.isAdAgreement;
    }

    /**
     * Set the isAdAgreement value.
     *
     * @param isAdAgreement the isAdAgreement value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withIsAdAgreement(boolean isAdAgreement) {
        this.isAdAgreement = isAdAgreement;
        return this;
    }

    /**
     * Get the isNightAdAgreement value.
     *
     * @return the isNightAdAgreement value
     */
    public boolean isNightAdAgreement() {
        return this.isNightAdAgreement;
    }

    /**
     * Set the isNightAdAgreement value.
     *
     * @param isNightAdAgreement the isNightAdAgreement value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withIsNightAdAgreement(boolean isNightAdAgreement) {
        this.isNightAdAgreement = isNightAdAgreement;
        return this;
    }

    /**
     * Get 국가코드 (ISO 3166-1 alpha-2, 대문자) *default: KR.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set 국가코드 (ISO 3166-1 alpha-2, 대문자) *default: KR.
     *
     * @param country the country value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get 언어 (ISO 639-1, 소문자) *default: ko.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set 언어 (ISO 639-1, 소문자) *default: ko.
     *
     * @param language the language value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get number of seconds away from UTC. Example: -28800 *default: 32400.
     *
     * @return the timezone value
     */
    public Integer timezone() {
        return this.timezone;
    }

    /**
     * Set number of seconds away from UTC. Example: -28800 *default: 32400.
     *
     * @param timezone the timezone value to set
     * @return the PushUserRequestParameter object itself.
     */
    public PushUserRequestParameter withTimezone(Integer timezone) {
        this.timezone = timezone;
        return this;
    }

}
