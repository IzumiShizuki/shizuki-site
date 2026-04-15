package gh;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f7565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f7566b;

    public m(l lVar) {
        this.f7565a = lVar;
    }

    @Override // gh.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f7565a.a(sSLSocket);
    }

    @Override // gh.n
    public final boolean b() {
        return true;
    }

    @Override // gh.n
    public final String c(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // gh.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        jc.l.e(list, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f7566b == null && this.f7565a.a(sSLSocket)) {
                this.f7566b = this.f7565a.h(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7566b;
    }
}
