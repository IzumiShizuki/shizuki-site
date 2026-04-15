package d7;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;
import m4.j1;
import m4.k1;
import m4.p1;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackSelectionView f5533a;

    public l(TrackSelectionView trackSelectionView) {
        this.f5533a = trackSelectionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.f5533a;
        HashMap map = trackSelectionView.f1007g;
        boolean z10 = true;
        if (view == trackSelectionView.f1003c) {
            trackSelectionView.f1012l = true;
            map.clear();
        } else if (view == trackSelectionView.f1004d) {
            trackSelectionView.f1012l = false;
            map.clear();
        } else {
            trackSelectionView.f1012l = false;
            Object tag = view.getTag();
            tag.getClass();
            m mVar = (m) tag;
            p1 p1Var = mVar.f5534a;
            j1 j1Var = p1Var.f14509b;
            int i10 = mVar.f5535b;
            k1 k1Var = (k1) map.get(j1Var);
            if (k1Var == null) {
                if (!trackSelectionView.f1009i && map.size() > 0) {
                    map.clear();
                }
                map.put(j1Var, new k1(j1Var, i0.u(Integer.valueOf(i10))));
            } else {
                ArrayList arrayList = new ArrayList(k1Var.f14347b);
                boolean zIsChecked = ((CheckedTextView) view).isChecked();
                boolean z11 = trackSelectionView.f1008h && p1Var.f14510c;
                if (!z11 && (!trackSelectionView.f1009i || trackSelectionView.f1006f.size() <= 1)) {
                    z10 = false;
                }
                if (zIsChecked && z10) {
                    arrayList.remove(Integer.valueOf(i10));
                    if (arrayList.isEmpty()) {
                        map.remove(j1Var);
                    } else {
                        map.put(j1Var, new k1(j1Var, arrayList));
                    }
                } else if (!zIsChecked) {
                    if (z11) {
                        arrayList.add(Integer.valueOf(i10));
                        map.put(j1Var, new k1(j1Var, arrayList));
                    } else {
                        map.put(j1Var, new k1(j1Var, i0.u(Integer.valueOf(i10))));
                    }
                }
            }
        }
        trackSelectionView.a();
    }
}
