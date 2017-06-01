package dataoperate;

import dataoperate.IDataOperate;

/**
 * Created by 12917 on 2017/5/31.
 */
public class DBOperate implements IDataOperate {
    public void save(String big_text) {
        System.out.println("将数据"+big_text+"保存进数据库了");
    }
}
