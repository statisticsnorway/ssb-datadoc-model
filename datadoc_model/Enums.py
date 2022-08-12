from enum import Enum
from datadoc_model.LanguageStrings import LanguageStrings
from datadoc_model.LanguageStringsEnum import LanguageStringsEnum


class SupportedLanguages(str, Enum):
    "Reference: https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry"
    NORSK_BOKMÅL = "nb"
    NORSK_NYNORSK = "nn"
    ENGLISH = "en"


class Assessment(LanguageStringsEnum):
    # TODO: May have some kind of relation to DataSetState (SSB decision not made yet)? E.g. if "PROCSESSED_DATA" then "PROTECTED"?
    SENSITIVE = LanguageStrings(en="SENSITIVE", nn="SENSITIV", nb="SENSITIV")
    PROTECTED = LanguageStrings(en="PROTECTED", nn="BESKYTTET", nb="BESKYTTET")
    OPEN = LanguageStrings(en="OPEN", nn="ÅPEN", nb="ÅPEN")


class DatasetStatus(LanguageStringsEnum):
    DRAFT = LanguageStrings(en="DRAFT", nn="UTKAST", nb="UTKAST")
    INTERNAL = LanguageStrings(en="INTERNAL", nn="INTERN", nb="INTERN")
    EXTERNAL = LanguageStrings(en="EXTERNAL", nn="EKSTERN", nb="EKSTERN")
    DEPRECATED = LanguageStrings(en="DEPRECATED", nn="UTGÅTT", nb="UTGÅTT")


class DatasetState(LanguageStringsEnum):
    SOURCE_DATA = LanguageStrings(en="SOURCE DATA", nn="KILDEDATA", nb="KILDEDATA")
    INPUT_DATA = LanguageStrings(en="INPUT DATA", nn="INNDATA", nb="INNDATA")
    PROCESSED_DATA = LanguageStrings(
        en="PROCESSED DATA", nn="KLARGJORTE DATA", nb="KLARGJORTE DATA"
    )
    STATISTIC = LanguageStrings(en="STATISTIC", nn="STATISTIKK", nb="STATISTIKK")
    OUTPUT_DATA = LanguageStrings(en="OUTPUT DATA", nn="UTDATA", nb="UTDATA")


class UnitType(LanguageStringsEnum):
    """See list of SSB unit types https://www.ssb.no/metadata/definisjoner-av-statistiske-enheter"""

    ARBEIDSULYKKE = LanguageStrings(
        en="WORK ACCIDENT", nn="ARBEIDSULYKKE", nb="ARBEIDSULYKKE"
    )
    BOLIG = LanguageStrings(en="HOUSING", nn="BOLIG", nb="BOLIG")
    BYGNING = LanguageStrings(en="BUILDING", nn="BYGNING", nb="BYGNING")
    EIENDOM = LanguageStrings(en="PROPERTY", nn="EIENDOM", nb="EIENDOM")
    FAMILIE = LanguageStrings(en="FAMILY", nn="FAMILIE", nb="FAMILIE")
    FORETAK = LanguageStrings(en="COMPANY", nn="FORETAK", nb="FORETAK")
    FYLKE = LanguageStrings(en="REGION", nn="FYLKE", nb="FYLKE")
    HAVNEANLOEP = LanguageStrings(en="PORT CALL", nn="HAVNEANLOEP", nb="HAVNEANLOEP")
    HUSHOLDNING = LanguageStrings(en="HOUSEHOLD", nn="HUSHOLDNING", nb="HUSHOLDNING")
    KJOERETOEY = LanguageStrings(en="VEHICLE", nn="KJOERETOEY", nb="KJOERETOEY")
    KOMMUNE = LanguageStrings(en="COUNTY", nn="KOMMUNE", nb="KOMMUNE")
    KURS = LanguageStrings(en="COURSE", nn="KURS", nb="KURS")
    LOVBRUDD = LanguageStrings(en="CRIME", nn="LOVBRUDD", nb="LOVBRUDD")
    PERSON = LanguageStrings(en="PERSON", nn="PERSON", nb="PERSON")
    STAT = LanguageStrings(en="STATE", nn="STAT", nb="STAT")
    STORFE = LanguageStrings(en="CATTLE", nn="STORFE", nb="STORFE")
    TRAFIKKULYKKE = LanguageStrings(
        en="TRAFFIC ACCIDENT", nn="TRAFIKKULYKKE", nb="TRAFIKKULYKKE"
    )
    TRANSAKSJON = LanguageStrings(en="TRANSACTION", nn="TRANSAKSJON", nb="TRANSAKSJON")
    VARE_TJENESTE = LanguageStrings(
        en="GOOD/SERVICE", nn="VARE/TJENESTE", nb="VARE/TJENESTE"
    )
    VERDIPAPIR = LanguageStrings(en="SERVICE", nn="VERDIPAPIR", nb="VERDIPAPIR")
    VIRKSOMHET = LanguageStrings(en="BUSINESS", nn="VIRKSOMHET", nb="VIRKSOMHET")


class TemporalityType(LanguageStringsEnum):
    # More information about temporality type: https://statistics-norway.atlassian.net/l/c/HV12q90R
    FIXED = LanguageStrings(en="FIXED", nn="FAST", nb="FAST")
    STATUS = LanguageStrings(en="STATUS", nn="TVERRSNITT", nb="TVERRSNITT")
    ACCUMULATED = LanguageStrings(en="ACCUMULATED", nn="AKKUMULERT", nb="AKKUMULERT")
    EVENT = LanguageStrings(en="EVENT", nn="HENDELSE", nb="HENDELSE")


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
