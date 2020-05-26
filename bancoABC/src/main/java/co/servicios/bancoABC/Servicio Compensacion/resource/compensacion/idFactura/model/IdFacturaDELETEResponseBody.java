
package co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.model;

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
    "idFactura",
    "mensajeOK"
})
public class IdFacturaDELETEResponseBody {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idFactura")
    private Double idFactura;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mensajeOK")
    private String mensajeOK;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IdFacturaDELETEResponseBody() {
    }

    /**
     * 
     * @param mensajeOK
     * @param idFactura
     */
    public IdFacturaDELETEResponseBody(Double idFactura, String mensajeOK) {
        super();
        this.idFactura = idFactura;
        this.mensajeOK = mensajeOK;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idFactura")
    public Double getIdFactura() {
        return idFactura;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("idFactura")
    public void setIdFactura(Double idFactura) {
        this.idFactura = idFactura;
    }

    public IdFacturaDELETEResponseBody withIdFactura(Double idFactura) {
        this.idFactura = idFactura;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mensajeOK")
    public String getMensajeOK() {
        return mensajeOK;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mensajeOK")
    public void setMensajeOK(String mensajeOK) {
        this.mensajeOK = mensajeOK;
    }

    public IdFacturaDELETEResponseBody withMensajeOK(String mensajeOK) {
        this.mensajeOK = mensajeOK;
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

    public IdFacturaDELETEResponseBody withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdFacturaDELETEResponseBody.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idFactura");
        sb.append('=');
        sb.append(((this.idFactura == null)?"<null>":this.idFactura));
        sb.append(',');
        sb.append("mensajeOK");
        sb.append('=');
        sb.append(((this.mensajeOK == null)?"<null>":this.mensajeOK));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mensajeOK == null)? 0 :this.mensajeOK.hashCode()));
        result = ((result* 31)+((this.idFactura == null)? 0 :this.idFactura.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdFacturaDELETEResponseBody) == false) {
            return false;
        }
        IdFacturaDELETEResponseBody rhs = ((IdFacturaDELETEResponseBody) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.mensajeOK == rhs.mensajeOK)||((this.mensajeOK!= null)&&this.mensajeOK.equals(rhs.mensajeOK))))&&((this.idFactura == rhs.idFactura)||((this.idFactura!= null)&&this.idFactura.equals(rhs.idFactura))));
    }

}
