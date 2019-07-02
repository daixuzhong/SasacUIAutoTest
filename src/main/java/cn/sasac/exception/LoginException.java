package cn.sasac.exception;

/**
 * @author daixuzhong
 * @title: LoginException
 * @description: TODO
 * @date 2019/7/1
 */
public class LoginException extends Exception {

    //无参构造方法
    public LoginException(){
        super();
    }

    //有参的构造方法
    public LoginException(String message){
        super(message);

    }

    // 用指定的详细信息和原因构造一个新的异常
    public LoginException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public LoginException(Throwable cause) {
        super(cause);
    }



}
