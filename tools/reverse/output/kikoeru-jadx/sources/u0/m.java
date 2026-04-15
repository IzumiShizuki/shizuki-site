package u0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.reflect.Method;
import q1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f21207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f21208f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f21210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f21211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21212d;

    public m(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f21209a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f21209a) {
            this.f21212d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f21212d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f21212d;
    }
}
