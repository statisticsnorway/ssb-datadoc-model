
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.Date;
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
    "use_restriction",
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
    @JsonProperty("use_restriction")
    @JsonPropertyDescription("Use restriction type")
    private UseRestriction.UseRestrictionType useRestriction;
    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    @JsonPropertyDescription("Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.")
    private Date useRestrictionDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1677280696424516964L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UseRestriction() {
    }

    /**
     * 
     * @param useRestriction
     *     Use restriction type. Use restriction type.
     * @param useRestrictionDate
     *     Use restriction date. Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     */
    public UseRestriction(UseRestriction.UseRestrictionType useRestriction, Date useRestrictionDate) {
        super();
        this.useRestriction = useRestriction;
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
    @JsonProperty("use_restriction")
    public UseRestriction.UseRestrictionType getUseRestriction() {
        return useRestriction;
    }

    /**
     * Use restriction type
     * <p>
     * Use restriction type
     * 
     */
    @JsonProperty("use_restriction")
    public void setUseRestriction(UseRestriction.UseRestrictionType useRestriction) {
        this.useRestriction = useRestriction;
    }

    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    public Date getUseRestrictionDate() {
        return useRestrictionDate;
    }

    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    public void setUseRestrictionDate(Date useRestrictionDate) {
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
        sb.append("useRestriction");
        sb.append('=');
        sb.append(((this.useRestriction == null)?"<null>":this.useRestriction));
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
        result = ((result* 31)+((this.useRestriction == null)? 0 :this.useRestriction.hashCode()));
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
        return ((((this.useRestriction == rhs.useRestriction)||((this.useRestriction!= null)&&this.useRestriction.equals(rhs.useRestriction)))&&((this.useRestrictionDate == rhs.useRestrictionDate)||((this.useRestrictionDate!= null)&&this.useRestrictionDate.equals(rhs.useRestrictionDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public static class UseRestrictionBuilder
        extends UseRestriction.UseRestrictionBuilderBase<UseRestriction>
    {


        public UseRestrictionBuilder() {
            super();
        }

        public UseRestrictionBuilder(UseRestriction.UseRestrictionType useRestriction, Date useRestrictionDate) {
            super(useRestriction, useRestrictionDate);
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
        public UseRestrictionBuilderBase(UseRestriction.UseRestrictionType useRestriction, Date useRestrictionDate) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(UseRestriction.UseRestrictionBuilder.class)) {
                this.instance = ((T) new UseRestriction(useRestriction, useRestrictionDate));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public UseRestriction.UseRestrictionBuilderBase withUseRestriction(UseRestriction.UseRestrictionType useRestriction) {
            ((UseRestriction) this.instance).useRestriction = useRestriction;
            return this;
        }

        public UseRestriction.UseRestrictionBuilderBase withUseRestrictionDate(Date useRestrictionDate) {
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
