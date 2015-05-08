package me.leolin.speedmyandroid.speedview.action;

import me.leolin.speedmyandroid.speedview.chain.Chain;

/**
 * @author leolin
 */
public interface TextAction {
    <T extends Chain> T text(String text);
}
