# Android_Check_Internet_Connection
This Android tutorial continuously checks the device have the working internet connection or not using AsyncTask and Handler.

To Check Internet Connectivity I have Created a AsyncTask That will be called by Handler every 15 seconds.

It requires the below permission in <a href="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/CheckInternetConnection/app/src/main/AndroidManifest.xml">```AndroidManifest.xml```</a> file.
```
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.INTERNET"/>
```

1) Create a class that extends AsyncTask Class. Here I have created a class called <a href="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/CheckInternetConnection/app/src/main/java/com/example/checkinternetconnection/CheckInternetAsyncTask.java">```CheckInternetAsyncTask.java```</a>.

We have to override two methods ```doInBackground(Void... params)``` and ```onPostExecute(Boolean result)```.

```doInBackground(Void... params)``` method will return true or false to ```onPostExecute(Boolean result)``` method after performing the backgroud operation.

Here  ```doInBackground(Void... params)``` method :

ConnectivityManager class provide the state of network connectivity and also notifies applications when network connectivity changes.

NetworlInfo represents the current network connection. So when the device is connected with network then it will try to get address of "google.com". If the address received is not empty then it returns true otherwise returns false.

If device is not connected to any network it returns false.

Here  ```onPostExecute(Boolean result)``` method :

Based on the result Simply print the Toast message.


2) Create an object of Handler Class in <a href="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/CheckInternetConnection/app/src/main/java/com/example/checkinternetconnection/MainActivity.java">```MainActivity.java```</a>

There are two main uses for a Handler: (1) to schedule messages and runnables to be executed at some point in the future and (2) to enqueue an action to be performed on a different thread than your own.

I have created the instance of handler class in the ```onResume()``` method and excuted the AsyncTask with the specified time delay using ```handler.postDelayed()``` method.

And removing the callbacks of runnable in ```onPause()``` method.

Screen Preview
<table>
<tr>
  <td><img src="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/Images/InternetAvailable.png" width="300"/></td>
  <td><img src="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/Images/InternetNotAvailable.png" width="300"/></td>
  </tr>
</table>
