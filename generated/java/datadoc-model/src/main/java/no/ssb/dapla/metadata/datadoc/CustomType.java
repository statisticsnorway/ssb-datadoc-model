
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
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
    "key",
    "value"
})
@Generated("jsonschema2pojo")
public class CustomType implements Serializable
{

    /**
     * Key
     * <p>
     * Custom type KEY
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("Custom type KEY")
    private String key;
    /**
     * Value
     * <p>
     * Custom type VALUE (of type string, array or object).
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Custom type VALUE (of type string, array or object).")
    private Object value;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5187573791864322508L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomType() {
    }

    /**
     * 
     * @param value
     *     Value. Custom type VALUE (of type string, array or object).
     * @param key
     *     Key. Custom type KEY.
     */
    public CustomType(String key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    public static CustomType.CustomTypeBuilderBase builder() {
        return new CustomType.CustomTypeBuilder();
    }

    /**
     * Key
     * <p>
     * Custom type KEY
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Key
     * <p>
     * Custom type KEY
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Value
     * <p>
     * Custom type VALUE (of type string, array or object).
     * 
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Custom type VALUE (of type string, array or object).
     * 
     */
    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
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
        sb.append(CustomType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomType) == false) {
            return false;
        }
        CustomType rhs = ((CustomType) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

    public static class CustomTypeBuilder
        extends CustomType.CustomTypeBuilderBase<CustomType>
    {


        public CustomTypeBuilder() {
            super();
        }

        public CustomTypeBuilder(String key, Object value) {
            super(key, value);
        }

    }

    public static abstract class CustomTypeBuilderBase<T extends CustomType >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public CustomTypeBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(CustomType.CustomTypeBuilder.class)) {
                this.instance = ((T) new CustomType());
            }
        }

        @SuppressWarnings("unchecked")
        public CustomTypeBuilderBase(String key, Object value) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(CustomType.CustomTypeBuilder.class)) {
                this.instance = ((T) new CustomType(key, value));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public CustomType.CustomTypeBuilderBase withKey(String key) {
            ((CustomType) this.instance).key = key;
            return this;
        }

        public CustomType.CustomTypeBuilderBase withValue(Object value) {
            ((CustomType) this.instance).value = value;
            return this;
        }

        public CustomType.CustomTypeBuilderBase withAdditionalProperty(String name, Object value) {
            ((CustomType) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
