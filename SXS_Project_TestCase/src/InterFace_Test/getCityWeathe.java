package InterFace_Test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Dreamslians on 2017/1/7.
 */
public class getCityWeathe
{
    private static String Get_url = "";

    public String getUrl()
    {
        return null;
    }

    public String getHttpRespone(String cityCode) throws IOException
    {
        String line = "";
        String httpResults = "";
        URL getURL = new URL("http://www.weather.com.cn/data/cityinfo/"
                + cityCode + ".html");
        try
        {
            HttpURLConnection connection = (HttpURLConnection) getURL.openConnection();
            DataOutputStream out = null;
            // 建立实际的连接
            connection.connect();
            out = new DataOutputStream(connection.getOutputStream());
            out.flush();
            out.close();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            while ((line = reader.readLine()) != null)
            {
                httpResults = httpResults + line.toString();
            }
            reader.close();
            // 断开连接
            connection.disconnect();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return httpResults;
    }
}
