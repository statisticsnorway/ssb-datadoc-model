
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "very_short_name",
    "assessment",
    "dataset_status",
    "dataset_state",
    "name",
    "description",
    "data_source",
    "register_uri",
    "population_description",
    "version",
    "version_description",
    "unit_type",
    "temporality_type",
    "subject_field",
    "keyword",
    "spatial_coverage_description",
    "id",
    "owner",
    "file_path",
    "metadata_created_date",
    "metadata_created_by",
    "metadata_last_updated_date",
    "metadata_last_updated_by",
    "contains_data_from",
    "contains_data_until"
})
@Generated("jsonschema2pojo")
public class Dataset implements Serializable
{

    /**
     * Short name
     * <p>
     * Name of (physical) data file, data table or dataset Alphanumeric limited to a-z, A-Z, 0-9, - (hyphen) and _ (underscore)
     * 
     */
    @JsonProperty("very_short_name")
    @JsonPropertyDescription("Name of (physical) data file, data table or dataset")
    private String veryShortName;
    /**
     * Assessment
     * <p>
     * Value assessment (sensitivity classification) for the data set
     * (Required)
     * 
     */
    @JsonProperty("assessment")
    @JsonPropertyDescription("Value assessment (sensitivity classification) for the data set")
    @NotNull
    private Dataset.Assessment assessment;
    /**
     * Data set status
     * <p>
     * Life cycle for data set
     * (Required)
     * 
     */
    @JsonProperty("dataset_status")
    @JsonPropertyDescription("Life cycle for data set")
    @NotNull
    private Dataset.DatasetStatus datasetStatus;
    /**
     * Data set state
     * <p>
     * Steady state of data
     * (Required)
     * 
     */
    @JsonProperty("dataset_state")
    @JsonPropertyDescription("Steady state of data")
    @NotNull
    private Dataset.DatasetState datasetState;
    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("name")
    @Valid
    @NotNull
    private LanguageStringType name;
    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("description")
    @Valid
    @NotNull
    private LanguageStringType description;
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("data_source")
    @Valid
    private LanguageStringType dataSource;
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("register_uri")
    @Valid
    private LanguageStringType registerUri;
    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("population_description")
    @Valid
    @NotNull
    private LanguageStringType populationDescription;
    /**
     * Version
     * <p>
     * Version of data set
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of data set")
    @NotNull
    private String version;
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("version_description")
    @Valid
    private LanguageStringType versionDescription;
    /**
     * Unit type
     * <p>
     * Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * (Required)
     * 
     */
    @JsonProperty("unit_type")
    @JsonPropertyDescription("Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter")
    @NotNull
    private Dataset.UnitType unitType;
    /**
     * Reusable temporalitytype type
     * 
     */
    @JsonProperty("temporality_type")
    private Dataset.TemporalityTypeType temporalityType;
    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("subject_field")
    @Valid
    @NotNull
    private LanguageStringType subjectField;
    /**
     * Keyword(s)
     * <p>
     * A list of searchable keywords that can contribute to the development of effective filtering and search services.
     * 
     */
    @JsonProperty("keyword")
    @JsonPropertyDescription("A list of searchable keywords that can contribute to the development of effective filtering and search services.")
    @Valid
    private List<String> keyword = new ArrayList<String>();
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("spatial_coverage_description")
    @Valid
    private LanguageStringType spatialCoverageDescription;
    /**
     * Identifier
     * <p>
     * Unique identifier for the data set UUID specified by RFC4122
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier for the data set")
    @NotNull
    private UUID id;
    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("owner")
    @Valid
    @NotNull
    private LanguageStringType owner;
    /**
     * File path
     * <p>
     * The file path contains the data set's name and the path to where it is stored
     * (Required)
     * 
     */
    @JsonProperty("file_path")
    @JsonPropertyDescription("The file path contains the data set's name and the path to where it is stored")
    @NotNull
    private String filePath;
    /**
     * Metadata created date
     * <p>
     * Created date for metadata about the data set
     * (Required)
     * 
     */
    @JsonProperty("metadata_created_date")
    @JsonPropertyDescription("Created date for metadata about the data set")
    @NotNull
    private Date metadataCreatedDate;
    /**
     * Metadata created by
     * <p>
     * Created by identifiable person.
     * (Required)
     * 
     */
    @JsonProperty("metadata_created_by")
    @JsonPropertyDescription("Created by identifiable person.")
    @NotNull
    private String metadataCreatedBy;
    /**
     * Metadata last updated date
     * <p>
     * Last updated date for metadata about the dataset
     * (Required)
     * 
     */
    @JsonProperty("metadata_last_updated_date")
    @JsonPropertyDescription("Last updated date for metadata about the dataset")
    @NotNull
    private Date metadataLastUpdatedDate;
    /**
     * Metadata last updated by
     * <p>
     * Last change made by identifiable person. 
     * (Required)
     * 
     */
    @JsonProperty("metadata_last_updated_by")
    @JsonPropertyDescription("Last change made by identifiable person. ")
    @NotNull
    private String metadataLastUpdatedBy;
    /**
     * Contains data from
     * <p>
     * The data set contains data from date/time
     * 
     */
    @JsonProperty("contains_data_from")
    @JsonPropertyDescription("The data set contains data from date/time")
    private String containsDataFrom;
    /**
     * Contains data up until
     * <p>
     * The data set contains data up until date/time
     * 
     */
    @JsonProperty("contains_data_until")
    @JsonPropertyDescription("The data set contains data up until date/time")
    private String containsDataUntil;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6722405258912007109L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dataset() {
    }

    /**
     * 
     * @param versionDescription
     *     Version description. Dataset version information in the form of descriptive text.
     * @param containsDataUntil
     *     Contains data up until. The data set contains data up until date/time.
     * @param datasetState
     *     Data set state. Steady state of data.
     * @param veryShortName
     *     Short name. Name of (physical) data file, data table or dataset.
     * @param datasetStatus
     *     Data set status. Life cycle for data set.
     * @param description
     *     Description. Free text description of the data set.
     * @param populationDescription
     *     Description of population. Description of the population covered in the data set. Includes unit type, spatial coverage and period of time.
     * @param metadataLastUpdatedBy
     *     Metadata last updated by. Last change made by identifiable person. .
     * @param temporalityType
     *     Temporality type. Temporality type. Either for the instance variable or the data set.
     * @param subjectField
     *     Subject field. Primary area of statistics in which the data set is included.
     * @param unitType
     *     Unit type. Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter.
     * @param assessment
     *     Assessment. Value assessment (sensitivity classification) for the data set.
     * @param registerUri
     *     Register. Link to register.
     * @param spatialCoverageDescription
     *     Spatial coverage description. Description of the data set's spatial coverage.
     * @param metadataCreatedBy
     *     Metadata created by. Created by identifiable person.
     * @param id
     *     Identifier. Unique identifier for the data set.
     * @param keyword
     *     Keyword(s). A list of searchable keywords that can contribute to the development of effective filtering and search services.
     * @param owner
     *     Owner. Owner of the data set (responsible division in Statistics Norway). See also Classification of organisational units https://www.ssb.no/en/klass/klassifikasjoner/83.
     * @param containsDataFrom
     *     Contains data from. The data set contains data from date/time.
     * @param filePath
     *     File path. The file path contains the data set's name and the path to where it is stored.
     * @param metadataLastUpdatedDate
     *     Metadata last updated date. Last updated date for metadata about the dataset.
     * @param version
     *     Version. Version of data set.
     * @param metadataCreatedDate
     *     Metadata created date. Created date for metadata about the data set.
     * @param name
     *     Name. Name of data set.
     * @param dataSource
     *     Data source. Data source. Set either for the data set or instance variable.
     */
    public Dataset(String veryShortName, Dataset.Assessment assessment, Dataset.DatasetStatus datasetStatus, Dataset.DatasetState datasetState, LanguageStringType name, LanguageStringType description, LanguageStringType dataSource, LanguageStringType registerUri, LanguageStringType populationDescription, String version, LanguageStringType versionDescription, Dataset.UnitType unitType, Dataset.TemporalityTypeType temporalityType, LanguageStringType subjectField, List<String> keyword, LanguageStringType spatialCoverageDescription, UUID id, LanguageStringType owner, String filePath, Date metadataCreatedDate, String metadataCreatedBy, Date metadataLastUpdatedDate, String metadataLastUpdatedBy, String containsDataFrom, String containsDataUntil) {
        super();
        this.veryShortName = veryShortName;
        this.assessment = assessment;
        this.datasetStatus = datasetStatus;
        this.datasetState = datasetState;
        this.name = name;
        this.description = description;
        this.dataSource = dataSource;
        this.registerUri = registerUri;
        this.populationDescription = populationDescription;
        this.version = version;
        this.versionDescription = versionDescription;
        this.unitType = unitType;
        this.temporalityType = temporalityType;
        this.subjectField = subjectField;
        this.keyword = keyword;
        this.spatialCoverageDescription = spatialCoverageDescription;
        this.id = id;
        this.owner = owner;
        this.filePath = filePath;
        this.metadataCreatedDate = metadataCreatedDate;
        this.metadataCreatedBy = metadataCreatedBy;
        this.metadataLastUpdatedDate = metadataLastUpdatedDate;
        this.metadataLastUpdatedBy = metadataLastUpdatedBy;
        this.containsDataFrom = containsDataFrom;
        this.containsDataUntil = containsDataUntil;
    }

    /**
     * Short name
     * <p>
     * Name of (physical) data file, data table or dataset Alphanumeric limited to a-z, A-Z, 0-9, - (hyphen) and _ (underscore)
     * 
     */
    @JsonProperty("very_short_name")
    public String getVeryShortName() {
        return veryShortName;
    }

    /**
     * Short name
     * <p>
     * Name of (physical) data file, data table or dataset Alphanumeric limited to a-z, A-Z, 0-9, - (hyphen) and _ (underscore)
     * 
     */
    @JsonProperty("very_short_name")
    public void setVeryShortName(String veryShortName) {
        this.veryShortName = veryShortName;
    }

    /**
     * Assessment
     * <p>
     * Value assessment (sensitivity classification) for the data set
     * (Required)
     * 
     */
    @JsonProperty("assessment")
    public Dataset.Assessment getAssessment() {
        return assessment;
    }

    /**
     * Assessment
     * <p>
     * Value assessment (sensitivity classification) for the data set
     * (Required)
     * 
     */
    @JsonProperty("assessment")
    public void setAssessment(Dataset.Assessment assessment) {
        this.assessment = assessment;
    }

    /**
     * Data set status
     * <p>
     * Life cycle for data set
     * (Required)
     * 
     */
    @JsonProperty("dataset_status")
    public Dataset.DatasetStatus getDatasetStatus() {
        return datasetStatus;
    }

    /**
     * Data set status
     * <p>
     * Life cycle for data set
     * (Required)
     * 
     */
    @JsonProperty("dataset_status")
    public void setDatasetStatus(Dataset.DatasetStatus datasetStatus) {
        this.datasetStatus = datasetStatus;
    }

    /**
     * Data set state
     * <p>
     * Steady state of data
     * (Required)
     * 
     */
    @JsonProperty("dataset_state")
    public Dataset.DatasetState getDatasetState() {
        return datasetState;
    }

    /**
     * Data set state
     * <p>
     * Steady state of data
     * (Required)
     * 
     */
    @JsonProperty("dataset_state")
    public void setDatasetState(Dataset.DatasetState datasetState) {
        this.datasetState = datasetState;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("name")
    public LanguageStringType getName() {
        return name;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(LanguageStringType name) {
        this.name = name;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public LanguageStringType getDescription() {
        return description;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(LanguageStringType description) {
        this.description = description;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("data_source")
    public LanguageStringType getDataSource() {
        return dataSource;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("data_source")
    public void setDataSource(LanguageStringType dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("register_uri")
    public LanguageStringType getRegisterUri() {
        return registerUri;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("register_uri")
    public void setRegisterUri(LanguageStringType registerUri) {
        this.registerUri = registerUri;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("population_description")
    public LanguageStringType getPopulationDescription() {
        return populationDescription;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("population_description")
    public void setPopulationDescription(LanguageStringType populationDescription) {
        this.populationDescription = populationDescription;
    }

    /**
     * Version
     * <p>
     * Version of data set
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Version
     * <p>
     * Version of data set
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("version_description")
    public LanguageStringType getVersionDescription() {
        return versionDescription;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("version_description")
    public void setVersionDescription(LanguageStringType versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * Unit type
     * <p>
     * Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * (Required)
     * 
     */
    @JsonProperty("unit_type")
    public Dataset.UnitType getUnitType() {
        return unitType;
    }

    /**
     * Unit type
     * <p>
     * Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * (Required)
     * 
     */
    @JsonProperty("unit_type")
    public void setUnitType(Dataset.UnitType unitType) {
        this.unitType = unitType;
    }

    /**
     * Reusable temporalitytype type
     * 
     */
    @JsonProperty("temporality_type")
    public Dataset.TemporalityTypeType getTemporalityType() {
        return temporalityType;
    }

    /**
     * Reusable temporalitytype type
     * 
     */
    @JsonProperty("temporality_type")
    public void setTemporalityType(Dataset.TemporalityTypeType temporalityType) {
        this.temporalityType = temporalityType;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("subject_field")
    public LanguageStringType getSubjectField() {
        return subjectField;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("subject_field")
    public void setSubjectField(LanguageStringType subjectField) {
        this.subjectField = subjectField;
    }

    /**
     * Keyword(s)
     * <p>
     * A list of searchable keywords that can contribute to the development of effective filtering and search services.
     * 
     */
    @JsonProperty("keyword")
    public List<String> getKeyword() {
        return keyword;
    }

    /**
     * Keyword(s)
     * <p>
     * A list of searchable keywords that can contribute to the development of effective filtering and search services.
     * 
     */
    @JsonProperty("keyword")
    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("spatial_coverage_description")
    public LanguageStringType getSpatialCoverageDescription() {
        return spatialCoverageDescription;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("spatial_coverage_description")
    public void setSpatialCoverageDescription(LanguageStringType spatialCoverageDescription) {
        this.spatialCoverageDescription = spatialCoverageDescription;
    }

    /**
     * Identifier
     * <p>
     * Unique identifier for the data set UUID specified by RFC4122
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Identifier
     * <p>
     * Unique identifier for the data set UUID specified by RFC4122
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public LanguageStringType getOwner() {
        return owner;
    }

    /**
     * Reusable langugage string type
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public void setOwner(LanguageStringType owner) {
        this.owner = owner;
    }

    /**
     * File path
     * <p>
     * The file path contains the data set's name and the path to where it is stored
     * (Required)
     * 
     */
    @JsonProperty("file_path")
    public String getFilePath() {
        return filePath;
    }

    /**
     * File path
     * <p>
     * The file path contains the data set's name and the path to where it is stored
     * (Required)
     * 
     */
    @JsonProperty("file_path")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Metadata created date
     * <p>
     * Created date for metadata about the data set
     * (Required)
     * 
     */
    @JsonProperty("metadata_created_date")
    public Date getMetadataCreatedDate() {
        return metadataCreatedDate;
    }

    /**
     * Metadata created date
     * <p>
     * Created date for metadata about the data set
     * (Required)
     * 
     */
    @JsonProperty("metadata_created_date")
    public void setMetadataCreatedDate(Date metadataCreatedDate) {
        this.metadataCreatedDate = metadataCreatedDate;
    }

    /**
     * Metadata created by
     * <p>
     * Created by identifiable person.
     * (Required)
     * 
     */
    @JsonProperty("metadata_created_by")
    public String getMetadataCreatedBy() {
        return metadataCreatedBy;
    }

    /**
     * Metadata created by
     * <p>
     * Created by identifiable person.
     * (Required)
     * 
     */
    @JsonProperty("metadata_created_by")
    public void setMetadataCreatedBy(String metadataCreatedBy) {
        this.metadataCreatedBy = metadataCreatedBy;
    }

    /**
     * Metadata last updated date
     * <p>
     * Last updated date for metadata about the dataset
     * (Required)
     * 
     */
    @JsonProperty("metadata_last_updated_date")
    public Date getMetadataLastUpdatedDate() {
        return metadataLastUpdatedDate;
    }

    /**
     * Metadata last updated date
     * <p>
     * Last updated date for metadata about the dataset
     * (Required)
     * 
     */
    @JsonProperty("metadata_last_updated_date")
    public void setMetadataLastUpdatedDate(Date metadataLastUpdatedDate) {
        this.metadataLastUpdatedDate = metadataLastUpdatedDate;
    }

    /**
     * Metadata last updated by
     * <p>
     * Last change made by identifiable person. 
     * (Required)
     * 
     */
    @JsonProperty("metadata_last_updated_by")
    public String getMetadataLastUpdatedBy() {
        return metadataLastUpdatedBy;
    }

    /**
     * Metadata last updated by
     * <p>
     * Last change made by identifiable person. 
     * (Required)
     * 
     */
    @JsonProperty("metadata_last_updated_by")
    public void setMetadataLastUpdatedBy(String metadataLastUpdatedBy) {
        this.metadataLastUpdatedBy = metadataLastUpdatedBy;
    }

    /**
     * Contains data from
     * <p>
     * The data set contains data from date/time
     * 
     */
    @JsonProperty("contains_data_from")
    public String getContainsDataFrom() {
        return containsDataFrom;
    }

    /**
     * Contains data from
     * <p>
     * The data set contains data from date/time
     * 
     */
    @JsonProperty("contains_data_from")
    public void setContainsDataFrom(String containsDataFrom) {
        this.containsDataFrom = containsDataFrom;
    }

    /**
     * Contains data up until
     * <p>
     * The data set contains data up until date/time
     * 
     */
    @JsonProperty("contains_data_until")
    public String getContainsDataUntil() {
        return containsDataUntil;
    }

    /**
     * Contains data up until
     * <p>
     * The data set contains data up until date/time
     * 
     */
    @JsonProperty("contains_data_until")
    public void setContainsDataUntil(String containsDataUntil) {
        this.containsDataUntil = containsDataUntil;
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
        sb.append(Dataset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("veryShortName");
        sb.append('=');
        sb.append(((this.veryShortName == null)?"<null>":this.veryShortName));
        sb.append(',');
        sb.append("assessment");
        sb.append('=');
        sb.append(((this.assessment == null)?"<null>":this.assessment));
        sb.append(',');
        sb.append("datasetStatus");
        sb.append('=');
        sb.append(((this.datasetStatus == null)?"<null>":this.datasetStatus));
        sb.append(',');
        sb.append("datasetState");
        sb.append('=');
        sb.append(((this.datasetState == null)?"<null>":this.datasetState));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("dataSource");
        sb.append('=');
        sb.append(((this.dataSource == null)?"<null>":this.dataSource));
        sb.append(',');
        sb.append("registerUri");
        sb.append('=');
        sb.append(((this.registerUri == null)?"<null>":this.registerUri));
        sb.append(',');
        sb.append("populationDescription");
        sb.append('=');
        sb.append(((this.populationDescription == null)?"<null>":this.populationDescription));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("versionDescription");
        sb.append('=');
        sb.append(((this.versionDescription == null)?"<null>":this.versionDescription));
        sb.append(',');
        sb.append("unitType");
        sb.append('=');
        sb.append(((this.unitType == null)?"<null>":this.unitType));
        sb.append(',');
        sb.append("temporalityType");
        sb.append('=');
        sb.append(((this.temporalityType == null)?"<null>":this.temporalityType));
        sb.append(',');
        sb.append("subjectField");
        sb.append('=');
        sb.append(((this.subjectField == null)?"<null>":this.subjectField));
        sb.append(',');
        sb.append("keyword");
        sb.append('=');
        sb.append(((this.keyword == null)?"<null>":this.keyword));
        sb.append(',');
        sb.append("spatialCoverageDescription");
        sb.append('=');
        sb.append(((this.spatialCoverageDescription == null)?"<null>":this.spatialCoverageDescription));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("filePath");
        sb.append('=');
        sb.append(((this.filePath == null)?"<null>":this.filePath));
        sb.append(',');
        sb.append("metadataCreatedDate");
        sb.append('=');
        sb.append(((this.metadataCreatedDate == null)?"<null>":this.metadataCreatedDate));
        sb.append(',');
        sb.append("metadataCreatedBy");
        sb.append('=');
        sb.append(((this.metadataCreatedBy == null)?"<null>":this.metadataCreatedBy));
        sb.append(',');
        sb.append("metadataLastUpdatedDate");
        sb.append('=');
        sb.append(((this.metadataLastUpdatedDate == null)?"<null>":this.metadataLastUpdatedDate));
        sb.append(',');
        sb.append("metadataLastUpdatedBy");
        sb.append('=');
        sb.append(((this.metadataLastUpdatedBy == null)?"<null>":this.metadataLastUpdatedBy));
        sb.append(',');
        sb.append("containsDataFrom");
        sb.append('=');
        sb.append(((this.containsDataFrom == null)?"<null>":this.containsDataFrom));
        sb.append(',');
        sb.append("containsDataUntil");
        sb.append('=');
        sb.append(((this.containsDataUntil == null)?"<null>":this.containsDataUntil));
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
        result = ((result* 31)+((this.versionDescription == null)? 0 :this.versionDescription.hashCode()));
        result = ((result* 31)+((this.containsDataUntil == null)? 0 :this.containsDataUntil.hashCode()));
        result = ((result* 31)+((this.datasetState == null)? 0 :this.datasetState.hashCode()));
        result = ((result* 31)+((this.veryShortName == null)? 0 :this.veryShortName.hashCode()));
        result = ((result* 31)+((this.datasetStatus == null)? 0 :this.datasetStatus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.populationDescription == null)? 0 :this.populationDescription.hashCode()));
        result = ((result* 31)+((this.metadataLastUpdatedBy == null)? 0 :this.metadataLastUpdatedBy.hashCode()));
        result = ((result* 31)+((this.temporalityType == null)? 0 :this.temporalityType.hashCode()));
        result = ((result* 31)+((this.subjectField == null)? 0 :this.subjectField.hashCode()));
        result = ((result* 31)+((this.unitType == null)? 0 :this.unitType.hashCode()));
        result = ((result* 31)+((this.assessment == null)? 0 :this.assessment.hashCode()));
        result = ((result* 31)+((this.registerUri == null)? 0 :this.registerUri.hashCode()));
        result = ((result* 31)+((this.spatialCoverageDescription == null)? 0 :this.spatialCoverageDescription.hashCode()));
        result = ((result* 31)+((this.metadataCreatedBy == null)? 0 :this.metadataCreatedBy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.containsDataFrom == null)? 0 :this.containsDataFrom.hashCode()));
        result = ((result* 31)+((this.filePath == null)? 0 :this.filePath.hashCode()));
        result = ((result* 31)+((this.metadataLastUpdatedDate == null)? 0 :this.metadataLastUpdatedDate.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.metadataCreatedDate == null)? 0 :this.metadataCreatedDate.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dataSource == null)? 0 :this.dataSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dataset) == false) {
            return false;
        }
        Dataset rhs = ((Dataset) other);
        return (((((((((((((((((((((((((((this.versionDescription == rhs.versionDescription)||((this.versionDescription!= null)&&this.versionDescription.equals(rhs.versionDescription)))&&((this.containsDataUntil == rhs.containsDataUntil)||((this.containsDataUntil!= null)&&this.containsDataUntil.equals(rhs.containsDataUntil))))&&((this.datasetState == rhs.datasetState)||((this.datasetState!= null)&&this.datasetState.equals(rhs.datasetState))))&&((this.veryShortName == rhs.veryShortName)||((this.veryShortName!= null)&&this.veryShortName.equals(rhs.veryShortName))))&&((this.datasetStatus == rhs.datasetStatus)||((this.datasetStatus!= null)&&this.datasetStatus.equals(rhs.datasetStatus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.populationDescription == rhs.populationDescription)||((this.populationDescription!= null)&&this.populationDescription.equals(rhs.populationDescription))))&&((this.metadataLastUpdatedBy == rhs.metadataLastUpdatedBy)||((this.metadataLastUpdatedBy!= null)&&this.metadataLastUpdatedBy.equals(rhs.metadataLastUpdatedBy))))&&((this.temporalityType == rhs.temporalityType)||((this.temporalityType!= null)&&this.temporalityType.equals(rhs.temporalityType))))&&((this.subjectField == rhs.subjectField)||((this.subjectField!= null)&&this.subjectField.equals(rhs.subjectField))))&&((this.unitType == rhs.unitType)||((this.unitType!= null)&&this.unitType.equals(rhs.unitType))))&&((this.assessment == rhs.assessment)||((this.assessment!= null)&&this.assessment.equals(rhs.assessment))))&&((this.registerUri == rhs.registerUri)||((this.registerUri!= null)&&this.registerUri.equals(rhs.registerUri))))&&((this.spatialCoverageDescription == rhs.spatialCoverageDescription)||((this.spatialCoverageDescription!= null)&&this.spatialCoverageDescription.equals(rhs.spatialCoverageDescription))))&&((this.metadataCreatedBy == rhs.metadataCreatedBy)||((this.metadataCreatedBy!= null)&&this.metadataCreatedBy.equals(rhs.metadataCreatedBy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.containsDataFrom == rhs.containsDataFrom)||((this.containsDataFrom!= null)&&this.containsDataFrom.equals(rhs.containsDataFrom))))&&((this.filePath == rhs.filePath)||((this.filePath!= null)&&this.filePath.equals(rhs.filePath))))&&((this.metadataLastUpdatedDate == rhs.metadataLastUpdatedDate)||((this.metadataLastUpdatedDate!= null)&&this.metadataLastUpdatedDate.equals(rhs.metadataLastUpdatedDate))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.metadataCreatedDate == rhs.metadataCreatedDate)||((this.metadataCreatedDate!= null)&&this.metadataCreatedDate.equals(rhs.metadataCreatedDate))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dataSource == rhs.dataSource)||((this.dataSource!= null)&&this.dataSource.equals(rhs.dataSource))));
    }


    /**
     * Assessment
     * <p>
     * Value assessment (sensitivity classification) for the data set
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Assessment {

        SENSITIVE("SENSITIVE"),
        PROTECTED("PROTECTED"),
        OPEN("OPEN");
        private final String value;
        private final static Map<String, Dataset.Assessment> CONSTANTS = new HashMap<String, Dataset.Assessment>();

        static {
            for (Dataset.Assessment c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Assessment(String value) {
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
        public static Dataset.Assessment fromValue(String value) {
            Dataset.Assessment constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Data set state
     * <p>
     * Steady state of data
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatasetState {

        SOURCE_DATA("SOURCE_DATA"),
        INPUT_DATA("INPUT_DATA"),
        PROCESSED_DATA("PROCESSED_DATA"),
        STATISTICS("STATISTICS"),
        OUTPUT_DATA("OUTPUT_DATA");
        private final String value;
        private final static Map<String, Dataset.DatasetState> CONSTANTS = new HashMap<String, Dataset.DatasetState>();

        static {
            for (Dataset.DatasetState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatasetState(String value) {
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
        public static Dataset.DatasetState fromValue(String value) {
            Dataset.DatasetState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Data set status
     * <p>
     * Life cycle for data set
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatasetStatus {

        DRAFT("DRAFT"),
        INTERNAL("INTERNAL"),
        EXTERNAL("EXTERNAL"),
        DEPRECATED("DEPRECATED");
        private final String value;
        private final static Map<String, Dataset.DatasetStatus> CONSTANTS = new HashMap<String, Dataset.DatasetStatus>();

        static {
            for (Dataset.DatasetStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatasetStatus(String value) {
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
        public static Dataset.DatasetStatus fromValue(String value) {
            Dataset.DatasetStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Reusable temporalitytype type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TemporalityTypeType {

        FIXED("FIXED"),
        STATUS("STATUS"),
        ACCUMULATED("ACCUMULATED"),
        EVENT("EVENT");
        private final String value;
        private final static Map<String, Dataset.TemporalityTypeType> CONSTANTS = new HashMap<String, Dataset.TemporalityTypeType>();

        static {
            for (Dataset.TemporalityTypeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TemporalityTypeType(String value) {
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
        public static Dataset.TemporalityTypeType fromValue(String value) {
            Dataset.TemporalityTypeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Unit type
     * <p>
     * Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * 
     */
    @Generated("jsonschema2pojo")
    public enum UnitType {

        ARBEIDSULYKKE("ARBEIDSULYKKE"),
        BOLIG("BOLIG"),
        BYGNING("BYGNING"),
        EIENDOM("EIENDOM"),
        FAMILIE("FAMILIE"),
        FORETAK("FORETAK"),
        FYLKE("FYLKE"),
        HAVNEANLOEP("HAVNEANLOEP"),
        HUSHOLDNING("HUSHOLDNING"),
        KJOERETOEY("KJOERETOEY"),
        KOMMUNE("KOMMUNE"),
        KURS("KURS"),
        LOVBRUDD("LOVBRUDD"),
        PERSON("PERSON"),
        STAT("STAT"),
        STORFE("STORFE"),
        TRAFIKKULYKKE("TRAFIKKULYKKE"),
        TRANSAKSJON("TRANSAKSJON"),
        VARE_TJENESTE("VARE_TJENESTE"),
        VERDIPAPIR("VERDIPAPIR"),
        VIRKSOMHET("VIRKSOMHET");
        private final String value;
        private final static Map<String, Dataset.UnitType> CONSTANTS = new HashMap<String, Dataset.UnitType>();

        static {
            for (Dataset.UnitType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UnitType(String value) {
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
        public static Dataset.UnitType fromValue(String value) {
            Dataset.UnitType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
