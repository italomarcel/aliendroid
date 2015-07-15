package getinfo.net.br.myapplication;

import android.app.Application;

import com.alienlabz.AlienDroid;

/**
 * Created by Italo on 14/07/15.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AlienDroid.init(this);
    }
}
