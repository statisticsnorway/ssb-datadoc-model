
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@Generated("jsonschema2pojo")
public class EncryptionAlgorithmParameter implements Serializable
{

    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7693110438516409562L;

    public static EncryptionAlgorithmParameter.EncryptionAlgorithmParameterBuilderBase builder() {
        return new EncryptionAlgorithmParameter.EncryptionAlgorithmParameterBuilder();
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
        sb.append(EncryptionAlgorithmParameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EncryptionAlgorithmParameter) == false) {
            return false;
        }
        EncryptionAlgorithmParameter rhs = ((EncryptionAlgorithmParameter) other);
        return ((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)));
    }

    public static class EncryptionAlgorithmParameterBuilder
        extends EncryptionAlgorithmParameter.EncryptionAlgorithmParameterBuilderBase<EncryptionAlgorithmParameter>
    {


        public EncryptionAlgorithmParameterBuilder() {
            super();
        }

    }

    public static abstract class EncryptionAlgorithmParameterBuilderBase<T extends EncryptionAlgorithmParameter >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public EncryptionAlgorithmParameterBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(EncryptionAlgorithmParameter.EncryptionAlgorithmParameterBuilder.class)) {
                this.instance = ((T) new EncryptionAlgorithmParameter());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public EncryptionAlgorithmParameter.EncryptionAlgorithmParameterBuilderBase withAdditionalProperty(String name, Object value) {
            ((EncryptionAlgorithmParameter) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
