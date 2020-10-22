package ch.rhjoerg.git.server;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class DefaultHandler implements HttpHandler
{
	@Override
	public void handle(HttpExchange exchange) throws IOException
	{
		exchange.sendResponseHeaders(200, 0);
		exchange.getResponseBody().write("hello, world!".getBytes(StandardCharsets.UTF_8));
		exchange.close();
	}
}
