package pe.edu.upeu.demo01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ServiceConfigurationError;

/**
 * Created by Manuel on 18/09/2015.
 */
public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("SERVICE STTART", "SERVICE IS STARTED");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("SERVICE STTART", "SERVICE IS RUNNING");
        return START_NOT_STICKY;
    }
}
