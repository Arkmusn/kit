package xyz.arkmusn.kit.design.pattern.chain;

import java.util.Optional;

/**
 * Handler chain. Init it then add {@link Handler handlers} inside
 *
 * @author Arkmusn
 * @param <P> parameter type of handler chain
 * @param <R> return type of handler chain
 * @since 1.0
 * @see Handler
 */
public interface HandlerChain<P, R> {
    /**
     * add handler to chain
     *
     * @param handler
     */
    void addHandler(Handler<P, R> handler);

    /**
     * handle with the input
     *
     * @param param input value
     * @return result, optional
     */
    Optional<R> handle(P param);
}
