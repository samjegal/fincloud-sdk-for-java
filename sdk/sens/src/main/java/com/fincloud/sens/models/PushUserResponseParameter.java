/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushUserResponseParameter model.
 */
public class PushUserResponseParameter {
    /**
     * The userId property.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /**
     * The channelName property.
     */
    @JsonProperty(value = "channelName")
    private String channelName;

    /**
     * The isNotificationAgreement property.
     */
    @JsonProperty(value = "isNotificationAgreement")
    private Boolean isNotificationAgreement;

    /**
     * The isAdAgreement property.
     */
    @JsonProperty(value = "isAdAgreement")
    private Boolean isAdAgreement;

    /**
     * The notificationAgreementTime property.
     */
    @JsonProperty(value = "notificationAgreementTime")
    private DateTime notificationAgreementTime;

    /**
     * The adAgreementTime property.
     */
    @JsonProperty(value = "adAgreementTime")
    private DateTime adAgreementTime;

    /**
     * The nightAdAgreementTime property.
     */
    @JsonProperty(value = "nightAdAgreementTime")
    private DateTime nightAdAgreementTime;

    /**
     * 국가코드 (ISO 3166-1 alpha-2, 대문자).
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * 언어 (ISO 639-1, 소문자).
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Number of seconds away from UTC.
     */
    @JsonProperty(value = "timezone")
    private Integer timezone;

    /**
     * The devices property.
     */
    @JsonProperty(value = "devices")
    private List<PushUserResponseParameterDevicesItem> devices;

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
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withUserId(String userId) {
        this.userId = userId;
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
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * Get the isNotificationAgreement value.
     *
     * @return the isNotificationAgreement value
     */
    public Boolean isNotificationAgreement() {
        return this.isNotificationAgreement;
    }

    /**
     * Set the isNotificationAgreement value.
     *
     * @param isNotificationAgreement the isNotificationAgreement value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withIsNotificationAgreement(Boolean isNotificationAgreement) {
        this.isNotificationAgreement = isNotificationAgreement;
        return this;
    }

    /**
     * Get the isAdAgreement value.
     *
     * @return the isAdAgreement value
     */
    public Boolean isAdAgreement() {
        return this.isAdAgreement;
    }

    /**
     * Set the isAdAgreement value.
     *
     * @param isAdAgreement the isAdAgreement value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withIsAdAgreement(Boolean isAdAgreement) {
        this.isAdAgreement = isAdAgreement;
        return this;
    }

    /**
     * Get the notificationAgreementTime value.
     *
     * @return the notificationAgreementTime value
     */
    public DateTime notificationAgreementTime() {
        return this.notificationAgreementTime;
    }

    /**
     * Set the notificationAgreementTime value.
     *
     * @param notificationAgreementTime the notificationAgreementTime value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withNotificationAgreementTime(DateTime notificationAgreementTime) {
        this.notificationAgreementTime = notificationAgreementTime;
        return this;
    }

    /**
     * Get the adAgreementTime value.
     *
     * @return the adAgreementTime value
     */
    public DateTime adAgreementTime() {
        return this.adAgreementTime;
    }

    /**
     * Set the adAgreementTime value.
     *
     * @param adAgreementTime the adAgreementTime value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withAdAgreementTime(DateTime adAgreementTime) {
        this.adAgreementTime = adAgreementTime;
        return this;
    }

    /**
     * Get the nightAdAgreementTime value.
     *
     * @return the nightAdAgreementTime value
     */
    public DateTime nightAdAgreementTime() {
        return this.nightAdAgreementTime;
    }

    /**
     * Set the nightAdAgreementTime value.
     *
     * @param nightAdAgreementTime the nightAdAgreementTime value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withNightAdAgreementTime(DateTime nightAdAgreementTime) {
        this.nightAdAgreementTime = nightAdAgreementTime;
        return this;
    }

    /**
     * Get 국가코드 (ISO 3166-1 alpha-2, 대문자).
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set 국가코드 (ISO 3166-1 alpha-2, 대문자).
     *
     * @param country the country value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get 언어 (ISO 639-1, 소문자).
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set 언어 (ISO 639-1, 소문자).
     *
     * @param language the language value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get number of seconds away from UTC.
     *
     * @return the timezone value
     */
    public Integer timezone() {
        return this.timezone;
    }

    /**
     * Set number of seconds away from UTC.
     *
     * @param timezone the timezone value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withTimezone(Integer timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Get the devices value.
     *
     * @return the devices value
     */
    public List<PushUserResponseParameterDevicesItem> devices() {
        return this.devices;
    }

    /**
     * Set the devices value.
     *
     * @param devices the devices value to set
     * @return the PushUserResponseParameter object itself.
     */
    public PushUserResponseParameter withDevices(List<PushUserResponseParameterDevicesItem> devices) {
        this.devices = devices;
        return this;
    }

}
