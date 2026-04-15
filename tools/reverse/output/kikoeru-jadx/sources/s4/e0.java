package s4;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f19406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.d f19407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19409d;

    public e0(h hVar, t4.d dVar) {
        hVar.getClass();
        this.f19406a = hVar;
        dVar.getClass();
        this.f19407b = dVar;
    }

    @Override // s4.h
    public final void close() throws t4.c {
        t4.d dVar = this.f19407b;
        try {
            this.f19406a.close();
            if (this.f19408c) {
                this.f19408c = false;
                if (dVar.f20411d == null) {
                    return;
                }
                try {
                    dVar.a();
                } catch (IOException e10) {
                    throw new t4.c(e10);
                }
            }
        } catch (Throwable th2) {
            if (this.f19408c) {
                this.f19408c = false;
                if (dVar.f20411d != null) {
                    try {
                        dVar.a();
                    } catch (IOException e11) {
                        throw new t4.c(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // s4.h
    public final long f(m mVar) throws t4.c {
        long jF = this.f19406a.f(mVar);
        this.f19409d = jF;
        if (jF == 0) {
            return 0L;
        }
        if (mVar.f19449g == -1 && jF != -1) {
            mVar = mVar.c(0L, jF);
        }
        int i10 = mVar.f19451i;
        this.f19408c = true;
        t4.d dVar = this.f19407b;
        dVar.getClass();
        mVar.f19450h.getClass();
        if (mVar.f19449g == -1 && (i10 & 2) == 2) {
            dVar.f20411d = null;
        } else {
            dVar.f20411d = mVar;
            dVar.f20412e = (i10 & 4) == 4 ? dVar.f20409b : Long.MAX_VALUE;
            dVar.f20416i = 0L;
            try {
                dVar.b(mVar);
            } catch (IOException e10) {
                throw new t4.c(e10);
            }
        }
        return this.f19409d;
    }

    @Override // s4.h
    public final Map p() {
        return this.f19406a.p();
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws t4.c {
        if (this.f19409d == 0) {
            return -1;
        }
        int i12 = this.f19406a.read(bArr, i10, i11);
        if (i12 > 0) {
            t4.d dVar = this.f19407b;
            m mVar = dVar.f20411d;
            if (mVar != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (dVar.f20415h == dVar.f20412e) {
                            dVar.a();
                            dVar.b(mVar);
                        }
                        int iMin = (int) Math.min(i12 - i13, dVar.f20412e - dVar.f20415h);
                        OutputStream outputStream = dVar.f20414g;
                        int i14 = p4.c0.f16548a;
                        outputStream.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        dVar.f20415h += j10;
                        dVar.f20416i += j10;
                    } catch (IOException e10) {
                        throw new t4.c(e10);
                    }
                }
            }
            long j11 = this.f19409d;
            if (j11 != -1) {
                this.f19409d = j11 - ((long) i12);
            }
        }
        return i12;
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        f0Var.getClass();
        this.f19406a.t(f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        return this.f19406a.w();
    }
}
