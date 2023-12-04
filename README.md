# ssb-datadoc-model

Data Model for use in Statistics Norway's Metadata system

## Purpose

This package contains models defining the fields and data types used in Statistics Norway's metadata system. The purpose of these models is to:

- Enable validation of user data
- Enable serialization and deserialization of metadata files
- Support versioning of the metadata format
- Enforce consistency across multiple tools

## Model definition

The models are defined as [JSON Schema](https://json-schema.org/) documents. These are the single source of truth for metadata formats at Statistics Norway. The models reside within the `src/` directory in this repo. They may be directly used to validate metadata documents.

## Code generation

In order to facilitate production of compatible metadata documents, we generate code in a variety of languages. All languages use the models defined in the `src/` directory as their source. The generated code lives in the `generated/` directory, with a subdirectory for each language, and the package within a further subdirectory.

Currently supported languages are:

- Python
- Java

## Versioning

There are many versions in this repo, and care must be taken when incrementing versions such that we maintain a consistent approach and so we may maintain backwards compatibility for all existing metadata documents.

### Overall strategy

All versions in this repo follow semantic versioning.

### JSON Schema versions

_All_ changes to JSON Schema documents must result in version increments.

#### Patch versions

The most minor changes, such as corrections to descriptions of fields should result in patch version increments e.g. 0.0.1 -> 0.0.2.

#### Major versions

Due to the strict nature of these models, it is very easy to introduce breaking changes. All breaking changes should result in major version increments e.g. 1.1.14 -> 2.0.0. Examples of changes which are breaking:

- Removing a field
- Adding a field
- Changing the name of a field
- Changing the type of a field (unless it makes the type more _permissive_)

#### Recording the version

Each document has a field `document_version` which is a constant and records the version of the document when it was created. This should be incremented in the JSON Schema when changes to that schema are made.

### Code package versions

The code package versions should be incremented _at least_ as much as JSON Schema increments. For example, a minor version increment in a JSON Schema means all code packages should be incremented by a minor version. The only exception to this is if there are other technical changes which can be breaking, then the major version should be incremented.

More detail is provided in the README for each package.

## Release process

Each language has its own release process, refer to the READMEs with the 'generated/' directory.
