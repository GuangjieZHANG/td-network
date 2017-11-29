package com.fredericboisguerin.insa.network.core.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPMessageReceiverService implements MessageReceiverService {
    @Override
    public void listenOnPort(int port, IncomingMessageListener incomingMessageListener) throws Exception {

        DatagramSocket ds = new DatagramSocket(port);

        byte[] bbuf = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bbuf,bbuf.length);

        ds.receive(dp);

        ds.close();

        throw new UnsupportedOperationException();
    }
}
