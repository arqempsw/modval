
package co.servicios.bancoABC.registro.exceptions;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public class ServicioRegistroConveniosException
    extends RuntimeException
{

    private int statusCode;
    private String reason;
    private MultivaluedMap<String, String> headers;
    private Response response;

    public ServicioRegistroConveniosException(int statusCode, String reason, MultivaluedMap<String, String> headers, Response response) {
        super(reason);
        this.statusCode = statusCode;
        this.reason = reason;
        this.headers = headers;
        this.response = response;
    }

    public ServicioRegistroConveniosException(int statusCode, String reason) {
        this(statusCode, reason, null, null);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getReason() {
        return this.reason;
    }

    public MultivaluedMap<String, String> getHeaders() {
        return this.headers;
    }

    public Response getResponse() {
        return this.response;
    }

}
