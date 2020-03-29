package io.netty.example.pojo.protocol;

/***
 *@className RpcRequest
 *
 *@description 传输请求对象
 *
 *@author <a href="http://youngitman.tech">青年IT男</a>
 *
 *@date 16:02 2020-03-29
 *
 *@JunitTest: {@link  }
 *
 *@version v1.0.0
 *
**/
import java.io.Serializable;

public class RpcRequest implements Serializable{

    private static final long serialVersionUID = -2577707401136472809L;

    private String id;
    private Object data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "RpcRequest{" + "id='" + id + '\'' + ", data=" + data + '}';
    }
}
