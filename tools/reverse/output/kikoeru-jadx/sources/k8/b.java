package k8;

import ef.l;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11202c;

    public b(d dVar, a aVar) {
        this.f11202c = dVar;
        this.f11200a = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11201b) {
            return;
        }
        this.f11201b = true;
        d dVar = this.f11202c;
        synchronized (dVar) {
            a aVar = this.f11200a;
            int i10 = aVar.f11198h - 1;
            aVar.f11198h = i10;
            if (i10 == 0 && aVar.f11196f) {
                l lVar = d.f11203q;
                dVar.y(aVar);
            }
        }
    }
}
