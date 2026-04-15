package gh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7563a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f7564b;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f7564b = z10;
    }

    @Override // gh.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // gh.n
    public final boolean b() {
        return f7564b;
    }

    @Override // gh.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // gh.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        jc.l.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            fh.e eVar = fh.e.f7102a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) pe.d.z(list).toArray(new String[0]));
        }
    }
}
