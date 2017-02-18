package compsci290.edu.duke.imageviewer;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;

/**
 * Created by wangerxiao on 1/31/17.
 */

public class FullSizeActivity extends Activity {
    public Integer[] mThumbsBig =
            { R.drawable.pic0, R.drawable.pic1, R.drawable.pic2,
                    R.drawable.pic3, R.drawable.pic4, R.drawable.pic5,
                    R.drawable.pic6, R.drawable.pic7, R.drawable.pic8,
                    R.drawable.pic9, R.drawable.pic10,R.drawable.pic11,
                    R.drawable.pic12,R.drawable.pic13,R.drawable.pic14,
                    R.drawable.pic15,R.drawable.pic16,R.drawable.pic17,
                    R.drawable.pic18, R.drawable.pic19
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_size);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageResource(mThumbsBig[position]);

    }
}
