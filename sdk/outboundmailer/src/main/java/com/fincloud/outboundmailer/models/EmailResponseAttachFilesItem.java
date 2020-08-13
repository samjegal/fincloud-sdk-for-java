/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailResponseAttachFilesItem model.
 */
public class EmailResponseAttachFilesItem {
    /**
     * File ID.
     */
    @JsonProperty(value = "fileId")
    private String fileId;

    /**
     * File name.
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /**
     * File 크기.
     */
    @JsonProperty(value = "fileSize")
    private Integer fileSize;

    /**
     * Get file ID.
     *
     * @return the fileId value
     */
    public String fileId() {
        return this.fileId;
    }

    /**
     * Set file ID.
     *
     * @param fileId the fileId value to set
     * @return the EmailResponseAttachFilesItem object itself.
     */
    public EmailResponseAttachFilesItem withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get file name.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set file name.
     *
     * @param fileName the fileName value to set
     * @return the EmailResponseAttachFilesItem object itself.
     */
    public EmailResponseAttachFilesItem withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get file 크기.
     *
     * @return the fileSize value
     */
    public Integer fileSize() {
        return this.fileSize;
    }

    /**
     * Set file 크기.
     *
     * @param fileSize the fileSize value to set
     * @return the EmailResponseAttachFilesItem object itself.
     */
    public EmailResponseAttachFilesItem withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

}
