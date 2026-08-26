import pytest
from pydantic import ValidationError

from datadoc_model.all_optional.model import (
    DatadocMetadata,
    MetadataContainer,
    Variable,
)


def test_instantiate_no_values_container():
    container = MetadataContainer()
    assert isinstance(container, MetadataContainer)


def test_instantiate_no_values_datadoc():
    datadoc = DatadocMetadata()
    assert isinstance(datadoc, DatadocMetadata)


def test_unknown_field():
    with pytest.raises(ValidationError):
        DatadocMetadata(unknown_field="random_value")

@pytest.mark.parametrize(
    "data_type",
    [
        "ARRAY[STRING]",
        "ARRAY[INTEGER]",
        "ARRAY[DATETIME]",
        "ARRAY[BOOLEAN]",
        "ARRAY[FLOAT]",
    ],
)
def test_array_data_type_with_inner_type(data_type):
    variable = Variable(data_type=data_type)
    assert variable.model_dump(mode="json")["data_type"] == data_type
