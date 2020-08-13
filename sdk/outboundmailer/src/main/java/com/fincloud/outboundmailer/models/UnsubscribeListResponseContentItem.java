/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UnsubscribeListResponseContentItem model.
 */
public class UnsubscribeListResponseContentItem {
    /**
     * Email 주소.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * 수신거부 등록일.
     */
    @JsonProperty(value = "blockDate")
    private UnsubscribeListResponseContentItemBlockDate blockDate;

    /**
     * 관리자 등록 여부 (true: 관리자가 등록, false: 메일 수신자가 링크를 통해 수신거부 등록).
     */
    @JsonProperty(value = "isRegByManager")
    private Boolean isRegByManager;

    /**
     * Get email 주소.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set email 주소.
     *
     * @param address the address value to set
     * @return the UnsubscribeListResponseContentItem object itself.
     */
    public UnsubscribeListResponseContentItem withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get 수신거부 등록일.
     *
     * @return the blockDate value
     */
    public UnsubscribeListResponseContentItemBlockDate blockDate() {
        return this.blockDate;
    }

    /**
     * Set 수신거부 등록일.
     *
     * @param blockDate the blockDate value to set
     * @return the UnsubscribeListResponseContentItem object itself.
     */
    public UnsubscribeListResponseContentItem withBlockDate(UnsubscribeListResponseContentItemBlockDate blockDate) {
        this.blockDate = blockDate;
        return this;
    }

    /**
     * Get 관리자 등록 여부 (true: 관리자가 등록, false: 메일 수신자가 링크를 통해 수신거부 등록).
     *
     * @return the isRegByManager value
     */
    public Boolean isRegByManager() {
        return this.isRegByManager;
    }

    /**
     * Set 관리자 등록 여부 (true: 관리자가 등록, false: 메일 수신자가 링크를 통해 수신거부 등록).
     *
     * @param isRegByManager the isRegByManager value to set
     * @return the UnsubscribeListResponseContentItem object itself.
     */
    public UnsubscribeListResponseContentItem withIsRegByManager(Boolean isRegByManager) {
        this.isRegByManager = isRegByManager;
        return this;
    }

}
