
package co.servicios.bancoABC.registro.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import co.servicios.bancoABC.registro.resource.convenio.Convenio;

public class ServicioRegistroConveniosClient {

    private String _baseUrl;
    public final Convenio convenio;

    public ServicioRegistroConveniosClient(String baseUrl) {
        _baseUrl = baseUrl;
        convenio = new Convenio(getBaseUri(), getClient());
    }

    public ServicioRegistroConveniosClient() {
        this("http://www.bancoabc.co/servicios/registro/{version}");
    }

    protected Client getClient() {
        return ClientBuilder.newClient();
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static ServicioRegistroConveniosClient create(String baseUrl) {
        return new ServicioRegistroConveniosClient(baseUrl);
    }

    public static ServicioRegistroConveniosClient create() {
        return new ServicioRegistroConveniosClient();
    }

}
