package tk.mybatis.simple.model;

import lombok.Data;

@Data
public class Country {

    private Integer id;

    private String countryname;

    private String countrycode;
}
