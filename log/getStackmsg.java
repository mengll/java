package com.bigdata.data;

public class logs {
    public static String getTraceInfo(){
        StringBuffer sb = new StringBuffer();
        StackTraceElement[] stacks = new Throwable().getStackTrace();
        int stacksLen = stacks.length;
        sb.append("class: " ).append(stacks[1].getClassName()).append("; method: ").append(stacks[1].getMethodName()).append("; number: ").append(stacks[1].getLineNumber());
        return sb.toString();
    }

    public static String info(String msg){
        StackTraceElement stackmsg[] = new Exception().getStackTrace();
        String _className  = stackmsg[1].getClassName();
        String _filename = stackmsg[1].getFileName();
        String _methodName = stackmsg[1].getMethodName();// 获得调用者的方法名
       // String _thisMethodName =stackmsg[0].getMethodName();// 获得当前的方法名
        int _linNumber = stackmsg[1].getLineNumber();
        String _stackMsg = "file:"+_filename+" classname:"+_className +" methodname:"+_methodName + " linenum"+_linNumber;
        return _stackMsg+"=>"+msg;
    }
}
