package w1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f23154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f23156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f23157j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = g0.f23208a;
            list = vb.r.f22819a;
        }
        ArrayList arrayList = new ArrayList();
        this.f23148a = str;
        this.f23149b = f10;
        this.f23150c = f11;
        this.f23151d = f12;
        this.f23152e = f13;
        this.f23153f = f14;
        this.f23154g = f15;
        this.f23155h = f16;
        this.f23156i = list;
        this.f23157j = arrayList;
    }
}
