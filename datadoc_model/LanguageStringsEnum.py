from enum import Enum
from typing import TYPE_CHECKING


if TYPE_CHECKING:
    # Avoid circular imports
    from datadoc_model.LanguageStrings import LanguageStrings
    from datadoc_model.Enums import SupportedLanguages


class LanguageStringsEnum(Enum):
    def __init__(self, language_strings: "LanguageStrings"):
        self._value_ = self.name
        self.language_strings = language_strings

    def get_value_for_language(self, language: "SupportedLanguages") -> str:
        return getattr(self.language_strings, language.value)
