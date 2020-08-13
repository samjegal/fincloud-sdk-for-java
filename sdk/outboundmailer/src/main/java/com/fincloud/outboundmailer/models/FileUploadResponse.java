/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FileUploadResponse model.
 */
public class FileUploadResponse {
    /**
     * 임시 요청 ID.
     */
    @JsonProperty(value = "tempRequestId", required = true)
    private String tempRequestId;

    /**
     * File 목록.
     */
    @JsonProperty(value = "files", required = true)
    private List<FileUploadResponseFilesItem> files;

    /**
     * Get 임시 요청 ID.
     *
     * @return the tempRequestId value
     */
    public String tempRequestId() {
        return this.tempRequestId;
    }

    /**
     * Set 임시 요청 ID.
     *
     * @param tempRequestId the tempRequestId value to set
     * @return the FileUploadResponse object itself.
     */
    public FileUploadResponse withTempRequestId(String tempRequestId) {
        this.tempRequestId = tempRequestId;
        return this;
    }

    /**
     * Get file 목록.
     *
     * @return the files value
     */
    public List<FileUploadResponseFilesItem> files() {
        return this.files;
    }

    /**
     * Set file 목록.
     *
     * @param files the files value to set
     * @return the FileUploadResponse object itself.
     */
    public FileUploadResponse withFiles(List<FileUploadResponseFilesItem> files) {
        this.files = files;
        return this;
    }

}
