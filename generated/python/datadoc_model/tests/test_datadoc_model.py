from datadoc_model.model import (
    DatadocJsonSchema,
    MetadataContainer,
    PseudonymizationJsonSchema,
)


def test_instantiate_no_values_container():
    container = MetadataContainer()
    assert isinstance(container, MetadataContainer)


def test_instantiate_no_values_datadoc():
    container = DatadocJsonSchema()
    assert isinstance(container, DatadocJsonSchema)


def test_instantiate_no_values_pseudo():
    container = PseudonymizationJsonSchema()
    assert isinstance(container, PseudonymizationJsonSchema)
