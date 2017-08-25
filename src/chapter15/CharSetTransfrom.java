package chapter15;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CharSetTransfrom {
    public static void main(String[] args) {
        //指定编码对应的Charset对象
        Charset charset = Charset.forName("GBK");
        CharsetDecoder decoder = charset.newDecoder();
        CharsetEncoder encoder = charset.newEncoder();
        CharBuffer buffer = CharBuffer.allocate(6);
        buffer.put("孙");
        buffer.put("悟");
        buffer.put("空");
        buffer.flip();
        try {
            //将CharBuffer中的字符序列改为字节序列
            ByteBuffer byteBuffer = encoder.encode(buffer);
            for (int i = 0; i < buffer.capacity(); i++) {
                System.out.println();
                System.out.println(buffer.get(i));
            }
            System.out.println(decoder.decode(byteBuffer));
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }
    }
}
