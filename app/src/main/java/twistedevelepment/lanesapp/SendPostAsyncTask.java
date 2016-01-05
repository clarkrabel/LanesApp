package twistedevelepment.lanesapp;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.twistedevelepment.lanesapp.backend.coolStuff.CoolStuff;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by clarkrabel on 1/4/16.
 */
public class SendPostAsyncTask extends AsyncTask<Void, Void, String> {
    private static CoolStuff postApi = null;
    //    private GoogleCloudMessaging gcm;
    private Context context;
    private String post;
    private String posterName;

    private static final String SENDER_ID = "43184386616";

    public SendPostAsyncTask(Context context, String post, String posterName) {
        this.context = context;
        this.post = post;
        this.posterName = posterName;
    }

    @Override
    protected String doInBackground(Void... params) {
        if (postApi == null) {
            postApi = CloudEndpointsBuilderHelper.getEndpoints();
        }

        String msg = "";
        try {

            // You should send the registration ID to your server over HTTP,
            // so it can use GCM/HTTP; or CCS to send messages to your app.
            // The request to your server should be authenticated if your app
            // is using accounts.
//            postApi. .execute();
            int x = 5;

        } catch (Exception ex) {
            ex.printStackTrace();
            msg = "Error: " + ex.getMessage();
        }
        return msg;
    }

    @Override
    protected void onPostExecute(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        Logger.getLogger("REGISTRATION").log(Level.INFO, msg);
    }
}
