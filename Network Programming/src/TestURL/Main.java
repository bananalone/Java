package TestURL;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String site = "https://m10.music.126.net/20200819195332/" +
                "568d3bc817b20c642e271652835134dc/yyaac/obj/" +
                "wonDkMOGw6XDiTHCmMOi/3498900742/e693/c22b/fc85/" +
                "d60550b5c1fb39d29a74b29d74fae6ec.m4a";
        URL url = null;
        HttpURLConnection urlConn = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            url = new URL(site);
            urlConn = (HttpURLConnection) url.openConnection();
            is = urlConn.getInputStream();
            fos = new FileOutputStream("music.m4a");
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConn != null) {
                urlConn.disconnect();
            }
        }

    }
}
