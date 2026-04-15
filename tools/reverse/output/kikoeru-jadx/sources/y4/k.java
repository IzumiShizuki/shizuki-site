package y4;

import b0.w1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m4.o0;
import m4.q;
import m5.r;
import n5.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f25514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f25515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f25516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s4.h f25518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f25521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i[] f25522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f25523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z4.c f25524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j5.b f25526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25527n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y4.k] */
    public k(k5.d dVar, p pVar, z4.c cVar, w1 w1Var, int i10, int[] iArr, r rVar, int i11, s4.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, n nVar) {
        z4.m mVar;
        i[] iVarArr;
        q qVar;
        r5.n jVar;
        k5.e eVar;
        ?? obj = new Object();
        obj.f25514a = pVar;
        obj.f25524k = cVar;
        obj.f25515b = w1Var;
        obj.f25516c = iArr;
        obj.f25523j = rVar;
        obj.f25517d = i11;
        obj.f25518e = hVar;
        obj.f25525l = i10;
        obj.f25519f = j10;
        obj.f25520g = i12;
        n nVar2 = nVar;
        obj.f25521h = nVar2;
        long jD = cVar.d(i10);
        ArrayList arrayListA = obj.a();
        obj.f25522i = new i[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        k kVar = obj;
        while (i14 < kVar.f25522i.length) {
            z4.m mVar2 = (z4.m) arrayListA.get(rVar.i(i14));
            z4.b bVarE0 = w1Var.e0(mVar2.f26438b);
            i[] iVarArr2 = kVar.f25522i;
            z4.b bVar = bVarE0 == null ? (z4.b) mVar2.f26438b.get(i13) : bVarE0;
            q qVar2 = mVar2.f26437a;
            dVar.getClass();
            String str = qVar2.f14543m;
            if (!o0.n(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    qVar = qVar2;
                    iVarArr = iVarArr2;
                    jVar = new j6.d((m3.l) dVar.f11044c, dVar.f11043b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    jVar = new j5.p(1);
                } else if (Objects.equals(str, "image/png")) {
                    jVar = new n6.a(0);
                } else {
                    int i15 = z10 ? 4 : 0;
                    mVar = mVar2;
                    int i16 = dVar.f11043b ? i15 : i15 | 32;
                    iVarArr = iVarArr2;
                    qVar = qVar2;
                    jVar = new l6.j((m3.l) dVar.f11044c, i16, null, arrayList, nVar2);
                }
                eVar = new k5.e(jVar, i11, qVar);
                k5.e eVar2 = eVar;
                long j11 = jD;
                int i17 = i14;
                iVarArr[i17] = new i(j11, mVar, bVar, eVar2, 0L, mVar.d());
                i14 = i17 + 1;
                kVar = this;
                nVar2 = nVar;
                jD = j11;
                i13 = 0;
            } else if (dVar.f11043b) {
                jVar = new o6.h(((m3.l) dVar.f11044c).h(qVar2), qVar2);
            } else {
                eVar = null;
                mVar = mVar2;
                iVarArr = iVarArr2;
                k5.e eVar22 = eVar;
                long j112 = jD;
                int i172 = i14;
                iVarArr[i172] = new i(j112, mVar, bVar, eVar22, 0L, mVar.d());
                i14 = i172 + 1;
                kVar = this;
                nVar2 = nVar;
                jD = j112;
                i13 = 0;
            }
            mVar = mVar2;
            qVar = qVar2;
            iVarArr = iVarArr2;
            eVar = new k5.e(jVar, i11, qVar);
            k5.e eVar222 = eVar;
            long j1122 = jD;
            int i1722 = i14;
            iVarArr[i1722] = new i(j1122, mVar, bVar, eVar222, 0L, mVar.d());
            i14 = i1722 + 1;
            kVar = this;
            nVar2 = nVar;
            jD = j1122;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f25524k.b(this.f25525l).f26423c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f25516c) {
            arrayList.addAll(((z4.a) list.get(i10)).f26381c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f25522i;
        i iVar = iVarArr[i10];
        z4.b bVarE0 = this.f25515b.e0(((z4.m) iVar.f25510d).f26438b);
        if (bVarE0 == null || bVarE0.equals((z4.b) iVar.f25511e)) {
            return iVar;
        }
        i iVar2 = new i(iVar.f25507a, (z4.m) iVar.f25510d, bVarE0, (k5.e) iVar.f25509c, iVar.f25508b, (h) iVar.f25512f);
        iVarArr[i10] = iVar2;
        return iVar2;
    }
}
