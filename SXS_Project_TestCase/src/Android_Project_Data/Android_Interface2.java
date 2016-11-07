package Android_Project_Data;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Android_Interface2 {

	public static void main(String[] args) throws IllegalStateException, IOException {
		urlConnection();
	}

	// 通过HttpUrlConnection的方式发送get请求
	
	private static void urlConnection() {
		
	}

	// 通过HttpUrlConnection的方式发送Post请求
	@SuppressWarnings("unused")
	public static void doPost() throws IllegalStateException, IOException {
		try {
			// 创建连接
			URL url = new URL("http://127.0.0.1:8080/Text");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setRequestProperty("Content-Type", "application/json");// 以json的方式传递参数
			connection.setInstanceFollowRedirects(false);
			// connection.setConnectTimeout(2000);
			// connection.setReadTimeout(3000);
			connection.setRequestProperty("Charsert", "UTF-8");
			connection.connect();

			// POST请求
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());
			out.write("{\"name\",\"admin\"}".getBytes("UTF-8"));// 参数需要json格式(其实就是一个字符串)
			out.flush();
			out.close();

			// 读取响应
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String result = ConvertStream2Json(connection.getInputStream());
			System.out.println(result);
			reader.close();
			// 断开连接
			connection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
    private static String ConvertStream2Json(InputStream inputStream) {  
        String jsonStr = "";  
        // ByteArrayOutputStream相当于内存输出流  
        ByteArrayOutputStream out = new ByteArrayOutputStream();  
        byte[] buffer = new byte[1024];  
        int len = 0;  
        // 将输入流转移到内存输出流中  
        try {  
            while ((len = inputStream.read(buffer, 0, buffer.length)) != -1) {  
                out.write(buffer, 0, len);  
            }  
            // 将内存流转换为字符串  
            jsonStr = new String(out.toByteArray());  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return jsonStr;  
    }
}