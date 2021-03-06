package cn.blogss.shiro;/*
 *Created by liqiang on 2019/2/24
 */

import cn.blogss.pojo.Users;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class ShiroMd5Util {
    /*加密方法*/
    private static final String ALGORITHM_NAME = "MD5";
    /*加密次数*/
    private static final int HASH_ITERATIONS = 1;

    public static String  getMd5Password(String password) {

        Object source = password;//密码原值

        //ByteSource salt = ByteSource.Util.bytes(user.getUsername());//盐值

        SimpleHash hash = new SimpleHash(ALGORITHM_NAME,source);

        return hash.toString();
    }
}
