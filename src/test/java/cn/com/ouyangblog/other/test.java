package cn.com.ouyangblog.other;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: oyc
 * @Date: 2018/12/26 16:40
 * @Description:
 */
public class test {
    /**
     * 解析属性的正则匹配
     */
    private final static Pattern SUB_PATTREN = Pattern.compile("select(.*?)from");

    public static void main(String[] args) {
        String str = "select w as wangwang,id as account,m as mobile,username as realname,p as phone from sinoauth_user where {0}";
        Matcher m = SUB_PATTREN.matcher(str);
        /*while (m.find()) {
            String[] props = m.group(1).trim().split(",");
            for (String prop :props ){
                System.out.println(prop);
                String[] ps = prop.trim().split(" as ");
                for (String p :ps ){
                    System.out.println(p);
                }
            }
        }*/
        System.out.println(str);
    }


    @Test
    public void getColumnPropsTest() {
        String str = "select wangwang as w,id as account,mobile as m,realname as r from sinoauth_user where {0}";
        getColumnProps(str);
    }

    public Map<String, String> getColumnProps(String str) {
        Map<String, String> resutlMap = new HashMap<String, String>();
        Matcher m = SUB_PATTREN.matcher(str);
        String[] temp;
        while (m.find()) {
            String[] props = m.group(1).trim().split(",");
            for (String prop : props) {
                temp = prop.trim().split(" as ");
                if (temp.length == 2) {
                    resutlMap.put(temp[1].trim(), temp[0].trim());
                }
            }
        }
        return resutlMap;
    }

}