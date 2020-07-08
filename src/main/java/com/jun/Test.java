package com.jun;

import com.alibaba.fastjson.JSON;

/**
 * @author：cj
 * @date：2020-7-5 21:16
 * @desc：fastjson
 */
public class Test {
    private static String s =
            "{\"message\": {"
                    + "            \"2177\": {"
                    + "                \"id\": 2177,"
                    + "                \"name\": \"快速办理入住\""
                    + "            },"
                    + "            \"3\": {"
                    + "                \"id\": 3,"
                    + "                \"name\": \"酒吧/酒廊\""
                    + "            },"
                    + "            \"324\": {"
                    + "                \"id\": 324,"
                    + "                \"name\": \"公共区供应咖啡/茶\""
                    + "            },"
                    + "            \"8\": {"
                    + "                \"id\": 8,"
                    + "                \"name\": \"电梯\""
                    + "            },"
                    + "            \"14\": {"
                    + "                \"id\": 14,"
                    + "                \"name\": \"室内游泳池\""
                    + "            },"
                    + "            \"2063\": {"
                    + "                \"id\": 2063,"
                    + "                \"name\": \"24 小时前台服务\""
                    + "            }}}";
    public static void main(String[] args) {
        TestMap testMap = JSON.parseObject(s, TestMap.class);
        System.out.println(testMap.message.size());

    }
}
