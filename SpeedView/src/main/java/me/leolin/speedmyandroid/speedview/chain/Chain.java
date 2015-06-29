package me.leolin.speedmyandroid.speedview.chain;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.Action0;
import me.leolin.speedmyandroid.speedview.action.MoreAction;

/**
 * @author leolin
 */
public abstract class Chain<T extends View, C extends Chain> extends SpeedView {
    protected T view;

    private SpeedView wrapper;

    public Chain(T view, SpeedView wrapper) {
        this.view = view;
        this.wrapper = wrapper;
    }

    @Override
    protected View findViewById(int id) {
        return wrapper.just(id);
    }

    public C visible(int visibility) {
        view.setVisibility(visibility);
        return (C) this;
    }

    public C showIf(boolean condition) {
        return condition ? show() : hide();
    }

    public C hideIf(boolean condition) {
        return showIf(!condition);
    }

    public C show() {
        view.setVisibility(View.VISIBLE);
        return (C) this;
    }

    public C hide() {
        view.setVisibility(View.GONE);
        return (C) this;
    }

    public C click(View.OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener);
        return (C) this;
    }

    public C click(final Action0 action) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action.call();
            }
        });
        return (C) this;
    }


    public C enableIf(boolean condition) {
        return condition ? enable() : disable();
    }

    public C disableIf(boolean condition) {
        return enableIf(!condition);
    }

    public C enable() {
        view.setEnabled(true);
        return (C) this;
    }

    public C enable(boolean enable) {
        view.setEnabled(enable);
        return (C) this;
    }

    public C disable() {
        view.setEnabled(false);
        return (C) this;
    }

    public C bg(int color) {
        view.setBackgroundColor(color);
        return (C) this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public C bg(Drawable drawable) {
        view.setBackground(drawable);
        return (C) this;
    }

    public C bgRes(int id) {
        view.setBackgroundResource(id);
        return (C) this;
    }

    public C more(MoreAction<T> action) {
        action.more(view);
        return (C) this;
    }

    public C then(MoreAction<T> action) {
        action.more(view);
        return (C) this;
    }


    public T get() {
        return view;
    }


}
