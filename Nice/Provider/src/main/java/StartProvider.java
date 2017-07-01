/**
 * @author: lkz
 * @description : 启动Provider服务
 * @createTime : 2017/06/19
 */
public class StartProvider {
    public static void main(String[] args) {
        try {
            com.alibaba.dubbo.container.Main.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
