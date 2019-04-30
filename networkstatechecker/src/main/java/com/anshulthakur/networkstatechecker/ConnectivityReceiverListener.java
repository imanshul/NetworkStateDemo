package com.anshulthakur.networkstatechecker;

public interface ConnectivityReceiverListener {
    void onNetworkConnectionChanged(boolean isConnected);
}
