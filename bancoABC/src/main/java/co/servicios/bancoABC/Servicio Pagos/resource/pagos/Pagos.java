
package co.servicios.bancoABC.pagos.resource.pagos;

import javax.ws.rs.client.Client;
import co.servicios.bancoABC.pagos.resource.pagos.idFactura.IdFactura;

public class Pagos {

    private String _baseUrl;
    private Client _client;

    public Pagos() {
        _baseUrl = null;
        _client = null;
    }

    public Pagos(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/pagos");
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
