
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "name",
    "valid_from",
    "valid_until"
})
@Generated("jsonschema2pojo")
public class OtherValue implements Serializable
{

    /**
     * Code
     * <p>
     * Other value code
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Other value code")
    private String code;
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("name")
    @Valid
    private LanguageStringType name;
    /**
     * Valid from
     * <p>
     * Other value valid from date
     * 
     */
    @JsonProperty("valid_from")
    @JsonPropertyDescription("Other value valid from date")
    private Date validFrom;
    /**
     * Valid until
     * <p>
     * Other value until date
     * 
     */
    @JsonProperty("valid_until")
    @JsonPropertyDescription("Other value until date")
    private Date validUntil;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5723978274694723388L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OtherValue() {
    }

    /**
     * 
     * @param code
     *     Code. Other value code.
     * @param name
     *     Name. Other value name (text).
     * @param validUntil
     *     Valid until. Other value until date.
     * @param validFrom
     *     Valid from. Other value valid from date.
     */
    public OtherValue(String code, LanguageStringType name, Date validFrom, Date validUntil) {
        super();
        this.code = code;
        this.name = name;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    public static OtherValue.OtherValueBuilderBase builder() {
        return new OtherValue.OtherValueBuilder();
    }

    /**
     * Code
     * <p>
     * Other value code
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Other value code
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("name")
    public LanguageStringType getName() {
        return name;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("name")
    public void setName(LanguageStringType name) {
        this.name = name;
    }

    /**
     * Valid from
     * <p>
     * Other value valid from date
     * 
     */
    @JsonProperty("valid_from")
    public Date getValidFrom() {
        return validFrom;
    }

    /**
     * Valid from
     * <p>
     * Other value valid from date
     * 
     */
    @JsonProperty("valid_from")
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * Valid until
     * <p>
     * Other value until date
     * 
     */
    @JsonProperty("valid_until")
    public Date getValidUntil() {
        return validUntil;
    }

    /**
     * Valid until
     * <p>
     * Other value until date
     * 
     */
    @JsonProperty("valid_until")
    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OtherValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("validFrom");
        sb.append('=');
        sb.append(((this.validFrom == null)?"<null>":this.validFrom));
        sb.append(',');
        sb.append("validUntil");
        sb.append('=');
        sb.append(((this.validUntil == null)?"<null>":this.validUntil));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.validUntil == null)? 0 :this.validUntil.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.validFrom == null)? 0 :this.validFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherValue) == false) {
            return false;
        }
        OtherValue rhs = ((OtherValue) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.validUntil == rhs.validUntil)||((this.validUntil!= null)&&this.validUntil.equals(rhs.validUntil))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.validFrom == rhs.validFrom)||((this.validFrom!= null)&&this.validFrom.equals(rhs.validFrom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class OtherValueBuilder
        extends OtherValue.OtherValueBuilderBase<OtherValue>
    {


        public OtherValueBuilder() {
            super();
        }

        public OtherValueBuilder(String code, LanguageStringType name, Date validFrom, Date validUntil) {
            super(code, name, validFrom, validUntil);
        }

    }

    public static abstract class OtherValueBuilderBase<T extends OtherValue >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public OtherValueBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(OtherValue.OtherValueBuilder.class)) {
                this.instance = ((T) new OtherValue());
            }
        }

        @SuppressWarnings("unchecked")
        public OtherValueBuilderBase(String code, LanguageStringType name, Date validFrom, Date validUntil) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(OtherValue.OtherValueBuilder.class)) {
                this.instance = ((T) new OtherValue(code, name, validFrom, validUntil));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public OtherValue.OtherValueBuilderBase withCode(String code) {
            ((OtherValue) this.instance).code = code;
            return this;
        }

        public OtherValue.OtherValueBuilderBase withName(LanguageStringType name) {
            ((OtherValue) this.instance).name = name;
            return this;
        }

        public OtherValue.OtherValueBuilderBase withValidFrom(Date validFrom) {
            ((OtherValue) this.instance).validFrom = validFrom;
            return this;
        }

        public OtherValue.OtherValueBuilderBase withValidUntil(Date validUntil) {
            ((OtherValue) this.instance).validUntil = validUntil;
            return this;
        }

        public OtherValue.OtherValueBuilderBase withAdditionalProperty(String name, Object value) {
            ((OtherValue) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
