package me.leolin.speedmyandroid.speedview.value;

import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.chain.MultiEditTextValue;

/**
 * @author Leolin
 */
public class ValueProvider {

    public MultiEditTextValue etValues(SpeedView speedView, int id, int id2) {
        return new MultiEditTextValue(speedView, id, id2);
    }

    public MultiEditTextValue etValues(SpeedView speedView, int... ids) {
        return new MultiEditTextValue(speedView, ids);
    }
}
