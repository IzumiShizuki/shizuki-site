package m4;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public ya.i0 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f14318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f14319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f14320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f14321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f14322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f14323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f14324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f14325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z0 f14326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z0 f14327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f14328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f14329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f14330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f14331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f14332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f14333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f14334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f14335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f14336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f14337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f14338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f14339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f14340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f14341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f14342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f14343z;

    public k0() {
        ya.g0 g0Var = ya.i0.f25998b;
        this.I = ya.a1.f25946e;
    }

    public final void a(byte[] bArr, int i10) {
        if (this.f14328k != null) {
            Integer numValueOf = Integer.valueOf(i10);
            int i11 = p4.c0.f16548a;
            if (!numValueOf.equals(3) && Objects.equals(this.f14329l, 3)) {
                return;
            }
        }
        this.f14328k = (byte[]) bArr.clone();
        this.f14329l = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        this.f14328k = bArr == null ? null : (byte[]) bArr.clone();
        this.f14329l = num;
    }

    public final void c(Long l10) {
        p4.c.c(l10 == null || l10.longValue() >= 0);
        this.f14325h = l10;
    }
}
