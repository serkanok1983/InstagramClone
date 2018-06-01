package com.example.android.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;

public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("be248e7d1ca02a14e0e26495ef0ae687aae1f575")
                .clientKey("7c0212af1edd77f6570d18b42bcaf399774e5f32")
                .server("http://18.220.147.152:80/parse/")
                .build()
        );

        //Setting Bitnami application password to 'kQS1u7dDo43Q'
        //the default application username is 'user')
        //http://18.220.147.152:80/apps

        //ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

    }
}
