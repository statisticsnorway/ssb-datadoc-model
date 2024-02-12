
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
import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "short_name",
    "assessment",
    "dataset_status",
    "dataset_state",
    "name",
    "description",
    "data_source",
    "population_description",
    "version",
    "version_description",
    "unit_type",
    "temporality_type",
    "subject_field",
    "keyword",
    "spatial_coverage_description",
    "contains_personal_data",
    "use_restriction",
    "use_restriction_date",
    "custom_type",
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
     * (Required)
     * 
     */
    @JsonProperty("short_name")
    @JsonPropertyDescription("Name of (physical) data file, data table or dataset")
    @NotNull
    private String shortName;
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
    private Dataset.DataSetStatus datasetStatus;
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
    private Dataset.DataSetState datasetState;
    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("name")
    @Valid
    @NotNull
    private List<Object> name = new ArrayList<Object>();
    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("description")
    @Valid
    @NotNull
    private List<Object> description = new ArrayList<Object>();
    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("data_source")
    @Valid
    private List<Object> dataSource = new ArrayList<Object>();
    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("population_description")
    @Valid
    @NotNull
    private List<Object> populationDescription = new ArrayList<Object>();
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
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("version_description")
    @Valid
    private List<Object> versionDescription = new ArrayList<Object>();
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
     * Subject field
     * <p>
     * Primary area of statistics in which the data set is included
     * (Required)
     * 
     */
    @JsonProperty("subject_field")
    @JsonPropertyDescription("Primary area of statistics in which the data set is included")
    @NotNull
    private String subjectField;
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
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("spatial_coverage_description")
    @Valid
    private List<Object> spatialCoverageDescription = new ArrayList<Object>();
    /**
     * Contains personal data
     * <p>
     * Is there any personal data amongst this data (data set)?
     * (Required)
     * 
     */
    @JsonProperty("contains_personal_data")
    @JsonPropertyDescription("Is there any personal data amongst this data (data set)?")
    @NotNull
    private Boolean containsPersonalData;
    /**
     * Use restriction
     * <p>
     * Data set use restriction
     * 
     */
    @JsonProperty("use_restriction")
    @JsonPropertyDescription("Data set use restriction")
    private Dataset.UseRestriction useRestriction;
    /**
     * Use restriction date
     * <p>
     * Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * 
     */
    @JsonProperty("use_restriction_date")
    @JsonPropertyDescription("Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.")
    private Date useRestrictionDate;
    /**
     * Custom type for dataset metadata
     * <p>
     * Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * 
     */
    @JsonProperty("custom_type")
    @JsonPropertyDescription("Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).")
    @Valid
    private List<CustomType> customType = new ArrayList<CustomType>();
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
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("owner")
    @Valid
    @NotNull
    private List<Object> owner = new ArrayList<Object>();
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
    private final static long serialVersionUID = -7019746965862498234L;

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
     * @param useRestriction
     *     Use restriction. Data set use restriction.
     * @param containsPersonalData
     *     Contains personal data. Is there any personal data amongst this data (data set)?.
     * @param metadataLastUpdatedDate
     *     Metadata last updated date. Last updated date for metadata about the dataset.
     * @param version
     *     Version. Version of data set.
     * @param customType
     *     Custom type for dataset metadata. Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * @param metadataCreatedDate
     *     Metadata created date. Created date for metadata about the data set.
     * @param name
     *     Name. Name of data set.
     * @param useRestrictionDate
     *     Use restriction date. Use restriction date, eg. the date (deadline) for when data must be deleted/anonymised.
     * @param shortName
     *     Short name. Name of (physical) data file, data table or dataset.
     * @param dataSource
     *     Data source. Data source. Set either for the data set or instance variable.
     */
    public Dataset(String shortName, Dataset.Assessment assessment, Dataset.DataSetStatus datasetStatus, Dataset.DataSetState datasetState, List<Object> name, List<Object> description, List<Object> dataSource, List<Object> populationDescription, String version, List<Object> versionDescription, Dataset.UnitType unitType, Dataset.TemporalityTypeType temporalityType, String subjectField, List<String> keyword, List<Object> spatialCoverageDescription, Boolean containsPersonalData, Dataset.UseRestriction useRestriction, Date useRestrictionDate, List<CustomType> customType, UUID id, List<Object> owner, String filePath, Date metadataCreatedDate, String metadataCreatedBy, Date metadataLastUpdatedDate, String metadataLastUpdatedBy, String containsDataFrom, String containsDataUntil) {
        super();
        this.shortName = shortName;
        this.assessment = assessment;
        this.datasetStatus = datasetStatus;
        this.datasetState = datasetState;
        this.name = name;
        this.description = description;
        this.dataSource = dataSource;
        this.populationDescription = populationDescription;
        this.version = version;
        this.versionDescription = versionDescription;
        this.unitType = unitType;
        this.temporalityType = temporalityType;
        this.subjectField = subjectField;
        this.keyword = keyword;
        this.spatialCoverageDescription = spatialCoverageDescription;
        this.containsPersonalData = containsPersonalData;
        this.useRestriction = useRestriction;
        this.useRestrictionDate = useRestrictionDate;
        this.customType = customType;
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

    public static Dataset.DatasetBuilderBase builder() {
        return new Dataset.DatasetBuilder();
    }

    /**
     * Short name
     * <p>
     * Name of (physical) data file, data table or dataset Alphanumeric limited to a-z, A-Z, 0-9, - (hyphen) and _ (underscore)
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
     * Name of (physical) data file, data table or dataset Alphanumeric limited to a-z, A-Z, 0-9, - (hyphen) and _ (underscore)
     * (Required)
     * 
     */
    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
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
    public Dataset.DataSetStatus getDatasetStatus() {
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
    public void setDatasetStatus(Dataset.DataSetStatus datasetStatus) {
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
    public Dataset.DataSetState getDatasetState() {
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
    public void setDatasetState(Dataset.DataSetState datasetState) {
        this.datasetState = datasetState;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("name")
    public List<Object> getName() {
        return name;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(List<Object> name) {
        this.name = name;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public List<Object> getDescription() {
        return description;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(List<Object> description) {
        this.description = description;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("data_source")
    public List<Object> getDataSource() {
        return dataSource;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("data_source")
    public void setDataSource(List<Object> dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("population_description")
    public List<Object> getPopulationDescription() {
        return populationDescription;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("population_description")
    public void setPopulationDescription(List<Object> populationDescription) {
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
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("version_description")
    public List<Object> getVersionDescription() {
        return versionDescription;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("version_description")
    public void setVersionDescription(List<Object> versionDescription) {
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
     * Subject field
     * <p>
     * Primary area of statistics in which the data set is included
     * (Required)
     * 
     */
    @JsonProperty("subject_field")
    public String getSubjectField() {
        return subjectField;
    }

    /**
     * Subject field
     * <p>
     * Primary area of statistics in which the data set is included
     * (Required)
     * 
     */
    @JsonProperty("subject_field")
    public void setSubjectField(String subjectField) {
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
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("spatial_coverage_description")
    public List<Object> getSpatialCoverageDescription() {
        return spatialCoverageDescription;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("spatial_coverage_description")
    public void setSpatialCoverageDescription(List<Object> spatialCoverageDescription) {
        this.spatialCoverageDescription = spatialCoverageDescription;
    }

    /**
     * Contains personal data
     * <p>
     * Is there any personal data amongst this data (data set)?
     * (Required)
     * 
     */
    @JsonProperty("contains_personal_data")
    public Boolean getContainsPersonalData() {
        return containsPersonalData;
    }

    /**
     * Contains personal data
     * <p>
     * Is there any personal data amongst this data (data set)?
     * (Required)
     * 
     */
    @JsonProperty("contains_personal_data")
    public void setContainsPersonalData(Boolean containsPersonalData) {
        this.containsPersonalData = containsPersonalData;
    }

    /**
     * Use restriction
     * <p>
     * Data set use restriction
     * 
     */
    @JsonProperty("use_restriction")
    public Dataset.UseRestriction getUseRestriction() {
        return useRestriction;
    }

    /**
     * Use restriction
     * <p>
     * Data set use restriction
     * 
     */
    @JsonProperty("use_restriction")
    public void setUseRestriction(Dataset.UseRestriction useRestriction) {
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

    /**
     * Custom type for dataset metadata
     * <p>
     * Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * 
     */
    @JsonProperty("custom_type")
    public List<CustomType> getCustomType() {
        return customType;
    }

    /**
     * Custom type for dataset metadata
     * <p>
     * Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * 
     */
    @JsonProperty("custom_type")
    public void setCustomType(List<CustomType> customType) {
        this.customType = customType;
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
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public List<Object> getOwner() {
        return owner;
    }

    /**
     * Reusableb langugage string type
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public void setOwner(List<Object> owner) {
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
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
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
        sb.append("containsPersonalData");
        sb.append('=');
        sb.append(((this.containsPersonalData == null)?"<null>":this.containsPersonalData));
        sb.append(',');
        sb.append("useRestriction");
        sb.append('=');
        sb.append(((this.useRestriction == null)?"<null>":this.useRestriction));
        sb.append(',');
        sb.append("useRestrictionDate");
        sb.append('=');
        sb.append(((this.useRestrictionDate == null)?"<null>":this.useRestrictionDate));
        sb.append(',');
        sb.append("customType");
        sb.append('=');
        sb.append(((this.customType == null)?"<null>":this.customType));
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
        result = ((result* 31)+((this.datasetStatus == null)? 0 :this.datasetStatus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.populationDescription == null)? 0 :this.populationDescription.hashCode()));
        result = ((result* 31)+((this.metadataLastUpdatedBy == null)? 0 :this.metadataLastUpdatedBy.hashCode()));
        result = ((result* 31)+((this.temporalityType == null)? 0 :this.temporalityType.hashCode()));
        result = ((result* 31)+((this.subjectField == null)? 0 :this.subjectField.hashCode()));
        result = ((result* 31)+((this.unitType == null)? 0 :this.unitType.hashCode()));
        result = ((result* 31)+((this.assessment == null)? 0 :this.assessment.hashCode()));
        result = ((result* 31)+((this.spatialCoverageDescription == null)? 0 :this.spatialCoverageDescription.hashCode()));
        result = ((result* 31)+((this.metadataCreatedBy == null)? 0 :this.metadataCreatedBy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.containsDataFrom == null)? 0 :this.containsDataFrom.hashCode()));
        result = ((result* 31)+((this.filePath == null)? 0 :this.filePath.hashCode()));
        result = ((result* 31)+((this.useRestriction == null)? 0 :this.useRestriction.hashCode()));
        result = ((result* 31)+((this.containsPersonalData == null)? 0 :this.containsPersonalData.hashCode()));
        result = ((result* 31)+((this.metadataLastUpdatedDate == null)? 0 :this.metadataLastUpdatedDate.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.customType == null)? 0 :this.customType.hashCode()));
        result = ((result* 31)+((this.metadataCreatedDate == null)? 0 :this.metadataCreatedDate.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.useRestrictionDate == null)? 0 :this.useRestrictionDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
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
        return ((((((((((((((((((((((((((((((this.versionDescription == rhs.versionDescription)||((this.versionDescription!= null)&&this.versionDescription.equals(rhs.versionDescription)))&&((this.containsDataUntil == rhs.containsDataUntil)||((this.containsDataUntil!= null)&&this.containsDataUntil.equals(rhs.containsDataUntil))))&&((this.datasetState == rhs.datasetState)||((this.datasetState!= null)&&this.datasetState.equals(rhs.datasetState))))&&((this.datasetStatus == rhs.datasetStatus)||((this.datasetStatus!= null)&&this.datasetStatus.equals(rhs.datasetStatus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.populationDescription == rhs.populationDescription)||((this.populationDescription!= null)&&this.populationDescription.equals(rhs.populationDescription))))&&((this.metadataLastUpdatedBy == rhs.metadataLastUpdatedBy)||((this.metadataLastUpdatedBy!= null)&&this.metadataLastUpdatedBy.equals(rhs.metadataLastUpdatedBy))))&&((this.temporalityType == rhs.temporalityType)||((this.temporalityType!= null)&&this.temporalityType.equals(rhs.temporalityType))))&&((this.subjectField == rhs.subjectField)||((this.subjectField!= null)&&this.subjectField.equals(rhs.subjectField))))&&((this.unitType == rhs.unitType)||((this.unitType!= null)&&this.unitType.equals(rhs.unitType))))&&((this.assessment == rhs.assessment)||((this.assessment!= null)&&this.assessment.equals(rhs.assessment))))&&((this.spatialCoverageDescription == rhs.spatialCoverageDescription)||((this.spatialCoverageDescription!= null)&&this.spatialCoverageDescription.equals(rhs.spatialCoverageDescription))))&&((this.metadataCreatedBy == rhs.metadataCreatedBy)||((this.metadataCreatedBy!= null)&&this.metadataCreatedBy.equals(rhs.metadataCreatedBy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.containsDataFrom == rhs.containsDataFrom)||((this.containsDataFrom!= null)&&this.containsDataFrom.equals(rhs.containsDataFrom))))&&((this.filePath == rhs.filePath)||((this.filePath!= null)&&this.filePath.equals(rhs.filePath))))&&((this.useRestriction == rhs.useRestriction)||((this.useRestriction!= null)&&this.useRestriction.equals(rhs.useRestriction))))&&((this.containsPersonalData == rhs.containsPersonalData)||((this.containsPersonalData!= null)&&this.containsPersonalData.equals(rhs.containsPersonalData))))&&((this.metadataLastUpdatedDate == rhs.metadataLastUpdatedDate)||((this.metadataLastUpdatedDate!= null)&&this.metadataLastUpdatedDate.equals(rhs.metadataLastUpdatedDate))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.customType == rhs.customType)||((this.customType!= null)&&this.customType.equals(rhs.customType))))&&((this.metadataCreatedDate == rhs.metadataCreatedDate)||((this.metadataCreatedDate!= null)&&this.metadataCreatedDate.equals(rhs.metadataCreatedDate))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.useRestrictionDate == rhs.useRestrictionDate)||((this.useRestrictionDate!= null)&&this.useRestrictionDate.equals(rhs.useRestrictionDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.dataSource == rhs.dataSource)||((this.dataSource!= null)&&this.dataSource.equals(rhs.dataSource))));
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

    public static class DatasetBuilder
        extends Dataset.DatasetBuilderBase<Dataset>
    {


        public DatasetBuilder() {
            super();
        }

        public DatasetBuilder(String shortName, Dataset.Assessment assessment, Dataset.DataSetStatus datasetStatus, Dataset.DataSetState datasetState, List<Object> name, List<Object> description, List<Object> dataSource, List<Object> populationDescription, String version, List<Object> versionDescription, Dataset.UnitType unitType, Dataset.TemporalityTypeType temporalityType, String subjectField, List<String> keyword, List<Object> spatialCoverageDescription, Boolean containsPersonalData, Dataset.UseRestriction useRestriction, Date useRestrictionDate, List<CustomType> customType, UUID id, List<Object> owner, String filePath, Date metadataCreatedDate, String metadataCreatedBy, Date metadataLastUpdatedDate, String metadataLastUpdatedBy, String containsDataFrom, String containsDataUntil) {
            super(shortName, assessment, datasetStatus, datasetState, name, description, dataSource, populationDescription, version, versionDescription, unitType, temporalityType, subjectField, keyword, spatialCoverageDescription, containsPersonalData, useRestriction, useRestrictionDate, customType, id, owner, filePath, metadataCreatedDate, metadataCreatedBy, metadataLastUpdatedDate, metadataLastUpdatedBy, containsDataFrom, containsDataUntil);
        }

    }

    public static abstract class DatasetBuilderBase<T extends Dataset >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public DatasetBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Dataset.DatasetBuilder.class)) {
                this.instance = ((T) new Dataset());
            }
        }

        @SuppressWarnings("unchecked")
        public DatasetBuilderBase(String shortName, Dataset.Assessment assessment, Dataset.DataSetStatus datasetStatus, Dataset.DataSetState datasetState, List<Object> name, List<Object> description, List<Object> dataSource, List<Object> populationDescription, String version, List<Object> versionDescription, Dataset.UnitType unitType, Dataset.TemporalityTypeType temporalityType, String subjectField, List<String> keyword, List<Object> spatialCoverageDescription, Boolean containsPersonalData, Dataset.UseRestriction useRestriction, Date useRestrictionDate, List<CustomType> customType, UUID id, List<Object> owner, String filePath, Date metadataCreatedDate, String metadataCreatedBy, Date metadataLastUpdatedDate, String metadataLastUpdatedBy, String containsDataFrom, String containsDataUntil) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Dataset.DatasetBuilder.class)) {
                this.instance = ((T) new Dataset(shortName, assessment, datasetStatus, datasetState, name, description, dataSource, populationDescription, version, versionDescription, unitType, temporalityType, subjectField, keyword, spatialCoverageDescription, containsPersonalData, useRestriction, useRestrictionDate, customType, id, owner, filePath, metadataCreatedDate, metadataCreatedBy, metadataLastUpdatedDate, metadataLastUpdatedBy, containsDataFrom, containsDataUntil));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Dataset.DatasetBuilderBase withShortName(String shortName) {
            ((Dataset) this.instance).shortName = shortName;
            return this;
        }

        public Dataset.DatasetBuilderBase withAssessment(Dataset.Assessment assessment) {
            ((Dataset) this.instance).assessment = assessment;
            return this;
        }

        public Dataset.DatasetBuilderBase withDatasetStatus(Dataset.DataSetStatus datasetStatus) {
            ((Dataset) this.instance).datasetStatus = datasetStatus;
            return this;
        }

        public Dataset.DatasetBuilderBase withDatasetState(Dataset.DataSetState datasetState) {
            ((Dataset) this.instance).datasetState = datasetState;
            return this;
        }

        public Dataset.DatasetBuilderBase withName(List<Object> name) {
            ((Dataset) this.instance).name = name;
            return this;
        }

        public Dataset.DatasetBuilderBase withDescription(List<Object> description) {
            ((Dataset) this.instance).description = description;
            return this;
        }

        public Dataset.DatasetBuilderBase withDataSource(List<Object> dataSource) {
            ((Dataset) this.instance).dataSource = dataSource;
            return this;
        }

        public Dataset.DatasetBuilderBase withPopulationDescription(List<Object> populationDescription) {
            ((Dataset) this.instance).populationDescription = populationDescription;
            return this;
        }

        public Dataset.DatasetBuilderBase withVersion(String version) {
            ((Dataset) this.instance).version = version;
            return this;
        }

        public Dataset.DatasetBuilderBase withVersionDescription(List<Object> versionDescription) {
            ((Dataset) this.instance).versionDescription = versionDescription;
            return this;
        }

        public Dataset.DatasetBuilderBase withUnitType(Dataset.UnitType unitType) {
            ((Dataset) this.instance).unitType = unitType;
            return this;
        }

        public Dataset.DatasetBuilderBase withTemporalityType(Dataset.TemporalityTypeType temporalityType) {
            ((Dataset) this.instance).temporalityType = temporalityType;
            return this;
        }

        public Dataset.DatasetBuilderBase withSubjectField(String subjectField) {
            ((Dataset) this.instance).subjectField = subjectField;
            return this;
        }

        public Dataset.DatasetBuilderBase withKeyword(List<String> keyword) {
            ((Dataset) this.instance).keyword = keyword;
            return this;
        }

        public Dataset.DatasetBuilderBase withSpatialCoverageDescription(List<Object> spatialCoverageDescription) {
            ((Dataset) this.instance).spatialCoverageDescription = spatialCoverageDescription;
            return this;
        }

        public Dataset.DatasetBuilderBase withContainsPersonalData(Boolean containsPersonalData) {
            ((Dataset) this.instance).containsPersonalData = containsPersonalData;
            return this;
        }

        public Dataset.DatasetBuilderBase withUseRestriction(Dataset.UseRestriction useRestriction) {
            ((Dataset) this.instance).useRestriction = useRestriction;
            return this;
        }

        public Dataset.DatasetBuilderBase withUseRestrictionDate(Date useRestrictionDate) {
            ((Dataset) this.instance).useRestrictionDate = useRestrictionDate;
            return this;
        }

        public Dataset.DatasetBuilderBase withCustomType(List<CustomType> customType) {
            ((Dataset) this.instance).customType = customType;
            return this;
        }

        public Dataset.DatasetBuilderBase withId(UUID id) {
            ((Dataset) this.instance).id = id;
            return this;
        }

        public Dataset.DatasetBuilderBase withOwner(List<Object> owner) {
            ((Dataset) this.instance).owner = owner;
            return this;
        }

        public Dataset.DatasetBuilderBase withFilePath(String filePath) {
            ((Dataset) this.instance).filePath = filePath;
            return this;
        }

        public Dataset.DatasetBuilderBase withMetadataCreatedDate(Date metadataCreatedDate) {
            ((Dataset) this.instance).metadataCreatedDate = metadataCreatedDate;
            return this;
        }

        public Dataset.DatasetBuilderBase withMetadataCreatedBy(String metadataCreatedBy) {
            ((Dataset) this.instance).metadataCreatedBy = metadataCreatedBy;
            return this;
        }

        public Dataset.DatasetBuilderBase withMetadataLastUpdatedDate(Date metadataLastUpdatedDate) {
            ((Dataset) this.instance).metadataLastUpdatedDate = metadataLastUpdatedDate;
            return this;
        }

        public Dataset.DatasetBuilderBase withMetadataLastUpdatedBy(String metadataLastUpdatedBy) {
            ((Dataset) this.instance).metadataLastUpdatedBy = metadataLastUpdatedBy;
            return this;
        }

        public Dataset.DatasetBuilderBase withContainsDataFrom(String containsDataFrom) {
            ((Dataset) this.instance).containsDataFrom = containsDataFrom;
            return this;
        }

        public Dataset.DatasetBuilderBase withContainsDataUntil(String containsDataUntil) {
            ((Dataset) this.instance).containsDataUntil = containsDataUntil;
            return this;
        }

        public Dataset.DatasetBuilderBase withAdditionalProperty(String name, Object value) {
            ((Dataset) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }


    /**
     * Data set state
     * <p>
     * Steady state of data
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataSetState {

        SOURCE_DATA("SOURCE_DATA"),
        INPUT_DATA("INPUT_DATA"),
        PROCESSED_DATA("PROCESSED_DATA"),
        STATISTICS("STATISTICS"),
        OUTPUT_DATA("OUTPUT_DATA");
        private final String value;
        private final static Map<String, Dataset.DataSetState> CONSTANTS = new HashMap<String, Dataset.DataSetState>();

        static {
            for (Dataset.DataSetState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataSetState(String value) {
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
        public static Dataset.DataSetState fromValue(String value) {
            Dataset.DataSetState constant = CONSTANTS.get(value);
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
    public enum DataSetStatus {

        DRAFT("DRAFT"),
        INTERNAL("INTERNAL"),
        EXTERNAL("EXTERNAL"),
        DEPRECATED("DEPRECATED");
        private final String value;
        private final static Map<String, Dataset.DataSetStatus> CONSTANTS = new HashMap<String, Dataset.DataSetStatus>();

        static {
            for (Dataset.DataSetStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataSetStatus(String value) {
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
        public static Dataset.DataSetStatus fromValue(String value) {
            Dataset.DataSetStatus constant = CONSTANTS.get(value);
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


    /**
     * Use restriction
     * <p>
     * Data set use restriction
     * 
     */
    @Generated("jsonschema2pojo")
    public enum UseRestriction {

        DELETION_ANONYMIZATION("DELETION_ANONYMIZATION"),
        PROCESS_LIMITATIONS("PROCESS_LIMITATIONS"),
        SECONDARY_USE_RESTRICTIONS("SECONDARY_USE_RESTRICTIONS");
        private final String value;
        private final static Map<String, Dataset.UseRestriction> CONSTANTS = new HashMap<String, Dataset.UseRestriction>();

        static {
            for (Dataset.UseRestriction c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UseRestriction(String value) {
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
        public static Dataset.UseRestriction fromValue(String value) {
            Dataset.UseRestriction constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
