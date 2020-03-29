package io.netty.example.pojo;

import io.netty.example.pojo.server.NettyServer;

/**
 * @author <a href="http://youngitman.tech">青年IT男</a>
 * @version v1.0.0
 * @className Server
 * @description
 * @date 2020-03-29 15:41
 * @JunitTest: {@link  }
 **/
public class Server {
    public static void main(String[] args) throws Exception {
        //启动server服务
        new NettyServer().bind(8080);
    }
}
