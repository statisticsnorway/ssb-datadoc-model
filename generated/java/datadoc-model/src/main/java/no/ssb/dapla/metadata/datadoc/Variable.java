
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
    "name",
    "data_type",
    "variable_role",
    "definition_uri",
    "direct_person_identifying",
    "data_source",
    "population_description",
    "comment",
    "temporality_type",
    "measurement_unit",
    "format",
    "classification_uri",
    "sentinel_value_uri",
    "invalid_value_description",
    "id",
    "contains_data_from",
    "contains_data_until"
})
@Generated("jsonschema2pojo")
public class Variable implements Serializable
{

    /**
     * Short name
     * <p>
     * Physical name of the variable in the dataset. Should match the recommended short name.
     * (Required)
     * 
     */
    @JsonProperty("short_name")
    @JsonPropertyDescription("Physical name of the variable in the dataset. Should match the recommended short name.")
    @NotNull
    private String shortName;
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
     * Data type
     * <p>
     * Data type
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    @JsonPropertyDescription("Data type")
    @NotNull
    private Variable.DataType dataType;
    /**
     * Variable role
     * <p>
     * Role of the instance variable in the data set
     * (Required)
     * 
     */
    @JsonProperty("variable_role")
    @JsonPropertyDescription("Role of the instance variable in the data set")
    @NotNull
    private Variable.VariableRole variableRole;
    /**
     * Definition URI
     * <p>
     * A link (URI) to the variable's definition in Vardok/VarDef
     * 
     */
    @JsonProperty("definition_uri")
    @JsonPropertyDescription("A link (URI) to the variable's definition in Vardok/VarDef")
    private URI definitionUri;
    /**
     * Direct Person identifying Information (DPI)
     * <p>
     * Direct Person identifying Information (DPI). Some of the values ​​in an instance variable kan be DPI, others not. In this case, DPI is set equal to true. For example, the variable exporter where some of the values ​​can be organization number, others social security numbers (sole proprietorships).
     * (Required)
     * 
     */
    @JsonProperty("direct_person_identifying")
    @JsonPropertyDescription("Direct Person identifying Information (DPI). Some of the values \u200b\u200bin an instance variable kan be DPI, others not. In this case, DPI is set equal to true. For example, the variable exporter where some of the values \u200b\u200bcan be organization number, others social security numbers (sole proprietorships).")
    @NotNull
    private Boolean directPersonIdentifying;
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
    @JsonProperty("population_description")
    @Valid
    private LanguageStringType populationDescription;
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("comment")
    @Valid
    private LanguageStringType comment;
    /**
     * Reusable temporalitytype type
     * 
     */
    @JsonProperty("temporality_type")
    private no.ssb.dapla.metadata.datadoc.Dataset.TemporalityTypeType temporalityType;
    /**
     * Measurement unit
     * <p>
     * Measurement unit TODO: measurement_unit implemented as string. In the future this should be implemente as enum? See https://www.ssb.no/klass/klassifikasjoner/303/koder
     * 
     */
    @JsonProperty("measurement_unit")
    @JsonPropertyDescription("Measurement unit")
    private String measurementUnit;
    /**
     * Format
     * <p>
     * The format of the values ​​(physical format or regular expression) in machine-readable form for validation. This can be used as a further specification of the data type (dataType) in those cases where this is relevant.
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("The format of the values \u200b\u200b(physical format or regular expression) in machine-readable form for validation. This can be used as a further specification of the data type (dataType) in those cases where this is relevant.")
    private String format;
    /**
     * Classification or codelist URI
     * <p>
     * Link (URI) to valid classification or code list
     * 
     */
    @JsonProperty("classification_uri")
    @JsonPropertyDescription("Link (URI) to valid classification or code list")
    private URI classificationUri;
    /**
     * Sentinel value URI
     * <p>
     * A link (URI) to an overview of sentinel values included in the variable. Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway:  01 - In total, 02 - Sum, 03 - Subtotal, 04 - Other, 05 - Rest, 06 - Invalid value, 07 - Unspecified, 08 - Not relevant
     * 
     */
    @JsonProperty("sentinel_value_uri")
    @JsonPropertyDescription("A link (URI) to an overview of sentinel values included in the variable. Proposals for the standardization of sentinel values \u200b\u200bhave been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway:  01 - In total, 02 - Sum, 03 - Subtotal, 04 - Other, 05 - Rest, 06 - Invalid value, 07 - Unspecified, 08 - Not relevant")
    private URI sentinelValueUri;
    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("invalid_value_description")
    @Valid
    private LanguageStringType invalidValueDescription;
    /**
     * Identifier
     * <p>
     * Unique SSB identifier for the instance variable in the data set UUID specified by RFC4122
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique SSB identifier for the instance variable in the data set")
    @NotNull
    private UUID id;
    /**
     * Contains data from
     * <p>
     * The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.
     * 
     */
    @JsonProperty("contains_data_from")
    @JsonPropertyDescription("The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.")
    private Date containsDataFrom;
    /**
     * Contains data up until
     * <p>
     * The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * 
     */
    @JsonProperty("contains_data_until")
    @JsonPropertyDescription("The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.")
    private Date containsDataUntil;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6960793146359253774L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variable() {
    }

    /**
     * 
     * @param containsDataUntil
     *     Contains data up until. The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * @param containsDataFrom
     *     Contains data from. The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.
     * @param dataType
     *     Data type. Data type.
     * @param format
     *     Format. The format of the values ​​(physical format or regular expression) in machine-readable form for validation. This can be used as a further specification of the data type (dataType) in those cases where this is relevant.
     * @param classificationUri
     *     Classification or codelist URI. Link (URI) to valid classification or code list.
     * @param populationDescription
     *     Population description. The population the variable describes can be specified in more detail here. Set at dataset level, but can be overwritten at instance variable level.
     * @param definitionUri
     *     Definition URI. A link (URI) to the variable's definition in Vardok/VarDef.
     * @param temporalityType
     *     Temporality type. Temporality type. Set either for variable instance or dataset.
     * @param measurementUnit
     *     Measurement unit. Measurement unit.
     * @param directPersonIdentifying
     *     Direct Person identifying Information (DPI). Direct Person identifying Information (DPI). Some of the values ​​in an instance variable kan be DPI, others not. In this case, DPI is set equal to true. For example, the variable exporter where some of the values ​​can be organization number, others social security numbers (sole proprietorships).
     * @param variableRole
     *     Variable role. Role of the instance variable in the data set.
     * @param sentinelValueUri
     *     Sentinel value URI. A link (URI) to an overview of sentinel values included in the variable. Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway:  01 - In total, 02 - Sum, 03 - Subtotal, 04 - Other, 05 - Rest, 06 - Invalid value, 07 - Unspecified, 08 - Not relevant.
     * @param name
     *     Name. Variable names can be inherited from VarDef, but can also be documented/changed here.
     * @param comment
     *     Comment. Further clarification of the variables definition.
     * @param id
     *     Identifier. Unique SSB identifier for the instance variable in the data set.
     * @param shortName
     *     Short name. Physical name of the variable in the dataset. Should match the recommended short name.
     * @param dataSource
     *     Data source. Data source. Set at data set level, but can be overwritten at variable instance level.
     * @param invalidValueDescription
     *     Invalid value(s) description. Invalid value(s) description used in addition (or as an alternative) to standard sentinel values.
     */
    public Variable(String shortName, LanguageStringType name, Variable.DataType dataType, Variable.VariableRole variableRole, URI definitionUri, Boolean directPersonIdentifying, LanguageStringType dataSource, LanguageStringType populationDescription, LanguageStringType comment, no.ssb.dapla.metadata.datadoc.Dataset.TemporalityTypeType temporalityType, String measurementUnit, String format, URI classificationUri, URI sentinelValueUri, LanguageStringType invalidValueDescription, UUID id, Date containsDataFrom, Date containsDataUntil) {
        super();
        this.shortName = shortName;
        this.name = name;
        this.dataType = dataType;
        this.variableRole = variableRole;
        this.definitionUri = definitionUri;
        this.directPersonIdentifying = directPersonIdentifying;
        this.dataSource = dataSource;
        this.populationDescription = populationDescription;
        this.comment = comment;
        this.temporalityType = temporalityType;
        this.measurementUnit = measurementUnit;
        this.format = format;
        this.classificationUri = classificationUri;
        this.sentinelValueUri = sentinelValueUri;
        this.invalidValueDescription = invalidValueDescription;
        this.id = id;
        this.containsDataFrom = containsDataFrom;
        this.containsDataUntil = containsDataUntil;
    }

    /**
     * Short name
     * <p>
     * Physical name of the variable in the dataset. Should match the recommended short name.
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
     * Physical name of the variable in the dataset. Should match the recommended short name.
     * (Required)
     * 
     */
    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
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
     * Data type
     * <p>
     * Data type
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    public Variable.DataType getDataType() {
        return dataType;
    }

    /**
     * Data type
     * <p>
     * Data type
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    public void setDataType(Variable.DataType dataType) {
        this.dataType = dataType;
    }

    /**
     * Variable role
     * <p>
     * Role of the instance variable in the data set
     * (Required)
     * 
     */
    @JsonProperty("variable_role")
    public Variable.VariableRole getVariableRole() {
        return variableRole;
    }

    /**
     * Variable role
     * <p>
     * Role of the instance variable in the data set
     * (Required)
     * 
     */
    @JsonProperty("variable_role")
    public void setVariableRole(Variable.VariableRole variableRole) {
        this.variableRole = variableRole;
    }

    /**
     * Definition URI
     * <p>
     * A link (URI) to the variable's definition in Vardok/VarDef
     * 
     */
    @JsonProperty("definition_uri")
    public URI getDefinitionUri() {
        return definitionUri;
    }

    /**
     * Definition URI
     * <p>
     * A link (URI) to the variable's definition in Vardok/VarDef
     * 
     */
    @JsonProperty("definition_uri")
    public void setDefinitionUri(URI definitionUri) {
        this.definitionUri = definitionUri;
    }

    /**
     * Direct Person identifying Information (DPI)
     * <p>
     * Direct Person identifying Information (DPI). Some of the values ​​in an instance variable kan be DPI, others not. In this case, DPI is set equal to true. For example, the variable exporter where some of the values ​​can be organization number, others social security numbers (sole proprietorships).
     * (Required)
     * 
     */
    @JsonProperty("direct_person_identifying")
    public Boolean getDirectPersonIdentifying() {
        return directPersonIdentifying;
    }

    /**
     * Direct Person identifying Information (DPI)
     * <p>
     * Direct Person identifying Information (DPI). Some of the values ​​in an instance variable kan be DPI, others not. In this case, DPI is set equal to true. For example, the variable exporter where some of the values ​​can be organization number, others social security numbers (sole proprietorships).
     * (Required)
     * 
     */
    @JsonProperty("direct_person_identifying")
    public void setDirectPersonIdentifying(Boolean directPersonIdentifying) {
        this.directPersonIdentifying = directPersonIdentifying;
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
    @JsonProperty("population_description")
    public LanguageStringType getPopulationDescription() {
        return populationDescription;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("population_description")
    public void setPopulationDescription(LanguageStringType populationDescription) {
        this.populationDescription = populationDescription;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("comment")
    public LanguageStringType getComment() {
        return comment;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("comment")
    public void setComment(LanguageStringType comment) {
        this.comment = comment;
    }

    /**
     * Reusable temporalitytype type
     * 
     */
    @JsonProperty("temporality_type")
    public no.ssb.dapla.metadata.datadoc.Dataset.TemporalityTypeType getTemporalityType() {
        return temporalityType;
    }

    /**
     * Reusable temporalitytype type
     * 
     */
    @JsonProperty("temporality_type")
    public void setTemporalityType(no.ssb.dapla.metadata.datadoc.Dataset.TemporalityTypeType temporalityType) {
        this.temporalityType = temporalityType;
    }

    /**
     * Measurement unit
     * <p>
     * Measurement unit TODO: measurement_unit implemented as string. In the future this should be implemente as enum? See https://www.ssb.no/klass/klassifikasjoner/303/koder
     * 
     */
    @JsonProperty("measurement_unit")
    public String getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Measurement unit
     * <p>
     * Measurement unit TODO: measurement_unit implemented as string. In the future this should be implemente as enum? See https://www.ssb.no/klass/klassifikasjoner/303/koder
     * 
     */
    @JsonProperty("measurement_unit")
    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    /**
     * Format
     * <p>
     * The format of the values ​​(physical format or regular expression) in machine-readable form for validation. This can be used as a further specification of the data type (dataType) in those cases where this is relevant.
     * 
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * Format
     * <p>
     * The format of the values ​​(physical format or regular expression) in machine-readable form for validation. This can be used as a further specification of the data type (dataType) in those cases where this is relevant.
     * 
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Classification or codelist URI
     * <p>
     * Link (URI) to valid classification or code list
     * 
     */
    @JsonProperty("classification_uri")
    public URI getClassificationUri() {
        return classificationUri;
    }

    /**
     * Classification or codelist URI
     * <p>
     * Link (URI) to valid classification or code list
     * 
     */
    @JsonProperty("classification_uri")
    public void setClassificationUri(URI classificationUri) {
        this.classificationUri = classificationUri;
    }

    /**
     * Sentinel value URI
     * <p>
     * A link (URI) to an overview of sentinel values included in the variable. Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway:  01 - In total, 02 - Sum, 03 - Subtotal, 04 - Other, 05 - Rest, 06 - Invalid value, 07 - Unspecified, 08 - Not relevant
     * 
     */
    @JsonProperty("sentinel_value_uri")
    public URI getSentinelValueUri() {
        return sentinelValueUri;
    }

    /**
     * Sentinel value URI
     * <p>
     * A link (URI) to an overview of sentinel values included in the variable. Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway:  01 - In total, 02 - Sum, 03 - Subtotal, 04 - Other, 05 - Rest, 06 - Invalid value, 07 - Unspecified, 08 - Not relevant
     * 
     */
    @JsonProperty("sentinel_value_uri")
    public void setSentinelValueUri(URI sentinelValueUri) {
        this.sentinelValueUri = sentinelValueUri;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("invalid_value_description")
    public LanguageStringType getInvalidValueDescription() {
        return invalidValueDescription;
    }

    /**
     * Reusable langugage string type
     * 
     */
    @JsonProperty("invalid_value_description")
    public void setInvalidValueDescription(LanguageStringType invalidValueDescription) {
        this.invalidValueDescription = invalidValueDescription;
    }

    /**
     * Identifier
     * <p>
     * Unique SSB identifier for the instance variable in the data set UUID specified by RFC4122
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
     * Unique SSB identifier for the instance variable in the data set UUID specified by RFC4122
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Contains data from
     * <p>
     * The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.
     * 
     */
    @JsonProperty("contains_data_from")
    public Date getContainsDataFrom() {
        return containsDataFrom;
    }

    /**
     * Contains data from
     * <p>
     * The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.
     * 
     */
    @JsonProperty("contains_data_from")
    public void setContainsDataFrom(Date containsDataFrom) {
        this.containsDataFrom = containsDataFrom;
    }

    /**
     * Contains data up until
     * <p>
     * The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * 
     */
    @JsonProperty("contains_data_until")
    public Date getContainsDataUntil() {
        return containsDataUntil;
    }

    /**
     * Contains data up until
     * <p>
     * The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * 
     */
    @JsonProperty("contains_data_until")
    public void setContainsDataUntil(Date containsDataUntil) {
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
        sb.append(Variable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("variableRole");
        sb.append('=');
        sb.append(((this.variableRole == null)?"<null>":this.variableRole));
        sb.append(',');
        sb.append("definitionUri");
        sb.append('=');
        sb.append(((this.definitionUri == null)?"<null>":this.definitionUri));
        sb.append(',');
        sb.append("directPersonIdentifying");
        sb.append('=');
        sb.append(((this.directPersonIdentifying == null)?"<null>":this.directPersonIdentifying));
        sb.append(',');
        sb.append("dataSource");
        sb.append('=');
        sb.append(((this.dataSource == null)?"<null>":this.dataSource));
        sb.append(',');
        sb.append("populationDescription");
        sb.append('=');
        sb.append(((this.populationDescription == null)?"<null>":this.populationDescription));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("temporalityType");
        sb.append('=');
        sb.append(((this.temporalityType == null)?"<null>":this.temporalityType));
        sb.append(',');
        sb.append("measurementUnit");
        sb.append('=');
        sb.append(((this.measurementUnit == null)?"<null>":this.measurementUnit));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("classificationUri");
        sb.append('=');
        sb.append(((this.classificationUri == null)?"<null>":this.classificationUri));
        sb.append(',');
        sb.append("sentinelValueUri");
        sb.append('=');
        sb.append(((this.sentinelValueUri == null)?"<null>":this.sentinelValueUri));
        sb.append(',');
        sb.append("invalidValueDescription");
        sb.append('=');
        sb.append(((this.invalidValueDescription == null)?"<null>":this.invalidValueDescription));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.containsDataUntil == null)? 0 :this.containsDataUntil.hashCode()));
        result = ((result* 31)+((this.containsDataFrom == null)? 0 :this.containsDataFrom.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.classificationUri == null)? 0 :this.classificationUri.hashCode()));
        result = ((result* 31)+((this.populationDescription == null)? 0 :this.populationDescription.hashCode()));
        result = ((result* 31)+((this.definitionUri == null)? 0 :this.definitionUri.hashCode()));
        result = ((result* 31)+((this.temporalityType == null)? 0 :this.temporalityType.hashCode()));
        result = ((result* 31)+((this.measurementUnit == null)? 0 :this.measurementUnit.hashCode()));
        result = ((result* 31)+((this.directPersonIdentifying == null)? 0 :this.directPersonIdentifying.hashCode()));
        result = ((result* 31)+((this.variableRole == null)? 0 :this.variableRole.hashCode()));
        result = ((result* 31)+((this.sentinelValueUri == null)? 0 :this.sentinelValueUri.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.dataSource == null)? 0 :this.dataSource.hashCode()));
        result = ((result* 31)+((this.invalidValueDescription == null)? 0 :this.invalidValueDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variable) == false) {
            return false;
        }
        Variable rhs = ((Variable) other);
        return ((((((((((((((((((((this.containsDataUntil == rhs.containsDataUntil)||((this.containsDataUntil!= null)&&this.containsDataUntil.equals(rhs.containsDataUntil)))&&((this.containsDataFrom == rhs.containsDataFrom)||((this.containsDataFrom!= null)&&this.containsDataFrom.equals(rhs.containsDataFrom))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.classificationUri == rhs.classificationUri)||((this.classificationUri!= null)&&this.classificationUri.equals(rhs.classificationUri))))&&((this.populationDescription == rhs.populationDescription)||((this.populationDescription!= null)&&this.populationDescription.equals(rhs.populationDescription))))&&((this.definitionUri == rhs.definitionUri)||((this.definitionUri!= null)&&this.definitionUri.equals(rhs.definitionUri))))&&((this.temporalityType == rhs.temporalityType)||((this.temporalityType!= null)&&this.temporalityType.equals(rhs.temporalityType))))&&((this.measurementUnit == rhs.measurementUnit)||((this.measurementUnit!= null)&&this.measurementUnit.equals(rhs.measurementUnit))))&&((this.directPersonIdentifying == rhs.directPersonIdentifying)||((this.directPersonIdentifying!= null)&&this.directPersonIdentifying.equals(rhs.directPersonIdentifying))))&&((this.variableRole == rhs.variableRole)||((this.variableRole!= null)&&this.variableRole.equals(rhs.variableRole))))&&((this.sentinelValueUri == rhs.sentinelValueUri)||((this.sentinelValueUri!= null)&&this.sentinelValueUri.equals(rhs.sentinelValueUri))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.dataSource == rhs.dataSource)||((this.dataSource!= null)&&this.dataSource.equals(rhs.dataSource))))&&((this.invalidValueDescription == rhs.invalidValueDescription)||((this.invalidValueDescription!= null)&&this.invalidValueDescription.equals(rhs.invalidValueDescription))));
    }


    /**
     * Data type
     * <p>
     * Data type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataType {

        STRING("STRING"),
        INTEGER("INTEGER"),
        DATETIME("DATETIME"),
        BOOLEAN("BOOLEAN");
        private final String value;
        private final static Map<String, Variable.DataType> CONSTANTS = new HashMap<String, Variable.DataType>();

        static {
            for (Variable.DataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataType(String value) {
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
        public static Variable.DataType fromValue(String value) {
            Variable.DataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Variable role
     * <p>
     * Role of the instance variable in the data set
     * 
     */
    @Generated("jsonschema2pojo")
    public enum VariableRole {

        IDENTIFIER("IDENTIFIER"),
        MEASURE("MEASURE"),
        START_TIME("START_TIME"),
        STOP_TIME("STOP_TIME"),
        ATTRIBUTE("ATTRIBUTE");
        private final String value;
        private final static Map<String, Variable.VariableRole> CONSTANTS = new HashMap<String, Variable.VariableRole>();

        static {
            for (Variable.VariableRole c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        VariableRole(String value) {
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
        public static Variable.VariableRole fromValue(String value) {
            Variable.VariableRole constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
