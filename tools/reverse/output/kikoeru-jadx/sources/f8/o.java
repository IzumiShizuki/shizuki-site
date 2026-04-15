package f8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f6905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f6906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f6907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f6909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f6910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f6915l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f6904a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
