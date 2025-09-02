
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
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
    "data_element_path",
    "name",
    "data_type",
    "variable_role",
    "definition_uri",
    "is_personal_data",
    "pseudonymization",
    "unit_type",
    "data_source",
    "population_description",
    "comment",
    "temporality_type",
    "measurement_unit",
    "multiplication_factor",
    "format",
    "classification_uri",
    "special_value",
    "invalid_value_description",
    "custom_type",
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
     * Physical name of the variable (data element) in the dataset. Should match the recommended short name.
     * (Required)
     * 
     */
    @JsonProperty("short_name")
    @JsonPropertyDescription("Physical name of the variable (data element) in the dataset. Should match the recommended short name.")
    @NotNull
    private String shortName;
    /**
     * Data element path
     * <p>
     * The path (dot notation) to the data element in a hierarchical data structure, eg. 'person.adress'. Must be given in addition to the short_name.For hierarchical datasets only, eg. json and xml documents.
     * 
     */
    @JsonProperty("data_element_path")
    @JsonPropertyDescription("The path (dot notation) to the data element in a hierarchical data structure, eg. 'person.adress'. Must be given in addition to the short_name.")
    private String dataElementPath;
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
     * Is personal data
     * <p>
     * Whether or not the variable is personal data.
     * (Required)
     * 
     */
    @JsonProperty("is_personal_data")
    @JsonPropertyDescription("Whether or not the variable is personal data.")
    @NotNull
    private Boolean isPersonalData;
    /**
     * A pseudonymized variable in the dataset.
     * 
     */
    @JsonProperty("pseudonymization")
    @JsonPropertyDescription("A pseudonymized variable in the dataset.")
    @Valid
    private Pseudonymization pseudonymization;
    /**
     * Unit type
     * <p>
     * Unit Type which this variable pertains to. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/702. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * (Required)
     * 
     */
    @JsonProperty("unit_type")
    @JsonPropertyDescription("Unit Type which this variable pertains to. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/702. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter")
    @NotNull
    private String unitType;
    /**
     * Data source
     * <p>
     * The source of the data contained in this variable. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/712.
     * (Required)
     * 
     */
    @JsonProperty("data_source")
    @JsonPropertyDescription("The source of the data contained in this variable. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/712.")
    @NotNull
    private String dataSource;
    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("population_description")
    @Valid
    private List<Object> populationDescription = new ArrayList<Object>();
    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("comment")
    @Valid
    private List<Object> comment = new ArrayList<Object>();
    /**
     * Reusable temporalitytype type
     * (Required)
     * 
     */
    @JsonProperty("temporality_type")
    @NotNull
    private Variable.TemporalityTypeType temporalityType;
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
     * Multiplication factor
     * <p>
     * A multiplication factor for a value/result is a number that multiplies that value/result.
     * 
     */
    @JsonProperty("multiplication_factor")
    @JsonPropertyDescription("A multiplication factor for a value/result is a number that multiplies that value/result.")
    private Integer multiplicationFactor;
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
     * Special values
     * <p>
     * 
     * 
     */
    @JsonProperty("special_value")
    @Valid
    private SpecialValues specialValue;
    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("invalid_value_description")
    @Valid
    private List<Object> invalidValueDescription = new ArrayList<Object>();
    /**
     * Custom type for variable metadata
     * <p>
     * Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * 
     */
    @JsonProperty("custom_type")
    @JsonPropertyDescription("Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).")
    @Valid
    private List<CustomType__1> customType = new ArrayList<CustomType__1>();
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
    private String containsDataFrom;
    /**
     * Contains data up until
     * <p>
     * The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * 
     */
    @JsonProperty("contains_data_until")
    @JsonPropertyDescription("The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.")
    private String containsDataUntil;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8729988193442125550L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variable() {
    }

    /**
     * 
     * @param specialValue
     *     Special values.
     * @param containsDataUntil
     *     Contains data up until. The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * @param pseudonymization
     *     A pseudonymized variable in the dataset.
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
     *     Temporality type. Temporality type of this variable.
     * @param measurementUnit
     *     Measurement unit. Measurement unit.
     * @param unitType
     *     Unit type. Unit Type which this variable pertains to. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/702. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter.
     * @param customType
     *     Custom type for variable metadata. Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * @param variableRole
     *     Variable role. Role of the instance variable in the data set.
     * @param dataElementPath
     *     Data element path. The path (dot notation) to the data element in a hierarchical data structure, eg. 'person.adress'. Must be given in addition to the short_name.
     * @param name
     *     Name. Variable names can be inherited from VarDef, but can also be documented/changed here.
     * @param isPersonalData
     *     Is personal data. Whether or not the variable is personal data.
     * @param comment
     *     Comment. Further clarification of the variables definition.
     * @param id
     *     Identifier. Unique SSB identifier for the instance variable in the data set.
     * @param shortName
     *     Short name. Physical name of the variable (data element) in the dataset. Should match the recommended short name.
     * @param dataSource
     *     Data source. The source of the data contained in this variable. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/712.
     * @param multiplicationFactor
     *     Multiplication factor. A multiplication factor for a value/result is a number that multiplies that value/result.
     * @param invalidValueDescription
     *     Invalid value(s) description. Invalid value(s) description used in addition (or as an alternative) to standard sentinel values.
     */
    public Variable(String shortName, String dataElementPath, List<Object> name, Variable.DataType dataType, Variable.VariableRole variableRole, URI definitionUri, Boolean isPersonalData, Pseudonymization pseudonymization, String unitType, String dataSource, List<Object> populationDescription, List<Object> comment, Variable.TemporalityTypeType temporalityType, String measurementUnit, Integer multiplicationFactor, String format, URI classificationUri, SpecialValues specialValue, List<Object> invalidValueDescription, List<CustomType__1> customType, UUID id, String containsDataFrom, String containsDataUntil) {
        super();
        this.shortName = shortName;
        this.dataElementPath = dataElementPath;
        this.name = name;
        this.dataType = dataType;
        this.variableRole = variableRole;
        this.definitionUri = definitionUri;
        this.isPersonalData = isPersonalData;
        this.pseudonymization = pseudonymization;
        this.unitType = unitType;
        this.dataSource = dataSource;
        this.populationDescription = populationDescription;
        this.comment = comment;
        this.temporalityType = temporalityType;
        this.measurementUnit = measurementUnit;
        this.multiplicationFactor = multiplicationFactor;
        this.format = format;
        this.classificationUri = classificationUri;
        this.specialValue = specialValue;
        this.invalidValueDescription = invalidValueDescription;
        this.customType = customType;
        this.id = id;
        this.containsDataFrom = containsDataFrom;
        this.containsDataUntil = containsDataUntil;
    }

    public static Variable.VariableBuilderBase builder() {
        return new Variable.VariableBuilder();
    }

    /**
     * Short name
     * <p>
     * Physical name of the variable (data element) in the dataset. Should match the recommended short name.
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
     * Physical name of the variable (data element) in the dataset. Should match the recommended short name.
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
     * The path (dot notation) to the data element in a hierarchical data structure, eg. 'person.adress'. Must be given in addition to the short_name.For hierarchical datasets only, eg. json and xml documents.
     * 
     */
    @JsonProperty("data_element_path")
    public String getDataElementPath() {
        return dataElementPath;
    }

    /**
     * Data element path
     * <p>
     * The path (dot notation) to the data element in a hierarchical data structure, eg. 'person.adress'. Must be given in addition to the short_name.For hierarchical datasets only, eg. json and xml documents.
     * 
     */
    @JsonProperty("data_element_path")
    public void setDataElementPath(String dataElementPath) {
        this.dataElementPath = dataElementPath;
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
     * Is personal data
     * <p>
     * Whether or not the variable is personal data.
     * (Required)
     * 
     */
    @JsonProperty("is_personal_data")
    public Boolean getIsPersonalData() {
        return isPersonalData;
    }

    /**
     * Is personal data
     * <p>
     * Whether or not the variable is personal data.
     * (Required)
     * 
     */
    @JsonProperty("is_personal_data")
    public void setIsPersonalData(Boolean isPersonalData) {
        this.isPersonalData = isPersonalData;
    }

    /**
     * A pseudonymized variable in the dataset.
     * 
     */
    @JsonProperty("pseudonymization")
    public Pseudonymization getPseudonymization() {
        return pseudonymization;
    }

    /**
     * A pseudonymized variable in the dataset.
     * 
     */
    @JsonProperty("pseudonymization")
    public void setPseudonymization(Pseudonymization pseudonymization) {
        this.pseudonymization = pseudonymization;
    }

    /**
     * Unit type
     * <p>
     * Unit Type which this variable pertains to. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/702. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * (Required)
     * 
     */
    @JsonProperty("unit_type")
    public String getUnitType() {
        return unitType;
    }

    /**
     * Unit type
     * <p>
     * Unit Type which this variable pertains to. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/702. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter
     * (Required)
     * 
     */
    @JsonProperty("unit_type")
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * Data source
     * <p>
     * The source of the data contained in this variable. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/712.
     * (Required)
     * 
     */
    @JsonProperty("data_source")
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Data source
     * <p>
     * The source of the data contained in this variable. Values shall be codes from https://www.ssb.no/klass/klassifikasjoner/712.
     * (Required)
     * 
     */
    @JsonProperty("data_source")
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("population_description")
    public List<Object> getPopulationDescription() {
        return populationDescription;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("population_description")
    public void setPopulationDescription(List<Object> populationDescription) {
        this.populationDescription = populationDescription;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("comment")
    public List<Object> getComment() {
        return comment;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("comment")
    public void setComment(List<Object> comment) {
        this.comment = comment;
    }

    /**
     * Reusable temporalitytype type
     * (Required)
     * 
     */
    @JsonProperty("temporality_type")
    public Variable.TemporalityTypeType getTemporalityType() {
        return temporalityType;
    }

    /**
     * Reusable temporalitytype type
     * (Required)
     * 
     */
    @JsonProperty("temporality_type")
    public void setTemporalityType(Variable.TemporalityTypeType temporalityType) {
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
     * Multiplication factor
     * <p>
     * A multiplication factor for a value/result is a number that multiplies that value/result.
     * 
     */
    @JsonProperty("multiplication_factor")
    public Integer getMultiplicationFactor() {
        return multiplicationFactor;
    }

    /**
     * Multiplication factor
     * <p>
     * A multiplication factor for a value/result is a number that multiplies that value/result.
     * 
     */
    @JsonProperty("multiplication_factor")
    public void setMultiplicationFactor(Integer multiplicationFactor) {
        this.multiplicationFactor = multiplicationFactor;
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
     * Special values
     * <p>
     * 
     * 
     */
    @JsonProperty("special_value")
    public SpecialValues getSpecialValue() {
        return specialValue;
    }

    /**
     * Special values
     * <p>
     * 
     * 
     */
    @JsonProperty("special_value")
    public void setSpecialValue(SpecialValues specialValue) {
        this.specialValue = specialValue;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("invalid_value_description")
    public List<Object> getInvalidValueDescription() {
        return invalidValueDescription;
    }

    /**
     * Reusableb langugage string type
     * 
     */
    @JsonProperty("invalid_value_description")
    public void setInvalidValueDescription(List<Object> invalidValueDescription) {
        this.invalidValueDescription = invalidValueDescription;
    }

    /**
     * Custom type for variable metadata
     * <p>
     * Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * 
     */
    @JsonProperty("custom_type")
    public List<CustomType__1> getCustomType() {
        return customType;
    }

    /**
     * Custom type for variable metadata
     * <p>
     * Extend the DataDoc model by adding custom metadata elements as key-value-pairs (string, array or objects).
     * 
     */
    @JsonProperty("custom_type")
    public void setCustomType(List<CustomType__1> customType) {
        this.customType = customType;
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
    public String getContainsDataFrom() {
        return containsDataFrom;
    }

    /**
     * Contains data from
     * <p>
     * The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.
     * 
     */
    @JsonProperty("contains_data_from")
    public void setContainsDataFrom(String containsDataFrom) {
        this.containsDataFrom = containsDataFrom;
    }

    /**
     * Contains data up until
     * <p>
     * The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
     * 
     */
    @JsonProperty("contains_data_until")
    public String getContainsDataUntil() {
        return containsDataUntil;
    }

    /**
     * Contains data up until
     * <p>
     * The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.
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
        sb.append(Variable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
        sb.append(',');
        sb.append("dataElementPath");
        sb.append('=');
        sb.append(((this.dataElementPath == null)?"<null>":this.dataElementPath));
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
        sb.append("isPersonalData");
        sb.append('=');
        sb.append(((this.isPersonalData == null)?"<null>":this.isPersonalData));
        sb.append(',');
        sb.append("pseudonymization");
        sb.append('=');
        sb.append(((this.pseudonymization == null)?"<null>":this.pseudonymization));
        sb.append(',');
        sb.append("unitType");
        sb.append('=');
        sb.append(((this.unitType == null)?"<null>":this.unitType));
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
        sb.append("multiplicationFactor");
        sb.append('=');
        sb.append(((this.multiplicationFactor == null)?"<null>":this.multiplicationFactor));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("classificationUri");
        sb.append('=');
        sb.append(((this.classificationUri == null)?"<null>":this.classificationUri));
        sb.append(',');
        sb.append("specialValue");
        sb.append('=');
        sb.append(((this.specialValue == null)?"<null>":this.specialValue));
        sb.append(',');
        sb.append("invalidValueDescription");
        sb.append('=');
        sb.append(((this.invalidValueDescription == null)?"<null>":this.invalidValueDescription));
        sb.append(',');
        sb.append("customType");
        sb.append('=');
        sb.append(((this.customType == null)?"<null>":this.customType));
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
        result = ((result* 31)+((this.populationDescription == null)? 0 :this.populationDescription.hashCode()));
        result = ((result* 31)+((this.definitionUri == null)? 0 :this.definitionUri.hashCode()));
        result = ((result* 31)+((this.temporalityType == null)? 0 :this.temporalityType.hashCode()));
        result = ((result* 31)+((this.unitType == null)? 0 :this.unitType.hashCode()));
        result = ((result* 31)+((this.variableRole == null)? 0 :this.variableRole.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.multiplicationFactor == null)? 0 :this.multiplicationFactor.hashCode()));
        result = ((result* 31)+((this.invalidValueDescription == null)? 0 :this.invalidValueDescription.hashCode()));
        result = ((result* 31)+((this.specialValue == null)? 0 :this.specialValue.hashCode()));
        result = ((result* 31)+((this.pseudonymization == null)? 0 :this.pseudonymization.hashCode()));
        result = ((result* 31)+((this.containsDataFrom == null)? 0 :this.containsDataFrom.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.classificationUri == null)? 0 :this.classificationUri.hashCode()));
        result = ((result* 31)+((this.measurementUnit == null)? 0 :this.measurementUnit.hashCode()));
        result = ((result* 31)+((this.customType == null)? 0 :this.customType.hashCode()));
        result = ((result* 31)+((this.dataElementPath == null)? 0 :this.dataElementPath.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.isPersonalData == null)? 0 :this.isPersonalData.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
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
        if ((other instanceof Variable) == false) {
            return false;
        }
        Variable rhs = ((Variable) other);
        return (((((((((((((((((((((((((this.containsDataUntil == rhs.containsDataUntil)||((this.containsDataUntil!= null)&&this.containsDataUntil.equals(rhs.containsDataUntil)))&&((this.populationDescription == rhs.populationDescription)||((this.populationDescription!= null)&&this.populationDescription.equals(rhs.populationDescription))))&&((this.definitionUri == rhs.definitionUri)||((this.definitionUri!= null)&&this.definitionUri.equals(rhs.definitionUri))))&&((this.temporalityType == rhs.temporalityType)||((this.temporalityType!= null)&&this.temporalityType.equals(rhs.temporalityType))))&&((this.unitType == rhs.unitType)||((this.unitType!= null)&&this.unitType.equals(rhs.unitType))))&&((this.variableRole == rhs.variableRole)||((this.variableRole!= null)&&this.variableRole.equals(rhs.variableRole))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.multiplicationFactor == rhs.multiplicationFactor)||((this.multiplicationFactor!= null)&&this.multiplicationFactor.equals(rhs.multiplicationFactor))))&&((this.invalidValueDescription == rhs.invalidValueDescription)||((this.invalidValueDescription!= null)&&this.invalidValueDescription.equals(rhs.invalidValueDescription))))&&((this.specialValue == rhs.specialValue)||((this.specialValue!= null)&&this.specialValue.equals(rhs.specialValue))))&&((this.pseudonymization == rhs.pseudonymization)||((this.pseudonymization!= null)&&this.pseudonymization.equals(rhs.pseudonymization))))&&((this.containsDataFrom == rhs.containsDataFrom)||((this.containsDataFrom!= null)&&this.containsDataFrom.equals(rhs.containsDataFrom))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.classificationUri == rhs.classificationUri)||((this.classificationUri!= null)&&this.classificationUri.equals(rhs.classificationUri))))&&((this.measurementUnit == rhs.measurementUnit)||((this.measurementUnit!= null)&&this.measurementUnit.equals(rhs.measurementUnit))))&&((this.customType == rhs.customType)||((this.customType!= null)&&this.customType.equals(rhs.customType))))&&((this.dataElementPath == rhs.dataElementPath)||((this.dataElementPath!= null)&&this.dataElementPath.equals(rhs.dataElementPath))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.isPersonalData == rhs.isPersonalData)||((this.isPersonalData!= null)&&this.isPersonalData.equals(rhs.isPersonalData))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.dataSource == rhs.dataSource)||((this.dataSource!= null)&&this.dataSource.equals(rhs.dataSource))));
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
        BOOLEAN("BOOLEAN"),
        FLOAT("FLOAT"),
        ARRAY("ARRAY");
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
        private final static Map<String, Variable.TemporalityTypeType> CONSTANTS = new HashMap<String, Variable.TemporalityTypeType>();

        static {
            for (Variable.TemporalityTypeType c: values()) {
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
        public static Variable.TemporalityTypeType fromValue(String value) {
            Variable.TemporalityTypeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static class VariableBuilder
        extends Variable.VariableBuilderBase<Variable>
    {


        public VariableBuilder() {
            super();
        }

        public VariableBuilder(String shortName, String dataElementPath, List<Object> name, Variable.DataType dataType, Variable.VariableRole variableRole, URI definitionUri, Boolean isPersonalData, Pseudonymization pseudonymization, String unitType, String dataSource, List<Object> populationDescription, List<Object> comment, Variable.TemporalityTypeType temporalityType, String measurementUnit, Integer multiplicationFactor, String format, URI classificationUri, SpecialValues specialValue, List<Object> invalidValueDescription, List<CustomType__1> customType, UUID id, String containsDataFrom, String containsDataUntil) {
            super(shortName, dataElementPath, name, dataType, variableRole, definitionUri, isPersonalData, pseudonymization, unitType, dataSource, populationDescription, comment, temporalityType, measurementUnit, multiplicationFactor, format, classificationUri, specialValue, invalidValueDescription, customType, id, containsDataFrom, containsDataUntil);
        }

    }

    public static abstract class VariableBuilderBase<T extends Variable >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public VariableBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Variable.VariableBuilder.class)) {
                this.instance = ((T) new Variable());
            }
        }

        @SuppressWarnings("unchecked")
        public VariableBuilderBase(String shortName, String dataElementPath, List<Object> name, Variable.DataType dataType, Variable.VariableRole variableRole, URI definitionUri, Boolean isPersonalData, Pseudonymization pseudonymization, String unitType, String dataSource, List<Object> populationDescription, List<Object> comment, Variable.TemporalityTypeType temporalityType, String measurementUnit, Integer multiplicationFactor, String format, URI classificationUri, SpecialValues specialValue, List<Object> invalidValueDescription, List<CustomType__1> customType, UUID id, String containsDataFrom, String containsDataUntil) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(Variable.VariableBuilder.class)) {
                this.instance = ((T) new Variable(shortName, dataElementPath, name, dataType, variableRole, definitionUri, isPersonalData, pseudonymization, unitType, dataSource, populationDescription, comment, temporalityType, measurementUnit, multiplicationFactor, format, classificationUri, specialValue, invalidValueDescription, customType, id, containsDataFrom, containsDataUntil));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public Variable.VariableBuilderBase withShortName(String shortName) {
            ((Variable) this.instance).shortName = shortName;
            return this;
        }

        public Variable.VariableBuilderBase withDataElementPath(String dataElementPath) {
            ((Variable) this.instance).dataElementPath = dataElementPath;
            return this;
        }

        public Variable.VariableBuilderBase withName(List<Object> name) {
            ((Variable) this.instance).name = name;
            return this;
        }

        public Variable.VariableBuilderBase withDataType(Variable.DataType dataType) {
            ((Variable) this.instance).dataType = dataType;
            return this;
        }

        public Variable.VariableBuilderBase withVariableRole(Variable.VariableRole variableRole) {
            ((Variable) this.instance).variableRole = variableRole;
            return this;
        }

        public Variable.VariableBuilderBase withDefinitionUri(URI definitionUri) {
            ((Variable) this.instance).definitionUri = definitionUri;
            return this;
        }

        public Variable.VariableBuilderBase withIsPersonalData(Boolean isPersonalData) {
            ((Variable) this.instance).isPersonalData = isPersonalData;
            return this;
        }

        public Variable.VariableBuilderBase withPseudonymization(Pseudonymization pseudonymization) {
            ((Variable) this.instance).pseudonymization = pseudonymization;
            return this;
        }

        public Variable.VariableBuilderBase withUnitType(String unitType) {
            ((Variable) this.instance).unitType = unitType;
            return this;
        }

        public Variable.VariableBuilderBase withDataSource(String dataSource) {
            ((Variable) this.instance).dataSource = dataSource;
            return this;
        }

        public Variable.VariableBuilderBase withPopulationDescription(List<Object> populationDescription) {
            ((Variable) this.instance).populationDescription = populationDescription;
            return this;
        }

        public Variable.VariableBuilderBase withComment(List<Object> comment) {
            ((Variable) this.instance).comment = comment;
            return this;
        }

        public Variable.VariableBuilderBase withTemporalityType(Variable.TemporalityTypeType temporalityType) {
            ((Variable) this.instance).temporalityType = temporalityType;
            return this;
        }

        public Variable.VariableBuilderBase withMeasurementUnit(String measurementUnit) {
            ((Variable) this.instance).measurementUnit = measurementUnit;
            return this;
        }

        public Variable.VariableBuilderBase withMultiplicationFactor(Integer multiplicationFactor) {
            ((Variable) this.instance).multiplicationFactor = multiplicationFactor;
            return this;
        }

        public Variable.VariableBuilderBase withFormat(String format) {
            ((Variable) this.instance).format = format;
            return this;
        }

        public Variable.VariableBuilderBase withClassificationUri(URI classificationUri) {
            ((Variable) this.instance).classificationUri = classificationUri;
            return this;
        }

        public Variable.VariableBuilderBase withSpecialValue(SpecialValues specialValue) {
            ((Variable) this.instance).specialValue = specialValue;
            return this;
        }

        public Variable.VariableBuilderBase withInvalidValueDescription(List<Object> invalidValueDescription) {
            ((Variable) this.instance).invalidValueDescription = invalidValueDescription;
            return this;
        }

        public Variable.VariableBuilderBase withCustomType(List<CustomType__1> customType) {
            ((Variable) this.instance).customType = customType;
            return this;
        }

        public Variable.VariableBuilderBase withId(UUID id) {
            ((Variable) this.instance).id = id;
            return this;
        }

        public Variable.VariableBuilderBase withContainsDataFrom(String containsDataFrom) {
            ((Variable) this.instance).containsDataFrom = containsDataFrom;
            return this;
        }

        public Variable.VariableBuilderBase withContainsDataUntil(String containsDataUntil) {
            ((Variable) this.instance).containsDataUntil = containsDataUntil;
            return this;
        }

        public Variable.VariableBuilderBase withAdditionalProperty(String name, Object value) {
            ((Variable) this.instance).additionalProperties.put(name, value);
            return this;
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
