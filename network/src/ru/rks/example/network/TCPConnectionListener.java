package ru.rks.example.network;

import java.io.IOException;

/**
 * Created by RiazanovKS on 03.02.2018.
 */
public interface TCPConnectionListener {
    void onConnectionReady(TCPConnection tcpConnection);

    void onReceiveString(TCPConnection tcpConnection, String s);

    void onDisconnect(TCPConnection tcpConnection);

    void onException(TCPConnection tcpConnection, IOException e);
}
