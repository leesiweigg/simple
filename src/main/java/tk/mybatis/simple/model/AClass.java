package tk.mybatis.simple.model;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/10/25 9:41
 */
 class AClass  {


     AClass(){
         method();
         System.out.println("aa");
    }



    public void method(){
        System.out.println("m");
    }

    void defaultMethod(){

    }

    public static void main(String[] args) {
        new AClass();
    }

}
