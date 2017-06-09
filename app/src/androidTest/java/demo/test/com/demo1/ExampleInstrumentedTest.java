package demo.test.com.demo1;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.robotium.solo.Solo;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2 {

    static String main_activity = "demo.test.com.demo1.MainActivity";
    private static Class<?> launcherActivity;

    //Robotium 中的用到的最多的类
    public Solo solo;

    //静态加载模块
    static {
        try {
            launcherActivity = Class.forName(main_activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //构造方法
    public ExampleInstrumentedTest() {
        super(launcherActivity);
    }

    //初始化方法
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    //销毁资源的方法
    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    /**
     * 测试用例，点击text 弹出toast
     */
    public void test01_clickText(){
        TextView tv = (TextView)solo.getView("tv");
        //判断tv是否为空
        assertTrue("tv为null",null != tv);
        //点击tv
        solo.clickOnView(tv);
        //捕获toast
        TextView toast = (TextView) solo.getView("message");
        //toast
        assertTrue("toast 为空",null != toast);
        assertTrue("弹出toast失败",solo.searchText(toast.getText().toString()));
    }

}
