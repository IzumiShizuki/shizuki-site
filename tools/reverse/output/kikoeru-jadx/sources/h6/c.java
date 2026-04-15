package h6;

import g5.w;
import gh.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.m0;
import m4.n0;
import p4.r;
import p4.s;
import p4.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f8129b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f8130c = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f8131d;

    @Override // gh.g
    public final n0 t(a6.a aVar, ByteBuffer byteBuffer) {
        m0 dVar;
        long j10;
        y yVar = this.f8131d;
        if (yVar == null || aVar.f205j != yVar.e()) {
            y yVar2 = new y(aVar.f21384g);
            this.f8131d = yVar2;
            yVar2.a(aVar.f21384g - aVar.f205j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        s sVar = this.f8129b;
        sVar.E(bArrArray, iLimit);
        r rVar = this.f8130c;
        rVar.p(bArrArray, iLimit);
        rVar.t(39);
        long jI = (((long) rVar.i(1)) << 32) | ((long) rVar.i(32));
        rVar.t(20);
        int i10 = rVar.i(12);
        int i11 = rVar.i(8);
        sVar.H(14);
        if (i11 == 0) {
            dVar = new d();
        } else if (i11 == 255) {
            long jW = sVar.w();
            int i12 = i10 - 4;
            sVar.e(new byte[i12], 0, i12);
            dVar = new a(0, jW, jI);
        } else if (i11 == 4) {
            int iU = sVar.u();
            ArrayList arrayList = new ArrayList(iU);
            for (int i13 = 0; i13 < iU; i13++) {
                sVar.w();
                boolean z10 = (sVar.u() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    int iU2 = sVar.u();
                    boolean z11 = (iU2 & 64) != 0;
                    boolean z12 = (iU2 & 32) != 0;
                    if (z11) {
                        sVar.w();
                    }
                    if (!z11) {
                        int iU3 = sVar.u();
                        ArrayList arrayList3 = new ArrayList(iU3);
                        for (int i14 = 0; i14 < iU3; i14++) {
                            sVar.u();
                            sVar.w();
                            arrayList3.add(new w(14));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z12) {
                        sVar.u();
                        sVar.w();
                    }
                    sVar.A();
                    sVar.u();
                    sVar.u();
                }
                w wVar = new w(15);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(wVar);
            }
            d dVar2 = new d();
            Collections.unmodifiableList(arrayList);
            dVar = dVar2;
        } else if (i11 == 5) {
            y yVar3 = this.f8131d;
            sVar.w();
            boolean z13 = (sVar.u() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z13) {
                j10 = -9223372036854775807L;
            } else {
                int iU4 = sVar.u();
                boolean z14 = (iU4 & 64) != 0;
                boolean z15 = (iU4 & 32) != 0;
                boolean z16 = (iU4 & 16) != 0;
                long jD = (!z14 || z16) ? -9223372036854775807L : a.d(jI, sVar);
                if (!z14) {
                    int iU5 = sVar.u();
                    ArrayList arrayList4 = new ArrayList(iU5);
                    for (int i15 = 0; i15 < iU5; i15++) {
                        sVar.u();
                        yVar3.b(!z16 ? a.d(jI, sVar) : -9223372036854775807L);
                        arrayList4.add(new w(13));
                    }
                    list = arrayList4;
                }
                if (z15) {
                    sVar.u();
                    sVar.w();
                }
                sVar.A();
                sVar.u();
                sVar.u();
                j10 = jD;
            }
            dVar = new a(j10, yVar3.b(j10), list);
        } else if (i11 != 6) {
            dVar = null;
        } else {
            y yVar4 = this.f8131d;
            long jD2 = a.d(jI, sVar);
            dVar = new a(2, jD2, yVar4.b(jD2));
        }
        return dVar == null ? new n0(new m0[0]) : new n0(dVar);
    }
}
