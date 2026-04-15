package ah;

import ef.l;
import lh.b0;
import ug.f0;
import ug.v;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f388d;

    public i(String str, long j10, b0 b0Var) {
        this.f386b = str;
        this.f387c = j10;
        this.f388d = b0Var;
    }

    @Override // ug.f0
    public final long g() {
        return this.f387c;
    }

    @Override // ug.f0
    public final v i() {
        String str = this.f386b;
        if (str == null) {
            return null;
        }
        l lVar = v.f21877c;
        return w.w(str);
    }

    @Override // ug.f0
    public final lh.h k() {
        return this.f388d;
    }
}
