package code.common.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import code.common.constant.ResultStatus;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UniversalResult<T> implements Serializable {
    T data;
    Integer code;
    String message;

    public static <T> UniversalResult<T> success(T data) {
        return UniversalResult.<T>builder()
                .code(ResultStatus.SUCCESS)
                .data(data)
                .build();
    }

    public static <T> UniversalResult<T> fail(T data) {
        return UniversalResult.<T>builder()
                .code(ResultStatus.FAIL)
                .data(data)
                .build();
    }
}
