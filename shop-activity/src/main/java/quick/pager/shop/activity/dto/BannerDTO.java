package quick.pager.shop.activity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.common.dto.BaseDTO;

@EqualsAndHashCode(callSuper = true)
@Data
public class BannerDTO extends BaseDTO {
    private static final long serialVersionUID = 2378276818835084161L;


    private String bannerType;

}
