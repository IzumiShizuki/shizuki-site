package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import b0.c1;
import d7.k;
import d7.l;
import d7.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m4.j1;
import m4.k1;
import m4.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f1002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckedTextView f1003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f1004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f1005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f1010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f1011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1012l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f1001a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f1002b = layoutInflaterFrom;
        l lVar = new l(this);
        this.f1005e = lVar;
        this.f1010j = new c1(getResources());
        this.f1006f = new ArrayList();
        this.f1007g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1003c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.cnl.kikoeru.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(lVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.cnl.kikoeru.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1004d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.cnl.kikoeru.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(lVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f1003c.setChecked(this.f1012l);
        boolean z10 = this.f1012l;
        HashMap map = this.f1007g;
        this.f1004d.setChecked(!z10 && map.size() == 0);
        for (int i10 = 0; i10 < this.f1011k.length; i10++) {
            k1 k1Var = (k1) map.get(((p1) this.f1006f.get(i10)).f14509b);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f1011k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (k1Var != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.f1011k[i10][i11].setChecked(k1Var.f14347b.contains(Integer.valueOf(((m) tag).f5535b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.TrackSelectionView.b():void");
    }

    public boolean getIsDisabled() {
        return this.f1012l;
    }

    public Map<j1, k1> getOverrides() {
        return this.f1007g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f1008h != z10) {
            this.f1008h = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f1009i != z10) {
            this.f1009i = z10;
            if (!z10) {
                HashMap map = this.f1007g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.f1006f;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        k1 k1Var = (k1) map.get(((p1) arrayList.get(i10)).f14509b);
                        if (k1Var != null && map2.isEmpty()) {
                            map2.put(k1Var.f14346a, k1Var);
                        }
                        i10++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f1003c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(k kVar) {
        kVar.getClass();
        this.f1010j = kVar;
        b();
    }
}
