package com.fredericboisguerin.insa.network.core.service;

import java.io.OutputStream;
import java.net.Socket;

public class TCPMessageSenderService implements MessageSenderService {
    @Override
    public void sendMessageOn(String ipAddress, int port, String message) throws Exception {

        Socket socket = new Socket(ipAddress,port);

        byte[] buf = message.getBytes();

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(buf);

        outputStream.close();
        socket.close();

        throw new UnsupportedOperationException();
    }
}
