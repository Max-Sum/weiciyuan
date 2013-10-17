package org.qii.weiciyuan.support.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.qii.weiciyuan.support.utils.ThemeUtility;

/**
 * User: qii
 * Date: 13-10-15
 */
public class SwipeFrameLayout extends FrameLayout {

    public SwipeFrameLayout(Context context) {
        this(context, null);
    }

    public SwipeFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public SwipeFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setBackground(ThemeUtility.getDrawable(android.R.attr.windowBackground));
    }

}
