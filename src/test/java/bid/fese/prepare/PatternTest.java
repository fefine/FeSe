package bid.fese.prepare;

import org.junit.Test;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by feng_sh on 17-5-25.
 * url匹配测试
 */
public class PatternTest {
    @Test
    public void test() {
/*        Pattern pattern = Pattern.compile("/?/static/?\\S+");
        System.out.println(pattern.matcher("/static/index").matches());
        System.out.println(pattern.matcher("/static/").matches());
        System.out.println(pattern.matcher("/static/风").matches());
        System.out.println(pattern.matcher("/static/index html").matches());
        System.out.println(pattern.matcher("/static/index_html").matches());
     */
/*        Pattern p1 = Pattern.compile("\\W+.(jpg)|(gif)$");
        System.out.println(p1.matcher("mat.jpg").matches());*/

/*        Object[] os = new Object[3][2];
        for (int i = 0; i < os.length; i++) {
            os[i] = new Object[]{i, "" + i};
        }
        System.out.println(Arrays.deepToString(os));*/
        Pattern p = Pattern.compile("(jpg)|(png)");
        System.out.println(p.matcher("jpg").matches());
        System.out.println(p.matcher("png").matches());
        System.out.println(p.matcher("ff.png").matches());
        System.out.println("hehe.jpg".substring(4));
    }
}
