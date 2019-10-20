package xyz.staffjoy.common.async;

import org.springframework.core.task.TaskDecorator;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * 因为异步调用会丢失上下文，所以异步调用需要拷贝上下文信息，如用户认证信息
 * 上下文的拷贝装饰类
 */
// https://stackoverflow.com/questions/23732089/how-to-enable-request-scope-in-async-task-executor
public class ContextCopyingDecorator implements TaskDecorator {

    @Override
    public Runnable decorate(Runnable runnable) {
        RequestAttributes context = RequestContextHolder.currentRequestAttributes();
        return () -> {
            try {
                RequestContextHolder.setRequestAttributes(context);
                runnable.run();
            } finally {
                RequestContextHolder.resetRequestAttributes();
            }
        };
    }
}
