package xyz.staffjoy.common.auditlog;

import com.github.structlog4j.IToLog;
import lombok.Builder;
import lombok.Data;

/**
 * 结构化和审计日志 javabean
 */
@Data
@Builder
public class LogEntry implements IToLog {

    private String currentUserId;
    private String companyId;
    private String teamId;
    private String authorization;
    private String targetType;
    private String targetId;
    private String originalContents;
    private String updatedContents;

    @Override
    public Object[] toLog() {
        return new Object[]{
                "auditlog", "true",
                "currentUserId", currentUserId,
                "companyId", companyId,
                "teamId", teamId,
                "authorization", authorization,
                "targetType", targetType,
                "targetId", targetId,
                "originalContents", originalContents,
                "updatedContents", updatedContents
        };
    }
}
