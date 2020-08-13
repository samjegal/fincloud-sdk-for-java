/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailResponse model.
 */
public class EmailResponse {
    /**
     * Email 발송 요청 ID (각 요청을 구분하는 ID, 한번에 여러건에 메일 발송을 요청할 경우 requestId가 여러개의
     * mailId를 포함할 수 있다.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * Email 발송 요청자 IP.
     */
    @JsonProperty(value = "requesterIp")
    private String requesterIp;

    /**
     * 요청일시.
     */
    @JsonProperty(value = "requestDate")
    private NesDateTime requestDate;

    /**
     * Email ID (각 메일 한 건을 구분하는 ID).
     */
    @JsonProperty(value = "mailId")
    private String mailId;

    /**
     * 메일 제목.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * 메일 내용.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * 템플릿 ID.
     */
    @JsonProperty(value = "templateSid")
    private Integer templateSid;

    /**
     * 템플릿 제목.
     */
    @JsonProperty(value = "templateName")
    private String templateName;

    /**
     * Email 발송상태.
     */
    @JsonProperty(value = "emailStatus")
    private EmailResponseEmailStatus emailStatus;

    /**
     * 발송자 Email 주소.
     */
    @JsonProperty(value = "senderAddress")
    private String senderAddress;

    /**
     * 발송자 이름.
     */
    @JsonProperty(value = "senderName")
    private String senderName;

    /**
     * 발송 일시.
     */
    @JsonProperty(value = "sendDate")
    private NesDateTime sendDate;

    /**
     * 예약 발송 일시.
     */
    @JsonProperty(value = "reservationDate")
    private NesDateTime reservationDate;

    /**
     * 광고메일 여부.
     */
    @JsonProperty(value = "advertising")
    private Boolean advertising;

    /**
     * References 헤더 (다음의 형태가 되어야 함 &lt;unique_id@domain.com&gt;), 네이버 메일에서는
     * References 헤더에 따라 메일을 모아 볼 수 있음. 특정 메일을 모아서 보기 위해서는 Unique 한 값이 입력 되어야만
     * 함. 값이 중복되는 경우 같은 메일 쓰레드로 판단하여 메일을 묶어서 노출 됨.하나의 값만 입력해도 가능(References 헤더의
     * 최상단 값만으로만 판단).
     */
    @JsonProperty(value = "referencesHeader")
    private String referencesHeader;

    /**
     * 첨부파일.
     */
    @JsonProperty(value = "attachFiles")
    private List<EmailResponseAttachFilesItem> attachFiles;

    /**
     * 수신자 목록.
     */
    @JsonProperty(value = "recipients")
    private List<EmailResponseRecipientsItem> recipients;

    /**
     * Get email 발송 요청 ID (각 요청을 구분하는 ID, 한번에 여러건에 메일 발송을 요청할 경우 requestId가 여러개의 mailId를 포함할 수 있다.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set email 발송 요청 ID (각 요청을 구분하는 ID, 한번에 여러건에 메일 발송을 요청할 경우 requestId가 여러개의 mailId를 포함할 수 있다.
     *
     * @param requestId the requestId value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get email 발송 요청자 IP.
     *
     * @return the requesterIp value
     */
    public String requesterIp() {
        return this.requesterIp;
    }

    /**
     * Set email 발송 요청자 IP.
     *
     * @param requesterIp the requesterIp value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withRequesterIp(String requesterIp) {
        this.requesterIp = requesterIp;
        return this;
    }

    /**
     * Get 요청일시.
     *
     * @return the requestDate value
     */
    public NesDateTime requestDate() {
        return this.requestDate;
    }

    /**
     * Set 요청일시.
     *
     * @param requestDate the requestDate value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withRequestDate(NesDateTime requestDate) {
        this.requestDate = requestDate;
        return this;
    }

    /**
     * Get email ID (각 메일 한 건을 구분하는 ID).
     *
     * @return the mailId value
     */
    public String mailId() {
        return this.mailId;
    }

    /**
     * Set email ID (각 메일 한 건을 구분하는 ID).
     *
     * @param mailId the mailId value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withMailId(String mailId) {
        this.mailId = mailId;
        return this;
    }

    /**
     * Get 메일 제목.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set 메일 제목.
     *
     * @param title the title value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get 메일 내용.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set 메일 내용.
     *
     * @param body the body value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get 템플릿 ID.
     *
     * @return the templateSid value
     */
    public Integer templateSid() {
        return this.templateSid;
    }

    /**
     * Set 템플릿 ID.
     *
     * @param templateSid the templateSid value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withTemplateSid(Integer templateSid) {
        this.templateSid = templateSid;
        return this;
    }

    /**
     * Get 템플릿 제목.
     *
     * @return the templateName value
     */
    public String templateName() {
        return this.templateName;
    }

    /**
     * Set 템플릿 제목.
     *
     * @param templateName the templateName value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Get email 발송상태.
     *
     * @return the emailStatus value
     */
    public EmailResponseEmailStatus emailStatus() {
        return this.emailStatus;
    }

    /**
     * Set email 발송상태.
     *
     * @param emailStatus the emailStatus value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withEmailStatus(EmailResponseEmailStatus emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }

    /**
     * Get 발송자 Email 주소.
     *
     * @return the senderAddress value
     */
    public String senderAddress() {
        return this.senderAddress;
    }

    /**
     * Set 발송자 Email 주소.
     *
     * @param senderAddress the senderAddress value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }

    /**
     * Get 발송자 이름.
     *
     * @return the senderName value
     */
    public String senderName() {
        return this.senderName;
    }

    /**
     * Set 발송자 이름.
     *
     * @param senderName the senderName value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Get 발송 일시.
     *
     * @return the sendDate value
     */
    public NesDateTime sendDate() {
        return this.sendDate;
    }

    /**
     * Set 발송 일시.
     *
     * @param sendDate the sendDate value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withSendDate(NesDateTime sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    /**
     * Get 예약 발송 일시.
     *
     * @return the reservationDate value
     */
    public NesDateTime reservationDate() {
        return this.reservationDate;
    }

    /**
     * Set 예약 발송 일시.
     *
     * @param reservationDate the reservationDate value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withReservationDate(NesDateTime reservationDate) {
        this.reservationDate = reservationDate;
        return this;
    }

    /**
     * Get 광고메일 여부.
     *
     * @return the advertising value
     */
    public Boolean advertising() {
        return this.advertising;
    }

    /**
     * Set 광고메일 여부.
     *
     * @param advertising the advertising value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withAdvertising(Boolean advertising) {
        this.advertising = advertising;
        return this;
    }

    /**
     * Get references 헤더 (다음의 형태가 되어야 함 &lt;unique_id@domain.com&gt;), 네이버 메일에서는 References 헤더에 따라 메일을 모아 볼 수 있음. 특정 메일을 모아서 보기 위해서는 Unique 한 값이 입력 되어야만 함. 값이 중복되는 경우 같은 메일 쓰레드로 판단하여 메일을 묶어서 노출 됨.하나의 값만 입력해도 가능(References 헤더의 최상단 값만으로만 판단).
     *
     * @return the referencesHeader value
     */
    public String referencesHeader() {
        return this.referencesHeader;
    }

    /**
     * Set references 헤더 (다음의 형태가 되어야 함 &lt;unique_id@domain.com&gt;), 네이버 메일에서는 References 헤더에 따라 메일을 모아 볼 수 있음. 특정 메일을 모아서 보기 위해서는 Unique 한 값이 입력 되어야만 함. 값이 중복되는 경우 같은 메일 쓰레드로 판단하여 메일을 묶어서 노출 됨.하나의 값만 입력해도 가능(References 헤더의 최상단 값만으로만 판단).
     *
     * @param referencesHeader the referencesHeader value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withReferencesHeader(String referencesHeader) {
        this.referencesHeader = referencesHeader;
        return this;
    }

    /**
     * Get 첨부파일.
     *
     * @return the attachFiles value
     */
    public List<EmailResponseAttachFilesItem> attachFiles() {
        return this.attachFiles;
    }

    /**
     * Set 첨부파일.
     *
     * @param attachFiles the attachFiles value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withAttachFiles(List<EmailResponseAttachFilesItem> attachFiles) {
        this.attachFiles = attachFiles;
        return this;
    }

    /**
     * Get 수신자 목록.
     *
     * @return the recipients value
     */
    public List<EmailResponseRecipientsItem> recipients() {
        return this.recipients;
    }

    /**
     * Set 수신자 목록.
     *
     * @param recipients the recipients value to set
     * @return the EmailResponse object itself.
     */
    public EmailResponse withRecipients(List<EmailResponseRecipientsItem> recipients) {
        this.recipients = recipients;
        return this;
    }

}
