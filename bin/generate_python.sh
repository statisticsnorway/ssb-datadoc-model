#! /usr/bin/env bash

while [ "$#" -gt 0 ]; do
  case "$1" in
    --output=*) OUTPUT="${1#*=}"; shift 1;;
    --output) echo "$1 requires an argument" >&2; exit 1;;

    --force-optional) FORCE_OPTIONAL=true; shift 1;;

    -*) echo "$LOG_PREFIX unknown option: $1" >&2; exit 1;;
    # Skip positional arguments
    *) shift 1;;
  esac
done

datamodel-codegen \
    --input-file-type jsonschema \
    --input src/metadata-container-json-schema.json \
    --output-model-type pydantic_v2.BaseModel \
    --base-class "datadoc_model.datadoc_base_model.DatadocBaseModel" \
    --use-default \
    --use-title-as-name \
    --use-one-literal-as-default \
    --use-subclass-enum \
    --use-standard-collections \
    --use-double-quotes \
    --target-python-version 3.10 \
    --output "$OUTPUT" \
    ${FORCE_OPTIONAL:+"--force-optional"}
