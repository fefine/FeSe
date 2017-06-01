package bid.fese.handler;

import bid.fese.entity.SeRequest;
import bid.fese.entity.SeResponse;

import java.util.Set;

/**
 * Created by feng_sh on 17-5-25.
 * 动态请求处理
 */
public class DynamicDispatcherHandler implements DispatcherHandler {
    @Override
    public void initHandler() {}

    @Override
    public void handlerRequest(SeRequest request, SeResponse response) {
        StringBuilder sb = new StringBuilder();
        Set<String> ns = request.getParameterNames();
        for (String n : ns) {
            sb.append("key:").append(n).append(" value:").append(request.getParameter(n));
        }
        sb.append("\n");
        sb.append("Dynamic request handler is not implement");
        response.getPrintWriter().print(sb.toString());
        response.getPrintWriter().flush();
        response.getCookies().set("data", "hehe");
        response.flush();
    }
}
