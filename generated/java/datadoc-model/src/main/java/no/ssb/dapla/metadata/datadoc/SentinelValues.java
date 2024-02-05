
package no.ssb.dapla.metadata.datadoc;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;


/**
 * Sentinel values
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sentinel_value_uri",
    "sentinel_value_elements"
})
@Generated("jsonschema2pojo")
public class SentinelValues implements Serializable
{

    /**
     * Sentinel value URI
     * <p>
     * A link (URI) to a standardized list of sentinel values included in the variable, eg. a link to a codelist in Klass (https://www.ssb.no/en/klass/) Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway.
     * 
     */
    @JsonProperty("sentinel_value_uri")
    @JsonPropertyDescription("A link (URI) to a standardized list of sentinel values included in the variable, eg. a link to a codelist in Klass (https://www.ssb.no/en/klass/)")
    private URI sentinelValueUri;
    /**
     * Sentinel value elements
     * <p>
     * A selection (subset) of sentinel values in the 'sentinel_value_uri' ​​applicable to the data set.
     * 
     */
    @JsonProperty("sentinel_value_elements")
    @JsonPropertyDescription("A selection (subset) of sentinel values in the 'sentinel_value_uri' \u200b\u200bapplicable to the data set.")
    @Valid
    private List<String> sentinelValueElements = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6740706452491998917L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SentinelValues() {
    }

    /**
     * 
     * @param sentinelValueElements
     *     Sentinel value elements. A selection (subset) of sentinel values in the 'sentinel_value_uri' ​​applicable to the data set.
     * @param sentinelValueUri
     *     Sentinel value URI. A link (URI) to a standardized list of sentinel values included in the variable, eg. a link to a codelist in Klass (https://www.ssb.no/en/klass/).
     */
    public SentinelValues(URI sentinelValueUri, List<String> sentinelValueElements) {
        super();
        this.sentinelValueUri = sentinelValueUri;
        this.sentinelValueElements = sentinelValueElements;
    }

    public static SentinelValues.SentinelValuesBuilderBase builder() {
        return new SentinelValues.SentinelValuesBuilder();
    }

    /**
     * Sentinel value URI
     * <p>
     * A link (URI) to a standardized list of sentinel values included in the variable, eg. a link to a codelist in Klass (https://www.ssb.no/en/klass/) Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway.
     * 
     */
    @JsonProperty("sentinel_value_uri")
    public URI getSentinelValueUri() {
        return sentinelValueUri;
    }

    /**
     * Sentinel value URI
     * <p>
     * A link (URI) to a standardized list of sentinel values included in the variable, eg. a link to a codelist in Klass (https://www.ssb.no/en/klass/) Proposals for the standardization of sentinel values ​​have been drafted, but this has not yet been processed by the Standards Committee in Statistics Norway.
     * 
     */
    @JsonProperty("sentinel_value_uri")
    public void setSentinelValueUri(URI sentinelValueUri) {
        this.sentinelValueUri = sentinelValueUri;
    }

    /**
     * Sentinel value elements
     * <p>
     * A selection (subset) of sentinel values in the 'sentinel_value_uri' ​​applicable to the data set.
     * 
     */
    @JsonProperty("sentinel_value_elements")
    public List<String> getSentinelValueElements() {
        return sentinelValueElements;
    }

    /**
     * Sentinel value elements
     * <p>
     * A selection (subset) of sentinel values in the 'sentinel_value_uri' ​​applicable to the data set.
     * 
     */
    @JsonProperty("sentinel_value_elements")
    public void setSentinelValueElements(List<String> sentinelValueElements) {
        this.sentinelValueElements = sentinelValueElements;
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
        sb.append(SentinelValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sentinelValueUri");
        sb.append('=');
        sb.append(((this.sentinelValueUri == null)?"<null>":this.sentinelValueUri));
        sb.append(',');
        sb.append("sentinelValueElements");
        sb.append('=');
        sb.append(((this.sentinelValueElements == null)?"<null>":this.sentinelValueElements));
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
        result = ((result* 31)+((this.sentinelValueElements == null)? 0 :this.sentinelValueElements.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sentinelValueUri == null)? 0 :this.sentinelValueUri.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SentinelValues) == false) {
            return false;
        }
        SentinelValues rhs = ((SentinelValues) other);
        return ((((this.sentinelValueElements == rhs.sentinelValueElements)||((this.sentinelValueElements!= null)&&this.sentinelValueElements.equals(rhs.sentinelValueElements)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sentinelValueUri == rhs.sentinelValueUri)||((this.sentinelValueUri!= null)&&this.sentinelValueUri.equals(rhs.sentinelValueUri))));
    }

    public static class SentinelValuesBuilder
        extends SentinelValues.SentinelValuesBuilderBase<SentinelValues>
    {


        public SentinelValuesBuilder() {
            super();
        }

        public SentinelValuesBuilder(URI sentinelValueUri, List<String> sentinelValueElements) {
            super(sentinelValueUri, sentinelValueElements);
        }

    }

    public static abstract class SentinelValuesBuilderBase<T extends SentinelValues >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public SentinelValuesBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(SentinelValues.SentinelValuesBuilder.class)) {
                this.instance = ((T) new SentinelValues());
            }
        }

        @SuppressWarnings("unchecked")
        public SentinelValuesBuilderBase(URI sentinelValueUri, List<String> sentinelValueElements) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(SentinelValues.SentinelValuesBuilder.class)) {
                this.instance = ((T) new SentinelValues(sentinelValueUri, sentinelValueElements));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public SentinelValues.SentinelValuesBuilderBase withSentinelValueUri(URI sentinelValueUri) {
            ((SentinelValues) this.instance).sentinelValueUri = sentinelValueUri;
            return this;
        }

        public SentinelValues.SentinelValuesBuilderBase withSentinelValueElements(List<String> sentinelValueElements) {
            ((SentinelValues) this.instance).sentinelValueElements = sentinelValueElements;
            return this;
        }

        public SentinelValues.SentinelValuesBuilderBase withAdditionalProperty(String name, Object value) {
            ((SentinelValues) this.instance).additionalProperties.put(name, value);
            return this;
        }

    }

}
