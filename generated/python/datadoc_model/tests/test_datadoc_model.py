from datadoc_model.model import (
    DatadocMetadata,
    MetadataContainer,
    PseudonymizationMetadata,
)


def test_instantiate_no_values_container():
    container = MetadataContainer()
    assert isinstance(container, MetadataContainer)


def test_instantiate_no_values_datadoc():
    container = DatadocMetadata()
    assert isinstance(container, DatadocMetadata)


def test_instantiate_no_values_pseudo():
    container = PseudonymizationMetadata()
    assert isinstance(container, PseudonymizationMetadata)
