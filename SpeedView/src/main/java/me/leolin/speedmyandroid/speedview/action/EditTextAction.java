package me.leolin.speedmyandroid.speedview.action;

import me.leolin.speedmyandroid.speedview.chain.Chain;

/**
 * @author leolin
 */
public interface EditTextAction {
    <T extends Chain> T showAsText();

    <T extends Chain> T showAsPassword();
}
