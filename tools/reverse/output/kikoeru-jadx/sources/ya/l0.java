package ya;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends c0 {
    @Override // ya.c0
    public final c0 b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final m0 f() {
        int i10 = this.f25956b;
        if (i10 == 0) {
            int i11 = m0.f26017c;
            return g1.f25986j;
        }
        if (i10 != 1) {
            m0 m0VarP = m0.p(i10, this.f25955a);
            this.f25956b = m0VarP.size();
            this.f25957c = true;
            return m0VarP;
        }
        Object obj = this.f25955a[0];
        Objects.requireNonNull(obj);
        int i12 = m0.f26017c;
        return new m1(obj);
    }
}
