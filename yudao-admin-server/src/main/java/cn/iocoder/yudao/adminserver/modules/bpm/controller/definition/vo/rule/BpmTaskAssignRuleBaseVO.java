package cn.iocoder.yudao.adminserver.modules.bpm.controller.definition.vo.rule;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * 流程任务分配规则 Base VO，提供给添加、修改、详细的子 VO 使用
 * 如果子 VO 存在差异的字段，请不要添加到这里，影响 Swagger 文档生成
 */
@Data
public class BpmTaskAssignRuleBaseVO {

    @ApiModelProperty(value = "规则类型", required = true, example = "bpm_task_assign_rule_type")
    @NotNull(message = "规则类型不能为空")
    private Integer type;

    @ApiModelProperty(value = "规则值数组", required = true, example = "1,2,3")
    @NotNull(message = "规则值数组不能为空")
    private Set<Long> options;

}
