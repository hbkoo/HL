package love.lxy.hbk.hl.Util;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

/**
 * Created by 19216 on 2020/1/12.
 * 手势监听
 */

public class GestureListener extends GestureDetector.SimpleOnGestureListener {
    private Context mContext;

    GestureListener(Context context) {
        mContext = context;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Toast.makeText(mContext, "DOWN " + e.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Toast.makeText(mContext, "SHOW " + e.getAction(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Toast.makeText(mContext, "SINGLE UP " + e.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2,
                            float distanceX, float distanceY) {
        Toast.makeText(mContext, "SCROLL " + e2.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Toast.makeText(mContext, "LONG " + e.getAction(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        Toast.makeText(mContext, "FLING " + e2.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Toast.makeText(mContext, "DOUBLE " + e.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Toast.makeText(mContext, "DOUBLE EVENT " + e.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Toast.makeText(mContext, "SINGLE CONF " + e.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }
}
