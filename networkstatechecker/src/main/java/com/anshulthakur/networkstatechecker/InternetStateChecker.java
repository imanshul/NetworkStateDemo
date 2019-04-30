package com.anshulthakur.networkstatechecker;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.widget.Toast;

import com.anshulthakur.networkstatechecker.ConnectivityReceiver;
import com.anshulthakur.networkstatechecker.ConnectivityReceiverListener;

public class InternetStateChecker implements ConnectivityReceiverListener {

    private Context context;
    private ConnectivityReceiver receiver;

    public InternetStateChecker(Context context) {
        this.context = context;
        initReciever(context);
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        showSnack(isConnected);
    }
    private void showSnack(boolean isConnected) {
        String message;
        if (isConnected) {
            message = "Good! Connected to Internet";
        } else {
            message = "Sorry! Not connected to internet";
        }

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    private void initReciever(Context context)
    {
        receiver = new ConnectivityReceiver();
        context.registerReceiver(receiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        receiver.setConnectionCallback(this);
    }
    public void onDestroy() {
        try {
            context.unregisterReceiver(receiver);
        }catch(Exception e){
        }
    }
}
