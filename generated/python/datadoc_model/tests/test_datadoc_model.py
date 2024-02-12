from datadoc_model.model import (
    DatadocMetadata,
    MetadataContainer,
    PseudonymizationMetadata,
)


def test_instantiate_no_values_container():
    container = MetadataContainer()
    assert isinstance(container, MetadataContainer)


def test_instantiate_no_values_datadoc():
    datadoc = DatadocMetadata()
    assert isinstance(datadoc, DatadocMetadata)


def test_instantiate_no_values_pseudo():
    pseudo = PseudonymizationMetadata()
    assert isinstance(pseudo, PseudonymizationMetadata)
