
package co.servicios.bancoABC.registro.resource.convenio;

import javax.ws.rs.client.Client;
import co.servicios.bancoABC.registro.resource.convenio.idConvenio.IdConvenio;

public class Convenio {

    private String _baseUrl;
    private Client _client;

    public Convenio() {
        _baseUrl = null;
        _client = null;
    }

    public Convenio(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/convenio");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    public IdConvenio idConvenio(String idConvenio) {
        return new IdConvenio(getBaseUri(), getClient(), idConvenio);
    }

}
