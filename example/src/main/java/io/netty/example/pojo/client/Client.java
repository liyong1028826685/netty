package io.netty.example.pojo.client;

import io.netty.channel.Channel;
import io.netty.example.pojo.protocol.RpcRequest;

import java.util.UUID;

/**
 * @author <a href="http://youngitman.tech">青年IT男</a>
 * @version v1.0.0
 * @className Client
 * @description
 * @date 2020-03-29 15:46
 * @JunitTest: {@link  }
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        NettyClient client = new NettyClient("127.0.0.1", 8080);
        //启动client服务
        client.start();

        Channel channel = client.getChannel();
        //消息体
        RpcRequest request = new RpcRequest();
        request.setId(UUID.randomUUID().toString());
        request.setData("client.message");
        //channel对象可保存在map中，供其它地方发送消息
        channel.writeAndFlush(request);
    }
}
