package tk.mybatis.simple.model;

import lombok.Data;

@Data
public class Country extends AClass{

    private Integer id;

    private String countryname;

   private    String countrycode ="10";

    private AClass a;

    public Country(){
        System.out.println("country构造");
    }

    public Country clone() throws CloneNotSupportedException {
        return (Country)super.clone();
    }

     protected  class B{
        private int a = 10;

        public B(){
            System.out.println("b构造");
        }

        public int getA(){
            return a;
        }
    }

}
