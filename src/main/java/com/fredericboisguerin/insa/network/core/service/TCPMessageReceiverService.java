package com.fredericboisguerin.insa.network.core.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMessageReceiverService implements MessageReceiverService {
    @Override
    public void listenOnPort(int port, IncomingMessageListener incomingMessageListener) throws Exception {
        
        InputStream inputStream;
        ServerSocket serverSocket=new ServerSocket(port);
        Socket socket=serverSocket.accept();
        StringBuilder s = new StringBuilder();

        inputStream=socket.getInputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=(inputStream.read(buf)))>0){
            s.append(new String(buf,0,len));
        }

        System.out.println(s.toString());


        throw new UnsupportedOperationException();
    }
}
