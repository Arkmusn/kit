package xyz.arkmusn.kit.design.pattern.strategy;

/**
 * Strategy
 *
 * @author Arkmusn
 * @param <P> parameter type of handler chain
 * @since 1.0
 * @see StrategyContext
 */
public interface Strategy<P, R> {
    /**
     * execute this strategy
     *
     * @param param
     */
    R execute(P param);
}
