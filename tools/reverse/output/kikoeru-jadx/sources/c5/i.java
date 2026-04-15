package c5;

import android.net.Uri;
import android.util.Pair;
import b0.c1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m4.j1;
import p4.c0;
import s4.f0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.h f3445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.h f3446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1 f3447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f3448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.q[] f3449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e5.c f3450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f3451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f3452i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w4.k f3454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3455l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j5.b f3457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f3458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m5.r f3460q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3462s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c1 f3453j = new c1(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f3456m = c0.f16553f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f3461r = -9223372036854775807L;

    public i(c cVar, e5.c cVar2, Uri[] uriArr, m4.q[] qVarArr, c1 c1Var, f0 f0Var, c1 c1Var2, List list, w4.k kVar) {
        this.f3444a = cVar;
        this.f3450g = cVar2;
        this.f3448e = uriArr;
        this.f3449f = qVarArr;
        this.f3447d = c1Var2;
        this.f3452i = list;
        this.f3454k = kVar;
        s4.h hVarQ = ((s4.g) c1Var.f1208b).q();
        this.f3445b = hVarQ;
        if (f0Var != null) {
            hVarQ.t(f0Var);
        }
        this.f3446c = ((s4.g) c1Var.f1208b).q();
        this.f3451h = new j1("", qVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((qVarArr[i10].f14536f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        j1 j1Var = this.f3451h;
        int[] iArrA0 = g8.a.a0(arrayList);
        g gVar = new g(j1Var, iArrA0);
        gVar.f3439g = gVar.s(j1Var.f14307d[iArrA0[0]]);
        this.f3460q = gVar;
    }

    public final k5.m[] a(j jVar, long j10) {
        List listUnmodifiableList;
        i iVar = this;
        j jVar2 = jVar;
        int iB = jVar2 == null ? -1 : iVar.f3451h.b(jVar2.f11058d);
        int length = iVar.f3460q.length();
        k5.m[] mVarArr = new k5.m[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int i11 = iVar.f3460q.i(i10);
            Uri uri = iVar.f3448e[i11];
            e5.c cVar = iVar.f3450g;
            if (cVar.c(uri)) {
                e5.k kVarA = cVar.a(z10, uri);
                kVarA.getClass();
                long j11 = kVarA.f6215h - cVar.f6169n;
                Pair pairC = iVar.c(jVar2, i11 != iB, kVarA, j11, j10);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j12 = kVarA.f6218k;
                i0 i0Var = kVarA.f6226s;
                i0 i0Var2 = kVarA.f6225r;
                int i12 = (int) (jLongValue - j12);
                if (i12 < 0 || i0Var2.size() < i12) {
                    g0 g0Var = i0.f25998b;
                    listUnmodifiableList = a1.f25946e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i12 < i0Var2.size()) {
                        if (iIntValue != -1) {
                            e5.h hVar = (e5.h) i0Var2.get(i12);
                            if (iIntValue == 0) {
                                arrayList.add(hVar);
                            } else if (iIntValue < hVar.f6194m.size()) {
                                i0 i0Var3 = hVar.f6194m;
                                arrayList.addAll(i0Var3.subList(iIntValue, i0Var3.size()));
                            }
                            i12++;
                        }
                        arrayList.addAll(i0Var2.subList(i12, i0Var2.size()));
                        iIntValue = 0;
                    }
                    if (kVarA.f6221n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(iIntValue, i0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                mVarArr[i10] = new f(j11, listUnmodifiableList);
            } else {
                mVarArr[i10] = k5.m.f11105h0;
            }
            i10++;
            iVar = this;
            jVar2 = jVar;
            z10 = false;
        }
        return mVarArr;
    }

    public final int b(j jVar) {
        int i10 = jVar.f3467o;
        if (i10 == -1) {
            return 1;
        }
        e5.k kVarA = this.f3450g.a(false, this.f3448e[this.f3451h.b(jVar.f11058d)]);
        kVarA.getClass();
        i0 i0Var = kVarA.f6225r;
        int i11 = (int) (jVar.f11104j - kVarA.f6218k);
        if (i11 < 0) {
            return 1;
        }
        i0 i0Var2 = i11 < i0Var.size() ? ((e5.h) i0Var.get(i11)).f6194m : kVarA.f6226s;
        if (i10 >= i0Var2.size()) {
            return 2;
        }
        e5.f fVar = (e5.f) i0Var2.get(i10);
        if (fVar.f6189m) {
            return 0;
        }
        Uri uri = Uri.parse(p4.c.x(kVarA.f6249a, fVar.f6195a));
        Uri uri2 = jVar.f11056b.f19443a;
        int i12 = c0.f16548a;
        return Objects.equals(uri, uri2) ? 1 : 2;
    }

    public final Pair c(j jVar, boolean z10, e5.k kVar, long j10, long j11) {
        boolean z11 = true;
        if (jVar != null) {
            long jA = jVar.f11104j;
            int i10 = jVar.f3467o;
            if (!z10) {
                if (!jVar.H) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    jA = jVar.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j12 = kVar.f6228u;
        i0 i0Var = kVar.f6226s;
        long j13 = kVar.f6218k;
        i0 i0Var2 = kVar.f6225r;
        long j14 = j12 + j10;
        if (jVar != null && !this.f3459p) {
            j11 = jVar.f11061g;
        }
        if (!kVar.f6222o && j11 >= j14) {
            return new Pair(Long.valueOf(j13 + ((long) i0Var2.size())), -1);
        }
        long j15 = j11 - j10;
        Long lValueOf = Long.valueOf(j15);
        int i11 = 0;
        if (this.f3450g.f6168m && jVar != null) {
            z11 = false;
        }
        int iC = c0.c(i0Var2, lValueOf, z11);
        long j16 = ((long) iC) + j13;
        if (iC >= 0) {
            e5.h hVar = (e5.h) i0Var2.get(iC);
            i0 i0Var3 = j15 < hVar.f6199e + hVar.f6197c ? hVar.f6194m : i0Var;
            while (true) {
                if (i11 >= i0Var3.size()) {
                    break;
                }
                e5.f fVar = (e5.f) i0Var3.get(i11);
                if (j15 >= fVar.f6199e + fVar.f6197c) {
                    i11++;
                } else if (fVar.f6188l) {
                    j16 += i0Var3 == i0Var ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j16), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(Uri uri, int i10, boolean z10) {
        if (uri == null) {
            return null;
        }
        c1 c1Var = this.f3453j;
        byte[] bArr = (byte[]) ((d) c1Var.f1208b).remove(uri);
        if (bArr != null) {
            return null;
        }
        s4.m mVar = new s4.m(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        m4.q qVar = this.f3449f[i10];
        int iN = this.f3460q.n();
        Object objQ = this.f3460q.q();
        byte[] bArr2 = this.f3456m;
        e eVar = new e(this.f3446c, mVar, 3, qVar, iN, objQ, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = c0.f16553f;
        }
        eVar.f3434j = bArr2;
        return eVar;
    }
}
