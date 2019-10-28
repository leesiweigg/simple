package tk.mybatis.simple.model;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/10/25 11:20
 */
public enum AEnum  {
    INSTANCE("d");
    private String a;
    AEnum(){
        System.out.println("aaa");
    }
    AEnum(String a){
        System.out.println("bbb");
    }
    AEnum(String a,Integer b){
        System.out.println("ccc");
    }
}
