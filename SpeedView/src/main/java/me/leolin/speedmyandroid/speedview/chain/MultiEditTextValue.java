package me.leolin.speedmyandroid.speedview.chain;

import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.*;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Leolin
 */
public class MultiEditTextValue {

    private List<EditTextChain> editTextChains = new LinkedList<EditTextChain>();

    public MultiEditTextValue(SpeedView speedView, int id, int id2) {
        editTextChains.add(speedView.et(id));
        editTextChains.add(speedView.et(id2));
    }

    public MultiEditTextValue(SpeedView speedView, int[] ids) {
        for (int id : ids) {
            editTextChains.add(speedView.et(id));
        }
    }

    public void then(Action2<String, String> action2) {
        action2.call(
                editTextChains.get(0).get().getText().toString(),
                editTextChains.get(1).get().getText().toString()
        );
    }

    public void then(Action3<String, String, String> action) {
        action.call(
                editTextChains.get(0).get().getText().toString(),
                editTextChains.get(1).get().getText().toString(),
                editTextChains.get(2).get().getText().toString()
        );
    }

    public void then(Action4<String, String, String, String> action) {
        action.call(
                editTextChains.get(0).get().getText().toString(),
                editTextChains.get(1).get().getText().toString(),
                editTextChains.get(2).get().getText().toString(),
                editTextChains.get(3).get().getText().toString()
        );
    }

    public void then(Action5<String, String, String, String, String> action) {
        action.call(
                editTextChains.get(0).get().getText().toString(),
                editTextChains.get(1).get().getText().toString(),
                editTextChains.get(2).get().getText().toString(),
                editTextChains.get(3).get().getText().toString(),
                editTextChains.get(4).get().getText().toString()
        );
    }

    public void then(Action6<String, String, String, String, String, String> action) {
        action.call(
                editTextChains.get(0).get().getText().toString(),
                editTextChains.get(1).get().getText().toString(),
                editTextChains.get(2).get().getText().toString(),
                editTextChains.get(3).get().getText().toString(),
                editTextChains.get(4).get().getText().toString(),
                editTextChains.get(5).get().getText().toString()
        );
    }

    public void then(Action7<String, String, String, String, String, String, String> action) {
        action.call(
                editTextChains.get(0).get().getText().toString(),
                editTextChains.get(1).get().getText().toString(),
                editTextChains.get(2).get().getText().toString(),
                editTextChains.get(3).get().getText().toString(),
                editTextChains.get(4).get().getText().toString(),
                editTextChains.get(5).get().getText().toString(),
                editTextChains.get(6).get().getText().toString()
        );
    }

}
