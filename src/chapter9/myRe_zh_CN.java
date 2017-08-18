package chapter9;

import java.util.ListResourceBundle;

public class myRe_zh_CN extends ListResourceBundle {

    Object[][] data = {
            {"msg","{0},你好， 不是 {1}"}
    };
    @Override
    protected Object[][] getContents() {
        return data;
    }
}
