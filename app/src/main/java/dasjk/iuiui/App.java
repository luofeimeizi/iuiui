package dasjk.iuiui;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Administrator on 2017/7/13 0013.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        RongIM.init(this);
        super.onCreate();
    }
}
