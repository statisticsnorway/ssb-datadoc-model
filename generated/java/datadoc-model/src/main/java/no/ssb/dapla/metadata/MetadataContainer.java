
package no.ssb.dapla.metadata;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import no.ssb.dapla.metadata.datadoc.DatadocMetadata;


/**
 * Metadata container
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "document_version",
    "datadoc"
})
@Generated("jsonschema2pojo")
public class MetadataContainer implements Serializable
{

    /**
     * Version of this model
     * 
     */
    @JsonProperty("document_version")
    private Object documentVersion;
    /**
     * Datadoc metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("datadoc")
    @Valid
    private DatadocMetadata datadoc;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5502058716266199719L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetadataContainer() {
    }

    public MetadataContainer(Object documentVersion, DatadocMetadata datadoc) {
        super();
        this.documentVersion = documentVersion;
        this.datadoc = datadoc;
    }

    public static MetadataContainer.MetadataContainerBuilderBase builder() {
        return new MetadataContainer.MetadataContainerBuilder();
    }

    /**
     * Version of this model
     * 
     */
    @JsonProperty("document_version")
    public Object getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Version of this model
     * 
     */
    @JsonProperty("document_version")
    public void setDocumentVersion(Object documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * Datadoc metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("datadoc")
    public DatadocMetadata getDatadoc() {
        return datadoc;
    }

    /**
     * Datadoc metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("datadoc")
    public void setDatadoc(DatadocMetadata datadoc) {
        this.datadoc = datadoc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetadataContainer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("documentVersion");
        sb.append('=');
        sb.append(((this.documentVersion == null)?"<null>":this.documentVersion));
        sb.append(',');
        sb.append("datadoc");
        sb.append('=');
        sb.append(((this.datadoc == null)?"<null>":this.datadoc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.datadoc == null)? 0 :this.datadoc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.documentVersion == null)? 0 :this.documentVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetadataContainer) == false) {
            return false;
        }
        MetadataContainer rhs = ((MetadataContainer) other);
        return ((((this.datadoc == rhs.datadoc)||((this.datadoc!= null)&&this.datadoc.equals(rhs.datadoc)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.documentVersion == rhs.documentVersion)||((this.documentVersion!= null)&&this.documentVersion.equals(rhs.documentVersion))));
    }

    public static class MetadataContainerBuilder
        extends MetadataContainer.MetadataContainerBuilderBase<MetadataContainer>
    {


        public MetadataContainerBuilder() {
            super();
        }

        public MetadataContainerBuilder(Object documentVersion, DatadocMetadata datadoc) {
            super(documentVersion, datadoc);
        }

    }

    public static abstract class MetadataContainerBuilderBase<T extends MetadataContainer >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public MetadataContainerBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(MetadataContainer.MetadataContainerBuilder.class)) {
                this.instance = ((T) new MetadataContainer());
            }
        }

        @SuppressWarnings("unchecked")
        public MetadataContainerBuilderBase(Object documentVersion, DatadocMetadata datadoc) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(MetadataContainer.MetadataContainerBuilder.class)) {
                this.instance = ((T) new MetadataContainer(documentVersion, datadoc));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public MetadataContainer.MetadataContainerBuilderBase withDocumentVersion(Object documentVersion) {
            ((MetadataContainer) this.instance).documentVersion = documentVersion;
            return this;
        }

        public MetadataContainer.MetadataContainerBuilderBase withDatadoc(DatadocMetadata datadoc) {
            ((MetadataContainer) this.instance).datadoc = datadoc;
            return this;
        }

        public MetadataContainer.MetadataContainerBuilderBase withAdditionalProperty(String name, Object value) {
            ((MetadataContainer) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
