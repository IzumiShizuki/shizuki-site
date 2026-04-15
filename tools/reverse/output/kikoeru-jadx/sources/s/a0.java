package s;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19090c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f19091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f19092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f19093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f19094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f19095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f19096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f19097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f19098k;

    public a0(Context context, int i10) {
        this.f19088a = context;
        this.f19089b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? m3.f.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(u.e1 e1Var) {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f19088a;
        EdgeEffect edgeEffectA = i10 >= 31 ? m3.f.a(context) : new d0(context);
        edgeEffectA.setColor(this.f19089b);
        if (!f3.l.b(this.f19090c, 0L)) {
            if (e1Var == u.e1.f20882a) {
                long j10 = this.f19090c;
                edgeEffectA.setSize((int) (j10 >> 32), (int) (4294967295L & j10));
                return edgeEffectA;
            }
            long j11 = this.f19090c;
            edgeEffectA.setSize((int) (4294967295L & j11), (int) (j11 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f19092e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(u.e1.f20882a);
        this.f19092e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f19093f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(u.e1.f20883b);
        this.f19093f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f19094g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(u.e1.f20883b);
        this.f19094g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f19091d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(u.e1.f20882a);
        this.f19091d = edgeEffectA;
        return edgeEffectA;
    }
}
