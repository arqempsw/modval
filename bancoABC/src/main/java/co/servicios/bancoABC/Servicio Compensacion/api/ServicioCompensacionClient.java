
package co.servicios.bancoABC.compensacion.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import co.servicios.bancoABC.compensacion.resource.compensacion.Compensacion;

public class ServicioCompensacionClient {

    private String _baseUrl;
    public final Compensacion compensacion;

    public ServicioCompensacionClient(String baseUrl) {
        _baseUrl = baseUrl;
        compensacion = new Compensacion(getBaseUri(), getClient());
    }

    public ServicioCompensacionClient() {
        this("http://www.bancoabc.co/servicios/compensacion/{version}");
    }

    protected Client getClient() {
        return ClientBuilder.newClient();
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static ServicioCompensacionClient create(String baseUrl) {
        return new ServicioCompensacionClient(baseUrl);
    }

    public static ServicioCompensacionClient create() {
        return new ServicioCompensacionClient();
    }

}
