import java.io.*;
import java.net.*;

class Solution{
    public static void DeleteGithubHosts(String path){
        try{
            File inputFile = new File(path);
            File tempFile = new File(path + ".tmp");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));
            String currentLine;
            boolean startFlag = false;
            while((currentLine = reader.readLine())!=null){
                if(currentLine.equals("# GitHub Host Start")){
                    startFlag = true;
                }else if(currentLine.equals("# GitHub Host End")){
                    startFlag = false;
                }else if(startFlag){}else
                {
                    writer.println(currentLine);
                }
            }
            reader.close();
            writer.close();
            if(inputFile.delete()){
                tempFile.renameTo(inputFile);
                System.out.println("成功删除hosts文件中github部分");
            }else {
                System.out.println("无法删除原文件");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
public class WebPageFetcher {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Windows\\System32\\drivers\\etc\\hosts";
        Solution solution = new Solution();
        solution.DeleteGithubHosts(filePath);

        URL url = new URL("https://gitlab.com/ineo6/hosts/-/raw/master/next-hosts"); // 替换为你想要获取的网页链接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // 请求成功  
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            int a= 0;
            while ((inputLine = in.readLine()) != null) {
                if(a<2)
                {a++;continue;}
               System.out.println(inputLine);
                try {
                    File file = new File(filePath);
                    FileWriter writer = new FileWriter(file, true); // 设置为追加模式
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);

                    // 逐行向文件末尾添加数据
                    bufferedWriter.write(inputLine);
                    bufferedWriter.newLine(); // 添加新行
                    bufferedWriter.close();
                    System.out.println("该行添加成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            in.close();
        } else {
            System.out.println("GET请求失败，响应码：" + responseCode);
        }


    }

}