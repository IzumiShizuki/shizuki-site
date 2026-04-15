package k3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a2.c {
    @Override // a2.c
    public final void X(f fVar, f fVar2) {
        fVar.f11015b = fVar2;
    }

    @Override // a2.c
    public final void Y(f fVar, Thread thread) {
        fVar.f11014a = thread;
    }

    @Override // a2.c
    public final boolean x(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f11021b != cVar) {
                    return false;
                }
                gVar.f11021b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a2.c
    public final boolean y(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f11020a != obj) {
                    return false;
                }
                gVar.f11020a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a2.c
    public final boolean z(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f11022c != fVar) {
                    return false;
                }
                gVar.f11022c = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
