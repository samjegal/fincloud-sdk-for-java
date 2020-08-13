/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterMessage model.
 */
public class PushMessageResultResponseParameterMessage {
    /**
     * The apns property.
     */
    @JsonProperty(value = "apns")
    private PushMessageResultResponseParameterMessageApns apns;

    /**
     * The gcm property.
     */
    @JsonProperty(value = "gcm")
    private PushMessageResultResponseParameterMessageGcm gcm;

    /**
     * The defaultProperty property.
     */
    @JsonProperty(value = "default")
    private PushMessageResultResponseParameterMessageDefault defaultProperty;

    /**
     * Get the apns value.
     *
     * @return the apns value
     */
    public PushMessageResultResponseParameterMessageApns apns() {
        return this.apns;
    }

    /**
     * Set the apns value.
     *
     * @param apns the apns value to set
     * @return the PushMessageResultResponseParameterMessage object itself.
     */
    public PushMessageResultResponseParameterMessage withApns(PushMessageResultResponseParameterMessageApns apns) {
        this.apns = apns;
        return this;
    }

    /**
     * Get the gcm value.
     *
     * @return the gcm value
     */
    public PushMessageResultResponseParameterMessageGcm gcm() {
        return this.gcm;
    }

    /**
     * Set the gcm value.
     *
     * @param gcm the gcm value to set
     * @return the PushMessageResultResponseParameterMessage object itself.
     */
    public PushMessageResultResponseParameterMessage withGcm(PushMessageResultResponseParameterMessageGcm gcm) {
        this.gcm = gcm;
        return this;
    }

    /**
     * Get the defaultProperty value.
     *
     * @return the defaultProperty value
     */
    public PushMessageResultResponseParameterMessageDefault defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty value.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the PushMessageResultResponseParameterMessage object itself.
     */
    public PushMessageResultResponseParameterMessage withDefaultProperty(PushMessageResultResponseParameterMessageDefault defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

}
