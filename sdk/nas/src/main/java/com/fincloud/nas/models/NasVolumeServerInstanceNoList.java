/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NasVolumeServerInstanceNoList model.
 */
public class NasVolumeServerInstanceNoList {
    /**
     * The serverInstanceNo property.
     */
    @JsonProperty(value = "serverInstanceNo")
    private String serverInstanceNo;

    /**
     * Get the serverInstanceNo value.
     *
     * @return the serverInstanceNo value
     */
    public String serverInstanceNo() {
        return this.serverInstanceNo;
    }

    /**
     * Set the serverInstanceNo value.
     *
     * @param serverInstanceNo the serverInstanceNo value to set
     * @return the NasVolumeServerInstanceNoList object itself.
     */
    public NasVolumeServerInstanceNoList withServerInstanceNo(String serverInstanceNo) {
        this.serverInstanceNo = serverInstanceNo;
        return this;
    }

}
