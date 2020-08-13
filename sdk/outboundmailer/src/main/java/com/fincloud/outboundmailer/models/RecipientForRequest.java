/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 수신자 요청 정보.
 */
public class RecipientForRequest {
    /**
     * 수신자 Email 주소.
     */
    @JsonProperty(value = "address", required = true)
    private String address;

    /**
     * 수신자 이름.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * 치환 파라미터 (수신자별로 적용), '치환 ID' 를 key로, '치환 ID에 맵핑되는 값' 을 value로 가지는 Map 형태의
     * Object.
     */
    @JsonProperty(value = "parameters")
    private RecipientForRequestParameters parameters;

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
     * @return the RecipientForRequest object itself.
     */
    public RecipientForRequest withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get 수신자 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 수신자 이름.
     *
     * @param name the name value to set
     * @return the RecipientForRequest object itself.
     */
    public RecipientForRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
     *
     * @param type the type value to set
     * @return the RecipientForRequest object itself.
     */
    public RecipientForRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get 치환 파라미터 (수신자별로 적용), '치환 ID' 를 key로, '치환 ID에 맵핑되는 값' 을 value로 가지는 Map 형태의 Object.
     *
     * @return the parameters value
     */
    public RecipientForRequestParameters parameters() {
        return this.parameters;
    }

    /**
     * Set 치환 파라미터 (수신자별로 적용), '치환 ID' 를 key로, '치환 ID에 맵핑되는 값' 을 value로 가지는 Map 형태의 Object.
     *
     * @param parameters the parameters value to set
     * @return the RecipientForRequest object itself.
     */
    public RecipientForRequest withParameters(RecipientForRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
