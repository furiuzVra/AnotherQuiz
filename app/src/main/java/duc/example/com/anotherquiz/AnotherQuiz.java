package duc.example.com.anotherquiz;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Duc on 15.8.2017..
 */

public class AnotherQuiz extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
