package xyz.arkmusn.kit.design.pattern.chain;

import java.util.LinkedList;
import java.util.Optional;

/**
 * @author Arkmusn
 * @since 1.0
 */
public class BaseHandlerChain<P, R> implements HandlerChain<P, R> {
    private final LinkedList<Handler<P, R>> handlers = new LinkedList<>();

    @Override
    public void addHandler(Handler<P, R> handler) {
        handlers.add(handler);
    }

    @Override
    public Optional<R> handle(P param) {
        final var iterator = handlers.iterator();
        if (iterator.hasNext()) {
            final var result = iterator.next().handle(param);
            if (result.getStatus() == HandleResult.Status.HANDLED) {
                return Optional.of(result.getResult());
            }
        }
        return Optional.empty();
    }
}
