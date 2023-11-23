
package no.ssb.dapla.metadata;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataset_pseudo_time",
    "source_dataset_path"
})
@Generated("jsonschema2pojo")
public class PseudoDataset implements Serializable
{

    /**
     * Dataset pseudo time
     * <p>
     * Time at which the dataset was pseudonymized. In ISO 8601 format.
     * (Required)
     * 
     */
    @JsonProperty("dataset_pseudo_time")
    @JsonPropertyDescription("Time at which the dataset was pseudonymized. In ISO 8601 format.")
    @NotNull
    private Date datasetPseudoTime;
    /**
     * Source dataset path
     * <p>
     * Path to the unpseudonymized dataset. Specified as a file path, URL or URI.
     * 
     */
    @JsonProperty("source_dataset_path")
    @JsonPropertyDescription("Path to the unpseudonymized dataset. Specified as a file path, URL or URI.")
    private String sourceDatasetPath;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 1170099357079808748L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PseudoDataset() {
    }

    /**
     * 
     * @param datasetPseudoTime
     *     Dataset pseudo time. Time at which the dataset was pseudonymized. In ISO 8601 format.
     * @param sourceDatasetPath
     *     Source dataset path. Path to the unpseudonymized dataset. Specified as a file path, URL or URI.
     */
    public PseudoDataset(Date datasetPseudoTime, String sourceDatasetPath) {
        super();
        this.datasetPseudoTime = datasetPseudoTime;
        this.sourceDatasetPath = sourceDatasetPath;
    }

    /**
     * Dataset pseudo time
     * <p>
     * Time at which the dataset was pseudonymized. In ISO 8601 format.
     * (Required)
     * 
     */
    @JsonProperty("dataset_pseudo_time")
    public Date getDatasetPseudoTime() {
        return datasetPseudoTime;
    }

    /**
     * Dataset pseudo time
     * <p>
     * Time at which the dataset was pseudonymized. In ISO 8601 format.
     * (Required)
     * 
     */
    @JsonProperty("dataset_pseudo_time")
    public void setDatasetPseudoTime(Date datasetPseudoTime) {
        this.datasetPseudoTime = datasetPseudoTime;
    }

    /**
     * Source dataset path
     * <p>
     * Path to the unpseudonymized dataset. Specified as a file path, URL or URI.
     * 
     */
    @JsonProperty("source_dataset_path")
    public String getSourceDatasetPath() {
        return sourceDatasetPath;
    }

    /**
     * Source dataset path
     * <p>
     * Path to the unpseudonymized dataset. Specified as a file path, URL or URI.
     * 
     */
    @JsonProperty("source_dataset_path")
    public void setSourceDatasetPath(String sourceDatasetPath) {
        this.sourceDatasetPath = sourceDatasetPath;
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
        sb.append(PseudoDataset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datasetPseudoTime");
        sb.append('=');
        sb.append(((this.datasetPseudoTime == null)?"<null>":this.datasetPseudoTime));
        sb.append(',');
        sb.append("sourceDatasetPath");
        sb.append('=');
        sb.append(((this.sourceDatasetPath == null)?"<null>":this.sourceDatasetPath));
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
        result = ((result* 31)+((this.datasetPseudoTime == null)? 0 :this.datasetPseudoTime.hashCode()));
        result = ((result* 31)+((this.sourceDatasetPath == null)? 0 :this.sourceDatasetPath.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PseudoDataset) == false) {
            return false;
        }
        PseudoDataset rhs = ((PseudoDataset) other);
        return ((((this.datasetPseudoTime == rhs.datasetPseudoTime)||((this.datasetPseudoTime!= null)&&this.datasetPseudoTime.equals(rhs.datasetPseudoTime)))&&((this.sourceDatasetPath == rhs.sourceDatasetPath)||((this.sourceDatasetPath!= null)&&this.sourceDatasetPath.equals(rhs.sourceDatasetPath))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
