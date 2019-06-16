package com.warkiz.indicatorseekbar.fragment;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

import com.warkiz.indicatorseekbar.R;
import com.warkiz.widget.IndicatorSeekBar;

/**
 * created by zhuangguangquan on  2017/9/6
 */

public class DiscreteFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.discrete;
    }

    @Override
    protected void initView(View root) {
        //customTickTexts
        /*IndicatorSeekBar seekBar = root.findViewById(R.id.custom_text);
        String[] arr = {"A", "a", "B", "b", "C", "c", "D"};
        seekBar.customTickTexts(arr);
*/

        // This merely sets the TickMarks Drawable to a drawable/selector. then it implicitly calls initTickMarksBitmap which
        // draws a bitmap and set the bitmap to Selected/UnSelected bitmap member, so whe the onDraw method is called. it will
        // draw that member on the canvas
        //tick_drawable
        IndicatorSeekBar tick_drawable = root.findViewById(R.id.tick_drawable);
        tick_drawable.setTickMarksDrawable(getResources().getDrawable(R.mipmap.ic_launcher));

        Drawable d = getResources().getDrawable(R.drawable.ic_bluetooth);
        tick_drawable.setCustomTickMarkDrawable(d,1);

        //custom section color
        /*//IndicatorSeekBar sectionSeekBar = root.findViewById(R.id.custom_section_color);

        sectionSeekBar.customSectionTrackColor(new ColorCollector() {
            @Override
            public boolean collectSectionTrackColor(int[] colorIntArr) {
                //the length of colorIntArray equals section count
                colorIntArr[0] = getResources().getColor(R.color.color_blue, null);
                colorIntArr[1] = getResources().getColor(R.color.color_gray, null);
                colorIntArr[2] = Color.parseColor("#FF4081");
                   colorIntArr[3] = Color.parseColor("#303F9F");
                return true;//true if apply color , otherwise no change
            }
        });
*/
        //set listener
        IndicatorSeekBar listenerSeekBar = root.findViewById(R.id.listener);
        final TextView states = root.findViewById(R.id.states);
        states.setText("states: ");
        final TextView progress = root.findViewById(R.id.progress);
        //progress.setText("progress: " + listenerSeekBar.getProgress());
        final TextView progress_float = root.findViewById(R.id.progress_float);
        //progress_float.setText("progress_float: " + listenerSeekBar.getProgressFloat());
        final TextView from_user = root.findViewById(R.id.from_user);
        from_user.setText("from_user: ");
        final TextView thumb_position = root.findViewById(R.id.thumb_position);
        thumb_position.setText("thumb_position: ");
        final TextView tick_text = root.findViewById(R.id.tick_text);
        tick_text.setText("tick_text: ");
    }
}
