package gh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7561a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f7562b;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f7562b = z10;
    }

    @Override // gh.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // gh.n
    public final boolean b() {
        return f7562b;
    }

    @Override // gh.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // gh.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        jc.l.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            fh.e eVar = fh.e.f7102a;
            parameters.setApplicationProtocols((String[]) pe.d.z(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
