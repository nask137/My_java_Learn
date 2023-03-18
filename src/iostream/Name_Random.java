package iostream;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Name_Random {
    public static void main(String[] args) {
        String xing ="https://wenku.baidu.com/view/3deaa0c965ec102de2bd960590c69ec3d4bbdbe2.html?_wkts_=1679042478729";
        String boyname="https://baike.pcbaby.com.cn/qzbd/180748.html";
        String girlname="https://jingyan.baidu.com/article/fea4511a40912af7bb912599.html";
        String x = HttpUtil.get(xing);
        String b = HttpUtil.get(boyname);
        String g = HttpUtil.get(girlname);
        ArrayList<String> temp = (ArrayList<String>) ReUtil.findAll("([\\u4E00-\\u9FA5]{4})()", x, 0);
        ArrayList<String> B = (ArrayList<String>) ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、)", b, 1);
        ArrayList<String> G = (ArrayList<String>) ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、)", g, 1);
        ArrayList<String> X=new ArrayList<>();
        ArrayList<String> name=new ArrayList<>();
        Random r = new Random();
        for (int i = 13; i < temp.size(); i++) {
            StringBuilder sb = new StringBuilder(temp.get(i));
            for (int i1 = 0; i1 < 4; i1++) {
               X.add(String.valueOf(sb.charAt(i1)));
            }
        }
        for (int i = 0; i < 550; i++) {
            StringBuilder Bsb = new StringBuilder(X.get( r.nextInt(X.size()))+B.get(r.nextInt(B.size()))+"-男-"+(r.nextInt(7)+17));
            name.add(Bsb.toString());
        }
        for (int i = 0; i < 550; i++) {
            StringBuilder Gsb = new StringBuilder(X.get(r.nextInt(X.size()))+G.get(r.nextInt(G.size()))+"-女-"+(r.nextInt(7)+17));
            name.add(Gsb.toString());
        }
        Collections.shuffle(name);
        FileUtil.writeLines(name,"name.txt","UTF-8");
    }
}
