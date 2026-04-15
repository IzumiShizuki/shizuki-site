package b0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0.e f1296a;

    public m(int i10) {
        switch (i10) {
            case 1:
                this.f1296a = new z0.e(new u.f[16]);
                break;
            default:
                this.f1296a = new z0.e(new l[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        z0.e eVar = this.f1296a;
        int i10 = eVar.f26374c;
        hf.j[] jVarArr = new hf.j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jVarArr[i11] = ((u.f) eVar.f26372a[i11]).f20890b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            jVarArr[i12].t(cancellationException);
        }
        if (eVar.f26374c == 0) {
            return;
        }
        x.a.c("uncancelled requests present");
    }

    public void b() {
        z0.e eVar = this.f1296a;
        oc.d dVarE = nh.b.E(0, eVar.f26374c);
        int i10 = dVarE.f16307a;
        int i11 = dVarE.f16308b;
        if (i10 <= i11) {
            while (true) {
                ((u.f) eVar.f26372a[i10]).f20890b.h(ub.a0.f21526a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        eVar.g();
    }
}
