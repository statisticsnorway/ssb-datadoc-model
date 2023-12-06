
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * Reusable langugage string type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "en",
    "nn",
    "nb"
})
@Generated("jsonschema2pojo")
public class LanguageStringType implements Serializable
{

    @JsonProperty("en")
    private String en;
    @JsonProperty("nn")
    private String nn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nb")
    @NotNull
    private String nb;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 657811707745008224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LanguageStringType() {
    }

    public LanguageStringType(String en, String nn, String nb) {
        super();
        this.en = en;
        this.nn = nn;
        this.nb = nb;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("nn")
    public String getNn() {
        return nn;
    }

    @JsonProperty("nn")
    public void setNn(String nn) {
        this.nn = nn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nb")
    public String getNb() {
        return nb;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nb")
    public void setNb(String nb) {
        this.nb = nb;
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
        sb.append(LanguageStringType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("en");
        sb.append('=');
        sb.append(((this.en == null)?"<null>":this.en));
        sb.append(',');
        sb.append("nn");
        sb.append('=');
        sb.append(((this.nn == null)?"<null>":this.nn));
        sb.append(',');
        sb.append("nb");
        sb.append('=');
        sb.append(((this.nb == null)?"<null>":this.nb));
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
        result = ((result* 31)+((this.nn == null)? 0 :this.nn.hashCode()));
        result = ((result* 31)+((this.en == null)? 0 :this.en.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nb == null)? 0 :this.nb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LanguageStringType) == false) {
            return false;
        }
        LanguageStringType rhs = ((LanguageStringType) other);
        return (((((this.nn == rhs.nn)||((this.nn!= null)&&this.nn.equals(rhs.nn)))&&((this.en == rhs.en)||((this.en!= null)&&this.en.equals(rhs.en))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nb == rhs.nb)||((this.nb!= null)&&this.nb.equals(rhs.nb))));
    }

}
