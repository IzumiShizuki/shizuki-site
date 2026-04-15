package q8;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import b7.m;
import i7.p2;
import jc.l;
import m0.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f17911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17913d;

    public a(Context context) {
        this.f17910a = context;
        Bitmap.Config[] configArr = x8.d.f24838a;
        double d10 = 0.2d;
        try {
            Object objI = android.support.v4.media.session.b.I(context, ActivityManager.class);
            l.b(objI);
            if (((ActivityManager) objI).isLowRamDevice()) {
                d10 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f17911b = d10;
        this.f17912c = true;
        this.f17913d = true;
    }

    public final d a() {
        h p2Var;
        int largeMemoryClass;
        int i10 = 0;
        i mVar = this.f17913d ? new m((byte) 0, 8) : new m3.l(25);
        if (this.f17912c) {
            double d10 = this.f17911b;
            if (d10 > 0.0d) {
                Context context = this.f17910a;
                Bitmap.Config[] configArr = x8.d.f24838a;
                try {
                    Object objI = android.support.v4.media.session.b.I(context, ActivityManager.class);
                    l.b(objI);
                    ActivityManager activityManager = (ActivityManager) objI;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    largeMemoryClass = 256;
                }
                double d11 = 1024;
                i10 = (int) (d10 * ((double) largeMemoryClass) * d11 * d11);
            }
            p2Var = i10 > 0 ? new w(i10, mVar) : new p2(mVar);
        } else {
            p2Var = new p2(mVar);
        }
        return new d(p2Var, mVar);
    }
}
