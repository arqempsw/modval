
package co.servicios.bancoABC.consulta.resource.consulta.idFactura;

import java.net.URLEncoder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;
import co.servicios.bancoABC.consulta.exceptions.ServicioConsultaException;
import co.servicios.bancoABC.consulta.responses.ServicioConsultaResponse;

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
     * Envía petición a la empresa correspondiente y retorna información de la factura
     * 
     */
    public ServicioConsultaResponse<co.servicios.bancoABC.consulta.resource.consulta.idFactura.model.IdFacturaGETResponseBody> get() {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.get();
        if (response.getStatusInfo().getFamily()!= Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new ServicioConsultaException(statusInfo.getStatusCode(), statusInfo.getReasonPhrase(), response.getStringHeaders(), response);
        }
        ServicioConsultaResponse<co.servicios.bancoABC.consulta.resource.consulta.idFactura.model.IdFacturaGETResponseBody> apiResponse = new ServicioConsultaResponse<co.servicios.bancoABC.consulta.resource.consulta.idFactura.model.IdFacturaGETResponseBody>(response.readEntity(co.servicios.bancoABC.consulta.resource.consulta.idFactura.model.IdFacturaGETResponseBody.class), response.getStringHeaders(), response);
        return apiResponse;
    }

}
