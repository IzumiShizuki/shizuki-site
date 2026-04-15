package k8;

import e7.y;
import ic.k;
import java.io.EOFException;
import java.io.IOException;
import jc.l;
import lh.f0;
import lh.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11220b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f11222d;

    public e(f0 f0Var, y yVar) {
        super(f0Var);
        this.f11222d = yVar;
    }

    @Override // lh.n, lh.f0
    public final void H(lh.f fVar, long j10) throws EOFException {
        switch (this.f11220b) {
            case 0:
                if (this.f11221c) {
                    fVar.skip(j10);
                } else {
                    try {
                        this.f12597a.H(fVar, j10);
                    } catch (IOException e10) {
                        this.f11221c = true;
                        ((y) this.f11222d).a(e10);
                        return;
                    }
                }
                break;
            default:
                if (this.f11221c) {
                    fVar.skip(j10);
                } else {
                    try {
                        super.H(fVar, j10);
                    } catch (IOException e11) {
                        this.f11221c = true;
                        this.f11222d.a(e11);
                    }
                }
                break;
        }
    }

    @Override // lh.n, lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f11220b) {
            case 0:
                try {
                    super.close();
                } catch (IOException e10) {
                    this.f11221c = true;
                    ((y) this.f11222d).a(e10);
                    return;
                }
                break;
            default:
                try {
                    super.close();
                } catch (IOException e11) {
                    this.f11221c = true;
                    this.f11222d.a(e11);
                }
                break;
        }
    }

    @Override // lh.n, lh.f0, java.io.Flushable
    public final void flush() {
        switch (this.f11220b) {
            case 0:
                try {
                    super.flush();
                } catch (IOException e10) {
                    this.f11221c = true;
                    ((y) this.f11222d).a(e10);
                    return;
                }
                break;
            default:
                if (!this.f11221c) {
                    try {
                        super.flush();
                    } catch (IOException e11) {
                        this.f11221c = true;
                        this.f11222d.a(e11);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f0 f0Var, k kVar) {
        super(f0Var);
        l.e(f0Var, "delegate");
        this.f11222d = kVar;
    }
}
