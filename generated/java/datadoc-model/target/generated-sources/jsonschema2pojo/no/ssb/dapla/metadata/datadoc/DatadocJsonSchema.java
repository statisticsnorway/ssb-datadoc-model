
package no.ssb.dapla.metadata.datadoc;

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
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Datadoc metadata
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "percentage_complete",
    "document_version",
    "dataset",
    "variables"
})
@Generated("jsonschema2pojo")
public class DatadocJsonSchema implements Serializable
{

    /**
     * Percentage of obligatory metadata fields populated.
     * 
     */
    @JsonProperty("percentage_complete")
    @JsonPropertyDescription("Percentage of obligatory metadata fields populated.")
    private Integer percentageComplete;
    /**
     * Version of this model
     * (Required)
     * 
     */
    @JsonProperty("document_version")
    @JsonPropertyDescription("Version of this model")
    @NotNull
    private Object documentVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataset")
    @Valid
    @NotNull
    private Dataset dataset;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("variables")
    @Valid
    @NotNull
    private List<Variable> variables = new ArrayList<Variable>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 2230685356983896153L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DatadocJsonSchema() {
    }

    /**
     * 
     * @param percentageComplete
     *     Percentage of obligatory metadata fields populated.
     * @param documentVersion
     *     Version of this model.
     */
    public DatadocJsonSchema(Integer percentageComplete, Object documentVersion, Dataset dataset, List<Variable> variables) {
        super();
        this.percentageComplete = percentageComplete;
        this.documentVersion = documentVersion;
        this.dataset = dataset;
        this.variables = variables;
    }

    /**
     * Percentage of obligatory metadata fields populated.
     * 
     */
    @JsonProperty("percentage_complete")
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    /**
     * Percentage of obligatory metadata fields populated.
     * 
     */
    @JsonProperty("percentage_complete")
    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * Version of this model
     * (Required)
     * 
     */
    @JsonProperty("document_version")
    public Object getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Version of this model
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
    @JsonProperty("dataset")
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dataset")
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("variables")
    public List<Variable> getVariables() {
        return variables;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("variables")
    public void setVariables(List<Variable> variables) {
        this.variables = variables;
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
        sb.append(DatadocJsonSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentageComplete");
        sb.append('=');
        sb.append(((this.percentageComplete == null)?"<null>":this.percentageComplete));
        sb.append(',');
        sb.append("documentVersion");
        sb.append('=');
        sb.append(((this.documentVersion == null)?"<null>":this.documentVersion));
        sb.append(',');
        sb.append("dataset");
        sb.append('=');
        sb.append(((this.dataset == null)?"<null>":this.dataset));
        sb.append(',');
        sb.append("variables");
        sb.append('=');
        sb.append(((this.variables == null)?"<null>":this.variables));
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
        result = ((result* 31)+((this.variables == null)? 0 :this.variables.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.percentageComplete == null)? 0 :this.percentageComplete.hashCode()));
        result = ((result* 31)+((this.dataset == null)? 0 :this.dataset.hashCode()));
        result = ((result* 31)+((this.documentVersion == null)? 0 :this.documentVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatadocJsonSchema) == false) {
            return false;
        }
        DatadocJsonSchema rhs = ((DatadocJsonSchema) other);
        return ((((((this.variables == rhs.variables)||((this.variables!= null)&&this.variables.equals(rhs.variables)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.percentageComplete == rhs.percentageComplete)||((this.percentageComplete!= null)&&this.percentageComplete.equals(rhs.percentageComplete))))&&((this.dataset == rhs.dataset)||((this.dataset!= null)&&this.dataset.equals(rhs.dataset))))&&((this.documentVersion == rhs.documentVersion)||((this.documentVersion!= null)&&this.documentVersion.equals(rhs.documentVersion))));
    }

}
