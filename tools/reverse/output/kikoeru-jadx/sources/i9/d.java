package i9;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m0.w;
import s4.f0;
import s4.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9474a;

    public d(r rVar) {
        this.f9474a = rVar;
    }

    @Override // s4.h
    public final void close() {
        this.f9474a.close();
    }

    @Override // s4.h
    public final long f(s4.m mVar) {
        jc.l.e(mVar, "dataSpec");
        r rVar = this.f9474a;
        String str = "Bearer " + a9.i.f();
        str.getClass();
        w wVar = rVar.f19471h;
        synchronized (wVar) {
            wVar.f13783c = null;
            ((HashMap) wVar.f13782b).put("authorization", str);
        }
        return this.f9474a.f(mVar);
    }

    @Override // s4.h
    public final Map p() {
        return Collections.EMPTY_MAP;
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) {
        jc.l.e(bArr, "p0");
        return this.f9474a.read(bArr, i10, i11);
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        jc.l.e(f0Var, "p0");
        this.f9474a.t(f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        return this.f9474a.w();
    }
}
