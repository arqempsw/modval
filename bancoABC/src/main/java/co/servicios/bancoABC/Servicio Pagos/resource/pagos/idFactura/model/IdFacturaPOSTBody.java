
package co.servicios.bancoABC.pagos.resource.pagos.idFactura.model;

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
    "valorFactura"
})
public class IdFacturaPOSTBody {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("valorFactura")
    private Double valorFactura;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IdFacturaPOSTBody() {
    }

    /**
     * 
     * @param valorFactura
     */
    public IdFacturaPOSTBody(Double valorFactura) {
        super();
        this.valorFactura = valorFactura;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("valorFactura")
    public Double getValorFactura() {
        return valorFactura;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("valorFactura")
    public void setValorFactura(Double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public IdFacturaPOSTBody withValorFactura(Double valorFactura) {
        this.valorFactura = valorFactura;
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

    public IdFacturaPOSTBody withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdFacturaPOSTBody.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("valorFactura");
        sb.append('=');
        sb.append(((this.valorFactura == null)?"<null>":this.valorFactura));
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
        result = ((result* 31)+((this.valorFactura == null)? 0 :this.valorFactura.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdFacturaPOSTBody) == false) {
            return false;
        }
        IdFacturaPOSTBody rhs = ((IdFacturaPOSTBody) other);
        return (((this.valorFactura == rhs.valorFactura)||((this.valorFactura!= null)&&this.valorFactura.equals(rhs.valorFactura)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
