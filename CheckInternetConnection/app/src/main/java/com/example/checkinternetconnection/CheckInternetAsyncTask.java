package com.example.checkinternetconnection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

public class CheckInternetAsyncTask extends AsyncTask<Void, Integer, Boolean> {

    private Context context;

    public CheckInternetAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected Boolean doInBackground(Void... params) {

        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        assert cm != null;
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnected();

        if (isConnected) {
            try {
                InetAddress ipAddr = InetAddress.getByName("google.com");
                //You can replace it with your name
                return !ipAddr.equals("");

            } catch (Exception e) {
                Log.e("TAG", "Error checking internet connection"+ e.getMessage());
                return false;
            }
        } else {
            //Log.d("TAG", "No network available!");
            return false;
        }
    }

    @Override
    protected void onPostExecute(Boolean result) {
        super.onPostExecute(result);
        //Log.d("TAG", "result" + result);

        if(result){
            // do ur code
            Toast.makeText(context,"Device is connected to internet.",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(context,"Device is not connected to internet!",Toast.LENGTH_LONG).show();
        }

    }

}
