package com.jason.myjavatrips;

import java.nio.ByteBuffer;

public class NIOTest {
    public static void main(String[] args) {
        // 指定緩衝區大小為10
        ByteBuffer buffer = ByteBuffer.allocate(10);
        println(buffer, "");
        // 想緩衝區中放入五個字符
        buffer.put("Jason".getBytes());
        println(buffer, "");

        // 開啓讀模式
        buffer.flip();
        println(buffer, "開啓讀模式");

        byte[] bytes = new byte[buffer.limit()];
        buffer.get(bytes);
        System.out.println(new String(bytes, 0, bytes.length));

        buffer.rewind();
        println(buffer, "重複讀模式");


    }

    static void println(ByteBuffer buffer, String msg) {
        System.out.println("-----" + msg + "----");
        System.out.println("position：" + buffer.position());
        System.out.println("limit：" + buffer.limit());
        System.out.println("capacity：" + buffer.capacity());
    }
}
