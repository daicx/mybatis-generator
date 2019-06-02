package com.baomidou.ant.entity;

    import java.util.Date;
    import java.io.Serializable;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author dcx
* @since 2019-06-02
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @ApiModel(value="Videos对象", description="")
    public class Videos implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idvideos;

    private String name;

    private String desc;

    private Date updateTime;

    private Date addTime;

    private String title;


}
