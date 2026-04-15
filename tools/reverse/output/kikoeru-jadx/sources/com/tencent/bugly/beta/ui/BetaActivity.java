package com.tencent.bugly.beta.ui;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.bugly.beta.Beta;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BetaActivity extends FragmentActivity {
    public Runnable onDestroyRunnable = null;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            if (Beta.dialogFullScreen) {
                getWindow().setFlags(1024, 1024);
            }
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new com.tencent.bugly.beta.global.b(1, this, viewFindViewById));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        int intExtra = getIntent().getIntExtra("frag", -1);
        Map<Integer, BaseFrag> map = UiManager.TEMP_FRAG;
        BaseFrag baseFrag = map.get(Integer.valueOf(intExtra));
        if (baseFrag == null) {
            finish();
        } else {
            getSupportFragmentManager().beginTransaction().add(R.id.content, baseFrag).commit();
            map.remove(Integer.valueOf(intExtra));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.onDestroyRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        boolean zOnKeyDown = fragmentFindFragmentById instanceof BaseFrag ? ((BaseFrag) fragmentFindFragmentById).onKeyDown(i10, keyEvent) : false;
        if (zOnKeyDown) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }
}
