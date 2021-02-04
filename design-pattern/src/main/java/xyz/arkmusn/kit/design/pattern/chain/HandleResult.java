package xyz.arkmusn.kit.design.pattern.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * @author Arkmusn
 * @since 1.0
 */
@Data
@Accessors(chain = true)
public class HandleResult<R> {
    private Status status;
    private R result;

    public static <R> HandleResult<R> handled(R result) {
        var handleResult = new HandleResult<R>();
        handleResult.status = Status.HANDLED;
        handleResult.result = result;
        return handleResult;
    }

    public static HandleResult<Void> next() {
        var handleResult = new HandleResult<Void>();
        handleResult.status = Status.CONTINUE;
        return handleResult;
    }

    @Getter
    @AllArgsConstructor
    enum Status {
        HANDLED,
        CONTINUE,
        ;
    }
}
