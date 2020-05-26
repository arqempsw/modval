
package co.servicios.bancoABC.pagos.resource.pagos.idFactura;

import java.net.URLEncoder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;
import co.servicios.bancoABC.pagos.exceptions.ServicioPagosException;
import co.servicios.bancoABC.pagos.resource.pagos.idFactura.model.IdFacturaPOSTBody;
import co.servicios.bancoABC.pagos.responses.ServicioPagosResponse;

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
     * Permite realizar el pago de la factura direccionando al servicio correspondiente
     * 
     */
    public ServicioPagosResponse<co.servicios.bancoABC.pagos.resource.pagos.idFactura.model.IdFacturaPOSTResponseBody> post(IdFacturaPOSTBody body) {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.post(Entity.json(body));
        if (response.getStatusInfo().getFamily()!= Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new ServicioPagosException(statusInfo.getStatusCode(), statusInfo.getReasonPhrase(), response.getStringHeaders(), response);
        }
        ServicioPagosResponse<co.servicios.bancoABC.pagos.resource.pagos.idFactura.model.IdFacturaPOSTResponseBody> apiResponse = new ServicioPagosResponse<co.servicios.bancoABC.pagos.resource.pagos.idFactura.model.IdFacturaPOSTResponseBody>(response.readEntity(co.servicios.bancoABC.pagos.resource.pagos.idFactura.model.IdFacturaPOSTResponseBody.class), response.getStringHeaders(), response);
        return apiResponse;
    }

}
