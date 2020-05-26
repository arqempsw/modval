
package co.servicios.bancoABC.compensacion.resource.compensacion;

import javax.ws.rs.client.Client;
import co.servicios.bancoABC.compensacion.resource.compensacion.idFactura.IdFactura;

public class Compensacion {

    private String _baseUrl;
    private Client _client;

    public Compensacion() {
        _baseUrl = null;
        _client = null;
    }

    public Compensacion(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/compensacion");
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
