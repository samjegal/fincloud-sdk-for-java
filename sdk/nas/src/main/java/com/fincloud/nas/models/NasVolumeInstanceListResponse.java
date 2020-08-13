/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NasVolumeInstanceListResponse model.
 */
public class NasVolumeInstanceListResponse {
    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "returnCode")
    private String returnCode;

    /**
     * 리턴 메시지.
     */
    @JsonProperty(value = "returnMessage")
    private String returnMessage;

    /**
     * 총 행 개수.
     */
    @JsonProperty(value = "totalRows")
    private Integer totalRows;

    /**
     * The nasVolumeInstanceList property.
     */
    @JsonProperty(value = "nasVolumeInstanceList")
    private List<NasVolumeInstanceList> nasVolumeInstanceList;

    /**
     * Get 리턴 코드.
     *
     * @return the returnCode value
     */
    public String returnCode() {
        return this.returnCode;
    }

    /**
     * Set 리턴 코드.
     *
     * @param returnCode the returnCode value to set
     * @return the NasVolumeInstanceListResponse object itself.
     */
    public NasVolumeInstanceListResponse withReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get 리턴 메시지.
     *
     * @return the returnMessage value
     */
    public String returnMessage() {
        return this.returnMessage;
    }

    /**
     * Set 리턴 메시지.
     *
     * @param returnMessage the returnMessage value to set
     * @return the NasVolumeInstanceListResponse object itself.
     */
    public NasVolumeInstanceListResponse withReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }

    /**
     * Get 총 행 개수.
     *
     * @return the totalRows value
     */
    public Integer totalRows() {
        return this.totalRows;
    }

    /**
     * Set 총 행 개수.
     *
     * @param totalRows the totalRows value to set
     * @return the NasVolumeInstanceListResponse object itself.
     */
    public NasVolumeInstanceListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get the nasVolumeInstanceList value.
     *
     * @return the nasVolumeInstanceList value
     */
    public List<NasVolumeInstanceList> nasVolumeInstanceList() {
        return this.nasVolumeInstanceList;
    }

    /**
     * Set the nasVolumeInstanceList value.
     *
     * @param nasVolumeInstanceList the nasVolumeInstanceList value to set
     * @return the NasVolumeInstanceListResponse object itself.
     */
    public NasVolumeInstanceListResponse withNasVolumeInstanceList(List<NasVolumeInstanceList> nasVolumeInstanceList) {
        this.nasVolumeInstanceList = nasVolumeInstanceList;
        return this;
    }

}
