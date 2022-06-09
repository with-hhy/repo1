package com.lzw;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list=splitStr("10|E");
        System.out.println(list);
    }

    public static List<String> splitStr(String str){
        List<String> ls=new ArrayList<>();
        String[] bt=str.split("");
        StringBuffer sb=new StringBuffer();
        for( int j=0;j<bt.length;j++){
            if(bt[j].equals("|")||j==(bt.length-1)){
                if(j==(bt.length-1)){
                    sb.append(bt[j].equals("|")?"":bt[j]);
                }
                ls.add(sb.toString()==null?"NULL":sb.toString().length()==0?"NULL":sb.toString());
                sb=new StringBuffer();
            }else{
                sb.append(bt[j]);
            }
        }
        return ls;
    }
}





























