package xyz.staffjoy.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基本的统一响应类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse {

    private String message;

    @Builder.Default
    private ResultCode code = ResultCode.SUCCESS;

    public boolean isSuccess() {
        return code == ResultCode.SUCCESS;
    }
}
