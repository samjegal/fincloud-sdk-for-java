/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageRequestParameterMessage model.
 */
public class PushMessageRequestParameterMessage {
    /**
     * The apns property.
     */
    @JsonProperty(value = "apns")
    private PushMessageRequestParameterMessageApns apns;

    /**
     * The gcm property.
     */
    @JsonProperty(value = "gcm")
    private PushMessageRequestParameterMessageGcm gcm;

    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default", required = true)
    private PushMessageRequestParameterMessageDefault defaultProperty;

    /**
     * Get the apns value.
     *
     * @return the apns value
     */
    public PushMessageRequestParameterMessageApns apns() {
        return this.apns;
    }

    /**
     * Set the apns value.
     *
     * @param apns the apns value to set
     * @return the PushMessageRequestParameterMessage object itself.
     */
    public PushMessageRequestParameterMessage withApns(PushMessageRequestParameterMessageApns apns) {
        this.apns = apns;
        return this;
    }

    /**
     * Get the gcm value.
     *
     * @return the gcm value
     */
    public PushMessageRequestParameterMessageGcm gcm() {
        return this.gcm;
    }

    /**
     * Set the gcm value.
     *
     * @param gcm the gcm value to set
     * @return the PushMessageRequestParameterMessage object itself.
     */
    public PushMessageRequestParameterMessage withGcm(PushMessageRequestParameterMessageGcm gcm) {
        this.gcm = gcm;
        return this;
    }

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageRequestParameterMessageDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageRequestParameterMessage object itself.
     */
    public PushMessageRequestParameterMessage withDefaultProperty(PushMessageRequestParameterMessageDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

}
