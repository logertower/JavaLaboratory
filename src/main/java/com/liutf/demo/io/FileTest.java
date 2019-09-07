package com.liutf.demo.io;

import com.liutf.demo.util.StringUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ltf
 * @create 2019-09-07 14:48
 */
public class FileTest {


    public static void main(String[] args) throws Exception {
        String fileStr = "/Users/ltf/Documents/20190907-手机号导出/result.csv";

        FileReader fr = new FileReader(fileStr);
        BufferedReader br = new BufferedReader(fr);
        String line = "";

        List<String> list = new ArrayList<>();
        int i = 0;
        int count = 0;
        while ((line = br.readLine()) != null) {


            if (StringUtil.isValidMobile(line)) {
                list.add(line);
                count++;
            } else {
                System.out.println(line);
            }

            //if (list.size() >= 200000) {
            //
            //    FileWriter fw = new FileWriter(new File("/Users/ltf/Documents/20190907-手机号导出/result_" + (i++) + ".csv"));
            //    //写入中文字符时会出现乱码
            //    BufferedWriter bw = new BufferedWriter(fw);
            //
            //    for (String arr : list) {
            //        bw.write(arr + "\n");
            //    }
            //    bw.close();
            //    fw.close();
            //
            //
            //    list.clear();
            //}

        }


        //if (list.size() > 0) {
        //
        //    FileWriter fw = new FileWriter(new File("/Users/ltf/Documents/20190907-手机号导出/result_" + (i++) + ".csv"));
        //    //写入中文字符时会出现乱码
        //    BufferedWriter bw = new BufferedWriter(fw);
        //
        //    for (String arr : list) {
        //        bw.write(arr + "\n");
        //    }
        //    bw.close();
        //    fw.close();
        //
        //
        //    list.clear();
        //}

        br.close();
        fr.close();

        System.out.println(count);
    }
}
