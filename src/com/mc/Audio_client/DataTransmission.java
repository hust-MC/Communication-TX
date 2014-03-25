package com.mc.Audio_client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DataTransmission
{
	Socket socket;
	public DataTransmission(Socket socket)
	{
		this.socket = socket;
	}
	
	public void send(short[] data) throws IOException
	{
		OutputStream os = socket.getOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(data);
		out.flush();
		out.close();
	}
}
