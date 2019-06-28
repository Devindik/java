package example;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestThread extends Thread{

    private String httpurl;

    public TestThread(String httpurl){
        this.httpurl = httpurl;
    }

    public void run() {
        HttpURLConnection connection = null;
        InputStream urlStream = null;
        URL url = null;
        try {
            url = new URL(httpurl);

            connection = (HttpURLConnection)url.openConnection();
            connection.connect();
            urlStream = connection.getInputStream();
            Thread.sleep(10L); } catch (InterruptedException e) {
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}