
package no.ssb.dapla.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Pseudonymization metadata
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "document_version",
    "pseudo_dataset",
    "pseudo_variables"
})
@Generated("jsonschema2pojo")
public class PseudonymizationJsonSchema implements Serializable
{

    /**
     * Version of this Json Schema
     * (Required)
     * 
     */
    @JsonProperty("document_version")
    @NotNull
    private Object documentVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pseudo_dataset")
    @NotNull
    private PseudoDataset pseudoDataset;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pseudo_variables")
    @Valid
    @NotNull
    private List<PseudoVariable> pseudoVariables = new ArrayList<PseudoVariable>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 4491182946050709357L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PseudonymizationJsonSchema() {
    }

    public PseudonymizationJsonSchema(Object documentVersion, PseudoDataset pseudoDataset, List<PseudoVariable> pseudoVariables) {
        super();
        this.documentVersion = documentVersion;
        this.pseudoDataset = pseudoDataset;
        this.pseudoVariables = pseudoVariables;
    }

    /**
     * Version of this Json Schema
     * (Required)
     * 
     */
    @JsonProperty("document_version")
    public Object getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Version of this Json Schema
     * (Required)
     * 
     */
    @JsonProperty("document_version")
    public void setDocumentVersion(Object documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pseudo_dataset")
    public PseudoDataset getPseudoDataset() {
        return pseudoDataset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pseudo_dataset")
    public void setPseudoDataset(PseudoDataset pseudoDataset) {
        this.pseudoDataset = pseudoDataset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pseudo_variables")
    public List<PseudoVariable> getPseudoVariables() {
        return pseudoVariables;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pseudo_variables")
    public void setPseudoVariables(List<PseudoVariable> pseudoVariables) {
        this.pseudoVariables = pseudoVariables;
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
        sb.append(PseudonymizationJsonSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("documentVersion");
        sb.append('=');
        sb.append(((this.documentVersion == null)?"<null>":this.documentVersion));
        sb.append(',');
        sb.append("pseudoDataset");
        sb.append('=');
        sb.append(((this.pseudoDataset == null)?"<null>":this.pseudoDataset));
        sb.append(',');
        sb.append("pseudoVariables");
        sb.append('=');
        sb.append(((this.pseudoVariables == null)?"<null>":this.pseudoVariables));
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
        result = ((result* 31)+((this.pseudoDataset == null)? 0 :this.pseudoDataset.hashCode()));
        result = ((result* 31)+((this.documentVersion == null)? 0 :this.documentVersion.hashCode()));
        result = ((result* 31)+((this.pseudoVariables == null)? 0 :this.pseudoVariables.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PseudonymizationJsonSchema) == false) {
            return false;
        }
        PseudonymizationJsonSchema rhs = ((PseudonymizationJsonSchema) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.pseudoDataset == rhs.pseudoDataset)||((this.pseudoDataset!= null)&&this.pseudoDataset.equals(rhs.pseudoDataset))))&&((this.documentVersion == rhs.documentVersion)||((this.documentVersion!= null)&&this.documentVersion.equals(rhs.documentVersion))))&&((this.pseudoVariables == rhs.pseudoVariables)||((this.pseudoVariables!= null)&&this.pseudoVariables.equals(rhs.pseudoVariables))));
    }

}
