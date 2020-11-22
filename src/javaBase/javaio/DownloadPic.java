package javaBase.javaio;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadPic {
    public static void downloadPic(String srcPath,String filePath) throws Exception {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        HttpURLConnection httpURLConnection = getConnection(srcPath);

        InputStream inputStream = httpURLConnection.getInputStream();
        bis = new BufferedInputStream(inputStream);

        FileOutputStream fileOutputStream= new FileOutputStream(new File(filePath));
        bos = new BufferedOutputStream(fileOutputStream);

        int b=0;
        byte[] bytes = new byte[1024];
        while ((b=bis.read(bytes))!=-1){
            bos.write(bytes,0,b);
        }
    }

    public static HttpURLConnection getConnection(String httpUrl) throws
            Exception {
        URL url = new URL(httpUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/octet-stream");
        connection.setDoOutput(true); connection.setDoInput(true);
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.connect(); return connection;
    }

    public static void main(String[] args) {
        try{
            downloadPic("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606070918740&di=97a88e26244fb1e19e290408faccd275&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F03%2F19%2F33%2F5b62602ef2b93_610.jpg","C:\\Users\\wushiquan\\Desktop\\1.jpg");

        }catch (Exception e){
            e.printStackTrace();;
        }
    }
}
