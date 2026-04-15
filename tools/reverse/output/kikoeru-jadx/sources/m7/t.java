package m7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class t extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f14931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14932b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14931a = new Rect();
        this.f14932b = true;
    }

    public t(int i10, int i11) {
        super(i10, i11);
        this.f14931a = new Rect();
        this.f14932b = true;
    }

    public t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f14931a = new Rect();
        this.f14932b = true;
    }

    public t(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f14931a = new Rect();
        this.f14932b = true;
    }

    public t(t tVar) {
        super((ViewGroup.LayoutParams) tVar);
        this.f14931a = new Rect();
        this.f14932b = true;
    }
}
