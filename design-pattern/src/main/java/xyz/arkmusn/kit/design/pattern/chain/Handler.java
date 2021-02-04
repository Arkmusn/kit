package xyz.arkmusn.kit.design.pattern.chain;

/**
 * Handler in the {@link HandlerChain handler chain}
 *
 * @author Arkmusn
 * @param <P> parameter type of handler chain
 * @param <R> return type of handler chain
 * @since 1.0
 * @see HandlerChain
 */
public interface Handler<P, R> {
    HandleResult<R> handle(P param);
}
