# ssb-datadoc-model

Data Model for use in Statistics Norway's Metadata system

## Purpose

This package contains Java classes defining the fields and data types used in Statistics Norway's metadata system. The purpose of these models is to:

- Enable validation of user data
- Enable serialization and deserialization of metadata files
- Support versioning of the metadata format
- Enforce consistency across multiple tools

## Release

This packaged is built and released using the Maven Release Plugin and Github Actions.

To release a new version simply create a branch prefixed with `release-java` and everything else is taken care of, including version increment, tagging, building, pushing artifacts and a GitHub release.
