
package co.servicios.bancoABC.pagos.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import co.servicios.bancoABC.pagos.resource.pagos.Pagos;

public class ServicioPagosClient {

    private String _baseUrl;
    public final Pagos pagos;

    public ServicioPagosClient(String baseUrl) {
        _baseUrl = baseUrl;
        pagos = new Pagos(getBaseUri(), getClient());
    }

    public ServicioPagosClient() {
        this("http://www.bancoabc.co/servicios/pagos/{version}");
    }

    protected Client getClient() {
        return ClientBuilder.newClient();
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static ServicioPagosClient create(String baseUrl) {
        return new ServicioPagosClient(baseUrl);
    }

    public static ServicioPagosClient create() {
        return new ServicioPagosClient();
    }

}
