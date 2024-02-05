
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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


/**
 * Special values
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sentinel",
    "other_value"
})
@Generated("jsonschema2pojo")
public class SpecialValues implements Serializable
{

    /**
     * Sentinel values
     * <p>
     * 
     * 
     */
    @JsonProperty("sentinel")
    @Valid
    private SentinelValues sentinel;
    /**
     * Other special values
     * <p>
     * Other special values not represented as 'sentinel_value' in a standardized code list.
     * 
     */
    @JsonProperty("other_value")
    @JsonPropertyDescription("Other special values not represented as 'sentinel_value' in a standardized code list.")
    @Valid
    private List<OtherValue> otherValue = new ArrayList<OtherValue>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5889699621554465663L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SpecialValues() {
    }

    /**
     * 
     * @param sentinel
     *     Sentinel values.
     * @param otherValue
     *     Other special values. Other special values not represented as 'sentinel_value' in a standardized code list.
     */
    public SpecialValues(SentinelValues sentinel, List<OtherValue> otherValue) {
        super();
        this.sentinel = sentinel;
        this.otherValue = otherValue;
    }

    public static SpecialValues.SpecialValuesBuilderBase builder() {
        return new SpecialValues.SpecialValuesBuilder();
    }

    /**
     * Sentinel values
     * <p>
     * 
     * 
     */
    @JsonProperty("sentinel")
    public SentinelValues getSentinel() {
        return sentinel;
    }

    /**
     * Sentinel values
     * <p>
     * 
     * 
     */
    @JsonProperty("sentinel")
    public void setSentinel(SentinelValues sentinel) {
        this.sentinel = sentinel;
    }

    /**
     * Other special values
     * <p>
     * Other special values not represented as 'sentinel_value' in a standardized code list.
     * 
     */
    @JsonProperty("other_value")
    public List<OtherValue> getOtherValue() {
        return otherValue;
    }

    /**
     * Other special values
     * <p>
     * Other special values not represented as 'sentinel_value' in a standardized code list.
     * 
     */
    @JsonProperty("other_value")
    public void setOtherValue(List<OtherValue> otherValue) {
        this.otherValue = otherValue;
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
        sb.append(SpecialValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sentinel");
        sb.append('=');
        sb.append(((this.sentinel == null)?"<null>":this.sentinel));
        sb.append(',');
        sb.append("otherValue");
        sb.append('=');
        sb.append(((this.otherValue == null)?"<null>":this.otherValue));
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
        result = ((result* 31)+((this.sentinel == null)? 0 :this.sentinel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.otherValue == null)? 0 :this.otherValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecialValues) == false) {
            return false;
        }
        SpecialValues rhs = ((SpecialValues) other);
        return ((((this.sentinel == rhs.sentinel)||((this.sentinel!= null)&&this.sentinel.equals(rhs.sentinel)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.otherValue == rhs.otherValue)||((this.otherValue!= null)&&this.otherValue.equals(rhs.otherValue))));
    }

    public static class SpecialValuesBuilder
        extends SpecialValues.SpecialValuesBuilderBase<SpecialValues>
    {


        public SpecialValuesBuilder() {
            super();
        }

        public SpecialValuesBuilder(SentinelValues sentinel, List<OtherValue> otherValue) {
            super(sentinel, otherValue);
        }

    }

    public static abstract class SpecialValuesBuilderBase<T extends SpecialValues >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public SpecialValuesBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(SpecialValues.SpecialValuesBuilder.class)) {
                this.instance = ((T) new SpecialValues());
            }
        }

        @SuppressWarnings("unchecked")
        public SpecialValuesBuilderBase(SentinelValues sentinel, List<OtherValue> otherValue) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(SpecialValues.SpecialValuesBuilder.class)) {
                this.instance = ((T) new SpecialValues(sentinel, otherValue));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public SpecialValues.SpecialValuesBuilderBase withSentinel(SentinelValues sentinel) {
            ((SpecialValues) this.instance).sentinel = sentinel;
            return this;
        }

        public SpecialValues.SpecialValuesBuilderBase withOtherValue(List<OtherValue> otherValue) {
            ((SpecialValues) this.instance).otherValue = otherValue;
            return this;
        }

        public SpecialValues.SpecialValuesBuilderBase withAdditionalProperty(String name, Object value) {
            ((SpecialValues) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
