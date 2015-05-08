package me.leolin.speedmyandroid.speedview.action;

import android.view.View;
import me.leolin.speedmyandroid.speedview.chain.Chain;

/**
 * @author leolin
 */
public interface ContainerViewAction {
    <T extends Chain> T addView(View child);
}
