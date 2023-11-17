package com.wx.parser.info;

import java.util.Optional;
import java.util.function.Supplier;

public interface Info {
    default <C> Info optionalMap(Optional<C> ctx, Supplier<Info> f) {
        return ctx.map(a -> f.get()).orElse(this);
    }

}
