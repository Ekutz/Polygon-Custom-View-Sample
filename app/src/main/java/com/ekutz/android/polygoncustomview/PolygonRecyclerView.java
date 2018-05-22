package com.ekutz.android.polygoncustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by jsPark on 2018. 5. 22..
 */

public class PolygonRecyclerView extends RecyclerView {

    public PolygonRecyclerView(Context context) {
        super(context);
    }

    public PolygonRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PolygonRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {

        int height = canvas.getHeight();
        int width = canvas.getWidth();

        Path path = new Path();

        path.moveTo(0, 0);
        path.lineTo(0, height);
        path.lineTo(width/8, height);
        path.lineTo(width/3, height*14/18);
        path.lineTo(width, height*14/18);
        path.lineTo(width, height*4/18);
        path.lineTo(width/3, height*4/18);
        path.lineTo(width/8, 0);
        path.lineTo(0, 0);

        path.close();
        canvas.save();
        canvas.clipPath(path, Region.Op.INTERSECT);

        super.dispatchDraw(canvas);
    }
}
