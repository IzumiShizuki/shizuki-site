package cb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends android.support.v4.media.session.b {
    @Override // android.support.v4.media.session.b
    public final d E(p pVar) {
        d dVar;
        d dVar2 = d.f3842d;
        synchronized (pVar) {
            try {
                dVar = pVar.f3873b;
                if (dVar != dVar2) {
                    pVar.f3873b = dVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // android.support.v4.media.session.b
    public final o F(p pVar) {
        o oVar;
        o oVar2 = o.f3865c;
        synchronized (pVar) {
            try {
                oVar = pVar.f3874c;
                if (oVar != oVar2) {
                    pVar.f3874c = oVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    @Override // android.support.v4.media.session.b
    public final void R(o oVar, o oVar2) {
        oVar.f3867b = oVar2;
    }

    @Override // android.support.v4.media.session.b
    public final void S(o oVar, Thread thread) {
        oVar.f3866a = thread;
    }

    @Override // android.support.v4.media.session.b
    public final boolean v(p pVar, d dVar, d dVar2) {
        synchronized (pVar) {
            try {
                if (pVar.f3873b != dVar) {
                    return false;
                }
                pVar.f3873b = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final boolean w(p pVar, Object obj, Object obj2) {
        synchronized (pVar) {
            try {
                if (pVar.f3872a != obj) {
                    return false;
                }
                pVar.f3872a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final boolean x(p pVar, o oVar, o oVar2) {
        synchronized (pVar) {
            try {
                if (pVar.f3874c != oVar) {
                    return false;
                }
                pVar.f3874c = oVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
