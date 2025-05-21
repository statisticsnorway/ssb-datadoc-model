
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import jakarta.validation.constraints.NotNull;


/**
 * A pseudonymized variable in the dataset.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pseudonymization_time",
    "stable_identifier_type",
    "stable_identifier_version",
    "encryption_algorithm",
    "encryption_key_reference",
    "encryption_algorithm_parameters"
})
@Generated("jsonschema2pojo")
public class Pseudonymization implements Serializable
{

    /**
     * Variable pseudo time
     * <p>
     * Time at which the variable was pseudonymized. In ISO 8601 format.
     * 
     */
    @JsonProperty("pseudonymization_time")
    @JsonPropertyDescription("Time at which the variable was pseudonymized. In ISO 8601 format.")
    private Date pseudonymizationTime;
    /**
     * Stable identifier type
     * <p>
     * Type of stable identifier the variable was mapped to prior to pseudonymization.Only relevant when the variable is mapped to a stable identifier.
     * 
     */
    @JsonProperty("stable_identifier_type")
    @JsonPropertyDescription("Type of stable identifier the variable was mapped to prior to pseudonymization.")
    private String stableIdentifierType;
    /**
     * Stable identifier version
     * <p>
     * Version of stable identifier the variable was mapped to prior to pseudonymization.Only relevant when the variable is mapped to a stable identifier.
     * 
     */
    @JsonProperty("stable_identifier_version")
    @JsonPropertyDescription("Version of stable identifier the variable was mapped to prior to pseudonymization.")
    private String stableIdentifierVersion;
    /**
     * Encryption algorithm
     * <p>
     * The encryption algorithm used to pseudonymize the variable.
     * (Required)
     * 
     */
    @JsonProperty("encryption_algorithm")
    @JsonPropertyDescription("The encryption algorithm used to pseudonymize the variable.")
    @NotNull
    private String encryptionAlgorithm;
    /**
     * Encryption key reference
     * <p>
     * Name of or reference to the encryption key used to pseudonymize the variable.
     * (Required)
     * 
     */
    @JsonProperty("encryption_key_reference")
    @JsonPropertyDescription("Name of or reference to the encryption key used to pseudonymize the variable.")
    @NotNull
    private String encryptionKeyReference;
    /**
     * Encryption algorithm parameters
     * <p>
     * Parameters supplied to the encryption algorithm.
     * 
     */
    @JsonProperty("encryption_algorithm_parameters")
    @JsonPropertyDescription("Parameters supplied to the encryption algorithm.")
    @Valid
    private List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters = new ArrayList<EncryptionAlgorithmParameter>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -3507966329326709037L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pseudonymization() {
    }

    /**
     * 
     * @param stableIdentifierType
     *     Stable identifier type. Type of stable identifier the variable was mapped to prior to pseudonymization.
     * @param encryptionKeyReference
     *     Encryption key reference. Name of or reference to the encryption key used to pseudonymize the variable.
     * @param pseudonymizationTime
     *     Variable pseudo time. Time at which the variable was pseudonymized. In ISO 8601 format.
     * @param encryptionAlgorithmParameters
     *     Encryption algorithm parameters. Parameters supplied to the encryption algorithm.
     * @param stableIdentifierVersion
     *     Stable identifier version. Version of stable identifier the variable was mapped to prior to pseudonymization.
     * @param encryptionAlgorithm
     *     Encryption algorithm. The encryption algorithm used to pseudonymize the variable.
     */
    public Pseudonymization(Date pseudonymizationTime, String stableIdentifierType, String stableIdentifierVersion, String encryptionAlgorithm, String encryptionKeyReference, List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters) {
        super();
        this.pseudonymizationTime = pseudonymizationTime;
        this.stableIdentifierType = stableIdentifierType;
        this.stableIdentifierVersion = stableIdentifierVersion;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKeyReference = encryptionKeyReference;
        this.encryptionAlgorithmParameters = encryptionAlgorithmParameters;
    }

    public static Pseudonymization.PseudonymizationBuilderBase builder() {
        return new Pseudonymization.PseudonymizationBuilder();
    }

    /**
     * Variable pseudo time
     * <p>
     * Time at which the variable was pseudonymized. In ISO 8601 format.
     * 
     */
    @JsonProperty("pseudonymization_time")
    public Date getPseudonymizationTime() {
        return pseudonymizationTime;
    }

    /**
     * Variable pseudo time
     * <p>
     * Time at which the variable was pseudonymized. In ISO 8601 format.
     * 
     */
    @JsonProperty("pseudonymization_time")
    public void setPseudonymizationTime(Date pseudonymizationTime) {
        this.pseudonymizationTime = pseudonymizationTime;
    }

    /**
     * Stable identifier type
     * <p>
     * Type of stable identifier the variable was mapped to prior to pseudonymization.Only relevant when the variable is mapped to a stable identifier.
     * 
     */
    @JsonProperty("stable_identifier_type")
    public String getStableIdentifierType() {
        return stableIdentifierType;
    }

    /**
     * Stable identifier type
     * <p>
     * Type of stable identifier the variable was mapped to prior to pseudonymization.Only relevant when the variable is mapped to a stable identifier.
     * 
     */
    @JsonProperty("stable_identifier_type")
    public void setStableIdentifierType(String stableIdentifierType) {
        this.stableIdentifierType = stableIdentifierType;
    }

    /**
     * Stable identifier version
     * <p>
     * Version of stable identifier the variable was mapped to prior to pseudonymization.Only relevant when the variable is mapped to a stable identifier.
     * 
     */
    @JsonProperty("stable_identifier_version")
    public String getStableIdentifierVersion() {
        return stableIdentifierVersion;
    }

    /**
     * Stable identifier version
     * <p>
     * Version of stable identifier the variable was mapped to prior to pseudonymization.Only relevant when the variable is mapped to a stable identifier.
     * 
     */
    @JsonProperty("stable_identifier_version")
    public void setStableIdentifierVersion(String stableIdentifierVersion) {
        this.stableIdentifierVersion = stableIdentifierVersion;
    }

    /**
     * Encryption algorithm
     * <p>
     * The encryption algorithm used to pseudonymize the variable.
     * (Required)
     * 
     */
    @JsonProperty("encryption_algorithm")
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Encryption algorithm
     * <p>
     * The encryption algorithm used to pseudonymize the variable.
     * (Required)
     * 
     */
    @JsonProperty("encryption_algorithm")
    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * Encryption key reference
     * <p>
     * Name of or reference to the encryption key used to pseudonymize the variable.
     * (Required)
     * 
     */
    @JsonProperty("encryption_key_reference")
    public String getEncryptionKeyReference() {
        return encryptionKeyReference;
    }

    /**
     * Encryption key reference
     * <p>
     * Name of or reference to the encryption key used to pseudonymize the variable.
     * (Required)
     * 
     */
    @JsonProperty("encryption_key_reference")
    public void setEncryptionKeyReference(String encryptionKeyReference) {
        this.encryptionKeyReference = encryptionKeyReference;
    }

    /**
     * Encryption algorithm parameters
     * <p>
     * Parameters supplied to the encryption algorithm.
     * 
     */
    @JsonProperty("encryption_algorithm_parameters")
    public List<EncryptionAlgorithmParameter> getEncryptionAlgorithmParameters() {
        return encryptionAlgorithmParameters;
    }

    /**
     * Encryption algorithm parameters
     * <p>
     * Parameters supplied to the encryption algorithm.
     * 
     */
    @JsonProperty("encryption_algorithm_parameters")
    public void setEncryptionAlgorithmParameters(List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters) {
        this.encryptionAlgorithmParameters = encryptionAlgorithmParameters;
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
        sb.append(Pseudonymization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pseudonymizationTime");
        sb.append('=');
        sb.append(((this.pseudonymizationTime == null)?"<null>":this.pseudonymizationTime));
        sb.append(',');
        sb.append("stableIdentifierType");
        sb.append('=');
        sb.append(((this.stableIdentifierType == null)?"<null>":this.stableIdentifierType));
        sb.append(',');
        sb.append("stableIdentifierVersion");
        sb.append('=');
        sb.append(((this.stableIdentifierVersion == null)?"<null>":this.stableIdentifierVersion));
        sb.append(',');
        sb.append("encryptionAlgorithm");
        sb.append('=');
        sb.append(((this.encryptionAlgorithm == null)?"<null>":this.encryptionAlgorithm));
        sb.append(',');
        sb.append("encryptionKeyReference");
        sb.append('=');
        sb.append(((this.encryptionKeyReference == null)?"<null>":this.encryptionKeyReference));
        sb.append(',');
        sb.append("encryptionAlgorithmParameters");
        sb.append('=');
        sb.append(((this.encryptionAlgorithmParameters == null)?"<null>":this.encryptionAlgorithmParameters));
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
        result = ((result* 31)+((this.stableIdentifierType == null)? 0 :this.stableIdentifierType.hashCode()));
        result = ((result* 31)+((this.encryptionKeyReference == null)? 0 :this.encryptionKeyReference.hashCode()));
        result = ((result* 31)+((this.pseudonymizationTime == null)? 0 :this.pseudonymizationTime.hashCode()));
        result = ((result* 31)+((this.encryptionAlgorithmParameters == null)? 0 :this.encryptionAlgorithmParameters.hashCode()));
        result = ((result* 31)+((this.stableIdentifierVersion == null)? 0 :this.stableIdentifierVersion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.encryptionAlgorithm == null)? 0 :this.encryptionAlgorithm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pseudonymization) == false) {
            return false;
        }
        Pseudonymization rhs = ((Pseudonymization) other);
        return ((((((((this.stableIdentifierType == rhs.stableIdentifierType)||((this.stableIdentifierType!= null)&&this.stableIdentifierType.equals(rhs.stableIdentifierType)))&&((this.encryptionKeyReference == rhs.encryptionKeyReference)||((this.encryptionKeyReference!= null)&&this.encryptionKeyReference.equals(rhs.encryptionKeyReference))))&&((this.pseudonymizationTime == rhs.pseudonymizationTime)||((this.pseudonymizationTime!= null)&&this.pseudonymizationTime.equals(rhs.pseudonymizationTime))))&&((this.encryptionAlgorithmParameters == rhs.encryptionAlgorithmParameters)||((this.encryptionAlgorithmParameters!= null)&&this.encryptionAlgorithmParameters.equals(rhs.encryptionAlgorithmParameters))))&&((this.stableIdentifierVersion == rhs.stableIdentifierVersion)||((this.stableIdentifierVersion!= null)&&this.stableIdentifierVersion.equals(rhs.stableIdentifierVersion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.encryptionAlgorithm == rhs.encryptionAlgorithm)||((this.encryptionAlgorithm!= null)&&this.encryptionAlgorithm.equals(rhs.encryptionAlgorithm))));
    }

    public static class PseudonymizationBuilder
        extends Pseudonymization.PseudonymizationBuilderBase<Pseudonymization>
    {


        public PseudonymizationBuilder() {
            super();
        }

        public PseudonymizationBuilder(Date pseudonymizationTime, String stableIdentifierType, String stableIdentifierVersion, String encryptionAlgorithm, String encryptionKeyReference, List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters) {
            super(pseudonymizationTime, stableIdentifierType, stableIdentifierVersion, encryptionAlgorithm, encryptionKeyReference, encryptionAlgorithmParameters);
        }

    }

    public static abstract class PseudonymizationBuilderBase<T extends Pseudonymization >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public PseudonymizationBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Pseudonymization.PseudonymizationBuilder.class)) {
                this.instance = ((T) new Pseudonymization());
            }
        }

        @SuppressWarnings("unchecked")
        public PseudonymizationBuilderBase(Date pseudonymizationTime, String stableIdentifierType, String stableIdentifierVersion, String encryptionAlgorithm, String encryptionKeyReference, List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Pseudonymization.PseudonymizationBuilder.class)) {
                this.instance = ((T) new Pseudonymization(pseudonymizationTime, stableIdentifierType, stableIdentifierVersion, encryptionAlgorithm, encryptionKeyReference, encryptionAlgorithmParameters));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Pseudonymization.PseudonymizationBuilderBase withPseudonymizationTime(Date pseudonymizationTime) {
            ((Pseudonymization) this.instance).pseudonymizationTime = pseudonymizationTime;
            return this;
        }

        public Pseudonymization.PseudonymizationBuilderBase withStableIdentifierType(String stableIdentifierType) {
            ((Pseudonymization) this.instance).stableIdentifierType = stableIdentifierType;
            return this;
        }

        public Pseudonymization.PseudonymizationBuilderBase withStableIdentifierVersion(String stableIdentifierVersion) {
            ((Pseudonymization) this.instance).stableIdentifierVersion = stableIdentifierVersion;
            return this;
        }

        public Pseudonymization.PseudonymizationBuilderBase withEncryptionAlgorithm(String encryptionAlgorithm) {
            ((Pseudonymization) this.instance).encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        public Pseudonymization.PseudonymizationBuilderBase withEncryptionKeyReference(String encryptionKeyReference) {
            ((Pseudonymization) this.instance).encryptionKeyReference = encryptionKeyReference;
            return this;
        }

        public Pseudonymization.PseudonymizationBuilderBase withEncryptionAlgorithmParameters(List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters) {
            ((Pseudonymization) this.instance).encryptionAlgorithmParameters = encryptionAlgorithmParameters;
            return this;
        }

        public Pseudonymization.PseudonymizationBuilderBase withAdditionalProperty(String name, Object value) {
            ((Pseudonymization) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
