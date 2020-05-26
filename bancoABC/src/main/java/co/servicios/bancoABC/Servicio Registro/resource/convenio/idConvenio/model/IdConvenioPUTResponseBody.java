
package co.servicios.bancoABC.registro.resource.convenio.idConvenio.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idConvenio"
})
public class IdConvenioPUTResponseBody {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idConvenio")
    private Double idConvenio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IdConvenioPUTResponseBody() {
    }

    /**
     * 
     * @param idConvenio
     */
    public IdConvenioPUTResponseBody(Double idConvenio) {
        super();
        this.idConvenio = idConvenio;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idConvenio")
    public Double getIdConvenio() {
        return idConvenio;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idConvenio")
    public void setIdConvenio(Double idConvenio) {
        this.idConvenio = idConvenio;
    }

    public IdConvenioPUTResponseBody withIdConvenio(Double idConvenio) {
        this.idConvenio = idConvenio;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public IdConvenioPUTResponseBody withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdConvenioPUTResponseBody.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idConvenio");
        sb.append('=');
        sb.append(((this.idConvenio == null)?"<null>":this.idConvenio));
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
        result = ((result* 31)+((this.idConvenio == null)? 0 :this.idConvenio.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdConvenioPUTResponseBody) == false) {
            return false;
        }
        IdConvenioPUTResponseBody rhs = ((IdConvenioPUTResponseBody) other);
        return (((this.idConvenio == rhs.idConvenio)||((this.idConvenio!= null)&&this.idConvenio.equals(rhs.idConvenio)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
