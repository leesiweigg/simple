package tk.mybatis.simple.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/10/28 10:34
 */
public class BClass{

    public void f(){
        ArrayList<Object> list = new ArrayList<>(10);
        method(list);
    }

    public void method(List<Object> list){
        list.add("");
    }
}
