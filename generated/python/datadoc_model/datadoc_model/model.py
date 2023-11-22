# generated by datamodel-codegen:
#   filename:  metadata-container-json-schema.json
#   timestamp: 2023-11-22T12:56:11+00:00

from __future__ import annotations

from datetime import datetime
from enum import Enum
from typing import Any, Literal, Optional
from uuid import UUID

from pydantic import AnyUrl, BaseModel, Field


class Assessment(str, Enum):
    SENSITIVE = 'SENSITIVE'
    PROTECTED = 'PROTECTED'
    OPEN = 'OPEN'


class DatasetStatus(str, Enum):
    DRAFT = 'DRAFT'
    INTERNAL = 'INTERNAL'
    EXTERNAL = 'EXTERNAL'
    DEPRECATED = 'DEPRECATED'


class DatasetState(str, Enum):
    SOURCE_DATA = 'SOURCE_DATA'
    INPUT_DATA = 'INPUT_DATA'
    PROCESSED_DATA = 'PROCESSED_DATA'
    STATISTICS = 'STATISTICS'
    OUTPUT_DATA = 'OUTPUT_DATA'


class DataType(str, Enum):
    STRING = 'STRING'
    INTEGER = 'INTEGER'
    DATETIME = 'DATETIME'
    BOOLEAN = 'BOOLEAN'


class VariableRole(str, Enum):
    IDENTIFIER = 'IDENTIFIER'
    MEASURE = 'MEASURE'
    START_TIME = 'START_TIME'
    STOP_TIME = 'STOP_TIME'
    ATTRIBUTE = 'ATTRIBUTE'


class LanguageStringType(BaseModel):
    en: Optional[str] = None
    nn: Optional[str] = None
    nb: str


class UnitType(str, Enum):
    ARBEIDSULYKKE = 'ARBEIDSULYKKE'
    BOLIG = 'BOLIG'
    BYGNING = 'BYGNING'
    EIENDOM = 'EIENDOM'
    FAMILIE = 'FAMILIE'
    FORETAK = 'FORETAK'
    FYLKE = 'FYLKE'
    HAVNEANLOEP = 'HAVNEANLOEP'
    HUSHOLDNING = 'HUSHOLDNING'
    KJOERETOEY = 'KJOERETOEY'
    KOMMUNE = 'KOMMUNE'
    KURS = 'KURS'
    LOVBRUDD = 'LOVBRUDD'
    PERSON = 'PERSON'
    STAT = 'STAT'
    STORFE = 'STORFE'
    TRAFIKKULYKKE = 'TRAFIKKULYKKE'
    TRANSAKSJON = 'TRANSAKSJON'
    VARE_TJENESTE = 'VARE_TJENESTE'
    VERDIPAPIR = 'VERDIPAPIR'
    VIRKSOMHET = 'VIRKSOMHET'


class TemporalityTypeType(str, Enum):
    FIXED = 'FIXED'
    STATUS = 'STATUS'
    ACCUMULATED = 'ACCUMULATED'
    EVENT = 'EVENT'


class PseudoDataset(BaseModel):
    dataset_pseudo_time: datetime = Field(
        ...,
        description='Time at which the dataset was pseudonymized. In ISO 8601 format.',
        title='Dataset pseudo time',
    )
    source_dataset_path: Optional[str] = Field(
        None,
        description='Path to the unpseudonymized dataset. Specified as a file path, URL or URI.',
        title='Source dataset path',
    )


class SourceVariableDatatype(str, Enum):
    STRING = 'STRING'
    INTEGER = 'INTEGER'
    FLOAT = 'FLOAT'
    DATETIME = 'DATETIME'


class PseudoVariable(BaseModel):
    short_name: str = Field(
        ...,
        description='Physical name of the variable in the dataset. Should match the recommended short name.',
        title='Short name',
    )
    data_element_path: Optional[str] = Field(
        None,
        description='Path to one or multiple data element(s) in the dataset.',
        title='Data element path',
    )
    stable_identifier_type: Optional[str] = Field(
        None,
        description='Type of stable identifier the variable was mapped to prior to pseudonymization.',
        title='Stable identifier type',
    )
    stable_identifier_version: Optional[str] = Field(
        None,
        description='Version of stable identifier the variable was mapped to prior to pseudonymization.',
        title='Stable identifier version',
    )
    encryption_algorithm: str = Field(
        ...,
        description='The encryption algorithm used to pseudonymize the variable.',
        title='Encryption algorithm',
    )
    encryption_key_reference: str = Field(
        ...,
        description='Name of or reference to the encryption key used to pseudonymize the variable.',
        title='Encryption key reference',
    )
    encryption_algorithm_parameters: Optional[list[dict[str, Any]]] = Field(
        None,
        description='Parameters supplied to the encryption algorithm.',
        title='Encryption algorithm parameters',
    )
    source_variable: Optional[str] = Field(
        None, description='Short name of the source variable', title='Source variable'
    )
    source_variable_datatype: Optional[SourceVariableDatatype] = Field(
        None,
        description='Data type of the variable prior to pseudonymization.',
        title='Source variable data type',
    )


class PseudonymizationJsonSchema(BaseModel):
    document_version: Literal['0.0.1'] = '0.0.1'
    pseudo_dataset: PseudoDataset
    pseudo_variables: list[PseudoVariable]


class Dataset(BaseModel):
    short_name: str = Field(
        ...,
        description='Name of (physical) data file, data table or dataset',
        title='Short name',
    )
    assessment: Assessment = Field(
        ...,
        description='Value assessment (sensitivity classification) for the data set',
        title='Assessment',
    )
    dataset_status: DatasetStatus = Field(
        ..., description='Life cycle for data set', title='Data set status'
    )
    dataset_state: DatasetState = Field(
        ..., description='Steady state of data', title='Data set state'
    )
    name: LanguageStringType = Field(..., description='Name of data set', title='Name')
    description: LanguageStringType = Field(
        ..., description='Free text description of the data set', title='Description'
    )
    data_source: Optional[LanguageStringType] = Field(
        None,
        description='Data source. Set either for the data set or instance variable.',
        title='Data source',
    )
    register_uri: Optional[LanguageStringType] = Field(
        None, description='Link to register', title='Register'
    )
    population_description: LanguageStringType = Field(
        ...,
        description='Description of the population covered in the data set. Includes unit type, spatial coverage and period of time.',
        title='Description of population',
    )
    version: str = Field(..., description='Version of data set', title='Version')
    version_description: Optional[LanguageStringType] = Field(
        None,
        description='Dataset version information in the form of descriptive text',
        title='Version description',
    )
    unit_type: UnitType = Field(
        ...,
        description='Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter',
        title='Unit type',
    )
    temporality_type: Optional[TemporalityTypeType] = Field(
        None,
        description='Temporality type. Either for the instance variable or the data set',
        title='Temporality type',
    )
    subject_field: LanguageStringType = Field(
        ...,
        description='Primary area of statistics in which the data set is included',
        title='Subject field',
    )
    keyword: Optional[list[str]] = Field(
        None,
        description='A list of searchable keywords that can contribute to the development of effective filtering and search services.',
        title='Keyword(s)',
    )
    spatial_coverage_description: Optional[LanguageStringType] = Field(
        None,
        description="Description of the data set's spatial coverage",
        title='Spatial coverage description',
    )
    id: UUID = Field(
        ..., description='Unique identifier for the data set', title='Identifier'
    )
    owner: LanguageStringType = Field(
        ...,
        description='Owner of the data set (responsible division in Statistics Norway). See also Classification of organisational units https://www.ssb.no/en/klass/klassifikasjoner/83',
        title='Owner',
    )
    file_path: str = Field(
        ...,
        description="The file path contains the data set's name and the path to where it is stored",
        title='File path',
    )
    metadata_created_date: datetime = Field(
        ...,
        description='Created date for metadata about the data set',
        title='Metadata created date',
    )
    metadata_created_by: str = Field(
        ..., description='Created by identifiable person.', title='Metadata created by'
    )
    metadata_last_updated_date: datetime = Field(
        ...,
        description='Last updated date for metadata about the dataset',
        title='Metadata last updated date',
    )
    metadata_last_updated_by: str = Field(
        ...,
        description='Last change made by identifiable person. ',
        title='Metadata last updated by',
    )
    contains_data_from: Optional[str] = Field(
        None,
        description='The data set contains data from date/time',
        title='Contains data from',
    )
    contains_data_until: Optional[str] = Field(
        None,
        description='The data set contains data up until date/time',
        title='Contains data up until',
    )


class Variable(BaseModel):
    short_name: str = Field(
        ...,
        description='Physical name of the variable in the dataset. Should match the recommended short name.',
        title='Short name',
    )
    name: LanguageStringType = Field(
        ...,
        description='Variable names can be inherited from VarDef, but can also be documented/changed here',
        title='Name',
    )
    data_type: DataType = Field(..., description='Data type', title='Data type')
    variable_role: VariableRole = Field(
        ...,
        description='Role of the instance variable in the data set',
        title='Variable role',
    )
    definition_uri: Optional[AnyUrl] = Field(
        None,
        description="A link (URI) to the variable's definition in Vardok/VarDef",
        title='Definition URI',
    )
    direct_person_identifying: bool = Field(
        ...,
        description='Direct Person identifying Information (DPI). Some of the values \u200b\u200bin an instance variable kan be DPI, others not. In this case, DPI is set equal to true. For example, the variable exporter where some of the values \u200b\u200bcan be organization number, others social security numbers (sole proprietorships).',
        title='Direct Person identifying Information (DPI)',
    )
    data_source: Optional[LanguageStringType] = Field(
        None,
        description='Data source. Set at data set level, but can be overwritten at variable instance level.',
        title='Data source',
    )
    population_description: Optional[LanguageStringType] = Field(
        None,
        description='The population the variable describes can be specified in more detail here. Set at dataset level, but can be overwritten at instance variable level.',
        title='Population description',
    )
    comment: Optional[LanguageStringType] = Field(
        None,
        description='Further clarification of the variables definition',
        title='Comment',
    )
    temporality_type: Optional[TemporalityTypeType] = Field(
        None,
        description='Temporality type. Set either for variable instance or dataset.',
        title='Temporality type',
    )
    measurement_unit: Optional[str] = Field(
        None, description='Measurement unit', title='Measurement unit'
    )
    format: Optional[str] = Field(
        None,
        description='The format of the values \u200b\u200b(physical format or regular expression) in machine-readable form for validation. This can be used as a further specification of the data type (dataType) in those cases where this is relevant.',
        title='Format',
    )
    classification_uri: Optional[AnyUrl] = Field(
        None,
        description='Link (URI) to valid classification or code list',
        title='Classification or codelist URI',
    )
    sentinel_value_uri: Optional[AnyUrl] = Field(
        None,
        description='A link (URI) to an overview of sentinel values included in the variable. Proposals for the standardization of sentinel values \u200b\u200bhave been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway:  01 - In total, 02 - Sum, 03 - Subtotal, 04 - Other, 05 - Rest, 06 - Invalid value, 07 - Unspecified, 08 - Not relevant',
        title='Sentinel value URI',
    )
    invalid_value_description: Optional[LanguageStringType] = Field(
        None,
        description='Invalid value(s) description used in addition (or as an alternative) to standard sentinel values.',
        title='Invalid value(s) description',
    )
    id: UUID = Field(
        ...,
        description='Unique SSB identifier for the instance variable in the data set',
        title='Identifier',
    )
    contains_data_from: Optional[datetime] = Field(
        None,
        description='The instance variable in the data set contains data from and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some variables only contain data for the most recent periods/years, e.g. if the entire data set contains data from 1970 to 2020, while some instance variables only contain data from 1998 onwards.',
        title='Contains data from',
    )
    contains_data_until: Optional[datetime] = Field(
        None,
        description='The instance variable in the data set contains data up to and including this date. This can be useful information for data sets that contain many instance variables in addition to data for many periods/years. In many cases, it will then be the case that some of the instance variables in the data set are terminated (no longer updated) after a given point in time.',
        title='Contains data up until',
    )


class DatadocJsonSchema(BaseModel):
    percentage_complete: Optional[int] = Field(
        None, description='Percentage of obligatory metadata fields populated.'
    )
    document_version: Literal['2.0.0'] = Field(
        '2.0.0', description='Version of this model'
    )
    dataset: Dataset
    variables: list[Variable]


class MetadataContainer(BaseModel):
    document_version: Literal['0.0.1'] = None
    datadoc: Optional[DatadocJsonSchema] = None
    pseudonymization: Optional[PseudonymizationJsonSchema] = None
