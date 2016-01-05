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
public class SetUserAsyncTask extends AsyncTask<Void, Void, String> {
    private static CoolStuff chatUser = null;
    private Context context;
    private String first;
    private String last;

    private static final String SENDER_ID = "43184386616";

    public SetUserAsyncTask(Context context, String first, String last) {
        this.context = context;
        this.first = first;
        this.last = last;
    }

    @Override
    protected String doInBackground(Void... params) {
        if (chatUser == null) {
            chatUser = CloudEndpointsBuilderHelper.getEndpoints();
        }

        String msg = "";
        try {

            // You should send the registration ID to your server over HTTP,
            // so it can use GCM/HTTP; or CCS to send messages to your app.
            // The request to your server should be authenticated if your app
            // is using accounts.
            chatUser.addUser(first, last).execute();

        } catch (IOException ex) {
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
