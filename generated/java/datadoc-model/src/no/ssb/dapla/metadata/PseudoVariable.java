
package no.ssb.dapla.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A pseudonymized variable in the dataset.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "short_name",
        "data_element_path",
        "data_element_pattern",
        "stable_identifier_type",
        "stable_identifier_version",
        "encryption_algorithm",
        "encryption_key_reference",
        "encryption_algorithm_parameters",
        "source_variable",
        "source_variable_datatype"
})
@Generated("jsonschema2pojo")
public class PseudoVariable implements Serializable {

    /**
     * Short name
     * <p>
     * Physical name of the variable in the dataset. Should match the recommended
     * short name. Alphanumeric. Limited to a-z, A-Z, 0-9, - (hyphen) and _
     * (underscore)
     * (Required)
     *
     */
    @JsonProperty("short_name")
    @JsonPropertyDescription("Physical name of the variable in the dataset. Should match the recommended short name.")
    @NotNull
    private String shortName;
    /**
     * Data element path
     * <p>
     * Path to a single, concrete data element in the dataset.Only for use in
     * heirarchical datasets. Use JsonPath dot-notation to specify the path.
     *
     */
    @JsonProperty("data_element_path")
    @JsonPropertyDescription("Path to a single, concrete data element in the dataset.")
    private String dataElementPath;
    /**
     * Data element pattern
     * <p>
     * Pattern which matched this variable (if a pattern was used).Typically a glob
     * pattern.
     *
     */
    @JsonProperty("data_element_pattern")
    @JsonPropertyDescription("Pattern which matched this variable (if a pattern was used).")
    private String dataElementPattern;
    /**
     * Stable identifier type
     * <p>
     * Type of stable identifier the variable was mapped to prior to
     * pseudonymization.Only relevant when the variable is mapped to a stable
     * identifier.
     *
     */
    @JsonProperty("stable_identifier_type")
    @JsonPropertyDescription("Type of stable identifier the variable was mapped to prior to pseudonymization.")
    private String stableIdentifierType;
    /**
     * Stable identifier version
     * <p>
     * Version of stable identifier the variable was mapped to prior to
     * pseudonymization.Only relevant when the variable is mapped to a stable
     * identifier.
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
    /**
     * Source variable
     * <p>
     * Short name of the source variable Only relevant when this differs from the
     * short name of the variable.
     *
     */
    @JsonProperty("source_variable")
    @JsonPropertyDescription("Short name of the source variable")
    private String sourceVariable;
    /**
     * Source variable data type
     * <p>
     * Data type of the variable prior to pseudonymization.
     *
     */
    @JsonProperty("source_variable_datatype")
    @JsonPropertyDescription("Data type of the variable prior to pseudonymization.")
    private PseudoVariable.SourceVariableDataType sourceVariableDatatype;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5828695100678287117L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PseudoVariable() {
    }

    /**
     *
     * @param stableIdentifierType
     *                                      Stable identifier type. Type of stable
     *                                      identifier the variable was mapped to
     *                                      prior to pseudonymization.
     * @param encryptionKeyReference
     *                                      Encryption key reference. Name of or
     *                                      reference to the encryption key used to
     *                                      pseudonymize the variable.
     * @param dataElementPath
     *                                      Data element path. Path to a single,
     *                                      concrete data element in the dataset.
     * @param sourceVariable
     *                                      Source variable. Short name of the
     *                                      source variable.
     * @param sourceVariableDatatype
     *                                      Source variable data type. Data type of
     *                                      the variable prior to pseudonymization.
     * @param encryptionAlgorithmParameters
     *                                      Encryption algorithm parameters.
     *                                      Parameters supplied to the encryption
     *                                      algorithm.
     * @param dataElementPattern
     *                                      Data element pattern. Pattern which
     *                                      matched this variable (if a pattern was
     *                                      used).
     * @param stableIdentifierVersion
     *                                      Stable identifier version. Version of
     *                                      stable identifier the variable was
     *                                      mapped to prior to pseudonymization.
     * @param shortName
     *                                      Short name. Physical name of the
     *                                      variable in the dataset. Should match
     *                                      the recommended short name.
     * @param encryptionAlgorithm
     *                                      Encryption algorithm. The encryption
     *                                      algorithm used to pseudonymize the
     *                                      variable.
     */
    public PseudoVariable(String shortName, String dataElementPath, String dataElementPattern,
            String stableIdentifierType, String stableIdentifierVersion, String encryptionAlgorithm,
            String encryptionKeyReference, List<EncryptionAlgorithmParameter> encryptionAlgorithmParameters,
            String sourceVariable, PseudoVariable.SourceVariableDataType sourceVariableDatatype) {
        super();
        this.shortName = shortName;
        this.dataElementPath = dataElementPath;
        this.dataElementPattern = dataElementPattern;
        this.stableIdentifierType = stableIdentifierType;
        this.stableIdentifierVersion = stableIdentifierVersion;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKeyReference = encryptionKeyReference;
        this.encryptionAlgorithmParameters = encryptionAlgorithmParameters;
        this.sourceVariable = sourceVariable;
        this.sourceVariableDatatype = sourceVariableDatatype;
    }

    /**
     * Short name
     * <p>
     * Physical name of the variable in the dataset. Should match the recommended
     * short name. Alphanumeric. Limited to a-z, A-Z, 0-9, - (hyphen) and _
     * (underscore)
     * (Required)
     *
     */
    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short name
     * <p>
     * Physical name of the variable in the dataset. Should match the recommended
     * short name. Alphanumeric. Limited to a-z, A-Z, 0-9, - (hyphen) and _
     * (underscore)
     * (Required)
     *
     */
    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Data element path
     * <p>
     * Path to a single, concrete data element in the dataset.Only for use in
     * heirarchical datasets. Use JsonPath dot-notation to specify the path.
     *
     */
    @JsonProperty("data_element_path")
    public String getDataElementPath() {
        return dataElementPath;
    }

    /**
     * Data element path
     * <p>
     * Path to a single, concrete data element in the dataset.Only for use in
     * heirarchical datasets. Use JsonPath dot-notation to specify the path.
     *
     */
    @JsonProperty("data_element_path")
    public void setDataElementPath(String dataElementPath) {
        this.dataElementPath = dataElementPath;
    }

    /**
     * Data element pattern
     * <p>
     * Pattern which matched this variable (if a pattern was used).Typically a glob
     * pattern.
     *
     */
    @JsonProperty("data_element_pattern")
    public String getDataElementPattern() {
        return dataElementPattern;
    }

    /**
     * Data element pattern
     * <p>
     * Pattern which matched this variable (if a pattern was used).Typically a glob
     * pattern.
     *
     */
    @JsonProperty("data_element_pattern")
    public void setDataElementPattern(String dataElementPattern) {
        this.dataElementPattern = dataElementPattern;
    }

    /**
     * Stable identifier type
     * <p>
     * Type of stable identifier the variable was mapped to prior to
     * pseudonymization.Only relevant when the variable is mapped to a stable
     * identifier.
     *
     */
    @JsonProperty("stable_identifier_type")
    public String getStableIdentifierType() {
        return stableIdentifierType;
    }

    /**
     * Stable identifier type
     * <p>
     * Type of stable identifier the variable was mapped to prior to
     * pseudonymization.Only relevant when the variable is mapped to a stable
     * identifier.
     *
     */
    @JsonProperty("stable_identifier_type")
    public void setStableIdentifierType(String stableIdentifierType) {
        this.stableIdentifierType = stableIdentifierType;
    }

    /**
     * Stable identifier version
     * <p>
     * Version of stable identifier the variable was mapped to prior to
     * pseudonymization.Only relevant when the variable is mapped to a stable
     * identifier.
     *
     */
    @JsonProperty("stable_identifier_version")
    public String getStableIdentifierVersion() {
        return stableIdentifierVersion;
    }

    /**
     * Stable identifier version
     * <p>
     * Version of stable identifier the variable was mapped to prior to
     * pseudonymization.Only relevant when the variable is mapped to a stable
     * identifier.
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

    /**
     * Source variable
     * <p>
     * Short name of the source variable Only relevant when this differs from the
     * short name of the variable.
     *
     */
    @JsonProperty("source_variable")
    public String getSourceVariable() {
        return sourceVariable;
    }

    /**
     * Source variable
     * <p>
     * Short name of the source variable Only relevant when this differs from the
     * short name of the variable.
     *
     */
    @JsonProperty("source_variable")
    public void setSourceVariable(String sourceVariable) {
        this.sourceVariable = sourceVariable;
    }

    /**
     * Source variable data type
     * <p>
     * Data type of the variable prior to pseudonymization.
     *
     */
    @JsonProperty("source_variable_datatype")
    public PseudoVariable.SourceVariableDataType getSourceVariableDatatype() {
        return sourceVariableDatatype;
    }

    /**
     * Source variable data type
     * <p>
     * Data type of the variable prior to pseudonymization.
     *
     */
    @JsonProperty("source_variable_datatype")
    public void setSourceVariableDatatype(PseudoVariable.SourceVariableDataType sourceVariableDatatype) {
        this.sourceVariableDatatype = sourceVariableDatatype;
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
        sb.append(PseudoVariable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null) ? "<null>" : this.shortName));
        sb.append(',');
        sb.append("dataElementPath");
        sb.append('=');
        sb.append(((this.dataElementPath == null) ? "<null>" : this.dataElementPath));
        sb.append(',');
        sb.append("dataElementPattern");
        sb.append('=');
        sb.append(((this.dataElementPattern == null) ? "<null>" : this.dataElementPattern));
        sb.append(',');
        sb.append("stableIdentifierType");
        sb.append('=');
        sb.append(((this.stableIdentifierType == null) ? "<null>" : this.stableIdentifierType));
        sb.append(',');
        sb.append("stableIdentifierVersion");
        sb.append('=');
        sb.append(((this.stableIdentifierVersion == null) ? "<null>" : this.stableIdentifierVersion));
        sb.append(',');
        sb.append("encryptionAlgorithm");
        sb.append('=');
        sb.append(((this.encryptionAlgorithm == null) ? "<null>" : this.encryptionAlgorithm));
        sb.append(',');
        sb.append("encryptionKeyReference");
        sb.append('=');
        sb.append(((this.encryptionKeyReference == null) ? "<null>" : this.encryptionKeyReference));
        sb.append(',');
        sb.append("encryptionAlgorithmParameters");
        sb.append('=');
        sb.append(((this.encryptionAlgorithmParameters == null) ? "<null>" : this.encryptionAlgorithmParameters));
        sb.append(',');
        sb.append("sourceVariable");
        sb.append('=');
        sb.append(((this.sourceVariable == null) ? "<null>" : this.sourceVariable));
        sb.append(',');
        sb.append("sourceVariableDatatype");
        sb.append('=');
        sb.append(((this.sourceVariableDatatype == null) ? "<null>" : this.sourceVariableDatatype));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.stableIdentifierType == null) ? 0 : this.stableIdentifierType.hashCode()));
        result = ((result * 31) + ((this.encryptionKeyReference == null) ? 0 : this.encryptionKeyReference.hashCode()));
        result = ((result * 31) + ((this.dataElementPath == null) ? 0 : this.dataElementPath.hashCode()));
        result = ((result * 31) + ((this.sourceVariable == null) ? 0 : this.sourceVariable.hashCode()));
        result = ((result * 31) + ((this.sourceVariableDatatype == null) ? 0 : this.sourceVariableDatatype.hashCode()));
        result = ((result * 31)
                + ((this.encryptionAlgorithmParameters == null) ? 0 : this.encryptionAlgorithmParameters.hashCode()));
        result = ((result * 31) + ((this.dataElementPattern == null) ? 0 : this.dataElementPattern.hashCode()));
        result = ((result * 31)
                + ((this.stableIdentifierVersion == null) ? 0 : this.stableIdentifierVersion.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.shortName == null) ? 0 : this.shortName.hashCode()));
        result = ((result * 31) + ((this.encryptionAlgorithm == null) ? 0 : this.encryptionAlgorithm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PseudoVariable) == false) {
            return false;
        }
        PseudoVariable rhs = ((PseudoVariable) other);
        return ((((((((((((this.stableIdentifierType == rhs.stableIdentifierType)
                || ((this.stableIdentifierType != null) && this.stableIdentifierType.equals(rhs.stableIdentifierType)))
                && ((this.encryptionKeyReference == rhs.encryptionKeyReference)
                        || ((this.encryptionKeyReference != null)
                                && this.encryptionKeyReference.equals(rhs.encryptionKeyReference))))
                && ((this.dataElementPath == rhs.dataElementPath)
                        || ((this.dataElementPath != null) && this.dataElementPath.equals(rhs.dataElementPath))))
                && ((this.sourceVariable == rhs.sourceVariable)
                        || ((this.sourceVariable != null) && this.sourceVariable.equals(rhs.sourceVariable))))
                && ((this.sourceVariableDatatype == rhs.sourceVariableDatatype)
                        || ((this.sourceVariableDatatype != null)
                                && this.sourceVariableDatatype.equals(rhs.sourceVariableDatatype))))
                && ((this.encryptionAlgorithmParameters == rhs.encryptionAlgorithmParameters)
                        || ((this.encryptionAlgorithmParameters != null)
                                && this.encryptionAlgorithmParameters.equals(rhs.encryptionAlgorithmParameters))))
                && ((this.dataElementPattern == rhs.dataElementPattern) || ((this.dataElementPattern != null)
                        && this.dataElementPattern.equals(rhs.dataElementPattern))))
                && ((this.stableIdentifierVersion == rhs.stableIdentifierVersion)
                        || ((this.stableIdentifierVersion != null)
                                && this.stableIdentifierVersion.equals(rhs.stableIdentifierVersion))))
                && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties))))
                && ((this.shortName == rhs.shortName)
                        || ((this.shortName != null) && this.shortName.equals(rhs.shortName))))
                && ((this.encryptionAlgorithm == rhs.encryptionAlgorithm) || ((this.encryptionAlgorithm != null)
                        && this.encryptionAlgorithm.equals(rhs.encryptionAlgorithm))));
    }

    /**
     * Source variable data type
     * <p>
     * Data type of the variable prior to pseudonymization.
     *
     */
    @Generated("jsonschema2pojo")
    public enum SourceVariableDataType {

        STRING("STRING"),
        INTEGER("INTEGER"),
        FLOAT("FLOAT"),
        DATETIME("DATETIME");

        private final String value;
        private final static Map<String, PseudoVariable.SourceVariableDataType> CONSTANTS = new HashMap<String, PseudoVariable.SourceVariableDataType>();

        static {
            for (PseudoVariable.SourceVariableDataType c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SourceVariableDataType(String value) {
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
        public static PseudoVariable.SourceVariableDataType fromValue(String value) {
            PseudoVariable.SourceVariableDataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
