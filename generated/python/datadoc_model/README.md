# ssb-datadoc-model

Data Model for use in Statistics Norway's Metadata system

## Purpose

This package contains pydantic models defining the fields and data types used in Statistics Norway's metadata system. The purpose of these models is to:

- Enable validation of user data
- Enable serialization and deserialization of metadata files
- Support versioning of the metadata format
- Enforce consistency across multiple tools

## Release process

Update the version using `uv version --bump`. This project follows [semantic versioning](https://semver.org/):

```bash
uv version --bump patch   # bug fixes
uv version --bump minor   # new features
uv version --bump major   # breaking changes
```

Create a new branch for the release.

Commit with message like `Bump version x.x.x -> y.y.y`.

Open and merge a PR.