import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(9090), 0);
        server.createContext("/", new HelloHandler());
        server.start();
        System.out.println("Server running on http://localhost:9090");
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello World!";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}
