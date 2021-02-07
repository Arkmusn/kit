package xyz.arkmusn.kit.design.pattern.strategy;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Context for execute strategy.
 *
 * @author Arkmusn
 * @since 1.0
 * @see Strategy
 */
@Data
@Accessors(chain = true)
public class StrategyContext<P, R> {
    private Strategy<P, R> strategy;

    /**
     * execute the strategy with param
     *
     * @param param
     * @return
     */
    public R executeStrategy(P param) {
        return strategy.execute(param);
    }
}
