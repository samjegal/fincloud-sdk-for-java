/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BlockStorageInstanceDetailResponse model.
 */
public class BlockStorageInstanceDetailResponse {
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
     * 블럭 스토리지 인스턴스 리스트.
     */
    @JsonProperty(value = "blockStorageInstanceList")
    private List<BlockStorageInstanceList> blockStorageInstanceList;

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
     * @return the BlockStorageInstanceDetailResponse object itself.
     */
    public BlockStorageInstanceDetailResponse withReturnCode(String returnCode) {
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
     * @return the BlockStorageInstanceDetailResponse object itself.
     */
    public BlockStorageInstanceDetailResponse withReturnMessage(String returnMessage) {
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
     * @return the BlockStorageInstanceDetailResponse object itself.
     */
    public BlockStorageInstanceDetailResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 블럭 스토리지 인스턴스 리스트.
     *
     * @return the blockStorageInstanceList value
     */
    public List<BlockStorageInstanceList> blockStorageInstanceList() {
        return this.blockStorageInstanceList;
    }

    /**
     * Set 블럭 스토리지 인스턴스 리스트.
     *
     * @param blockStorageInstanceList the blockStorageInstanceList value to set
     * @return the BlockStorageInstanceDetailResponse object itself.
     */
    public BlockStorageInstanceDetailResponse withBlockStorageInstanceList(List<BlockStorageInstanceList> blockStorageInstanceList) {
        this.blockStorageInstanceList = blockStorageInstanceList;
        return this;
    }

}
