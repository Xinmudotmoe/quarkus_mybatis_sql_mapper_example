package code.common.constant;


public class ResultStatus {
    /**
     * 请求成功
     */
    public static final Integer SUCCESS = 200;
    /**
     * 系统异常（后台程序报错）
     */
    public static final Integer SYSTEM_ERROR = 400;
    /**
     * 重要参数缺失，或参数不正确
     */
    public static final Integer PARAMETER_EXCEPTION = 412;
    /**
     * 业务失败
     */
    public static final Integer FAIL = 599;

}
