# generated by datamodel-codegen:
#   filename:  datadoc-json-schema.json
#   timestamp: 2023-11-16T10:34:58+00:00

from __future__ import annotations

from datetime import datetime
from enum import Enum
from typing import List, Optional
from uuid import UUID

from pydantic import AnyUrl, BaseModel, Field
from typing_extensions import Literal


class Assessment(Enum):
    SENSITIVE = 'SENSITIVE'
    PROTECTED = 'PROTECTED'
    OPEN = 'OPEN'


class DatasetStatus(Enum):
    DRAFT = 'DRAFT'
    INTERNAL = 'INTERNAL'
    EXTERNAL = 'EXTERNAL'
    DEPRECATED = 'DEPRECATED'


class DatasetState(Enum):
    SOURCE_DATA = 'SOURCE_DATA'
    INPUT_DATA = 'INPUT_DATA'
    PROCESSED_DATA = 'PROCESSED_DATA'
    STATISTICS = 'STATISTICS'
    OUTPUT_DATA = 'OUTPUT_DATA'


class DataType(Enum):
    STRING = 'STRING'
    INTEGER = 'INTEGER'
    DATETIME = 'DATETIME'
    BOOLEAN = 'BOOLEAN'


class VariableRole(Enum):
    IDENTIFIER = 'IDENTIFIER'
    MEASURE = 'MEASURE'
    START_TIME = 'START_TIME'
    STOP_TIME = 'STOP_TIME'
    ATTRIBUTE = 'ATTRIBUTE'


class LanguageStringType(BaseModel):
    en: Optional[str] = None
    nn: Optional[str] = None
    nb: Optional[str] = None


class UnitType(Enum):
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


class TemporalityTypeType(Enum):
    FIXED = 'FIXED'
    STATUS = 'STATUS'
    ACCUMULATED = 'ACCUMULATED'
    EVENT = 'EVENT'


class Dataset(BaseModel):
    short_name: Optional[str] = Field(
        None,
        description='Name of (physical) data file, data table or dataset',
        title='Short name',
    )
    assessment: Optional[Assessment] = Field(
        None,
        description='Value assessment (sensitivity classification) for the data set',
        title='Assessment',
    )
    dataset_status: Optional[DatasetStatus] = Field(
        None, description='Life cycle for data set', title='Data set status'
    )
    dataset_state: Optional[DatasetState] = Field(
        None, description='Steady state of data', title='Data set state'
    )
    name: Optional[LanguageStringType] = Field(
        None, description='Name of data set', title='Name'
    )
    description: Optional[LanguageStringType] = Field(
        None, description='Free text description of the data set', title='Description'
    )
    data_source: Optional[LanguageStringType] = Field(
        None,
        description='Data source. Set either for the data set or instance variable.',
        title='Data source',
    )
    register_uri: Optional[LanguageStringType] = Field(
        None, description='Link to register', title='Register'
    )
    population_description: Optional[LanguageStringType] = Field(
        None,
        description='Description of the population covered in the data set. Includes unit type, spatial coverage and period of time.',
        title='Description of population',
    )
    version: Optional[str] = Field(
        None, description='Version of data set', title='Version'
    )
    version_description: Optional[LanguageStringType] = Field(
        None,
        description='Dataset version information in the form of descriptive text',
        title='Version description',
    )
    unit_type: Optional[UnitType] = Field(
        None,
        description='Unit Type for data file, table or data set. See Definitions of Unit Types https://www.ssb.no/en/metadata/definisjoner-av-statistiske-enheter',
        title='Unit type',
    )
    temporality_type: Optional[TemporalityTypeType] = Field(
        None,
        description='Temporality type. Either for the instance variable or the data set',
        title='Temporality type',
    )
    subject_field: Optional[LanguageStringType] = Field(
        None,
        description='Primary area of statistics in which the data set is included',
        title='Subject field',
    )
    keyword: Optional[List[str]] = Field(
        None,
        description='A list of searchable keywords that can contribute to the development of effective filtering and search services.',
        title='Keyword(s)',
    )
    spatial_coverage_description: Optional[LanguageStringType] = Field(
        None,
        description="Description of the data set's spatial coverage",
        title='Spatial coverage description',
    )
    id: Optional[UUID] = Field(
        None, description='Unique identifier for the data set', title='Identifier'
    )
    owner: Optional[LanguageStringType] = Field(
        None,
        description='Owner of the data set (responsible division in Statistics Norway). See also Classification of organisational units https://www.ssb.no/en/klass/klassifikasjoner/83',
        title='Owner',
    )
    file_path: Optional[str] = Field(
        None,
        description="The file path contains the data set's name and the path to where it is stored",
        title='File path',
    )
    metadata_created_date: Optional[datetime] = Field(
        None,
        description='Created date for metadata about the data set',
        title='Metadata created date',
    )
    metadata_created_by: Optional[str] = Field(
        None, description='Created by identifiable person.', title='Metadata created by'
    )
    metadata_last_updated_date: Optional[datetime] = Field(
        None,
        description='Last updated date for metadata about the dataset',
        title='Metadata last updated date',
    )
    metadata_last_updated_by: Optional[str] = Field(
        None,
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
    short_name: Optional[str] = Field(
        None,
        description='Physical name of the variable in the dataset. Should match the recommended short name.',
        title='Short name',
    )
    name: Optional[LanguageStringType] = Field(
        None,
        description='Variable names can be inherited from VarDef, but can also be documented/changed here',
        title='Name',
    )
    data_type: Optional[DataType] = Field(
        None, description='Data type', title='Data type'
    )
    variable_role: Optional[VariableRole] = Field(
        None,
        description='Role of the instance variable in the data set',
        title='Variable role',
    )
    definition_uri: Optional[AnyUrl] = Field(
        None,
        description="A link (URI) to the variable's definition in Vardok/VarDef",
        title='Definition URI',
    )
    direct_person_identifying: Optional[bool] = Field(
        None,
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
    id: Optional[UUID] = Field(
        None,
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


class Model(BaseModel):
    percentage_complete: Optional[int] = None
    document_version: Literal['2.0.0'] = None
    dataset: Optional[Dataset] = None
    variables: Optional[List[Variable]] = None