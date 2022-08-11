from enum import Enum
from datadoc_model.LanguageStrings import LanguageStrings
from datadoc_model.LanguageStringsEnum import LanguageStringsEnum


class SupportedLanguages(str, Enum):
    "Reference: https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry"
    NORSK_BOKMÅL = "nb"
    NORSK_NYNORSK = "nn"
    ENGLISH = "en"


class Assessment(str, Enum):
    # TODO: May have some kind of relation to DataSetState (SSB decision not made yet)? E.g. if "PROCSESSED_DATA" then "PROTECTED"?
    SENSITIVE = "SENSITIVE"
    PROTECTED = "PROTECTED"
    OPEN = "OPEN"


class DatasetState(LanguageStringsEnum):
    SOURCE_DATA = LanguageStrings(en="SOURCE DATA", nn="KILDEDATA", nb="KILDEDATA")
    INPUT_DATA = LanguageStrings(en="INPUT DATA", nn="INNDATA", nb="INNDATA")
    PROCESSED_DATA = LanguageStrings(
        en="PROCESSED DATA", nn="KLARGJORTE DATA", nb="KLARGJORTE DATA"
    )
    STATISTIC = LanguageStrings(en="STATISTIC", nn="STATISTIKK", nb="STATISTIKK")
    OUTPUT_DATA = LanguageStrings(en="OUTPUT DATA", nn="UTDATA", nb="UTDATA")


class DatasetStatus(str, Enum):
    DRAFT = "DRAFT"
    INTERNAL = "INTERNAL"
    EXTERNAL = "EXTERNAL"
    DEPRECATED = "DEPRECATED"


class UnitType(str, Enum):
    # TODO: May change in the nearest future? See list of SSB unit types https://www.ssb.no/metadata/definisjoner-av-statistiske-enheter
    ARBEIDSULYKKE = "ARBEIDSULYKKE"
    BOLIG = "BOLIG"
    BYGNING = "BYGNING"
    EIENDOM = "EIENDOM"
    FAMILIE = "FAMILIE"
    FORETAK = "FORETAK"
    FYLKE = "FYLKE"
    HAVNEANLOEP = "HAVNEANLOEP"
    HUSHOLDNING = "HUSHOLDNING"
    KJOERETOEY = "KJOERETOEY"
    KOMMUNE = "KOMMUNE"
    KURS = "KURS"
    LOVBRUDD = "LOVBRUDD"
    PERSON = "PERSON"
    STAT = "STAT"
    STORFE = "STORFE"
    TRAFIKKULYKKE = "TRAFIKKULYKKE"
    TRANSAKSJON = "TRANSAKSJON"
    VARE_TJENESTE = "VARE_TJENESTE"
    VERDIPAPIR = "VERDIPAPIR"
    VIRKSOMHET = "VIRKSOMHET"


class TemporalityType(str, Enum):
    # More information about temporality type: https://statistics-norway.atlassian.net/l/c/HV12q90R
    FIXED = "FIXED"
    STATUS = "STATUS"
    ACCUMULATED = "ACCUMULATED"
    EVENT = "EVENT"


class Datatype(str, Enum):
    STRING = "STRING"
    INTEGER = "INTEGER"
    FLOAT = "FLOAT"
    DATETIME = "DATETIME"
    BOOLEAN = "BOOLEAN"


class VariableRole(str, Enum):
    IDENTIFIER = "IDENTIFIER"
    MEASURE = "MEASURE"
    START_TIME = "START_TIME"
    STOP_TIME = "STOP_TIME"
    ATTRIBUTE = "ATTRIBUTE"
