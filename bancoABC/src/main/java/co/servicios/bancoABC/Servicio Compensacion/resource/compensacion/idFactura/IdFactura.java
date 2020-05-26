
package co.servicios.bancoABC.compensacion.resource.compensacion.idFactura;

import java.net.URLEncoder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;
import co.servicios.bancoABC.compensacion.exceptions.ServicioCompensacionException;
import co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.model.IdFacturaDELETEBody;
import co.servicios.bancoABC.compensacion.responses.ServicioCompensacionResponse;

public class IdFactura {

    private String _baseUrl;
    private Client _client;

    public IdFactura() {
        _baseUrl = null;
        _client = null;
    }

    public IdFactura(String baseUrl, Client _client, String uriParam) {
        _baseUrl = (baseUrl +("/"+ URLEncoder.encode(uriParam)));
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Permite compensar el pago de la factura validando con la entidad correspondiente
     * 
     */
    public ServicioCompensacionResponse<co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.model.IdFacturaDELETEResponseBody> delete(IdFacturaDELETEBody body) {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.delete();
        if (response.getStatusInfo().getFamily()!= Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new ServicioCompensacionException(statusInfo.getStatusCode(), statusInfo.getReasonPhrase(), response.getStringHeaders(), response);
        }
        ServicioCompensacionResponse<co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.model.IdFacturaDELETEResponseBody> apiResponse = new ServicioCompensacionResponse<co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.model.IdFacturaDELETEResponseBody>(response.readEntity(co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.model.IdFacturaDELETEResponseBody.class), response.getStringHeaders(), response);
        return apiResponse;
    }

}
