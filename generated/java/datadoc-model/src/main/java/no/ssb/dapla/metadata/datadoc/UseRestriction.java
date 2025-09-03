
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "use_restriction_type",
    "use_restriction_date"
})
@Generated("jsonschema2pojo")
public class UseRestriction implements Serializable
{

    /**
     * Use restriction type
     * <p>
     * Use restriction type
     * 
     */
    @JsonProperty("use_restriction_type")
    @JsonPropertyDescription("Use restriction type")
    private UseRestriction.UseRestrictionType useRestrictionType;
    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    @JsonPropertyDescription("Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.")
    private String useRestrictionDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6727527747502538009L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UseRestriction() {
    }

    /**
     * 
     * @param useRestrictionType
     *     Use restriction type. Use restriction type.
     * @param useRestrictionDate
     *     Use restriction date. Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     */
    public UseRestriction(UseRestriction.UseRestrictionType useRestrictionType, String useRestrictionDate) {
        super();
        this.useRestrictionType = useRestrictionType;
        this.useRestrictionDate = useRestrictionDate;
    }

    public static UseRestriction.UseRestrictionBuilderBase builder() {
        return new UseRestriction.UseRestrictionBuilder();
    }

    /**
     * Use restriction type
     * <p>
     * Use restriction type
     * 
     */
    @JsonProperty("use_restriction_type")
    public UseRestriction.UseRestrictionType getUseRestrictionType() {
        return useRestrictionType;
    }

    /**
     * Use restriction type
     * <p>
     * Use restriction type
     * 
     */
    @JsonProperty("use_restriction_type")
    public void setUseRestrictionType(UseRestriction.UseRestrictionType useRestrictionType) {
        this.useRestrictionType = useRestrictionType;
    }

    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    public String getUseRestrictionDate() {
        return useRestrictionDate;
    }

    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    public void setUseRestrictionDate(String useRestrictionDate) {
        this.useRestrictionDate = useRestrictionDate;
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
        sb.append(UseRestriction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("useRestrictionType");
        sb.append('=');
        sb.append(((this.useRestrictionType == null)?"<null>":this.useRestrictionType));
        sb.append(',');
        sb.append("useRestrictionDate");
        sb.append('=');
        sb.append(((this.useRestrictionDate == null)?"<null>":this.useRestrictionDate));
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
        result = ((result* 31)+((this.useRestrictionType == null)? 0 :this.useRestrictionType.hashCode()));
        result = ((result* 31)+((this.useRestrictionDate == null)? 0 :this.useRestrictionDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UseRestriction) == false) {
            return false;
        }
        UseRestriction rhs = ((UseRestriction) other);
        return ((((this.useRestrictionType == rhs.useRestrictionType)||((this.useRestrictionType!= null)&&this.useRestrictionType.equals(rhs.useRestrictionType)))&&((this.useRestrictionDate == rhs.useRestrictionDate)||((this.useRestrictionDate!= null)&&this.useRestrictionDate.equals(rhs.useRestrictionDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class UseRestrictionBuilder
        extends UseRestriction.UseRestrictionBuilderBase<UseRestriction>
    {


        public UseRestrictionBuilder() {
            super();
        }

        public UseRestrictionBuilder(UseRestriction.UseRestrictionType useRestrictionType, String useRestrictionDate) {
            super(useRestrictionType, useRestrictionDate);
        }

    }

    public static abstract class UseRestrictionBuilderBase<T extends UseRestriction >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public UseRestrictionBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(UseRestriction.UseRestrictionBuilder.class)) {
                this.instance = ((T) new UseRestriction());
            }
        }

        @SuppressWarnings("unchecked")
        public UseRestrictionBuilderBase(UseRestriction.UseRestrictionType useRestrictionType, String useRestrictionDate) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(UseRestriction.UseRestrictionBuilder.class)) {
                this.instance = ((T) new UseRestriction(useRestrictionType, useRestrictionDate));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public UseRestriction.UseRestrictionBuilderBase withUseRestrictionType(UseRestriction.UseRestrictionType useRestrictionType) {
            ((UseRestriction) this.instance).useRestrictionType = useRestrictionType;
            return this;
        }

        public UseRestriction.UseRestrictionBuilderBase withUseRestrictionDate(String useRestrictionDate) {
            ((UseRestriction) this.instance).useRestrictionDate = useRestrictionDate;
            return this;
        }

        public UseRestriction.UseRestrictionBuilderBase withAdditionalProperty(String name, Object value) {
            ((UseRestriction) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }


    /**
     * Use restriction type
     * <p>
     * Use restriction type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum UseRestrictionType {

        DELETION_ANONYMIZATION("DELETION_ANONYMIZATION"),
        PROCESS_LIMITATIONS("PROCESS_LIMITATIONS"),
        SECONDARY_USE_RESTRICTIONS("SECONDARY_USE_RESTRICTIONS");
        private final String value;
        private final static Map<String, UseRestriction.UseRestrictionType> CONSTANTS = new HashMap<String, UseRestriction.UseRestrictionType>();

        static {
            for (UseRestriction.UseRestrictionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UseRestrictionType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static UseRestriction.UseRestrictionType fromValue(String value) {
            UseRestriction.UseRestrictionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
