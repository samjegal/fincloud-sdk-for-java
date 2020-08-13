/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Permissions model.
 */
public class Permissions {
    /**
     * The read property.
     */
    @JsonProperty(value = "read")
    private Boolean read;

    /**
     * The write property.
     */
    @JsonProperty(value = "write")
    private Boolean write;

    /**
     * The admin property.
     */
    @JsonProperty(value = "admin")
    private Boolean admin;

    /**
     * Get the read value.
     *
     * @return the read value
     */
    public Boolean read() {
        return this.read;
    }

    /**
     * Set the read value.
     *
     * @param read the read value to set
     * @return the Permissions object itself.
     */
    public Permissions withRead(Boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get the write value.
     *
     * @return the write value
     */
    public Boolean write() {
        return this.write;
    }

    /**
     * Set the write value.
     *
     * @param write the write value to set
     * @return the Permissions object itself.
     */
    public Permissions withWrite(Boolean write) {
        this.write = write;
        return this;
    }

    /**
     * Get the admin value.
     *
     * @return the admin value
     */
    public Boolean admin() {
        return this.admin;
    }

    /**
     * Set the admin value.
     *
     * @param admin the admin value to set
     * @return the Permissions object itself.
     */
    public Permissions withAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

}
