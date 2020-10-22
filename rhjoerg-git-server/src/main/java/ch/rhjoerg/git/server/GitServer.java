package ch.rhjoerg.git.server;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class GitServer
{
	public static void main(String[] args)
	{
		try
		{
			InetSocketAddress adress = new InetSocketAddress(81);
			HttpServer server = HttpServer.create(adress, 0);

			server.createContext("/", new DefaultHandler());

			server.start();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
