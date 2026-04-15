package s8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.q;
import hf.u;
import java.util.Arrays;
import java.util.List;
import q.t0;
import ug.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final Integer A;
    public final Drawable B;
    public final Integer C;
    public final Drawable D;
    public final d E;
    public final c F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u8.a f19616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f19617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t8.d f19618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f19619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w8.e f19620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f19621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f19622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f19627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f19628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f19629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f19630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f19631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f19632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f19633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q f19634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t8.i f19635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t8.g f19636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f19637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Integer f19638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Drawable f19639z;

    public i(Context context, Object obj, u8.a aVar, Bitmap.Config config, t8.d dVar, List list, w8.e eVar, r rVar, p pVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar, b bVar2, b bVar3, u uVar, u uVar2, u uVar3, u uVar4, q qVar, t8.i iVar, t8.g gVar, n nVar, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar2, c cVar) {
        this.f19614a = context;
        this.f19615b = obj;
        this.f19616c = aVar;
        this.f19617d = config;
        this.f19618e = dVar;
        this.f19619f = list;
        this.f19620g = eVar;
        this.f19621h = rVar;
        this.f19622i = pVar;
        this.f19623j = z10;
        this.f19624k = z11;
        this.f19625l = z12;
        this.f19626m = z13;
        this.f19627n = bVar;
        this.f19628o = bVar2;
        this.f19629p = bVar3;
        this.f19630q = uVar;
        this.f19631r = uVar2;
        this.f19632s = uVar3;
        this.f19633t = uVar4;
        this.f19634u = qVar;
        this.f19635v = iVar;
        this.f19636w = gVar;
        this.f19637x = nVar;
        this.f19638y = num;
        this.f19639z = drawable;
        this.A = num2;
        this.B = drawable2;
        this.C = num3;
        this.D = drawable3;
        this.E = dVar2;
        this.F = cVar;
    }

    public static h a(i iVar) {
        Context context = iVar.f19614a;
        iVar.getClass();
        return new h(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jc.l.a(this.f19614a, iVar.f19614a) && this.f19615b.equals(iVar.f19615b) && jc.l.a(this.f19616c, iVar.f19616c) && this.f19617d == iVar.f19617d && this.f19618e == iVar.f19618e && jc.l.a(this.f19619f, iVar.f19619f) && jc.l.a(this.f19620g, iVar.f19620g) && jc.l.a(this.f19621h, iVar.f19621h) && this.f19622i.equals(iVar.f19622i) && this.f19623j == iVar.f19623j && this.f19624k == iVar.f19624k && this.f19625l == iVar.f19625l && this.f19626m == iVar.f19626m && this.f19627n == iVar.f19627n && this.f19628o == iVar.f19628o && this.f19629p == iVar.f19629p && jc.l.a(this.f19630q, iVar.f19630q) && jc.l.a(this.f19631r, iVar.f19631r) && jc.l.a(this.f19632s, iVar.f19632s) && jc.l.a(this.f19633t, iVar.f19633t) && jc.l.a(this.f19638y, iVar.f19638y) && jc.l.a(this.f19639z, iVar.f19639z) && jc.l.a(this.A, iVar.A) && jc.l.a(this.B, iVar.B) && jc.l.a(this.C, iVar.C) && jc.l.a(this.D, iVar.D) && jc.l.a(this.f19634u, iVar.f19634u) && this.f19635v.equals(iVar.f19635v) && this.f19636w == iVar.f19636w && this.f19637x.equals(iVar.f19637x) && this.E.equals(iVar.E) && jc.l.a(this.F, iVar.F);
    }

    public final int hashCode() {
        int iHashCode = (this.f19615b.hashCode() + (this.f19614a.hashCode() * 31)) * 31;
        u8.a aVar = this.f19616c;
        int iHashCode2 = (this.f19637x.f19657a.hashCode() + ((this.f19636w.hashCode() + ((this.f19635v.hashCode() + ((this.f19634u.hashCode() + ((this.f19633t.hashCode() + ((this.f19632s.hashCode() + ((this.f19631r.hashCode() + ((this.f19630q.hashCode() + ((this.f19629p.hashCode() + ((this.f19628o.hashCode() + ((this.f19627n.hashCode() + ((((((((((this.f19622i.f19666a.hashCode() + ((((this.f19620g.hashCode() + t0.z((this.f19618e.hashCode() + ((this.f19617d.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f19619f)) * 31) + Arrays.hashCode(this.f19621h.f21860a)) * 31)) * 31) + (this.f19623j ? 1231 : 1237)) * 31) + (this.f19624k ? 1231 : 1237)) * 31) + (this.f19625l ? 1231 : 1237)) * 31) + (this.f19626m ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        Integer num = this.f19638y;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f19639z;
        int iHashCode4 = (iHashCode3 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.A;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.B;
        int iHashCode6 = (iHashCode5 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.C;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.D;
        return this.F.hashCode() + ((this.E.hashCode() + ((iHashCode7 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }
}
