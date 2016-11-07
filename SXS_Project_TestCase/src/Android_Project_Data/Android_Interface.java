package Android_Project_Data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class Android_Interface {

	private static String PATH = "http://api.shaxiaoseng.com/Api.php/Index/index_02/";
	private static URL url;

	public Android_Interface() {

	}

	static {
		try {
			url = new URL(PATH);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static String sendPostMessage(Map<String, String> params, String encode) {

		StringBuffer stringBuffer = new StringBuffer();

		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				try {
					stringBuffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), encode))
							.append("&");

				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
			System.out.println("-->>" + stringBuffer.toString());

			try {
				HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.setDoInput(true);
				httpURLConnection.setDoOutput(true);

				byte[] mydata = stringBuffer.toString().getBytes();
				httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				httpURLConnection.setRequestProperty("Content-Lenth", String.valueOf(mydata.length));

				OutputStream outputStream = (OutputStream) httpURLConnection.getOutputStream();
				outputStream.write(mydata);

				int responseCode = httpURLConnection.getResponseCode();
				if (responseCode == 200) {

					InputStream inputStream = (InputStream) httpURLConnection.getInputStream();
					return (changeInputStream(inputStream, encode));

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return "";
	}

	public static String changeInputStream(InputStream inputStream, String encode) {

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] data = new byte[1024];
		int len = 0;
		String result = "";
		if (inputStream != null) {

			try {
				while ((len = inputStream.read(data)) != -1) {
					byteArrayOutputStream.write(data, 0, len);

				}
				result = new String(byteArrayOutputStream.toByteArray(), encode);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Map<String, String> params = new HashMap<String, String>();
//		params.put("id", "21");
		String result = sendPostMessage(params, "utf-8");
		System.out.println("-result->>" + result);

	}
}