package com.fredericboisguerin.insa.network.core.service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPMessageSenderService implements MessageSenderService {
    @Override
    public void sendMessageOn(String ipAddress, int port, String message) throws Exception {

        DatagramSocket ds = new DatagramSocket(port);

        InetAddress destination = InetAddress.getByName(ipAddress);

        byte[] buf = message.getBytes();

        DatagramPacket dp = new DatagramPacket(buf,buf.length,destination,10000);

        ds.send(dp);

        ds.close();

        throw new UnsupportedOperationException();
    }
}
