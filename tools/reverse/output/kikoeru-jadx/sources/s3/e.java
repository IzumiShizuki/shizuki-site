package s3;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.o0;
import m4.q;
import p4.p;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19374b;

    public e(int i10, List list) {
        this.f19373a = i10;
        this.f19374b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y6.f0 a(int r6, p4.p r7) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e.a(int, p4.p):y6.f0");
    }

    public List b(p pVar) {
        String str;
        int i10;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.f19374b;
        if (zC) {
            return list;
        }
        s sVar = new s((byte[]) pVar.f16602d);
        while (sVar.a() > 0) {
            int iU = sVar.u();
            int iU2 = sVar.f16612b + sVar.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = sVar.u() & 31;
                for (int i11 = 0; i11 < iU3; i11++) {
                    String strS = sVar.s(3, StandardCharsets.UTF_8);
                    int iU4 = sVar.u();
                    boolean z10 = (iU4 & 128) != 0;
                    if (z10) {
                        i10 = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bU = (byte) sVar.u();
                    sVar.H(1);
                    if (z10) {
                        boolean z11 = (bU & 64) != 0;
                        byte[] bArr = p4.d.f16565a;
                        listSingletonList = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    m4.p pVar2 = new m4.p();
                    pVar2.f14488m = o0.p(str);
                    pVar2.f14479d = strS;
                    pVar2.H = i10;
                    pVar2.f14491p = listSingletonList;
                    arrayList.add(new q(pVar2));
                }
                list = arrayList;
            }
            sVar.G(iU2);
        }
        return list;
    }

    public boolean c(int i10) {
        return (i10 & this.f19373a) != 0;
    }

    public e() {
        this.f19373a = 1;
        this.f19374b = Collections.singletonList(null);
    }

    public e(ArrayList arrayList) {
        this.f19373a = 0;
        this.f19374b = arrayList;
    }
}
