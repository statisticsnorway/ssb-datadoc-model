
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
public class CustomType__1 implements Serializable
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
    private final static long serialVersionUID = 9007834125759711144L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomType__1() {
    }

    /**
     * 
     * @param value
     *     Value. Custom type VALUE (of type string, array or object).
     * @param key
     *     Key. Custom type KEY.
     */
    public CustomType__1(String key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    public static CustomType__1 .CustomType__1BuilderBase builder() {
        return new CustomType__1 .CustomType__1Builder();
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
        sb.append(CustomType__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof CustomType__1) == false) {
            return false;
        }
        CustomType__1 rhs = ((CustomType__1) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

    public static class CustomType__1Builder
        extends CustomType__1 .CustomType__1BuilderBase<CustomType__1>
    {


        public CustomType__1Builder() {
            super();
        }

        public CustomType__1Builder(String key, Object value) {
            super(key, value);
        }

    }

    public static abstract class CustomType__1BuilderBase<T extends CustomType__1 >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public CustomType__1BuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(CustomType__1 .CustomType__1Builder.class)) {
                this.instance = ((T) new CustomType__1());
            }
        }

        @SuppressWarnings("unchecked")
        public CustomType__1BuilderBase(String key, Object value) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(CustomType__1 .CustomType__1Builder.class)) {
                this.instance = ((T) new CustomType__1(key, value));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public CustomType__1 .CustomType__1BuilderBase withKey(String key) {
            ((CustomType__1) this.instance).key = key;
            return this;
        }

        public CustomType__1 .CustomType__1BuilderBase withValue(Object value) {
            ((CustomType__1) this.instance).value = value;
            return this;
        }

        public CustomType__1 .CustomType__1BuilderBase withAdditionalProperty(String name, Object value) {
            ((CustomType__1) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
