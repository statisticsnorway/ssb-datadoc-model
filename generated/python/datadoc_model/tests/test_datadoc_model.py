from datadoc_model.model import (
    DatadocJsonSchema,
    MetadataContainer,
    PseudonymizationJsonSchema,
)


def test_instantiate_no_values_container():
    container = MetadataContainer()
    assert isinstance(container, MetadataContainer)


def test_instantiate_no_values_datadoc():
    datadoc = DatadocJsonSchema()
    assert isinstance(datadoc, DatadocJsonSchema)


def test_instantiate_no_values_pseudo():
    pseudo = PseudonymizationJsonSchema()
    assert isinstance(pseudo, PseudonymizationJsonSchema)
