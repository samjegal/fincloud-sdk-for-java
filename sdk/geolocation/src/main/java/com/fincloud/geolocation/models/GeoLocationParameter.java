/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GeoLocationParameter model.
 */
public class GeoLocationParameter {
    /**
     * 국가코드 EU(유럽), AP(아시아, 호주), A1(Anonymous Proxy), A2(Satellite provider),
     * O1(Other Country)를 포함.
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * 한국의 경우에 행정자치부에서 정하는 행정구역 코드.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * 도, 광역시, 주.
     */
    @JsonProperty(value = "r1")
    private String r1;

    /**
     * 시, 군, 구.
     */
    @JsonProperty(value = "r2")
    private String r2;

    /**
     * 동, 면, 읍.
     */
    @JsonProperty(value = "r3")
    private String r3;

    /**
     * 위도.
     */
    @JsonProperty(value = "lat")
    private Double lat;

    /**
     * 경도.
     */
    @JsonProperty(value = "long")
    private Double longProperty;

    /**
     * 통신사 이름.
     */
    @JsonProperty(value = "net")
    private String net;

    /**
     * Get 국가코드 EU(유럽), AP(아시아, 호주), A1(Anonymous Proxy), A2(Satellite provider), O1(Other Country)를 포함.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set 국가코드 EU(유럽), AP(아시아, 호주), A1(Anonymous Proxy), A2(Satellite provider), O1(Other Country)를 포함.
     *
     * @param country the country value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get 한국의 경우에 행정자치부에서 정하는 행정구역 코드.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 한국의 경우에 행정자치부에서 정하는 행정구역 코드.
     *
     * @param code the code value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get 도, 광역시, 주.
     *
     * @return the r1 value
     */
    public String r1() {
        return this.r1;
    }

    /**
     * Set 도, 광역시, 주.
     *
     * @param r1 the r1 value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withR1(String r1) {
        this.r1 = r1;
        return this;
    }

    /**
     * Get 시, 군, 구.
     *
     * @return the r2 value
     */
    public String r2() {
        return this.r2;
    }

    /**
     * Set 시, 군, 구.
     *
     * @param r2 the r2 value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withR2(String r2) {
        this.r2 = r2;
        return this;
    }

    /**
     * Get 동, 면, 읍.
     *
     * @return the r3 value
     */
    public String r3() {
        return this.r3;
    }

    /**
     * Set 동, 면, 읍.
     *
     * @param r3 the r3 value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withR3(String r3) {
        this.r3 = r3;
        return this;
    }

    /**
     * Get 위도.
     *
     * @return the lat value
     */
    public Double lat() {
        return this.lat;
    }

    /**
     * Set 위도.
     *
     * @param lat the lat value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * Get 경도.
     *
     * @return the longProperty value
     */
    public Double longProperty() {
        return this.longProperty;
    }

    /**
     * Set 경도.
     *
     * @param longProperty the longProperty value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withLongProperty(Double longProperty) {
        this.longProperty = longProperty;
        return this;
    }

    /**
     * Get 통신사 이름.
     *
     * @return the net value
     */
    public String net() {
        return this.net;
    }

    /**
     * Set 통신사 이름.
     *
     * @param net the net value to set
     * @return the GeoLocationParameter object itself.
     */
    public GeoLocationParameter withNet(String net) {
        this.net = net;
        return this;
    }

}
