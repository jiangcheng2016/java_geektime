package com.jiangrzc.supermarket.ai;

public class AI {
    //回复方法
    public String answer(String question){
        if(handlerCanStart(question) != null)
            return handlerCanStart(question);
        if(handlerEndTail(question) != null)
            return handlerEndTail(question);
        return handleOther(question);
    }
    //处理开始词
    private String handlerCanStart(String question){
        String[] canStart = {"会","能","有","敢","在"};
        for(int i = 0; i < canStart.length; i ++)
            if(question.startsWith(canStart[i]))
                return canStart[i] + "!";
        return null;
    }
    //处理结束词
    private String handlerEndTail(String question){
        String[] askTail = new String[]{"吗？","吗?","吗"};
        for(int i = 0; i < askTail.length; i ++)
            if(question.endsWith(askTail[i]))
                return question.replace(askTail[i],"!");
        return null;
    }

    //处理其他
    private String handleOther(String question){
        return question + "!";
    }
}
