
package co.servicios.bancoABC.registro.resource.convenio.idConvenio;

import java.net.URLEncoder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;
import co.servicios.bancoABC.registro.exceptions.ServicioRegistroConveniosException;
import co.servicios.bancoABC.registro.responses.ServicioRegistroConveniosResponse;

public class IdConvenio {

    private String _baseUrl;
    private Client _client;

    public IdConvenio() {
        _baseUrl = null;
        _client = null;
    }

    public IdConvenio(String baseUrl, Client _client, String uriParam) {
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
     * Registra un nuevo convenio a pagar
     * 
     */
    public ServicioRegistroConveniosResponse<co.servicios.bancoABC.registro.resource.convenio.idConvenio.model.IdConvenioPUTResponseBody> put() {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.put(null);
        if (response.getStatusInfo().getFamily()!= Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new ServicioRegistroConveniosException(statusInfo.getStatusCode(), statusInfo.getReasonPhrase(), response.getStringHeaders(), response);
        }
        ServicioRegistroConveniosResponse<co.servicios.bancoABC.registro.resource.convenio.idConvenio.model.IdConvenioPUTResponseBody> apiResponse = new ServicioRegistroConveniosResponse<co.servicios.bancoABC.registro.resource.convenio.idConvenio.model.IdConvenioPUTResponseBody>(response.readEntity(co.servicios.bancoABC.registro.resource.convenio.idConvenio.model.IdConvenioPUTResponseBody.class), response.getStringHeaders(), response);
        return apiResponse;
    }

}
