# Android_Check_Internet_Connection
This Android tutorial continuously checks the device have the working internet connection or not using AsyncTask and Handler.

To Check Internet Connectivity I have Created a AsyncTask That will be called by Handler every 15 seconds.

It requires the below permission in <a href="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/CheckInternetConnection/app/src/main/AndroidManifest.xml">```AndroidManifest.xml```</a> file.
```
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.INTERNET"/>
```

1) Create a class that extends AsyncTask Class. Here I have created a class called <a href="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/CheckInternetConnection/app/src/main/java/com/example/checkinternetconnection/CheckInternetAsyncTask.java">```CheckInternetAsyncTask.java```</a>
2) Create an object of Handler Class in <a href="https://github.com/Vijay-Tahelramani/Android_Check_Internet_Connection/blob/master/CheckInternetConnection/app/src/main/java/com/example/checkinternetconnection/MainActivity.java">```MainActivity.java```</a>
