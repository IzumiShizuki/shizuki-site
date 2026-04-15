package s4;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f19397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f19399c;

    public d0(h hVar) {
        hVar.getClass();
        this.f19397a = hVar;
        this.f19399c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // s4.h
    public final void close() {
        this.f19397a.close();
    }

    @Override // s4.h
    public final long f(m mVar) {
        h hVar = this.f19397a;
        this.f19399c = mVar.f19443a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.f(mVar);
        } finally {
            Uri uriW = hVar.w();
            if (uriW != null) {
                this.f19399c = uriW;
            }
            hVar.p();
        }
    }

    @Override // s4.h
    public final Map p() {
        return this.f19397a.p();
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f19397a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f19398b += (long) i12;
        }
        return i12;
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        f0Var.getClass();
        this.f19397a.t(f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        return this.f19397a.w();
    }
}
