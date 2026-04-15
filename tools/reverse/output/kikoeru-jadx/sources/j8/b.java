package j8;

import java.io.IOException;
import lh.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends lh.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10600b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10601c;

    public /* synthetic */ b(h0 h0Var) {
        super(h0Var);
    }

    @Override // lh.o, lh.h0
    public long W(lh.f fVar, long j10) throws Exception {
        switch (this.f10600b) {
            case 0:
                try {
                    return super.W(fVar, j10);
                } catch (Exception e10) {
                    this.f10601c = e10;
                    throw e10;
                }
            default:
                return super.W(fVar, j10);
        }
    }

    @Override // lh.o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f10600b) {
            case 1:
                ((ug.c) this.f10601c).f21725b.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h0 h0Var, ug.c cVar) {
        super(h0Var);
        this.f10601c = cVar;
    }
}
