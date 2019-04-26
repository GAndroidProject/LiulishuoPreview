package me.wangyuwei.liulishuopreview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * 作者： 巴掌 on 16/8/22 23:00
 * Github: https://github.com/JeasonWong
 */
public class PreviewVideoView extends VideoView {

    public PreviewVideoView(Context context) {
        super(context);
    }

    public PreviewVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PreviewVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//       seachal： 先测量宽度，根据宽度和宽高比，计算出高度，然后把计算好的宽度、高度值、设置进入。
        int w = MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(w, (int) (w / 0.56f));
    }
}
