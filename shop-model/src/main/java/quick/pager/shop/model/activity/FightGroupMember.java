package quick.pager.shop.model.activity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.shop.model.Model;

@EqualsAndHashCode(callSuper = true)
@Data
public class FightGroupMember extends Model {
    private static final long serialVersionUID = -2987561966562272975L;

    private Long groupId;

    private Long recordId;

    private Long userId;

    private Boolean master;

}