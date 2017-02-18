package compsci290.edu.duke.imageviewer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.content.Intent;
/**
 * Created by wangerxiao on 1/14/17.
 */

public class ImageGridActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_imagegrid);
        // Get GridView from xml
        GridView gridView = (GridView) findViewById (R.id.grid_view);

// Set Adapter for GridView
        gridView.setAdapter (new ImageAdapter (this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent in = new Intent(ImageGridActivity.this,FullSizeActivity.class);
                in.putExtra("id", i);
                startActivity(in);


            }
        });



        };

    }


