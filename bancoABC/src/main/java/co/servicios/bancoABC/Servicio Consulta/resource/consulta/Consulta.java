
package co.servicios.bancoABC.consulta.resource.consulta;

import javax.ws.rs.client.Client;
import co.servicios.bancoABC.consulta.resource.consulta.idFactura.IdFactura;

public class Consulta {

    private String _baseUrl;
    private Client _client;

    public Consulta() {
        _baseUrl = null;
        _client = null;
    }

    public Consulta(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/consulta");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    public IdFactura idFactura(String idFactura) {
        return new IdFactura(getBaseUri(), getClient(), idFactura);
    }

}
