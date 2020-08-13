/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailResponseRecipientsItem model.
 */
public class EmailResponseRecipientsItem {
    /**
     * 수신자 Email 주소.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * 수신자 명.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
     */
    @JsonProperty(value = "type")
    private EmailResponseRecipientsItemType type;

    /**
     * 수신 여부.
     */
    @JsonProperty(value = "received")
    private Boolean received;

    /**
     * 수신 일시.
     */
    @JsonProperty(value = "receivedDate")
    private NesDateTime receivedDate;

    /**
     * Email 발송상태.
     */
    @JsonProperty(value = "status")
    private EmailResponseRecipientsItemStatus status;

    /**
     * 재발송 시도 횟수.
     */
    @JsonProperty(value = "retryCount")
    private Integer retryCount;

    /**
     * 발송 결과 상세 메시지.
     */
    @JsonProperty(value = "sendResultMessage")
    private String sendResultMessage;

    /**
     * Get 수신자 Email 주소.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set 수신자 Email 주소.
     *
     * @param address the address value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get 수신자 명.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 수신자 명.
     *
     * @param name the name value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
     *
     * @return the type value
     */
    public EmailResponseRecipientsItemType type() {
        return this.type;
    }

    /**
     * Set 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
     *
     * @param type the type value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withType(EmailResponseRecipientsItemType type) {
        this.type = type;
        return this;
    }

    /**
     * Get 수신 여부.
     *
     * @return the received value
     */
    public Boolean received() {
        return this.received;
    }

    /**
     * Set 수신 여부.
     *
     * @param received the received value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withReceived(Boolean received) {
        this.received = received;
        return this;
    }

    /**
     * Get 수신 일시.
     *
     * @return the receivedDate value
     */
    public NesDateTime receivedDate() {
        return this.receivedDate;
    }

    /**
     * Set 수신 일시.
     *
     * @param receivedDate the receivedDate value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withReceivedDate(NesDateTime receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    /**
     * Get email 발송상태.
     *
     * @return the status value
     */
    public EmailResponseRecipientsItemStatus status() {
        return this.status;
    }

    /**
     * Set email 발송상태.
     *
     * @param status the status value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withStatus(EmailResponseRecipientsItemStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get 재발송 시도 횟수.
     *
     * @return the retryCount value
     */
    public Integer retryCount() {
        return this.retryCount;
    }

    /**
     * Set 재발송 시도 횟수.
     *
     * @param retryCount the retryCount value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get 발송 결과 상세 메시지.
     *
     * @return the sendResultMessage value
     */
    public String sendResultMessage() {
        return this.sendResultMessage;
    }

    /**
     * Set 발송 결과 상세 메시지.
     *
     * @param sendResultMessage the sendResultMessage value to set
     * @return the EmailResponseRecipientsItem object itself.
     */
    public EmailResponseRecipientsItem withSendResultMessage(String sendResultMessage) {
        this.sendResultMessage = sendResultMessage;
        return this;
    }

}
