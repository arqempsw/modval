
package co.servicios.bancoABC.compensacion.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import co.servicios.bancoABC.compensacion.resource.consulta.Consulta;

public class ServicioConsultaClient {

    private String _baseUrl;
    public final Consulta consulta;

    public ServicioConsultaClient(String baseUrl) {
        _baseUrl = baseUrl;
        consulta = new Consulta(getBaseUri(), getClient());
    }

    public ServicioConsultaClient() {
        this("http://www.bancoabc.co/servicios/consulta/{version}");
    }

    protected Client getClient() {
        return ClientBuilder.newClient();
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static ServicioConsultaClient create(String baseUrl) {
        return new ServicioConsultaClient(baseUrl);
    }

    public static ServicioConsultaClient create() {
        return new ServicioConsultaClient();
    }

}
